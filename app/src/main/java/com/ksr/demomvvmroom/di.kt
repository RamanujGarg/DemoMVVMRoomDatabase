package com.ksr.demomvvmroom

import androidx.room.Room
import com.ksr.demomvvmroom.database.DigitalStoreDatabase
import com.ksr.demomvvmroom.registration.addRegistrationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

fun appModule(): List<Module> {
    val modules = mutableListOf<Module>()
    modules.add(appModules)
    modules.addAll(addRegistrationModule())
    return modules
}

val appModules = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            DigitalStoreDatabase::class.java,
            AppUtils.DATABASE_NAME
        ).fallbackToDestructiveMigration()
            .build()
    }
    single { get<DigitalStoreDatabase>().getDao() }
}
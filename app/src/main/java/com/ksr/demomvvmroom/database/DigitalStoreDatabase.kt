package com.ksr.demomvvmroom.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ksr.demomvvmroom.AppUtils
import com.ksr.demomvvmroom.registration.data.model.DigitalStoreEntity

@Database(entities = [DigitalStoreEntity::class], version = AppUtils.DB_VERSION_CODE)
abstract class DigitalStoreDatabase : RoomDatabase() {

    abstract fun getDao(): DigitalStoreDao

    companion object {
        var instance: DigitalStoreDatabase? = null

        @Synchronized
        fun getInstance(ctx: Context): DigitalStoreDatabase {
            if (instance == null)
                instance = Room.databaseBuilder(
                    ctx,
                    DigitalStoreDatabase::class.java,
                    AppUtils.DATABASE_NAME
                )
                    .fallbackToDestructiveMigration()
                    .build()

            return instance!!
        }
    }
}
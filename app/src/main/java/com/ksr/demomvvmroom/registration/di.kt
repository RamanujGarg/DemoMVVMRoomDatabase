package com.ksr.demomvvmroom.registration

import com.ksr.demomvvmroom.registration.data.repository.DigitalStoreRepository
import com.ksr.demomvvmroom.registration.data.repository.DigitalStoreRepositoryImpl
import com.ksr.demomvvmroom.registration.domain.AddCustomerOnDbUseCase
import com.ksr.demomvvmroom.registration.domain.AddCustomerOnDbUseCaseImpl
import com.ksr.demomvvmroom.registration.ui.AddCustomerOnStoreViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

fun addRegistrationModule() = listOf<Module>(dataModule, domainModule, presentationModule)

val dataModule = module {
    single { DigitalStoreRepositoryImpl(get()) as DigitalStoreRepository }
}

val domainModule = module {
  single { AddCustomerOnDbUseCaseImpl(get()) as AddCustomerOnDbUseCase }
}

val presentationModule = module {
    viewModel { AddCustomerOnStoreViewModel(get(), get()) }
}
package com.ksr.demomvvmroom.registration.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ksr.demomvvmroom.registration.Utils
import com.ksr.demomvvmroom.registration.data.model.DigitalStoreEntity
import com.ksr.demomvvmroom.registration.data.repository.DigitalStoreRepository
import kotlinx.coroutines.launch

class AddCustomerOnStoreViewModel(
    context: Context,
    private val repository: DigitalStoreRepository
): ViewModel() {
    fun addCustomer(customer: DigitalStoreEntity){
        viewModelScope.launch {
            repository.addCustomerOnDb(customer)
        }
    }

    fun addDemoCustomer(){
        viewModelScope.launch {
            repository.addCustomerOnDb(Utils.DEMO_CUSTOMER)
        }
    }
}
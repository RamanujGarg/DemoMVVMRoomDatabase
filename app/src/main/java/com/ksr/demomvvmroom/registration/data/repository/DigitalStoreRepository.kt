package com.ksr.demomvvmroom.registration.data.repository

import androidx.lifecycle.LiveData
import com.ksr.demomvvmroom.registration.data.model.DigitalStoreEntity

interface DigitalStoreRepository {
    fun getAllCustomer(): LiveData<List<DigitalStoreEntity>>
    //suspend fun deleteAllCustomer()
    suspend fun addCustomerOnDb(customer: DigitalStoreEntity)
    suspend fun updateCustomerOnDb(customer: DigitalStoreEntity)
    suspend fun deleteCustomerOnDb(customer: DigitalStoreEntity)

}
package com.ksr.demomvvmroom.registration.data.repository

import androidx.lifecycle.LiveData
import com.ksr.demomvvmroom.database.DigitalStoreDao
import com.ksr.demomvvmroom.registration.data.model.DigitalStoreEntity

public class DigitalStoreRepositoryImpl(private val dao: DigitalStoreDao) : DigitalStoreRepository {
    override fun getAllCustomer(): LiveData<List<DigitalStoreEntity>> = dao.getAllCustomer()
    override suspend fun deleteAllCustomer() = dao.deleteAllCustomerForDb()
    override suspend fun addCustomerOnDb(customer: DigitalStoreEntity) =
        dao.addCustomerOnDb(customer)

    override suspend fun updateCustomerOnDb(customer: DigitalStoreEntity) =
        dao.updateCustomerOnDb(customer)

    override suspend fun deleteCustomerOnDb(customer: DigitalStoreEntity) =
        dao.deleteCustomerOnDb(customer)

}
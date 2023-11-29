package com.ksr.demomvvmroom.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ksr.demomvvmroom.AppUtils
import com.ksr.demomvvmroom.AppUtils.TABLE_NAME
import com.ksr.demomvvmroom.registration.data.model.DigitalStoreEntity

@Dao
interface DigitalStoreDao {

    @Query("SELECT * FROM $TABLE_NAME")
    fun getAllCustomer(): LiveData<List<DigitalStoreEntity>>

//    @Query("delete * from ${AppUtils.TABLE_NAME}")
//    fun deleteAllCustomerForDb()

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun addCustomerOnDb(customer: DigitalStoreEntity)

    @Update
    suspend fun updateCustomerOnDb(customer: DigitalStoreEntity)

    @Delete
    suspend fun deleteCustomerOnDb(customer: DigitalStoreEntity)
}
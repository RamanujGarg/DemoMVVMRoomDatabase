package com.ksr.demomvvmroom.registration.ui

import android.content.Context
import android.text.Editable
import android.widget.Toast
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ksr.demomvvmroom.registration.Utils
import com.ksr.demomvvmroom.registration.data.model.DigitalStoreEntity
import com.ksr.demomvvmroom.registration.data.repository.DigitalStoreRepository
import kotlinx.coroutines.launch

class AddCustomerOnStoreViewModel(
    context: Context,
    val repository: DigitalStoreRepository
) : ViewModel() {
    private fun addCustomer(customer: DigitalStoreEntity) {
        viewModelScope.launch {
            repository.addCustomerOnDb(customer)
        }
    }

    fun validateCustomerData(
        context: Context,
        name: Editable,
        email: Editable,
        mobileNumber: Editable,
        age: Editable,
        address: Editable
    ): Boolean {
        if (name.isNotEmpty() && email.isNotEmpty()
            && mobileNumber.isNotEmpty()
            && age.isNotEmpty()
            && address.isNotEmpty()
        ) {

            addCustomer(
                DigitalStoreEntity(
                    name.toString(),
                    email.toString(),
                    mobileNumber.toString(),
                    age.toString(),
                    address.toString()
                )
            )
            name.clear()
            email.clear()
            mobileNumber.clear()
            age.clear()
            address.clear()
            Toast.makeText(context, Utils.SUCCESS_MSG, Toast.LENGTH_LONG).show()
            return true
        } else {
            Toast.makeText(context, Utils.VALIDATION_MSG, Toast.LENGTH_LONG).show()
            return false
        }
    }
    fun addDemoCustomer() {
        viewModelScope.launch {
            repository.addCustomerOnDb(Utils.DEMO_CUSTOMER)
        }
    }
}
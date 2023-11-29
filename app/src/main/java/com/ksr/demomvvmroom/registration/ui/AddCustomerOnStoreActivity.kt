package com.ksr.demomvvmroom.registration.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.ksr.demomvvmroom.R
import com.ksr.demomvvmroom.databinding.ActivityAddCustomerBinding
import com.ksr.demomvvmroom.registration.data.model.DigitalStoreEntity
import org.koin.androidx.viewmodel.ext.android.viewModel

class AddCustomerOnStoreActivity : AppCompatActivity() {
    private val viewModel: AddCustomerOnStoreViewModel by viewModel<AddCustomerOnStoreViewModel>()
    private lateinit var dataBinding: ActivityAddCustomerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this@AddCustomerOnStoreActivity,R.layout.activity_add_customer)
        dataBinding.btnSave.setOnClickListener {
            viewModel.addCustomer(
                DigitalStoreEntity(1,
            dataBinding.etName.text.toString(),
            dataBinding.etEmail.text.toString(),
            dataBinding.etMobileNumber.text.toString(),
            dataBinding.etAddress.text.toString()))
        }
    }
}
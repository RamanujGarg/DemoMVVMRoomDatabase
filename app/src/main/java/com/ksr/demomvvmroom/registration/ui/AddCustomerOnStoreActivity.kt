package com.ksr.demomvvmroom.registration.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Observer
import com.ksr.demomvvmroom.R
import com.ksr.demomvvmroom.databinding.ActivityAddCustomerBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class AddCustomerOnStoreActivity : AppCompatActivity() {
    private val viewModel: AddCustomerOnStoreViewModel by viewModel<AddCustomerOnStoreViewModel>()
    private lateinit var dataBinding: ActivityAddCustomerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(
            this@AddCustomerOnStoreActivity,
            R.layout.activity_add_customer
        )

        viewModel.repository.getAllCustomer().observe(this@AddCustomerOnStoreActivity, Observer {
            Log.d("ListData->",it.toString())
        })
        dataBinding.btnSave.setOnClickListener {
            viewModel.validateCustomerData(
                this,
                dataBinding.etName.text,
                dataBinding.etEmail.text,
                dataBinding.etMobileNumber.text,
                dataBinding.etAge.text,
                dataBinding.etAddress.text,
            )
        }
    }

}
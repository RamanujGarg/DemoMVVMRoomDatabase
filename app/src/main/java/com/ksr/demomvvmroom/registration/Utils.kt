package com.ksr.demomvvmroom.registration

import com.ksr.demomvvmroom.AppUtils
import com.ksr.demomvvmroom.registration.data.model.DigitalStoreEntity

object Utils {
    val DEMO_CUSTOMER = DigitalStoreEntity(AppUtils.DEFAULT_INT, "Ramanuj Garg",
        "gargpss@gmail.com",
    "9755347777",
    "30",
    "Word number 10, vijayraghavgarh dist. katni")
    const val VALIDATION_MSG = "Please fill all field for customer data"
    const val SUCCESS_MSG = "Customer Added Successfully"
}
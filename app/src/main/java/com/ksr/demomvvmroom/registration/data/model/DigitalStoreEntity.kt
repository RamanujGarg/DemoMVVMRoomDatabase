package com.ksr.demomvvmroom.registration.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ksr.demomvvmroom.AppUtils

@Entity(tableName = AppUtils.TABLE_NAME)
data class DigitalStoreEntity(
    @ColumnInfo(name = "customerName") val customerName: String? = AppUtils.EMPTY_STRING,
    @ColumnInfo(name = "customerEmail") val customerEmail: String? = AppUtils.EMPTY_STRING,
    @ColumnInfo(name = "customerMobile") val customerMobile: String? = AppUtils.EMPTY_STRING,
    @ColumnInfo(name = "customerAge") val customerAge: String? = AppUtils.EMPTY_STRING,
    @ColumnInfo(name = "customerAddress") val customerAddress: String? = AppUtils.EMPTY_STRING,
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
)

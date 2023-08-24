package com.example.room.ui.App

import android.app.Application
import com.example.room.data.MainDb

class APP: Application() {
    val database by lazy {
        MainDb.crateDataBase(this)
    }

}
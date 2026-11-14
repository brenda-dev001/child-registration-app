package com.example.clinicofkids

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.room.Room
import com.example.clinicofkids.data.local.AppDataBase
import com.example.clinicofkids.data.local.dao.ChildDao
import com.example.clinicofkids.data.repository.ChildRepository
import com.example.clinicofkids.ui.navigation.AppNavigation
import com.example.clinicofkids.ui.screens.child.ChildViewModel

class MainActivity : ComponentActivity() {

    private lateinit var childViewModel : ChildViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val dataBase = Room.databaseBuilder(
            applicationContext,
            AppDataBase::class.java,
            "children_dataBase"
        ).build()

        val repository = ChildRepository(dataBase.childDao())
        childViewModel = ChildViewModel(repository)
        setContent {
            AppNavigation(childViewModel)
        }
    }
}


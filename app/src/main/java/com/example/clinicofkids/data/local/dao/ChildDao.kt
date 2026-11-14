package com.example.clinicofkids.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.clinicofkids.data.model.Child

@Dao
interface ChildDao {
    @Insert
    suspend fun insertChild(child: Child)
}
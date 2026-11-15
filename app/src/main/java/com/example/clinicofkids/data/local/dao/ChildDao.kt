package com.example.clinicofkids.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.clinicofkids.data.model.Child

@Dao
interface ChildDao {
    @Insert
    suspend fun insertChild(child: Child)

    @Query("SELECT * FROM tb_children")
    suspend fun getAll() : List<Child>
}
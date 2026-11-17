package com.example.clinicofkids.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.clinicofkids.data.model.Child

@Dao
interface ChildDao {
    @Insert
    suspend fun insertChild(child: Child)

    @Query("SELECT * FROM tb_children")
    suspend fun getAll() : List<Child>

    @Query("SELECT * FROM tb_children WHERE cpf = :cpf")
    suspend fun getChildByCpf(cpf : String) : Child

    @Query("SELECT * FROM tb_children WHERE guardianCpf = :cpf")
    suspend fun getGuardianByCpf(cpf: String) : List<Child>

    @Update
    suspend fun updateChild(child: Child)

    @Delete
    suspend fun deleteChild(child: Child)

}
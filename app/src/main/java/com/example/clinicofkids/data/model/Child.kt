package com.example.clinicofkids.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "tb_children")
data class Child(
    @PrimaryKey val cpf: String,
    val name: String,
    val age: Int,
    val guardianCpf: String,
    val guardianName: String,
    val guardianEmail: String,
    val guardianPhone: String,
    val professionalName: String
)

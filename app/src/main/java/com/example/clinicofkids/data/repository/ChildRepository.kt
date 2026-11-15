package com.example.clinicofkids.data.repository

import com.example.clinicofkids.data.local.dao.ChildDao
import com.example.clinicofkids.data.model.Child

class ChildRepository(
    private val childDao: ChildDao
) {
    suspend fun insertChild(child: Child){
        childDao.insertChild(child)
    }

    suspend fun getAll() : List<Child>{
        return childDao.getAll()
    }
}
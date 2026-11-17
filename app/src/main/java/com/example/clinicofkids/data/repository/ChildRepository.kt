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

    suspend fun getChildByCpf(cpf: String) : Child{
        return childDao.getChildByCpf(cpf)
    }

    suspend fun getGuardianByCpf(cpf: String) : List<Child>{
        return childDao.getGuardianByCpf(cpf)
    }

    suspend fun updateChild(child: Child){
        return childDao.updateChild(child)
    }

    suspend fun deleteChild(child: Child){
        return childDao.deleteChild(child)
    }

    suspend fun totalChildren(): Int{
        return childDao.totalChildren()
    }

    suspend fun avarageAgeChildren(): Double?{
        return childDao.avarageAgeChildren()
    }
}
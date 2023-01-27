package com.dsu.myapplication

import android.arch.persistence.room.*

@Dao
interface ExpenseDao {

    @Query("SELECT * FROM details")
    fun getAll(): List<Expense> // list of array

    @Insert
    fun insertAll(vararg details: Expense)

    @Update
    fun update(details: Expense) // model class which should be updated

    @Delete
    fun delete(details: Expense)
    abstract fun addTx(any: Any, s: String)

}
package com.dsu.myapplication

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey
import java.util.*

@Entity(tableName = "details") // table name details
public class Expense(s: String, s1: String) {
    // first col defined
    @PrimaryKey(autoGenerate = true)
    var id: String = UUID.randomUUID().toString()

    // Second col defined
    @ColumnInfo(name = "title")
    var title: String = ""

    // Third col defined
    @ColumnInfo(name = "amount")
    var amount: String = ""

    class Expense(val id: Int, var title: String, var amount: String) {
        class Expense @Ignore constructor(var title: String, var amount: String) {
        }
    }

}
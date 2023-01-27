package com.dsu.myapplication.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dsu.myapplication.R
import com.dsu.myapplication.datamodel.Record
import kotlinx.coroutines.launch

class DashboardViewModel : ViewModel() {

    private var recordList: MutableLiveData<List<Record>> = MutableLiveData()

    fun getAllRecords(): LiveData<List<Record>> {
        viewModelScope.launch {
            val records = arrayListOf<Record>()

            records.add(Record(R.drawable.a, "Taha Sir ", "Hello SIR", true))
            records.add(Record(R.drawable.user4, "Huzaifa Rehman ", "4 GPA", true))
            records.add(Record(R.drawable.c, "Ali Shan", "Kotlin Developer not Found", true))
            records.add(Record(R.drawable.d, "Abdullah ", "Youtuber", true))
            records.add(Record(R.drawable.user1, "Areej Ali", "WOWOW", true))
            records.add(Record(R.drawable.f, "Hamza Ali", "Not Found Error", true))
            records.add(Record(R.drawable.g, "Marium Khan ", "Exception Error", true))
            records.add(Record(R.drawable.h, "Bilal Khan ", "Gender not found", true))
            records.add(Record(R.drawable.i, "Sehar Hayat", "OKAY", true))
            records.add(Record(R.drawable.j, "Mirza Ali", "Hello", true))
            records.add(Record(R.drawable.k, "Iman Rizwan ", "Hello", true))
            records.add(Record(R.drawable.l, "Muhammad Ahmed", "Hello", true))
            recordList.postValue(records)
        }
        return recordList
    }
}
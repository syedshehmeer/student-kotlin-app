package com.dsu.myapplication.ui.favourites

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dsu.myapplication.R
import com.dsu.myapplication.datamodel.Record
import kotlinx.coroutines.launch

class FavouriteViewModel : ViewModel() {


    private var favRecordList: MutableLiveData<List<Record>> = MutableLiveData()

    fun getAllFavRecords(): LiveData<List<Record>> {
        viewModelScope.launch {
            val records = arrayListOf<Record>()
//            for (i in 0..10){
//                records.add(Record(R.drawable.a, "DSU student " +i, "This is description", true))
//                favRecordList.postValue(records)
//            }
            records.add(Record(R.drawable.a, "Ali Ahmed ", "This is description", true))
            records.add(Record(R.drawable.b, "Fatima Khan ", "This is description", false))
            records.add(Record(R.drawable.c, "Uzair Ali ", "This is description", false))
            records.add(Record(R.drawable.d, "Abdullah Faizan ", "This is description", true))
            records.add(Record(R.drawable.e, "Areej Ali", "This is description", true))
            records.add(Record(R.drawable.f, "Syed Hamza ", "This is description", true))
            records.add(Record(R.drawable.g, "Marium Khan ", "This is description", true))
            records.add(Record(R.drawable.h, "Bilal Khan ", "This is description", false))
            records.add(Record(R.drawable.i, "Sehar Ahmed", "This is description", true))
            records.add(Record(R.drawable.j, "Mirza Ali", "This is description", true))
            records.add(Record(R.drawable.k, "Iman Rizwan ", "This is description", true))
            records.add(Record(R.drawable.l, "Muhammad Ahmed", "This is description", true))
            favRecordList.postValue(records)
        }
        return favRecordList
    }
}
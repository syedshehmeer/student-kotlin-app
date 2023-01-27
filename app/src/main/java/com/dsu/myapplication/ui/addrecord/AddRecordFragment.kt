package com.dsu.myapplication.ui.addrecord

import android.app.Activity
import android.util.Log
import com.dsu.myapplication.DatabaseHelper
import com.dsu.myapplication.Expense
import com.dsu.myapplication.R
import kotlinx.android.synthetic.main.fragment_addrecord.*
import kotlinx.android.synthetic.main.fragment_addrecord.view.*
import android.view.View as View

class AddRecordFragment : Activity() {

    private var editAmount: View = findViewById(R.id.editAmount)
    private var editTitle: View = findViewById(R.id.editTitle)
    private var btnAdd: View = findViewById(R.id.btnAdd)
    // object making and name
    private val databaseHelper: DatabaseHelper = DatabaseHelper.getDB(this)


//      btnAdd.setOnClickListener(new View.onClickListener()
    btnAdd.setOnClickListener(object : View.OnClickListener {
    {
        override fun onClick( v : View? )
        {
            var title = editTitle.toString()
            var amount = editAmount.toString();
        }
        databaseHelper.expenseDao().addTx(Expense.Expense(title, amount));
        private infix fun <Expense> ArrayList<Expense>.arrExpenses())databaseHelper.expenseDao().getAll() {

    }
        ArrayList<Expense>() arrExpenses = (ArrayList<Expense>())databaseHelper.expenseDao().getAll();

        for (int i = 0; i<arrExpenses.size();i++ )
        {
            Log.d("Data", "Title: "+ arrExpenses().get(i).getTitle() + "Amount :" + arrExpenses.get(i).getAmount());
        }
    })
}
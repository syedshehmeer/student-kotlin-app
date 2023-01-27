package com.dsu.myapplication

import android.arch.persistence.db.SupportSQLiteOpenHelper
import android.arch.persistence.room.*
import com.dsu.myapplication.ui.addrecord.AddRecordFragment
import kotlinx.coroutines.flow.internal.NoOpContinuation.context
import kotlin.coroutines.jvm.internal.CompletedContinuation.context

@Database(
    entities = Expense.class, version = 1, exportSchema = false)
abstract class DatabaseHelper : RoomDatabase() {
    abstract fun expenseDao(): ExpenseDao

    companion object {
        // cannot be reassigned and can be called before constructor
        private const val DATABASE_NAME = "expenseDb"
        const val DATABASE_VERSION = 1

        private var Instance: DatabaseHelper? = null

        public var synchronized DatabaseHelper getInstance(Context context) {
            if (Instance == null) {
                // (context, Reference of database, name of db)

                Instance = Room.databaseBuilder(context, DatabaseHelper.javaClass, DATABASE_NAME)
                    .fallbackToDestructiveMigration().allowMainThreadQueries().build();
            }
            return Instance;
        }

        fun createOpenHelper(config: DatabaseConfiguration?): SupportSQLiteOpenHelper {
            TODO("Not yet implemented")
        }

        fun createInvalidationTracker(): InvalidationTracker {
            TODO("Not yet implemented")
        }

        fun getDB(AddRecordFragment: AddRecordFragment): DatabaseHelper {

        }
    }
}
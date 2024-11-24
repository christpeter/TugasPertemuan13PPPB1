package com.example.tugaspertemuan13pppb1

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DataPemilih::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun pemilihDao(): PemilihDao
}

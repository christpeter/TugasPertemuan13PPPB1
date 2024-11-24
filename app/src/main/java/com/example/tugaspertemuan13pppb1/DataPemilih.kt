package com.example.tugaspertemuan13pppb1

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pemilih")
data class DataPemilih(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nama: String,
    val nik: String,
    val gender: String,
    val alamat: String
)

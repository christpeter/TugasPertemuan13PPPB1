package com.example.tugaspertemuan13pppb1

import androidx.room.*

@Dao
interface PemilihDao {
    @Insert
    suspend fun insert(pemilih: DataPemilih)

    @Update
    suspend fun update(pemilih: DataPemilih)

    @Delete
    suspend fun delete(pemilih: DataPemilih)

    @Query("SELECT * FROM pemilih")
    suspend fun getAll(): List<DataPemilih>
}

package com.example.tugaspertemuan13pppb1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class TambahDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_data)

        val etNama = findViewById<EditText>(R.id.etNamaTambah)
        val etNik = findViewById<EditText>(R.id.etNikTambah)
        val rgGender = findViewById<RadioGroup>(R.id.rgGenderTambah)
        val etAlamat = findViewById<EditText>(R.id.etAlamatTambah)
        val btnSimpan = findViewById<Button>(R.id.btnSimpanTambah)

        btnSimpan.setOnClickListener {
            // Logic to add new data
            // Insert into database and navigate back to Home
        }
    }
}

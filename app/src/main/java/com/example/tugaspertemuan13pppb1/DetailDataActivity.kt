package com.example.tugaspertemuan13pppb1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class DetailDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_data)

        val tvNama = findViewById<TextView>(R.id.tvNamaDetail)
        val tvNik = findViewById<TextView>(R.id.tvNikDetail)
        val tvGender = findViewById<TextView>(R.id.tvGenderDetail)
        val tvAlamat = findViewById<TextView>(R.id.tvAlamatDetail)
        val btnKembali = findViewById<Button>(R.id.btnKembali)

        // Get data from intent
        val nama = intent.getStringExtra("nama")
        val nik = intent.getStringExtra("nik")
        val gender = intent.getStringExtra("gender")
        val alamat = intent.getStringExtra("alamat")

        // Set data to views
        tvNama.text = nama
        tvNik.text = nik
        tvGender.text = gender
        tvAlamat.text = alamat

        btnKembali.setOnClickListener {
            finish() // Navigate back to Home
        }
    }
}
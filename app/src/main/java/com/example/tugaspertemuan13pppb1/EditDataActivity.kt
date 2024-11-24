package com.example.tugaspertemuan13pppb1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class EditDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_data)

        val etNama = findViewById<EditText>(R.id.etNamaEdit)
        val etNik = findViewById<EditText>(R.id.etNikEdit)
        val rgGender = findViewById<RadioGroup>(R.id.rgGenderEdit)
        val etAlamat = findViewById<EditText>(R.id.etAlamatEdit)
        val btnSimpan = findViewById<Button>(R.id.btnSimpanEdit)

        // Get data from intent
        val nama = intent.getStringExtra("nama")
        val nik = intent.getStringExtra("nik")
        val gender = intent.getStringExtra("gender")
        val alamat = intent.getStringExtra("alamat")

        // Set data to views
        etNama.setText(nama)
        etNik.setText(nik)
        etAlamat.setText(alamat)

        // Set gender selection
        if (gender == "Laki-laki") {
            rgGender.check(R.id.rbLakiEdit)
        } else {
            rgGender.check(R.id.rbPerempuanEdit)
        }

        btnSimpan.setOnClickListener {
            // Logic to save edited data
            // Update database and navigate back to Home
        }
    }
}
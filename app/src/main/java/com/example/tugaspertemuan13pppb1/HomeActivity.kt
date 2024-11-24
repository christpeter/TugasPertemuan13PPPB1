package com.example.tugaspertemuan13pppb1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.tugaspertemuan13pppb1.adapter.PemilihAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity() {
    private lateinit var database: AppDatabase
    private lateinit var sessionManager: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        sessionManager = SessionManager(this)
        database = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "pemilih_db").build()

        loadData()

        findViewById<Button>(R.id.btnLogout).setOnClickListener {
            sessionManager.logout()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    private fun loadData() {
        CoroutineScope(Dispatchers.IO).launch {
            val pemilihList = database.pemilihDao().getAll()
            runOnUiThread {
            }
        }
    }
}




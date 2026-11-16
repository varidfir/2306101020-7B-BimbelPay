package com.example.bimbelpay

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SiswaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(107, 53, 197)
        window.navigationBarColor = Color.BLACK

        setContentView(R.layout.activity_siswa)

        val btnTambahSiswa = findViewById<View>(R.id.btnTambahSiswa)
        val btnBack = findViewById<View>(R.id.btnBack)

        val navDashboard = findViewById<View>(R.id.navDashboard)
        val navSiswa = findViewById<View>(R.id.navSiswa)
        val navPembayaran = findViewById<View>(R.id.navPembayaran)

        btnTambahSiswa.setOnClickListener {
            startActivity(
                Intent(this, TambahSiswaActivity::class.java)
            )
        }

        btnBack.setOnClickListener {
            finish()
        }

        navDashboard.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
            )
            finish()
        }

        navSiswa.setOnClickListener {
            // Sudah berada di halaman Siswa
        }

        navPembayaran.setOnClickListener {
            startActivity(
                Intent(this, PembayaranActivity::class.java)
            )
            finish()
        }
    }
}
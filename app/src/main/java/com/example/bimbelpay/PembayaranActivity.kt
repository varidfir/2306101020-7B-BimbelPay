package com.example.bimbelpay

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class PembayaranActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(107, 53, 197)
        window.navigationBarColor = Color.BLACK

        setContentView(R.layout.activity_pembayaran)

        val btnBack = findViewById<View>(R.id.btnBack)

        val navDashboard = findViewById<View>(R.id.navDashboard)
        val navSiswa = findViewById<View>(R.id.navSiswa)
        val navPembayaran = findViewById<View>(R.id.navPembayaran)

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
            startActivity(
                Intent(this, SiswaActivity::class.java)
            )
            finish()
        }

        navPembayaran.setOnClickListener {
            // Sudah berada di halaman Pembayaran
        }
    }
}
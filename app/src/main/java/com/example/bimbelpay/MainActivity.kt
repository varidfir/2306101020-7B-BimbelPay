package com.example.bimbelpay

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(107, 53, 197)
        window.navigationBarColor = Color.BLACK

        setContentView(R.layout.activity_main)

        val menuDataSiswa = findViewById<View>(R.id.menuDataSiswa)
        val menuPembayaran = findViewById<View>(R.id.menuPembayaran)

        val navDashboard = findViewById<View>(R.id.navDashboard)
        val navSiswa = findViewById<View>(R.id.navSiswa)
        val navPembayaran = findViewById<View>(R.id.navPembayaran)

        menuDataSiswa.setOnClickListener {
            bukaDataSiswa()
        }

        menuPembayaran.setOnClickListener {
            bukaPembayaran()
        }

        navDashboard.setOnClickListener {
            // Sudah berada di Dashboard
        }

        navSiswa.setOnClickListener {
            bukaDataSiswa()
        }

        navPembayaran.setOnClickListener {
            bukaPembayaran()
        }
    }

    private fun bukaDataSiswa() {
        startActivity(
            Intent(this, SiswaActivity::class.java)
        )
    }

    private fun bukaPembayaran() {
        startActivity(
            Intent(this, PembayaranActivity::class.java)
        )
    }
}
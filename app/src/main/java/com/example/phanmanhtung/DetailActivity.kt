package com.example.phanmanhtung

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    private lateinit var tvMaSV: TextView
    private lateinit var tvHoTen: TextView
    private lateinit var tvLop: TextView
    private lateinit var tvGpa: TextView
    private lateinit var btnQuayLai: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        tvMaSV = findViewById(R.id.tvMaSV)
        tvHoTen = findViewById(R.id.tvHoTen)
        tvLop = findViewById(R.id.tvLop)
        tvGpa = findViewById(R.id.tvGpa)
        btnQuayLai = findViewById(R.id.btnQuayLai)

        val maSV = intent.getStringExtra("MA_SV")
        val hoTen = intent.getStringExtra("HO_TEN")
        val lop = intent.getStringExtra("LOP")
        val gpa = intent.getStringExtra("GPA")

        tvMaSV.text = "Mã sinh viên: $maSV"
        tvHoTen.text = "Họ tên: $hoTen"
        tvLop.text = "Lớp: $lop"
        tvGpa.text = "GPA: $gpa"

        btnQuayLai.setOnClickListener {
            finish()
        }
    }
}
package com.example.phanmanhtung

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtMaSV: EditText
    private lateinit var edtHoTen: EditText
    private lateinit var edtLop: EditText
    private lateinit var edtGpa: EditText
    private lateinit var btnXacNhan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtMaSV = findViewById(R.id.edtMaSV)
        edtHoTen = findViewById(R.id.edtHoTen)
        edtLop = findViewById(R.id.edtLop)
        edtGpa = findViewById(R.id.edtGpa)
        btnXacNhan = findViewById(R.id.btnXacNhan)

        btnXacNhan.setOnClickListener {

            val maSV = edtMaSV.text.toString()
            val hoTen = edtHoTen.text.toString()
            val lop = edtLop.text.toString()
            val gpa = edtGpa.text.toString()

            val intent = Intent(this, DetailActivity::class.java)

            intent.putExtra("MA_SV", maSV)
            intent.putExtra("HO_TEN", hoTen)
            intent.putExtra("LOP", lop)
            intent.putExtra("GPA", gpa)

            startActivity(intent)
        }
    }
}
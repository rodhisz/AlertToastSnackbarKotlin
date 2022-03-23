package com.rsz.alerttoastsnackbarkotlin

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_toast.setOnClickListener {
            Toast.makeText(this, "Ini adalah Toast", Toast.LENGTH_SHORT).show()
        }

        btn_alertdialog.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this@MainActivity)

            alertDialog.setTitle("Ini Adalah Judul Alert Dialog")
            alertDialog.setMessage("Ini adalah message alert dialog")

            alertDialog.setPositiveButton("Ya", DialogInterface.OnClickListener { dialoh, which ->
                Toast.makeText(
                    this@MainActivity,
                    "Ya",
                    Toast.LENGTH_SHORT
                ).show() })
            alertDialog.setNegativeButton("Tidak", DialogInterface.OnClickListener { dialoh, which ->
                Toast.makeText(
                    this@MainActivity,
                    "Tidak",
                    Toast.LENGTH_SHORT
                ).show() })
            alertDialog.setNeutralButton("Batal", DialogInterface.OnClickListener { dialoh, which ->
                Toast.makeText(
                    this@MainActivity,
                    "Batal",
                    Toast.LENGTH_SHORT
                ).show() })
            alertDialog.show()
        }

        btn_snackbar.setOnClickListener {
            view -> Snackbar.make(view, "Ini adalah SnackBar", Snackbar.LENGTH_LONG).show()
        }
    }
}
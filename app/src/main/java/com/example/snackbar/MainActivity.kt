package com.example.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var buttonshow: Button
    lateinit var mylayout: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonshow = findViewById(R.id.btshowtoast)
        mylayout = findViewById(R.id.mylayout)
        buttonshow.setText(R.string.buttontitle)// or in xml  android:text="@string/toastmessage"
        buttonshow.setOnClickListener {
            Snackbar.make(
                mylayout,
                R.string.snackmessage,
                Snackbar.LENGTH_INDEFINITE)
                .setAction(
                    "Close", View.OnClickListener { }
                ).show()
        }
    }
}
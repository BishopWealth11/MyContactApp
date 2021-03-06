package com.bishop.mycontactapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bishop.mycontactapp.databinding.ActivityContactDetailsBinding

class ContactDetailsActivity : AppCompatActivity() {

    private lateinit var gumming: ActivityContactDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gumming = ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(gumming.root)

        gumming.run {
            contactSnTv.text = intent.getIntExtra("S/N", 0).toString()
            firstnameTv.text = intent.getStringExtra("First Name")
            lastnameTv.text = intent.getStringExtra("Last Name")
            phoneNumberTv.text = intent.getStringExtra("Phone Number")
            emailTv.text = intent.getStringExtra("E-Mail")

        }
    }
}
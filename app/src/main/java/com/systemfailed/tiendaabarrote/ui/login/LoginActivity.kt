package com.systemfailed.tiendaabarrote.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.systemfailed.tiendaabarrote.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        actionBar?.hide()
    }
}
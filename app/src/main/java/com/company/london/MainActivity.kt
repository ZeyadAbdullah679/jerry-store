package com.company.london

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.company.london.ui.ProfileScreen
import com.company.london.ui.theme.JerryStoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JerryStoreTheme {
                ProfileScreen()
            }
        }
    }
}
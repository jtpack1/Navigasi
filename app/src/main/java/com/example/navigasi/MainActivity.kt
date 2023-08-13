package com.example.navigasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasi.page.home
import com.example.navigasi.page.next
import com.example.navigasi.ui.theme.NavigasiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigasiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   val controlNav = rememberNavController()
                    NavHost(navController = controlNav, startDestination = "home"){
                        composable("home"){
                            home().composehome()
                        }
                        composable("next"){
                            next().composenext()
                        }

                    }
                    Row {
                        Text(modifier = Modifier.clickable { controlNav.navigate("home") },text = "home")
                        Spacer(modifier = Modifier.width(50.dp))
                        Text(modifier = Modifier.clickable { controlNav.navigate("next") },text = "next")
                    }
                }
            }
        }
    }
}



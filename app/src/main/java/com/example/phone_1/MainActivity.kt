package com.example.phone_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.phone_1.ui.theme.Phone_1Theme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.graphics.Color


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Phone_1Theme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Hello(
                        name = "Мышь",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Composable
fun Hello(name: String?, modifier: Modifier = Modifier) {
    if (name == null) {
        Text(
            text = "Имя не задано",
            modifier = modifier
        )
    } else {
        Text(
            text = "Привет, $name!",
            modifier = modifier
        )
    }
}

@Preview(
    name = "1. Portrait",
    showSystemUi = true,
        device = "spec:width=891dp,height=411dp,orientation=portrait"
)
@Composable
fun HelloPreviewPortrait() {
    Phone_1Theme() {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Hello(name = "Мышь", modifier = Modifier.padding(innerPadding))
        }
    }
}

@Preview(
    name = "2. Landscape",
    showSystemUi = true,
    device = "spec:width=891dp,height=411dp,orientation=landscape"
)
@Composable
fun HelloPreviewLandscape() {
    Phone_1Theme() {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Hello(name = "Мышь", modifier = Modifier.padding(innerPadding))
        }
    }
}

@Preview(
    name = "3. Round",
    showSystemUi = true,
    device = "spec:width=200dp,height=200dp,isRound=true"
    // backgroundColor отсюда можно убрать, мы сделаем его в коде
)
@Composable
fun HelloPreviewRound() {
    Phone_1Theme() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Yellow) // Красим фон прямо здесь
        ) {
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                containerColor = Color.Transparent // Оставляем Scaffold прозрачным
            ) { innerPadding ->
                Hello(name = "Мышь", modifier = Modifier.padding(innerPadding))
            }
        }
    }
}
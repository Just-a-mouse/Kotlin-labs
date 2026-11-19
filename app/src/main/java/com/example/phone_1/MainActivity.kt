package com.example.phone_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.phone_1.ui.theme.Phone_1Theme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Phone_1Theme() {
                Scaffold(modifier = Modifier.fillMaxSize()) {

                }
            }
        }
    }
}
@Composable
fun MyButton(modifier: Modifier = Modifier) {
    Button(
        onClick = { },
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(2.dp, Color.Gray),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.LightGray,
            contentColor = Color.Black
        )
    ) {
        Text(text = "Нажми на меня")
    }
}
@Preview(
    name = "ButtonPreview - portrait",
    showSystemUi = false,
    device = "spec:width=891dp,height=411dp,orientation=portrait"
)
@Composable
fun MyButtonPreview() {
    Phone_1Theme() {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            MyButton(modifier = Modifier.padding(innerPadding).padding(16.dp))
        }
    }
}



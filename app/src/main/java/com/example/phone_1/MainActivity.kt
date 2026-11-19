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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


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
fun InitialsContainer(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Gray),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .padding(vertical = 16.dp)
                .fillMaxHeight()
                .aspectRatio(1f)
                .background(Color.Cyan, CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "ИМ",
                fontSize = 24.sp,
                color = Color.Gray
            )
        }
    }
}

@Preview(
    name = "qwe",
    showSystemUi = false,
    device = "spec:width=891dp,height=411dp,orientation=portrait"
)
@Composable
fun MyButtonPreview() {
    Phone_1Theme() {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            InitialsContainer()
        }
    }
}



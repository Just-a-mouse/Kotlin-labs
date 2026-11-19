package com.example.phone_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.phone_1.ui.theme.Phone_1Theme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
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
fun ComposeDescriptionGreenCenter(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.compose_description),
        modifier = modifier.fillMaxWidth(),
        style = TextStyle(
            color = Color.Green,
            fontSize = 16.sp,
            fontStyle = FontStyle.Italic
        ),
        textAlign = TextAlign.Center
    )
}
@Composable
fun ComposeDescriptionOneLine(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.compose_description),
        modifier = modifier.fillMaxWidth(),
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun ComposeDescriptionIndented(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.compose_description),
        modifier = modifier.background(Color.Green),
        style = TextStyle(
            color = Color.Black,
            fontSize = 24.sp,
            textDecoration = TextDecoration.Underline,
            textIndent = TextIndent(firstLine = 48.sp)
        )
    )
}

@Preview(
    name = "first",
    showSystemUi = true,
    device = "spec:width=891dp,height=411dp,orientation=portrait"
)
@Composable
fun HelloPreviewPortrait() {
    Phone_1Theme() {
        Scaffold(modifier = Modifier.fillMaxSize()) {
            ComposeDescriptionGreenCenter()
        }
    }
}

@Preview(
    name = "second",
    showSystemUi = false,
    device = "spec:width=891dp,height=411dp,orientation=portrait"
)
@Composable
fun HelloPreviewPortrait1() {
    Phone_1Theme() {
        Scaffold(modifier = Modifier.fillMaxSize()) {
            ComposeDescriptionOneLine()
        }
    }
}

@Preview(
    name = "third",
    showSystemUi = false,
    device = "spec:width=891dp,height=411dp,orientation=portrait"
)
@Composable
fun HelloPreviewPortrait2() {
    Phone_1Theme() {
        Scaffold(modifier = Modifier.fillMaxSize()) {
            ComposeDescriptionIndented()
        }
    }
}
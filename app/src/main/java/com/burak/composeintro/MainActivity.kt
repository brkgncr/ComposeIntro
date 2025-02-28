package com.burak.composeintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.burak.composeintro.ui.theme.ComposeIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeIntroTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        MainScreen()
                    }
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
       SpecialText("Hello Compose")


        Spacer(modifier = Modifier.padding(20.dp))


        Text(
            text = "Hello World",
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontSize = 56.sp
        )

        Spacer(modifier = Modifier.padding(60.dp))

        Text(
            text = "Hello Compose",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 56.sp
        )

        Spacer(modifier = Modifier.padding(20.dp))


        Text(
            text = "Hello World",
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontSize = 56.sp
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text ="Row Element 1", color = Color.White)
            Text(text ="Row Element 1", color = Color.White)
        }

    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeIntroTheme {
        MainScreen()
    }
}
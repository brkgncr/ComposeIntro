package com.burak.composeintro

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SpecialText(text: String) {
    Text(modifier = Modifier.clickable {
        println("text clicked")
    }.background(color = Color.Black)
        .fillMaxWidth(0.9f)
        .padding(10.dp)
        //.width(300.dp)
        //.height(200.dp)
        ,text = text
        ,color = Color.White
        ,textAlign = TextAlign.Center
        ,fontSize = 40.sp
    )
}

@Preview(showBackground = true)
@Composable
fun SpecialPreview() {
    SpecialText(text = "Hello World")
}
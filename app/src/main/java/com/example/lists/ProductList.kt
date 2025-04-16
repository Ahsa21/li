package com.example.lists

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProductList(ggotodetail: (Fruit)-> Unit, aboutme:() -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Text(text = "Product List")
        Button(onClick = { ggotodetail(Fruit("apple")) }) {
            Text(text = "Add apple")

        }
        Button(onClick = { ggotodetail(Fruit("banana")) }) {
            Text(text = "add banana")
        }
        Button(onClick = { aboutme() }) {
            Text(text = "about me")
        }

    }
}
@Composable
@Preview(showBackground = true)
fun ProductListPreview() {
    ProductList(ggotodetail = { destination -> println("Navigating to: $destination")}, aboutme = {})
}
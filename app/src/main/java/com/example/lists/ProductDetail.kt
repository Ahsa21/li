package com.example.lists

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun ProductDetail(productfruit: Fruit) {
    Text(productfruit.fruitname)
}


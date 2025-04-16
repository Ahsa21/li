package com.example.lists

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Names() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "names ahmad")


    }
}




@Composable
@Preview(showBackground = true)
fun NamesPreview() {
    Names()
}


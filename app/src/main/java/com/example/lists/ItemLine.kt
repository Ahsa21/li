package com.example.lists

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.lists.ui.theme.fancyred


@Composable
fun LiItem(item: String, ondelete: () -> Unit) {
    Row(modifier = Modifier
        .background(fancyred)
        .fillMaxWidth()
        .clickable { ondelete() }) {
        var Textmodifier = Modifier.weight(1f)
        Text(text = item, modifier = Textmodifier, color = Color.Blue)

    }
}


@Preview
@Composable
fun LiItemPreview(showBackground: Boolean = true) {
    LiItem(item = "ahmad", ondelete = {})
}

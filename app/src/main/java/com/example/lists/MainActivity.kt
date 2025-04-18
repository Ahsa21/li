package com.example.lists

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.lists.ui.theme.ListsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            ListsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProductNav()
                }
            }
        }
    }
}



@Composable
fun Greeting() {

    var name by remember { mutableStateOf("") }
    var listNames = remember { mutableStateListOf<String>("ahmad", "ahmad2") }
    var count by remember { mutableStateOf(0) }

    var buttonmodyfier = Modifier.background(Color.Red)

    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.padding(16.dp)) {
            TextField(value = name, onValueChange = {name = it})

            Button(onClick = {
                listNames.add(name)
                listNames.sort()
                name = ""
            }, modifier = buttonmodyfier) {
                Text(text = "Add MORE and MORE")
            }
        }
        LazyColumn {
            items(listNames) { item ->
                LiItem(item = item, ondelete = {listNames.remove(item)})
            }
        }



    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ListsTheme {
        ProductNav()
    }
}
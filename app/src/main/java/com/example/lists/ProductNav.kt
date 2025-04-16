package com.example.lists

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

@Serializable
data class Fruit(val fruitname: String)

@Composable
fun ProductNav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "product_list") {
        composable("product_list") {
            backStackEntry -> ProductList(ggotodetail = { destination ->
                navController.navigate(route = destination)
        }, aboutme = { navController.navigate("names") })
        }
        composable<Fruit> {backStackEntry -> val fruit : Fruit = backStackEntry.toRoute()
            ProductDetail(productfruit = fruit)}

        composable("names") {Names()}
    }

}

@Composable
@Preview(showBackground = true)
fun ProductNavPreview() {
    ProductNav()
}


package com.maninmiddle.navigation

sealed class Screen(val route: String) {
    object Catalog: Screen("catalog")
    object Basket: Screen("basket")
}
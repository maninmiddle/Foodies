package com.maninmiddle.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.maninmiddle.feature_catalog.presentation.HomeScreen

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = Screen.Catalog.route) {
        composable(route = Screen.Catalog.route) {
            HomeScreen()
        }
    }
}
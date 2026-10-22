package io.mmaltsev.vkeducation.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import io.mmaltsev.vkeducation.presentation.appslist.AppListScreen
import io.mmaltsev.vkeducation.presentation.appdetails.AppDetailsScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "app_list"
    ) {
        composable("app_list") {
            AppListScreen(
                onAppClick = { app ->
                    navController.navigate("app_details/${app.id}")
                }
            )
        }
        composable(
            route = "app_details/{appId}",
            arguments = listOf(navArgument("appId") { type = NavType.StringType })
        ) {
            AppDetailsScreen(
                onBackClick = {
                    navController.popBackStack()
                },
                onShowcaseAppClick = { app ->
                    navController.navigate("app_list") {
                        popUpTo("app_list") { inclusive = true }
                    }
                }
            )
        }
    }
}

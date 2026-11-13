package com.example.clinicofkids.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.clinicofkids.ui.screens.child.ChildRegistrationScreen
import com.example.clinicofkids.ui.screens.home.MenuScreen
import com.example.clinicofkids.ui.screens.search.SearchForCpfScreen
import com.example.clinicofkids.ui.screens.statistics.StatisticsScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ){
        composable(Routes.HOME){
            MenuScreen(
                onChildRegistrationClick = {
                    navController.navigate(Routes.CHILDREGISTRATION)
                },
                onSearchCpfClick = {
                    navController.navigate(Routes.SEARCHCPF)
                },
                onStatisticsClick = {
                    navController.navigate(Routes.STATISTICS)
                }
            )
        }

        composable(Routes.CHILDREGISTRATION){
            ChildRegistrationScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable(Routes.SEARCHCPF){
            SearchForCpfScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
        composable(Routes.STATISTICS){
            StatisticsScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}
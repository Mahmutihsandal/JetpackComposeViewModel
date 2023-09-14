package com.example.viewmodel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun SetupNavGraph(
    navController: NavHostController,
    viewModel: MyViewModel
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Acount.route
    ) {
        composable(
            route = Screen.Acount.route
        ) {
            // AmountSelection(navController=navController)
            FirstScreen(navController = navController,
                viewModel = viewModel)
        }
        composable(
            route = Screen.Amount.route
        ) {
            SecondScreen(navController = navController,viewModel= viewModel)
        }

    }
}





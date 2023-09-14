package com.example.viewmodel

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondScreen(viewModel: MyViewModel,navController: NavHostController) {
    Column {
        Text(text = "Counter in Second Screen: ${viewModel.counter.value}")
        Button(onClick = { viewModel.increment() }) {
            Text(text = "Increment from Second Screen")
        }
        Spacer(modifier = Modifier.height(12.dp))

        OutlinedCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 2.dp, end = 16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
            ),
            onClick = { navController.navigate(route = Screen.Acount.route) },
            border = BorderStroke(0.4.dp, Color(0xffC0C0C0))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(//seçiniz kısmı
                    text = "second screen", // Seçilen kartın değeri ViewModel üzerinden alınır
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Medium,
                )

                Icon(
                    painter = painterResource(id = R.drawable.arrow),
                    contentDescription = null,
                    modifier = Modifier.size(32.dp)
                )
            }
        }
    }
}

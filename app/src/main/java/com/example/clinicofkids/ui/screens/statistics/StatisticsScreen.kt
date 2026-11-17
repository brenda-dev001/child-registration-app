package com.example.clinicofkids.ui.screens.statistics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clinicofkids.ui.screens.child.ChildViewModel
import com.example.clinicofkids.ui.theme.Background
import com.example.clinicofkids.ui.theme.Blue
import com.example.clinicofkids.ui.theme.Green
import com.example.clinicofkids.ui.theme.Primary
import com.example.clinicofkids.ui.theme.Secondary
import com.example.clinicofkids.ui.theme.Surface

@Composable
fun StatisticsScreen(
    onBackClick: () -> Unit,
    viewModel: ChildViewModel
){
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(color = Background)
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(color = Primary)
            .padding(6.dp),
            verticalArrangement = Arrangement.Top,
        ) {
            Button(onClick = {onBackClick()},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                ),
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    tint = Blue
                )
            }
        }
        Column(modifier = Modifier.fillMaxWidth(0.9f)
            .height(50.dp)
            .padding(10.dp)
            .background(color = Secondary, shape = RoundedCornerShape(10.dp))
            .align(alignment = Alignment.CenterHorizontally),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Statiscs", color = Green, fontSize = 17.sp)
        }
        Spacer(modifier = Modifier.size(20.dp))
        Column(modifier = Modifier
            .fillMaxWidth(0.9f)
            .background(color = Surface, shape = RoundedCornerShape(20.dp))
            .padding(all = 10.dp)
            .align(alignment = Alignment.CenterHorizontally)
        ) {
            LaunchedEffect(Unit) {
                viewModel.totalChildren()
            }
            LaunchedEffect(Unit) {
                viewModel.avarageAgeChildren()
            }

            Row() {
                Text(text = "Total number of children : ", fontSize = 16.sp)
                Text(text = viewModel.countChildren.toString(), fontSize = 16.sp, color = Green)
            }
            Spacer(modifier = Modifier.size(15.dp))
            Row(){
                Text(text = "Average age : ", fontSize = 16.sp)
                Text(text = "${viewModel.avgChildren?.toInt()}", fontSize = 16.sp, color = Green)
            }
        }
    }
}

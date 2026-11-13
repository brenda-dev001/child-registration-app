package com.example.clinicofkids.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clinicofkids.R
import com.example.clinicofkids.ui.theme.AccentCoral
import com.example.clinicofkids.ui.theme.AccentYellow
import com.example.clinicofkids.ui.theme.Background
import com.example.clinicofkids.ui.theme.Coral
import com.example.clinicofkids.ui.theme.Green
import com.example.clinicofkids.ui.theme.Primary
import com.example.clinicofkids.ui.theme.Secondary
import com.example.clinicofkids.ui.theme.Yellow

@Composable
fun MenuScreen(
    onChildRegistrationClick: () -> Unit,
    onSearchCpfClick: () -> Unit,
    onStatisticsClick: () -> Unit
){
    Box(modifier = Modifier.fillMaxWidth()
        .fillMaxHeight()
        .background(color = Background)
    ) {
        Box(modifier = Modifier.fillMaxWidth()
            .height(60.dp)
            .background(color = Primary)
            .align(Alignment.TopCenter),

        ) {
            Row(modifier = Modifier.padding(start = 5.dp),
                verticalAlignment = Alignment.CenterVertically
                ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "App logo",
                    modifier = Modifier.size(50.dp)
                        .padding(10.dp)
                )
                Spacer(modifier = Modifier.size(20.dp))
                Text("Child clinic", fontSize = 18.sp, color = Secondary)
            }
        }
        Column(modifier = Modifier.align(alignment = Alignment.Center)) {
            Button(onClick = {onChildRegistrationClick()},
                modifier = Modifier.fillMaxWidth(0.7f)
                    .padding(10.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = AccentYellow,
                    contentColor = Yellow
                )
            ) {
                Text(text = "Child registration", fontSize = 17.sp)
            }
            Button(onClick = {onSearchCpfClick()},
                modifier = Modifier.fillMaxWidth(0.7f)
                    .padding(10.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = AccentCoral,
                    contentColor = Coral
                )
            ) {
                Text(text = "Search for CPF", fontSize = 17.sp)
            }
            Button(onClick = {onStatisticsClick},
                modifier = Modifier.fillMaxWidth(0.7f)
                    .padding(10.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Secondary,
                    contentColor = Green
                )
            ) {
                Text(text = "Statistics", fontSize = 17.sp)
            }
        }
    }
}

@Preview
@Composable
private fun MenuScreenPreview(){
    MenuScreen(onChildRegistrationClick = {}, onSearchCpfClick = {}, onStatisticsClick = {})
}
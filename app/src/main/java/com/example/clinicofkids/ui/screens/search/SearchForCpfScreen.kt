package com.example.clinicofkids.ui.screens.search

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clinicofkids.data.model.Child
import com.example.clinicofkids.ui.screens.child.ChildViewModel
import com.example.clinicofkids.ui.theme.AccentCoral
import com.example.clinicofkids.ui.theme.AccentYellow
import com.example.clinicofkids.ui.theme.Background
import com.example.clinicofkids.ui.theme.Blue
import com.example.clinicofkids.ui.theme.Coral
import com.example.clinicofkids.ui.theme.Green
import com.example.clinicofkids.ui.theme.Primary
import com.example.clinicofkids.ui.theme.Secondary
import com.example.clinicofkids.ui.theme.Surface
import com.example.clinicofkids.ui.theme.Yellow

@Composable
fun SearchForCpfScreen(
    onBackClick: () -> Unit,
    viewModel : ChildViewModel
){
    var cpf by remember { mutableStateOf("") }
    var isSearching by remember { mutableStateOf(false) }

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
        Spacer(modifier = Modifier.size(20.dp))
        Column(modifier = Modifier
            .fillMaxWidth(0.9f)
            .background(color = Surface, shape = RoundedCornerShape(20.dp))
            .padding(all = 10.dp)
            .align(alignment = Alignment.CenterHorizontally),
        ) {
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Background,
                    unfocusedBorderColor = Secondary,
                    focusedBorderColor = Secondary,
                    unfocusedPlaceholderColor = Secondary
                ),
                shape = RoundedCornerShape(10.dp),
                value = cpf,
                onValueChange = {cpf = it},
                label = {Text(text = "CPF", color = Secondary)},
                placeholder = {Text("Enter your cpf")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.NumberPassword
                )
            )
            Spacer(modifier = Modifier.size(10.dp))
            Button(onClick = {
                if(cpf.isNotBlank()){
                    isSearching = true
                    viewModel.getChildByCpf(cpf)
                }else{
                    isSearching = false
                }
            },
                modifier = Modifier.align(alignment = Alignment.End),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Green,
                    containerColor = Secondary
                ),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 2.dp
                )
            ) {
                Text("Search")
            }
        }
        if(isSearching){
            viewModel.child?.let { child ->
                ChildCard(child)
            }
        }else{
            LazyColumn(modifier = Modifier
                .weight(1f)
                .align(alignment = Alignment.CenterHorizontally),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(viewModel.list){children ->
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(0.9f)
                            .background(color = Surface, shape = RoundedCornerShape(12.dp))
                            .border(width = 1.dp, color = Green, shape = RoundedCornerShape(12.dp))
                            .padding(10.dp)
                            .align(alignment = Alignment.CenterHorizontally)
                    ) {
                        Column(modifier = Modifier.fillMaxWidth()
                            .background(color = Secondary, shape = RoundedCornerShape(5.dp))
                            .padding(7.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = children.name, fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Green)
                        }
                        Spacer(modifier = Modifier.size(5.dp))
                        Text(text = "CPF: ${children.cpf}", fontSize = 16.sp)
                        Spacer(modifier = Modifier.size(5.dp))
                        Text(text = "Age: ${children.age}", fontSize = 16.sp)
                        Spacer(modifier = Modifier.size(5.dp))
                        Text(text = "Guardian CPF: ${children.guardianCpf}", fontSize = 16.sp)
                        Spacer(modifier = Modifier.size(5.dp))
                        Text(text = "Guardian name: ${children.guardianName}", fontSize = 16.sp)
                        Spacer(modifier = Modifier.size(5.dp))
                        Text(text = "Professional name: ${children.professionalName}", fontSize = 16.sp)
                        Spacer(modifier = Modifier.size(3.dp))
                        Row(modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            Button(onClick = {},
                                modifier = Modifier.height(35.dp),
                                colors = ButtonDefaults.buttonColors(
                                    contentColor = Yellow,
                                    containerColor = AccentYellow
                                ),
                                elevation = ButtonDefaults.buttonElevation(
                                    defaultElevation = 2.dp
                                ),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Text(text = "Edit")
                            }
                            Spacer(modifier = Modifier.size(5.dp))
                            Button(onClick = {},
                                modifier = Modifier.height(35.dp),
                                colors = ButtonDefaults.buttonColors(
                                    contentColor = Coral,
                                    containerColor = AccentCoral
                                ),
                                elevation = ButtonDefaults.buttonElevation(
                                    defaultElevation = 2.dp
                                ),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Text(text = "Delete")
                            }
                        }
                    }
                }
            }
        }
        Spacer(modifier = Modifier.size(40.dp))
        LaunchedEffect(Unit) {
            viewModel.getAll()
        }
    }
}

@Composable
private fun ChildCard(child: Child){

    Box(modifier = Modifier.fillMaxWidth()){
        Column(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .background(color = Surface, shape = RoundedCornerShape(12.dp))
                .border(width = 1.dp, color = Green, shape = RoundedCornerShape(12.dp))
                .padding(10.dp)
                .align(alignment = Alignment.Center)
        ) {
            Column(modifier = Modifier.fillMaxWidth()
                .background(color = Secondary, shape = RoundedCornerShape(5.dp))
                .padding(7.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = child.name, fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Green)
            }
            Spacer(modifier = Modifier.size(5.dp))
            Text(text = "CPF: ${child.cpf}", fontSize = 16.sp)
            Spacer(modifier = Modifier.size(5.dp))
            Text(text = "Age: ${child.age}", fontSize = 16.sp)
            Spacer(modifier = Modifier.size(5.dp))
            Text(text = "Guardian CPF: ${child.guardianCpf}", fontSize = 16.sp)
            Spacer(modifier = Modifier.size(5.dp))
            Text(text = "Guardian name: ${child.guardianName}", fontSize = 16.sp)
            Spacer(modifier = Modifier.size(5.dp))
            Text(text = "Professional name: ${child.professionalName}", fontSize = 16.sp)
            Spacer(modifier = Modifier.size(3.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Button(onClick = {},
                    modifier = Modifier.height(35.dp),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Yellow,
                        containerColor = AccentYellow
                    ),
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 2.dp
                    ),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Edit")
                }
                Spacer(modifier = Modifier.size(5.dp))
                Button(onClick = {},
                    modifier = Modifier.height(35.dp),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Coral,
                        containerColor = AccentCoral
                    ),
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 2.dp
                    ),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Delete")
                }
            }
        }
    }
}
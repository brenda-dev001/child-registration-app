package com.example.clinicofkids.ui.screens.child

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clinicofkids.ui.theme.Background
import com.example.clinicofkids.ui.theme.Primary
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import com.example.clinicofkids.ui.theme.AccentCoral
import com.example.clinicofkids.ui.theme.AccentYellow
import com.example.clinicofkids.ui.theme.Blue
import com.example.clinicofkids.ui.theme.Green
import com.example.clinicofkids.ui.theme.Secondary
import com.example.clinicofkids.ui.theme.Surface

@Composable
fun ChildRegistrationScreen(
    onBackClick: () -> Unit
){
    var childCpf by remember { mutableStateOf("") }
    var childName by remember { mutableStateOf("") }
    var childAge by remember { mutableStateOf("") }
    var guardiansName by remember { mutableStateOf("") }
    var guardiansCpf by remember { mutableStateOf("") }
    var guardiansEmail by remember { mutableStateOf("") }
    var guardiansPhone by remember { mutableStateOf("") }
    var professionalName by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxWidth()
        .fillMaxHeight()
        .background(color = Background)
        .verticalScroll(rememberScrollState())
    ) {
        Column(modifier = Modifier.fillMaxWidth()
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
        Column(modifier = Modifier.fillMaxWidth(0.9f)
            .background(color = Surface, shape = RoundedCornerShape(20.dp))
            .padding(all = 10.dp)
            .align(alignment = Alignment.CenterHorizontally),
        ) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth()
                    .height(58.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Background,
                    unfocusedBorderColor = Secondary,
                    focusedBorderColor = Secondary,
                    unfocusedPlaceholderColor = Secondary
                ),
                shape = RoundedCornerShape(10.dp),
                value = childName,
                onValueChange = {childName = it},
                label = {Text(text = "child's name", color = Secondary)},
                placeholder = {Text("Enter child's name")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                )

            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth()
                    .height(58.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Background,
                    unfocusedBorderColor = Secondary,
                    focusedBorderColor = Secondary,
                    unfocusedPlaceholderColor = Secondary
                ),
                shape = RoundedCornerShape(10.dp),
                value = childCpf,
                onValueChange = {childCpf = it},
                label = {Text(text = "child's CPF", color = Secondary)},
                placeholder = {Text("Enter child's cpf")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.NumberPassword
                )
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth()
                    .height(58.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Background,
                    unfocusedBorderColor = AccentYellow,
                    focusedBorderColor = AccentYellow,
                    unfocusedPlaceholderColor = AccentYellow
                ),
                shape = RoundedCornerShape(10.dp),
                value = childAge,
                onValueChange = {childAge = it},
                label = {Text(text = "child's age", color = AccentYellow)},
                placeholder = {Text("Enter child's age")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.NumberPassword
                )
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth()
                    .height(58.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Background,
                    unfocusedBorderColor = AccentYellow,
                    focusedBorderColor = AccentYellow,
                    unfocusedPlaceholderColor = AccentYellow
                ),
                shape = RoundedCornerShape(10.dp),
                value = guardiansName,
                onValueChange = {guardiansName = it},
                label = {Text(text = "guardian's name", color = AccentYellow)},
                placeholder = {Text("Enter guardian' name")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                )
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth()
                    .height(58.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Background,
                    unfocusedBorderColor = Primary,
                    focusedBorderColor = Primary,
                    unfocusedPlaceholderColor = Primary
                ),
                shape = RoundedCornerShape(10.dp),
                value = guardiansCpf,
                onValueChange = {guardiansCpf = it},
                label = {Text(text = "guardian's cpf", color = Primary)},
                placeholder = {Text("Enter guardian's cpf")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.NumberPassword
                )
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth()
                    .height(58.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Background,
                    unfocusedBorderColor = Primary,
                    focusedBorderColor = Primary,
                    unfocusedPlaceholderColor = Primary
                ),
                shape = RoundedCornerShape(10.dp),
                value = guardiansEmail,
                onValueChange = {guardiansEmail = it},
                label = {Text(text = "guardian's email", color = Primary)},
                placeholder = {Text("Enter guardian's email")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                )
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth()
                    .height(58.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Background,
                    unfocusedBorderColor = AccentCoral,
                    focusedBorderColor = AccentCoral,
                    unfocusedPlaceholderColor = AccentCoral
                ),
                shape = RoundedCornerShape(10.dp),
                value = guardiansPhone,
                onValueChange = {guardiansPhone = it},
                label = {Text(text = "guardian's phone", color = AccentCoral)},
                placeholder = {Text("Enter guardian's phone")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Phone
                )
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth()
                    .height(58.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Background,
                    unfocusedBorderColor = AccentCoral,
                    focusedBorderColor = AccentCoral,
                    unfocusedPlaceholderColor = AccentCoral
                ),
                shape = RoundedCornerShape(10.dp),
                value = professionalName,
                onValueChange = {professionalName = it},
                label = {Text(text = "professional's name", color = AccentCoral)},
                placeholder = {Text("Enter professional's name")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                )
            )
            Spacer(modifier = Modifier.size(10.dp))
            Button(onClick = {},
                modifier = Modifier.align(alignment = Alignment.End),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Green,
                    containerColor = Secondary
                ),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 2.dp
                )
            ) {
                Text("Insert child")
            }
        }
    }
}

@Preview
@Composable
private fun ChildRegistrationPreview(){
    ChildRegistrationScreen(onBackClick = {})
}
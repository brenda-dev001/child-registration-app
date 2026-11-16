package com.example.clinicofkids.ui.screens.child

import android.widget.Toast
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clinicofkids.ui.theme.AccentCoral
import com.example.clinicofkids.ui.theme.AccentYellow
import com.example.clinicofkids.ui.theme.Background
import com.example.clinicofkids.ui.theme.Blue
import com.example.clinicofkids.ui.theme.Green
import com.example.clinicofkids.ui.theme.Primary
import com.example.clinicofkids.ui.theme.Secondary
import com.example.clinicofkids.ui.theme.Surface

@Composable
fun UpdateGuardianScreen(
    onBackClick: () -> Unit,
    viewModel: ChildViewModel
){

    val child = viewModel.child
    var guardianName by remember(child) { mutableStateOf(child?.guardianName ?: "") }
    var guardianEmail by remember(child) { mutableStateOf(child?.guardianEmail ?: "") }
    var guardianPhone by remember(child) { mutableStateOf(child?.guardianPhone ?: "") }
    val context = LocalContext.current

    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(color = Background)
        .verticalScroll(rememberScrollState())
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
                    .height(58.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Background,
                    unfocusedBorderColor = Secondary,
                    focusedBorderColor = Secondary,
                    unfocusedPlaceholderColor = Secondary
                ),
                shape = RoundedCornerShape(10.dp),
                value = guardianName,
                onValueChange = {guardianName = it},
                label = {Text(text = "guardian's name", color = Secondary)},
                placeholder = {Text("Enter guardian's name")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                )
            )
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(58.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Background,
                    unfocusedBorderColor = Secondary,
                    focusedBorderColor = Secondary,
                    unfocusedPlaceholderColor = Secondary
                ),
                shape = RoundedCornerShape(10.dp),
                value = child?.guardianCpf ?: "",
                onValueChange = {},
                label = {Text(text = "guardian's CPF", color = Secondary)},
                placeholder = {Text("Enter guardian's cpf")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.NumberPassword
                ),
                enabled = false
            )
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(58.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Background,
                    unfocusedBorderColor = AccentYellow,
                    focusedBorderColor = AccentYellow,
                    unfocusedPlaceholderColor = AccentYellow
                ),
                shape = RoundedCornerShape(10.dp),
                value = guardianEmail,
                onValueChange = {guardianEmail = it},
                label = {Text(text = "guardian's email", color = AccentYellow)},
                placeholder = {Text("Enter guardian's email")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.NumberPassword
                )
            )
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(58.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Background,
                    unfocusedBorderColor = AccentYellow,
                    focusedBorderColor = AccentYellow,
                    unfocusedPlaceholderColor = AccentYellow
                ),
                shape = RoundedCornerShape(10.dp),
                value = guardianPhone,
                onValueChange = {guardianPhone = it},
                label = {Text(text = "guardian's phone", color = AccentYellow)},
                placeholder = {Text("Enter guardian's phone")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                )
            )
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(58.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Background,
                    unfocusedBorderColor = Primary,
                    focusedBorderColor = Primary,
                    unfocusedPlaceholderColor = Primary
                ),
                shape = RoundedCornerShape(10.dp),
                value = child?.cpf ?: "",
                onValueChange = {},
                label = {Text(text = "child's cpf", color = Primary)},
                placeholder = {Text("Enter child's cpf")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.NumberPassword
                ),
                readOnly = true,
                enabled = false
            )
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(58.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Background,
                    unfocusedBorderColor = AccentCoral,
                    focusedBorderColor = AccentCoral,
                    unfocusedPlaceholderColor = AccentCoral
                ),
                shape = RoundedCornerShape(10.dp),
                value = child?.name ?: "",
                onValueChange = {},
                label = {Text(text = "child's name", color = AccentCoral)},
                placeholder = {Text("Enter child's name")},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                ),
                readOnly = true,
                enabled = false
            )
            Spacer(modifier = Modifier.size(10.dp))
            Button(onClick = {
                viewModel.child?.let { child ->
                    val guardianCpf = child.guardianCpf
                    if(guardianCpf.isNotEmpty()){
                        viewModel.updateGuardian(guardianCpf, guardianName, guardianEmail, guardianPhone)
                        onBackClick.invoke()
                    }
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
                Text("Update guardian")
            }
            if(viewModel.message.isNotEmpty()){
                Toast.makeText(context, viewModel.message, Toast.LENGTH_LONG).show()
                viewModel.clearMessage()
            }
        }
    }
}


@Preview
@Composable
private fun UpdateGuardianScreenPreview(){
//    UpdateGuardianScreen()
}
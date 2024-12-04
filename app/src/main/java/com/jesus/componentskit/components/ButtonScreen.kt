package com.jesus.componentskit.components


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.CardGiftcard
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun ButtonScreen(navController: NavHostController) {

    val mainViewModel : MainViewModel = viewModel()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Button Component", color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.DarkGray),
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                            contentDescription = "Go Back"
                        )
                    }
                }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .verticalScroll(
                    state = rememberScrollState(),
                )
        ) {
            Box(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(10.dp)
                    .fillMaxWidth()

            ) {
                Text(text = "IconButton")
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = { println("I'm IconButton") }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.Send,
                        contentDescription = "Send",
                        modifier = Modifier.size(50.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = { println("I'm IconButton") }) {
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        tint = Color.Green,
                        contentDescription = "Send",
                        modifier = Modifier.size(50.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(90.dp),
                    onClick = { println("I'm IconButton") }) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        tint = Color.Red,
                        contentDescription = "Send",
                        modifier = Modifier.size(50.dp)
                    )
                }
            }
            Box(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(10.dp)
                    .fillMaxWidth()

            ) {
                Text(text = "ElevateButton")
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                ElevatedButton(
                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
                    modifier = Modifier
                        .padding(16.dp)
                        .width(200.dp),
                    onClick = {

                        println("I'm ElevateButton")
                    }) {
                    Text(text = "ElevateButton")
                }
            }
            Box(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(10.dp)
                    .fillMaxWidth()

            ) {
                Text(text = "OutlinedButton")
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                OutlinedButton(
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.Blue
                    ),
                    border = ButtonDefaults.outlinedButtonBorder().copy(width = 5.dp),
                    modifier = Modifier
                        .padding(16.dp)
                        .width(150.dp),
                    onClick = { println("I'm OutlinedButton") }) {
                    Text(text = "OutlinedButton")
                }

                OutlinedButton(
                    enabled = false,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.Magenta
                    ),
                    border = BorderStroke(width = 5.dp, color = Color.Magenta),
                    modifier = Modifier
                        .padding(16.dp)
                        .width(150.dp),
                    onClick = { println("I'm OutlinedButton") }) {
                    Text(text = "OutlinedButton")
                }
            }
            Box(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(10.dp)
                    .fillMaxWidth()

            ) {
                Text(text = "FilledTonalButton")
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ){
                FilledTonalButton(onClick = { println("I'm FilledTonalButton") }) {
                    Text(text = "FilledTonalButton")
                }
            }
            Box(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(10.dp)
                    .fillMaxWidth()

            ) {
                Text(text = "FilledIconButton")
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                FilledIconButton(onClick = { println("I'm FilledIconButton") }) {
                    Icon(imageVector = Icons.AutoMirrored.Filled.Send, contentDescription = "Send")
                }
            }
            Box(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(10.dp)
                    .fillMaxWidth()

            ) {
                Text(text = "ElevateButton AlertDialog")
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                ElevatedButton(
                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
                    modifier = Modifier
                        .padding(16.dp)
                        .width(200.dp),
                    onClick = {
                        mainViewModel.showDialogExample = true
                    }) {
                    Text(text = "Open Dialog")
                }
            }
            if (mainViewModel.showDialogExample) {
                DialogExample(mainViewModel)
            }
        }
    }
}

class MainViewModel : ViewModel() {
    var showDialogExample by mutableStateOf(false)
}

@Composable
fun DialogExample(mainViewModel: MainViewModel) {
    AlertDialog(
        icon = { Icon(Icons.Outlined.CardGiftcard, null, modifier = Modifier.size(48.dp)) },
        title = { Text(text = "Dialog Example") },
        text = { Text(text = "This is a dialog example") },
        onDismissRequest = { mainViewModel.showDialogExample = false },
        confirmButton = {
            TextButton(
                onClick = { mainViewModel.showDialogExample = false }) {
                Text(text = "Confirm")
            }
        })
}

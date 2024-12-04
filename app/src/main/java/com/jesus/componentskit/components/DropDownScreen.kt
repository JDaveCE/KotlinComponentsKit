package com.jesus.componentskit.components


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun DropDownScreen(navController: NavHostController) {

    val options = listOf(
        Movie("The Walking Death", 2013),
        Movie("The Mentalist", 2000),
        Movie("Dr. House", 2004)
    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Drop Down Component", color = Color.White) },
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
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {

            var valueText by remember { mutableStateOf("") }
            var expanded by remember { mutableStateOf(false) }



            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                TextField(
                    label = { Text(text = "Enter Value") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    value = valueText,
                    onValueChange = { valueText = it },
                    trailingIcon = {
                        IconButton(onClick = { expanded = !expanded }) {
                            Icon(
                                imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "Go Back"
                            )
                        }
                    }
                )
                DropdownMenu(
                    modifier = Modifier
                        .fillMaxWidth(fraction = 0.9f).height(100.dp),
                    expanded = expanded,
                    onDismissRequest = { expanded = false },
                    scrollState = rememberScrollState()
                ) {

                    DropdownMenuItem(
                        text = { Text(text = options[0].title) },
                        onClick = {
                            valueText = options[0].title
                            expanded = false
                        })
                    DropdownMenuItem(text = { Text(text = options[1].title) }, onClick = {
                        valueText = options[1].title
                        expanded = false
                    })
                    DropdownMenuItem(text = { Text(text = options[2].title) }, onClick = {
                        valueText = options[2].title
                        expanded = false
                    })

                }
            }
            Text(text = "Selected Value: $valueText", modifier = Modifier.align(Alignment.CenterHorizontally))
        }

    }
}

data class Movie(val title: String, val year: Int)


























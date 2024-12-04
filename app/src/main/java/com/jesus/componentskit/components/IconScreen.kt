package com.jesus.componentskit.components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.rounded.StopScreenShare
import androidx.compose.material.icons.filled.Bathtub
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun IconScreen(navController: NavHostController){

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Icon Component",color = Color.White) },
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
    ){
        Column(
            modifier = Modifier.padding(it)
                .verticalScroll(
                    state = rememberScrollState(),
                )
        ){
            Icon(
                imageVector = Icons.AutoMirrored.Rounded.StopScreenShare,
                contentDescription = "",
                modifier = Modifier.padding(10.dp)
                    .size(150.dp)
            )
            Icon(
                imageVector = Icons.Default.Bathtub,
                contentDescription = "",
                modifier = Modifier.padding(10.dp)
                    .size(150.dp)
            )
            Icon(
                imageVector = Icons.Default.Bathtub,
                contentDescription = "",
                modifier = Modifier.padding(10.dp)
                    .size(150.dp)
            )
            Icon(
                imageVector = Icons.Default.Bathtub,
                contentDescription = "",
                modifier = Modifier.padding(10.dp)
                    .size(150.dp)
            )
            Icon(
                imageVector = Icons.Default.Bathtub,
                contentDescription = "",
                modifier = Modifier.padding(10.dp)
                    .size(150.dp)
            )
            Icon(
                imageVector = Icons.Default.Bathtub,
                contentDescription = "",
                modifier = Modifier.padding(10.dp)
                    .size(150.dp)
            )
            Icon(
                imageVector = Icons.Default.Bathtub,
                contentDescription = "",
                modifier = Modifier.padding(10.dp)
                    .size(150.dp)
            )
            Icon(
                imageVector = Icons.Default.Bathtub,
                contentDescription = "",
                modifier = Modifier.padding(10.dp)
                    .size(150.dp)
            )
            Icon(
                imageVector = Icons.Default.Bathtub,
                contentDescription = "",
                modifier = Modifier.padding(10.dp)
                    .size(150.dp)
            )
            Icon(
                imageVector = Icons.Default.Bathtub,
                contentDescription = "",
                modifier = Modifier.padding(10.dp)
                    .size(150.dp)
            )
        }
    }
}
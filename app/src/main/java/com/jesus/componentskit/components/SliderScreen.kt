package com.jesus.componentskit.components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun SliderScreen(navController: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Slider Component", color = Color.White) },
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
            var sliderValue by remember { mutableFloatStateOf(0.2f) }

            Slider(colors = SliderDefaults.colors(
               thumbColor = Color.DarkGray,
                activeTrackColor = Color.DarkGray,
                inactiveTrackColor = Color.LightGray
            ),
                value = sliderValue, onValueChange = {
                sliderValue = it
            })
            Text(text = sliderValue.toString(), color = Color.DarkGray, fontSize = (50).sp)

            HorizontalDivider(modifier = Modifier.padding( vertical = 20.dp))

            var sliderValue2 by remember { mutableFloatStateOf(0.2f) }

            Slider(
                steps = 5,
                value = sliderValue2, onValueChange = {
                    sliderValue2 = it
                })
            Text(text = sliderValue2.toString(), color = Color.DarkGray, fontSize = (50).sp)

            HorizontalDivider(modifier = Modifier.padding( vertical = 20.dp))

            var sliderValue3 by remember { mutableFloatStateOf(0f) }

            Slider(
                steps = 9,
                valueRange = 0f..10f,
                value = sliderValue3, onValueChange = {
                    sliderValue3 = it
                })
            Text(text = sliderValue3.toString(), color = Color.DarkGray, fontSize = (50).sp)


        }
    }
}
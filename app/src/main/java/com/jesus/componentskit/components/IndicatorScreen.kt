package com.jesus.componentskit.components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun IndicatorScreen(navController: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Indicator Component", color = Color.White) },
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
            Text(text = "Circular Indicator Component", modifier = Modifier.padding(16.dp))
            HorizontalDivider()
            CircularProgressIndicator(
                color = Color.Red,
                trackColor = Color.LightGray,
                strokeWidth = 6.dp,
                modifier = Modifier.padding(16.dp),
            )

            Text(text = "Progress Bar Component", modifier = Modifier.padding(16.dp))
            HorizontalDivider()

            var progressValue by remember { mutableFloatStateOf(0.0f) }

            LinearProgressIndicator(
                color = Color.Red,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                progress = { progressValue }
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()) {

                ElevatedButton(onClick = {
                    if (progressValue < 1.0f)
                        progressValue += 0.1f
                }
                ) {
                    Text(text = "Increase Progress")
                }

                ElevatedButton(onClick = {
                    if (progressValue > 0.0f)
                        progressValue -= 0.1f
                }
                ) {
                    Text(text = "Decrease Progress")
                }
            }


            Text(text = "Progress: $progressValue", modifier = Modifier.padding(16.dp))

        }
    }
}
package com.jesus.componentskit.components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun RadioButtonScreen(navController: NavHostController) {
    var selectedValue by remember { mutableStateOf(false) }
    var selectedValue2 by remember { mutableStateOf(false) }

    var optionSelected by remember { mutableStateOf("0") }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Radio Button Component", color = Color.White) },
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

            Row(
                //horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp).fillMaxWidth()

            ) {

                RadioButton(selected = selectedValue, onClick = { selectedValue = !selectedValue })
                Text(text = "Radio Button")
            }
            Row(
                //horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp).fillMaxWidth()

            ) {

                RadioButton(selected = selectedValue2, onClick = { selectedValue2 = !selectedValue2 })
                Text(text = "Radio Button")
            }
            HorizontalDivider()
            Row(
                //horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp).fillMaxWidth()

            ) {

                RadioButton(selected = (optionSelected == "1"), onClick = { optionSelected = "1" })
                Text(text = "Group Radio Button 1")
            }
            Row(
                //horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp).fillMaxWidth()

            ) {

                RadioButton(selected = (optionSelected == "2"), onClick = { optionSelected = "2" })
                Text(text = "Group Radio Button 2")
            }
            Row(
                //horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp).fillMaxWidth()

            ) {

                RadioButton(selected = (optionSelected == "3"), onClick = { optionSelected = "3" })
                Text(text = "Group Radio Button 3")
            }
            Row(
                //horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp).fillMaxWidth()

            ) {

                RadioButton(selected = (optionSelected == "4"), onClick = { optionSelected = "4" })
                Text(text = "Group Radio Button 4")
            }

            Text(text = "Option Selected: $optionSelected", fontSize = 30.sp, fontWeight = FontWeight.Bold)

            HorizontalDivider()
            Row(
                //horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp).fillMaxWidth()

            ) {

                RadioButton(
                    colors = RadioButtonDefaults.colors(
                        selectedColor = Color.Green,
                        unselectedColor = Color.Red,
                        disabledSelectedColor = Color.Yellow,
                        disabledUnselectedColor = Color.Blue
                    ),
                    selected = selectedValue,
                    onClick = { selectedValue = !selectedValue })
                Text(text = "Radio Button")
            }

        }
    }
}
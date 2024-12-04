package com.jesus.componentskit.components


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun CheckBoxScreen(navController: NavHostController) {

    var checkedValue by remember { mutableStateOf(false) }
    var checkedValue2 by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "CheckBox Component", color = Color.White) },
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
            Checkbox(
                checked = checkedValue,
                onCheckedChange = { checkedValue = it },
                enabled = true,
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Green,
                    uncheckedColor = Color.Red,
                    checkmarkColor = Color.Blue
                ),
                //scale if for the checkbox grow up and size if for the space checkbox grow up
                /*modifier = Modifier
                    .scale(4f)
                    .size(100.dp),*/


                )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(5.dp)
                    .clickable { checkedValue2 = !checkedValue2 }
            ) {
                Checkbox(
                    checked = checkedValue2,
                    onCheckedChange = { checkedValue2 = it  },
                    enabled = true,
                    colors = CheckboxDefaults.colors(
                        checkedColor = Color.Green,
                        uncheckedColor = Color.Red,
                        checkmarkColor = Color.Blue
                    ),
                    //scale if for the checkbox grow up and size if for the space checkbox grow up
                   // modifier = Modifier
                     //   .scale(4f)
                     //   .size(100.dp),


                    )
                Text(text = "Checkbox 2", modifier = Modifier.padding(start = 8.dp))
            }
        }
    }
}
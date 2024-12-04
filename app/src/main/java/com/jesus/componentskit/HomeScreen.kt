package com.jesus.componentskit

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCard
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Badge
import androidx.compose.material.icons.filled.CheckBox
import androidx.compose.material.icons.filled.EditCalendar
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.LinearScale
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Pages
import androidx.compose.material.icons.filled.RadioButtonChecked
import androidx.compose.material.icons.filled.Replay
import androidx.compose.material.icons.filled.SmartButton
import androidx.compose.material.icons.filled.SwitchLeft
import androidx.compose.material.icons.filled.TextFields
import androidx.compose.material.icons.filled.TouchApp
import androidx.compose.material.icons.outlined.Cached
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import com.jesus.componentskit.routes.Routes


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    val items = mutableListOf(
        View("Text", Icons.Default.Menu, Routes.TextScreen, navController),
        View("Icon", Icons.Default.Face, Routes.IconScreen, navController),
        View("Button", Icons.Default.TouchApp, Routes.ButtonScreen, navController),
        View("TextField", Icons.Default.TextFields, Routes.TextFieldScreen, navController),
        View("Checkbox", Icons.Default.CheckBox, Routes.CheckBoxScreen, navController),
        View("Switch", Icons.Default.SwitchLeft, Routes.SwitchScreen, navController),
        View("RadioButton", Icons.Default.RadioButtonChecked, Routes.RadioButtonScreen, navController),
        View("Image", Icons.Default.Image, Routes.ImageScreen, navController),
        View("AsyncImage", Icons.Default.Replay, Routes.AsyncImageScreen, navController),
        View("Indicator", Icons.Outlined.Cached, Routes.IndicatorScreen, navController),
        View("Badge", Icons.Default.Badge, Routes.BadgeScreen, navController),
        View("Slider", Icons.Default.LinearScale, Routes.SliderScreen, navController),
        View("Dropdown", Icons.Default.ArrowDropDown, Routes.DropdownScreen, navController),
        View("Cards", Icons.Default.AddCard, Routes.CardsScreen, navController),
        View("Pager", Icons.Default.Pages, Routes.PagerScreen, navController),
        View("ButtonAppBar", Icons.Default.SmartButton, Routes.ButtonAppBarScreen, navController),
        View("ModalNavigationDrawer", Icons.Default.EditCalendar, Routes.ModalNavigationDrawerScreen, navController),
        View("CircularImage", Icons.Default.AccountCircle, Routes.CircularImageScreen, navController),
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Components Kits", color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.DarkGray)
            )
        }
    ) {
        Column(
            modifier = Modifier.padding(it).verticalScroll(
                state = rememberScrollState(),
            )
        ) {
            for (item in items) {
                ItemComponent(item.name, item.icon, item.route, navController)
            }
        }
    }
}

data class View(
    val name: String,
    val icon: ImageVector,
    val route: Routes,
    val navController: NavHostController
)
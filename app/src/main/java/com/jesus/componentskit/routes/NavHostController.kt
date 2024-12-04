package com.jesus.componentskit.routes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jesus.componentskit.HomeScreen
import com.jesus.componentskit.components.AsyncImageScreen
import com.jesus.componentskit.components.BadgeScreen
import com.jesus.componentskit.components.ButtonAppBarScreen
import com.jesus.componentskit.components.ButtonScreen
import com.jesus.componentskit.components.CardsScreen
import com.jesus.componentskit.components.CheckBoxScreen
import com.jesus.componentskit.components.CircularImageScreen
import com.jesus.componentskit.components.DropDownScreen
import com.jesus.componentskit.components.IconScreen
import com.jesus.componentskit.components.ImageScreen
import com.jesus.componentskit.components.IndicatorScreen
import com.jesus.componentskit.components.ModalNavigationDrawerScreen
import com.jesus.componentskit.components.PagerScreen
import com.jesus.componentskit.components.RadioButtonScreen
import com.jesus.componentskit.components.SliderScreen
import com.jesus.componentskit.components.SwitchScreen
import com.jesus.componentskit.components.TextFieldScreen
import com.jesus.componentskit.components.TextScreen

@Composable
fun NavHostController() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.HomeScreen.route) {
        composable(route = Routes.HomeScreen.route) {
            HomeScreen(navController)
        }
        composable(route = Routes.TextScreen.route) {
            TextScreen(navController)
        }
        composable(route = Routes.IconScreen.route) {
            IconScreen(navController)
        }
        composable(route = Routes.ButtonScreen.route) {
            ButtonScreen(navController)
        }
        composable(route = Routes.TextFieldScreen.route) {
            TextFieldScreen(navController)
        }
        composable(route = Routes.CheckBoxScreen.route) {
            CheckBoxScreen(navController)
        }
        composable(route = Routes.SwitchScreen.route) {
            SwitchScreen(navController)
        }
        composable(route = Routes.RadioButtonScreen.route) {
            RadioButtonScreen(navController)
        }
        composable(route = Routes.ImageScreen.route) {
            ImageScreen(navController)
        }
        composable(route = Routes.AsyncImageScreen.route) {
            AsyncImageScreen(navController)
        }
        composable(route = Routes.IndicatorScreen.route) {
            IndicatorScreen(navController)
        }
        composable(route = Routes.BadgeScreen.route) {
            BadgeScreen(navController)
        }
        composable(route = Routes.SliderScreen.route) {
            SliderScreen(navController)
        }
        composable(route = Routes.DropdownScreen.route) {
            DropDownScreen(navController)
        }
        composable(route = Routes.CardsScreen.route) {
            CardsScreen(navController)
        }
        composable(route = Routes.PagerScreen.route) {
            PagerScreen(navController)
        }
        composable(route = Routes.ButtonAppBarScreen.route) {
            ButtonAppBarScreen(navController)
        }
        composable(route = Routes.ModalNavigationDrawerScreen.route) {
            ModalNavigationDrawerScreen(navController)
        }
        composable(route = Routes.CircularImageScreen.route) {
            CircularImageScreen(navController)
        }
    }
}
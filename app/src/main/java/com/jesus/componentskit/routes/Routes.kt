package com.jesus.componentskit.routes

sealed class Routes (val route: String) {
    data object HomeScreen : Routes("Home")
    data object TextScreen : Routes("Text")
    data object IconScreen : Routes("Icon")
    data object ButtonScreen : Routes("Button")
    data object TextFieldScreen : Routes("TextField")
    data object CheckBoxScreen : Routes("CheckBox")
    data object SwitchScreen : Routes("Switch")
    data object RadioButtonScreen : Routes("RadioButton")
    data object ImageScreen : Routes("Image")
    data object AsyncImageScreen : Routes("AsyncImage")
    data object IndicatorScreen : Routes("Indicator")
    data object BadgeScreen : Routes("Badge")
    data object SliderScreen : Routes("Slider")
    data object DropdownScreen : Routes("Dropdown")
    data object CardsScreen : Routes("Cards")
    data object PagerScreen : Routes("Pager")
    data object ButtonAppBarScreen : Routes("ButtonAppBar")
    data object ModalNavigationDrawerScreen : Routes("ModalNavigationDrawer")
    data object CircularImageScreen : Routes("CircularImage")
}
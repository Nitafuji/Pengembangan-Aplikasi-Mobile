package com.example.project_activity_intent

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    object Search : NavigationItem("search", R.drawable.ic_search, "Search")
    object Library : NavigationItem("library", R.drawable.ic_library, "Library")
    object Setting : NavigationItem("setting", R.drawable.ic_setting, "Setting")
}

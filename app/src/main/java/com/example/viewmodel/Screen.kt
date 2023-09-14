package com.example.viewmodel

sealed class Screen(val route :String){
    object Amount: Screen(route ="Amount_screen")
    object Acount: Screen(route ="Acount_screen")

}

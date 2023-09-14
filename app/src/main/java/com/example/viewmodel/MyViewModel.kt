package com.example.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    // ViewModel içinde paylaşılacak veri
    val counter = mutableStateOf(0)

    fun increment() {
        counter.value++
    }
}

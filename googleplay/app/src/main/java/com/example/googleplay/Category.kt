package com.example.googleplay

// Category.kt

data class Category(
    val name: String, // Tên loại ứng dụng
    val apps: List<App> // Danh sách các ứng dụng thuộc loại này
)

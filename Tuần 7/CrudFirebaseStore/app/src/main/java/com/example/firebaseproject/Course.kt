package com.example.firebaseproject

// Mở file Course.kt và sửa lại cho giống thế này:
data class Course(
    var courseID: String? = "", // Phải là var
    var courseName: String? = "",
    var courseDuration: String? = "",
    var courseDescription: String? = ""
)
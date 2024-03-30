package com.example.kakaologin

data class socialSignUpandLogin(
    val code: Int,
    val `data`: Data,
    val message: String
) {
    data class Data(
        val accessToken: String,
        val refreshToken: String,
        val type: String
    )
}
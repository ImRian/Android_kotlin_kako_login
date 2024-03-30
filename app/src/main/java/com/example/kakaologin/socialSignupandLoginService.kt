package com.example.kakaologin

import retrofit2.Call
import retrofit2.http.Header
import retrofit2.http.POST

interface socialSignupandLoginService {
    @POST("/api/auth/social")
    fun token(): Call<socialSignUpandLogin>
}

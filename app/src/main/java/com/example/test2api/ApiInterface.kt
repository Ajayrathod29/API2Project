package com.example.test2api

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("users")
    fun getUserList(): Call<MyData>
}
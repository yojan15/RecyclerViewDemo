package com.example.recyclerviewdemo.apiService

import com.example.recyclerviewdemo.model.Demo
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("pass the end point of api")
    fun getService() : Call<Demo>
}
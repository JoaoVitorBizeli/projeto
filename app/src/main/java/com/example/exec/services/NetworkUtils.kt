package com.example.exec.services

import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

class NetworkUtils {
    companion object{
        //** RETORNA A INSTACIA DO CLIENT RETROFIT PARA FUTURAS REQUISIÇÕES

        fun getRetrofitInstance(): Retrofit{
            return Retrofit.Builder()
                   .baseUrl("http://httbin.org")
                   .addConverterFactory(JacksonConverterFactory.create())
                   .build()
        }
    }
}
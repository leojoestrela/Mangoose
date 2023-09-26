package com.eutropiosaboya.mangoose.webservice.retrofit

import com.eutropiosaboya.mangoose.webservice.model.ResponseManga
import retrofit2.Call
import retrofit2.http.GET

interface Endpoint {

    @GET("manga")
    fun getMangas(): Call<ResponseManga>
}
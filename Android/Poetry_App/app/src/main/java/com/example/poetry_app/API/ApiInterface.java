package com.example.poetry_app.API;

import com.example.poetry_app.Response.GetPoetryResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("getpoetry.php")
    Call<GetPoetryResponse> getpoetry();
}

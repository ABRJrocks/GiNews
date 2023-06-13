package com.example.ginews;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {
    @GET("news")
    Call<NewsModel> getAllNews(@Url String url);

    @GET("news/category")
    Call<NewsModel> getNewsByCategory(@Url String url);
}

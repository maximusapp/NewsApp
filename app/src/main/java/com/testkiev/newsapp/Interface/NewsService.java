package com.testkiev.newsapp.Interface;

import com.testkiev.newsapp.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;



public interface NewsService {
    @GET("v2/sources?language=en")
    Call<WebSite> getSources();

}

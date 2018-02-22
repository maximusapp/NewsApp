package com.testkiev.newsapp.Common;

import com.testkiev.newsapp.Interface.NewsService;
import com.testkiev.newsapp.Remote.RetrofitClient;

/**
 * Created by ОрганизациЯ on 22.02.2018.
 */

public class Common {
    private static final String BASE_URL = "https://newsapi.org/";
    public static final String API_KEY = "2402e6f47f1b4273a73de075bb34af9d";

    public static NewsService newsService() {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }
}

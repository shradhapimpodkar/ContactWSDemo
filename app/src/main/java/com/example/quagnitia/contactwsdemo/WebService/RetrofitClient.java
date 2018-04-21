package com.example.quagnitia.contactwsdemo.WebService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by V@iBh@V on 4/2/2018.
 */

public class RetrofitClient {
    private static Retrofit retrofit;

    public RetrofitClient() {
    }

    public static Retrofit getClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(ApiConstants.BASE_URL)
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}

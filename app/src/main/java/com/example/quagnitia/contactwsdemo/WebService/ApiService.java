package com.example.quagnitia.contactwsdemo.WebService;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by V@iBh@V on 4/2/2018.
 */

public interface ApiService {
    @Headers({
            "Accept:apllictaion/json",
            "Content/Type:apllication/json"
    })

    @GET("contacts/")
    Call<UserResponse> getContactApi();
}

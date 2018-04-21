package com.example.quagnitia.contactwsdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import com.example.quagnitia.contactwsdemo.WebService.ApiService;
import com.example.quagnitia.contactwsdemo.WebService.RetrofitClient;
import com.example.quagnitia.contactwsdemo.WebService.UserResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Context context=this;
    List<Contacts> contactsList=new ArrayList<>();
    ListView lvContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContacts=findViewById(R.id.lvContacts);
        ContactWS();

/*        lvContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    */}

    private void ContactWS() {
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);
        Call<UserResponse> call = apiService.getContactApi();
        Log.i("@shradha","Url: "+call.request().url().toString());
        call.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                Log.i("@shradha","Resp: "+response);
                ContactAdapter cd=new ContactAdapter(context,response.body().getContacts());
                lvContacts.setAdapter(cd);

            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
                Log.i("@shradha","Error: "+t);

            }
        });
    }
}

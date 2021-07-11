package com.example.aplikasistudiomusikpangkalpinang.api;

import com.example.aplikasistudiomusikpangkalpinang.model.ListLocationModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("JsonDisplayMarker.php")
    Call<ListLocationModel> getAllLocation();
}

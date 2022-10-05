package com.example.aminternship;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitAPI {

    @POST("users")
    Call<DataModel> createPost(@Body DataModel dataModel);
}

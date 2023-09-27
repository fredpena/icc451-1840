package com.pucmm.icc451.api;

import com.pucmm.icc451.dto.UserList;
import com.pucmm.icc451.dto.UserSingle;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface APIInterface {

    @GET("users")
    Call<UserList> findAll();

    @GET("users/{id}")
    Call<UserSingle> find(@Path("id") int id);


}

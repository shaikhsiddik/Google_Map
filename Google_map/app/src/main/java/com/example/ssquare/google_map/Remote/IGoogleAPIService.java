package com.example.ssquare.google_map.Remote;

import com.example.ssquare.google_map.Model.MyPlaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by S square on 06-02-2018.
 */

public interface IGoogleAPIService
{
    @GET
    Call<MyPlaces> getNearByPlaces(@Url String url);



}

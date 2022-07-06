package com.example.messengerapp.Fragments;

import com.example.messengerapp.Notifications.MyResponse;
import com.example.messengerapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAH_N_zjg:APA91bHUqlbq_okiLr39FmCGtuBxAVKJSw6mpGCa8TTkQtwgdu-CORUvEpbZr5CxerEWGBgIs0SaUpL0nsaeezmC-lkm2243tUawZOoUdKtb4ilh59MaABDLEKT1t_WIhCGVrHqwDCkn"
    })

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

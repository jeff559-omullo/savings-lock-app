package com.savingslock.app.api;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import com.savingslock.app.models.MpesaRequest;
import com.savingslock.app.models.MpesaResponse;

public interface MpesaApi {
    @POST("mpesa/process")
    Call<MpesaResponse> processPayment(@Body MpesaRequest request);
}
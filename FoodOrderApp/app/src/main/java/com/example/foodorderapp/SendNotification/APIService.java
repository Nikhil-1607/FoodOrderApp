package com.example.foodorderapp.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAmEOviYY:AAAAiFwdyYY:APA91bHq5vVNEtL5zdZpdSGzfpXW6JQ9166AqXPGbW3PcDMzMy3EZ4IvNPGPLuw_w2dwVh6a8q4tdrgduB485URfAGfojQEZHxRc8dwD9GKmlDJ9chxkePXYfKQ2AMqg02oVwDMT1b0R"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
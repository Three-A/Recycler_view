package com.creativeerror.createrr.iak.Service;

import com.creativeerror.createrr.iak.model.ExampleRetro;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

import static com.creativeerror.createrr.iak.Service.ServiceApi.END_POINT;

/**
 * Created by yudha on 5/14/2017.
 */

public interface ServiceApi {

    String END_POINT = "questions";

    @GET(END_POINT)
    Call<List<ExampleRetro>> getData();
}

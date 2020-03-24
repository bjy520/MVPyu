package com.shuaiyu.mvpyu.ceshi;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BlogService {
    @GET("cc/json/mobile_tel_segment.htm")
    Call<ResponseBody> getBlog(@Query("tel") String tel);
}

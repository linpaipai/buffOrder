import http.DefaultRequestBody;
import itf.GetData;
import okhttp3.*;
import utils.TextUtlis;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;

public class CommonHttp{
    //@url 请求地址 @getData回调接口
    public   void getHttpData(String url, GetData getData){
        String data = "";
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).header("Cookie",Constant.cookie19857003766)
                .build();
        try {
            Response response = okHttpClient.newCall(request).execute();
            if(response.isSuccessful()){
                //这里是body().toString
                data += response.body().string();

                if(getData!=null){
                    getData.getData(data);
                }
            }else{
                System.out.println("请求"+url+"报错");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //@url 请求地址 @getData回调接口
    public   void getHttpData(String url,  RequestBody body,GetData getData){
        String data = "";
        OkHttpClient okHttpClient = new OkHttpClient();

        Request request = new Request.Builder().url(url).post(body).
                header("Cookie",Constant.cookie19857003766)
                .build();

        try {
            Response response = okHttpClient.newCall(request).execute();
            if(response.isSuccessful()){
                //这里是body().toString
                data += response.body().string();
                if(getData!=null){
                    getData.getData(data);
                }
            }else{
                  System.out.println("请求"+url+"报错");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

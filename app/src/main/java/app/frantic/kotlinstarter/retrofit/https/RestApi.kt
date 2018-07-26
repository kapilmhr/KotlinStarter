package app.frantic.kotlinstarter.retrofit.https

import app.frantic.kotlinstarter.retrofit.model.data.Flower
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class RestApi {
    companion object {
        fun RestApi():RestApi.RequestAPI{
            val retrofit = Retrofit.Builder()
                    .baseUrl(API_URL.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            return retrofit.create(RequestAPI::class.java)
        }
    }

    interface RequestAPI {

        @GET(API_URL.GET_FLOWERS)
        fun getFlower(): Call<List<Flower>>

    }
}
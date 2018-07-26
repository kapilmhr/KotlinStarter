package app.frantic.kotlinstarter.retrofit.model

import app.frantic.kotlinstarter.retrofit.FlowerContract
import app.frantic.kotlinstarter.retrofit.https.RestApi
import app.frantic.kotlinstarter.retrofit.model.data.Flower
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FlowerModel : FlowerContract.FlowerModel{

    override fun getFlowersFromApi(listener: FlowerContract.ModelListener) {
        val response = RestApi.RestApi().getFlower()

        response.enqueue(object : Callback<List<Flower>> {

            override fun onFailure(call: Call<List<Flower>>?, t: Throwable?) {
                listener.onError(t?.message.toString())
            }

            override fun onResponse(call: Call<List<Flower>>?, response: Response<List<Flower>>?) {
                listener.onSuccess(response!!.body()!!.toList())

            }

        })

    }

}
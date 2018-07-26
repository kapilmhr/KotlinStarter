package app.frantic.kotlinstarter.retrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import app.frantic.kotlinstarter.R
import app.frantic.kotlinstarter.retrofit.adapter.FlowerAdapter
import app.frantic.kotlinstarter.retrofit.model.FlowerModel
import app.frantic.kotlinstarter.retrofit.model.data.Flower
import app.frantic.kotlinstarter.retrofit.presenter.FlowerPresenter
import kotlinx.android.synthetic.main.activity_flowers.*

class FlowersActivity : AppCompatActivity(),FlowerContract.FlowerView {

    lateinit var presenter:FlowerPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flowers)
        presenter = FlowerPresenter(this, FlowerModel())
        presenter.getFlowers()
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun onSuccessFlower(list: List<Flower>) {
        /*for(i in 0 until list.size){
            println(i)
            println(list.get(i).name)
        }*/
        recyclerView.adapter = FlowerAdapter(list)

    }

    override fun onErrorFlower(error: String) {
        Toast.makeText(applicationContext,error,Toast.LENGTH_LONG).show()
    }
}

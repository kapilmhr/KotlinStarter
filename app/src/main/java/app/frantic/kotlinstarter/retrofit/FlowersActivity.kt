package app.frantic.kotlinstarter.retrofit

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import app.frantic.kotlinstarter.R
import app.frantic.kotlinstarter.retrofit.adapter.FlowerAdapter
import app.frantic.kotlinstarter.retrofit.model.FlowerModel
import app.frantic.kotlinstarter.retrofit.model.data.Flower
import app.frantic.kotlinstarter.retrofit.presenter.FlowerPresenter
import app.frantic.kotlinstarter.retrofit.view.FlowerDetailActivity
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
        recyclerView.adapter = FlowerAdapter(list,{flower:Flower->flowerClicked(flower)})

    }

    fun flowerClicked(flower: Flower){
        println(flower.name)
        var i = Intent(this,FlowerDetailActivity::class.java)
        i.putExtra("Flower",flower)
        startActivity(i)
    }

    override fun onErrorFlower(error: String) {
        Toast.makeText(applicationContext,error,Toast.LENGTH_LONG).show()
    }
}

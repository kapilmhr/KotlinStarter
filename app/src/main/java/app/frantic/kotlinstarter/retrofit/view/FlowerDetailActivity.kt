package app.frantic.kotlinstarter.retrofit.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import app.frantic.kotlinstarter.R
import app.frantic.kotlinstarter.retrofit.model.data.Flower
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_flower_detail.*

class FlowerDetailActivity : AppCompatActivity() {
    var imageUrl="http://services.hanselandpetal.com/photos/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flower_detail)
        var flower = intent.getSerializableExtra("Flower") as Flower
        tv_flower_title.text = flower.name
        tv_flower_category.text = "Category: "+flower.category
        tv_flower_price.text = "Price $"+flower.price
        tv_flower_desc.text = flower.instructions
        Glide.with(applicationContext).load(imageUrl+flower.photo).into(iv_flower_image)
    }

}

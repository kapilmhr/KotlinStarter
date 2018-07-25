package app.frantic.kotlinstarter.recyclerview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import app.frantic.kotlinstarter.R
import kotlinx.android.synthetic.main.activity_animal_detail.*

class AnimalDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_detail)
        val animal = intent.getSerializableExtra("ANIMAL") as Animal
        name.text = animal.name
    }
}

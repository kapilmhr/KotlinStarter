package app.frantic.kotlinstarter.recyclerview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import app.frantic.kotlinstarter.R
import kotlinx.android.synthetic.main.activity_recycler_view.*
import java.util.ArrayList

class RecyclerViewActivity : AppCompatActivity() {

    val animals: ArrayList<Animal> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        addAnimals()
        recyclerView.layoutManager = LinearLayoutManager(this);
        recyclerView.adapter = AnimalAdapter(animals,{ animal: Animal -> animalClicked(animal)});

    }

    private fun animalClicked(animal: Animal) {
//        Toast.makeText(applicationContext,animal.name,Toast.LENGTH_SHORT).show()
        val i = Intent(applicationContext,AnimalDetailActivity::class.java)
        i.putExtra("ANIMAL",animal)
        startActivity(i)
    }


    // Adds animals to the empty animals ArrayList
    fun addAnimals() {
        animals.add(Animal("dog",false))
        animals.add(Animal("cat",false))
        animals.add(Animal("owl",true))
        animals.add(Animal("cheetah",false))
        animals.add(Animal("raccoon",false))
        animals.add(Animal("bird",true))
        animals.add(Animal("snake",false))
        animals.add(Animal("lizard",false))
        animals.add(Animal("hamster",false))
        animals.add(Animal("bear",false))
        animals.add(Animal("lion",false))
        animals.add(Animal("tiger",false))
        animals.add(Animal("horse",false))
        animals.add(Animal("frog",false))
        animals.add(Animal("fish",false))
        animals.add(Animal("shark",false))
        animals.add(Animal("turtle",false))
        animals.add(Animal("elephant",false))
        animals.add(Animal("cow",false))
        animals.add(Animal("beaver",false))
        animals.add(Animal("bison",false))
        animals.add(Animal("porcupine",false))
        animals.add(Animal("rat",false))
        animals.add(Animal("mouse",false))
        animals.add(Animal("goose",true))
        animals.add(Animal("deer",false))
        animals.add(Animal("fox",false))
        animals.add(Animal("moose",false))
        animals.add(Animal("buffalo",false))
        animals.add(Animal("monkey",false))
        animals.add(Animal("penguin",false))
        animals.add(Animal("parrot",true))
    }
}

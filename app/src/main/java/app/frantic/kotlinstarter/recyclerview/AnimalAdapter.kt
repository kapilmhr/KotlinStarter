package app.frantic.kotlinstarter.recyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import app.frantic.kotlinstarter.R
import kotlinx.android.synthetic.main.animal_list_item.view.*

class AnimalAdapter(val items : ArrayList<Animal>, val itemClickListener:(Animal) -> Unit) : RecyclerView.Adapter<ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.animal_list_item,parent,false))
    }

    override fun getItemCount(): Int {
        return  items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.tvAnimalType.text = items.get(position)
       /* holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context,items.get(position),Toast.LENGTH_LONG).show()
        }*/

        (holder as ViewHolder).bind(items.get(position),itemClickListener)

    }

}

class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
//   val tvAnimalType = view.tv_animal_type

    fun bind(animal: Animal, clickListener: (Animal) -> Unit){
//        val b: String?  = null
//        print(b?.length ?: -1)

        itemView.tv_animal_type.text = animal.name;
        var fly = if(animal.canfly) "Yes" else "NO"
        itemView.tv_animal_fly.text = "Can Fly? "+ fly;
        itemView.setOnClickListener { clickListener(animal) }
    }
}

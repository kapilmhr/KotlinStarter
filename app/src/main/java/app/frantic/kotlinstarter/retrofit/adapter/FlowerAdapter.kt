package app.frantic.kotlinstarter.retrofit.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.frantic.kotlinstarter.R
import app.frantic.kotlinstarter.retrofit.model.data.Flower
import kotlinx.android.synthetic.main.flower_list_item.view.*

class FlowerAdapter(val flowers:List<Flower>):RecyclerView.Adapter<FlowerAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.flower_list_item,parent,false))
    }

    override fun getItemCount(): Int {
        return  flowers.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = flowers.get(position).name
        holder.price.text = "Price: $"+flowers.get(position).price
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var name = view.tv_flower_name;
        var price = view.tv_price;
    }

}
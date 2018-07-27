package app.frantic.kotlinstarter.retrofit.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.frantic.kotlinstarter.R
import app.frantic.kotlinstarter.retrofit.model.data.Flower
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_flower_detail.*
import kotlinx.android.synthetic.main.flower_list_item.view.*

class FlowerAdapter(val flowers:List<Flower>, val itemclickListener: (Flower) -> Unit):RecyclerView.Adapter<FlowerAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.flower_list_item,parent,false))
    }

    override fun getItemCount(): Int {
        return  flowers.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(flowers.get(position),itemclickListener)
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var name = view.tv_flower_name;
        var price = view.tv_price;
        var imageView = view.iv_flower_image
        var imageUrl="http://services.hanselandpetal.com/photos/"
        fun bind(flower:Flower,clickListener:(Flower)->Unit){
            name.text = flower.name
            price.text = "Price: $"+flower.price
            Glide.with(itemView.context).load(imageUrl+flower.photo).into(imageView)

            itemView.setOnClickListener { clickListener(flower) }
        }
    }

}
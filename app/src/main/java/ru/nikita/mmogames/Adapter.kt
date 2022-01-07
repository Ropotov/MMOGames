package ru.nikita.mmogames

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.game_item.view.*
import ru.nikita.mmogames.Model.GamesApiItem


class Adapter : RecyclerView.Adapter<Adapter.MyViewHolder>() {
    var gameList = emptyList<GamesApiItem>()

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val photo: ImageView = itemView.game_image
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater
            .from(parent.context).inflate(R.layout.game_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        with(holder) {
            itemView.name_item.text = gameList[position].title
            itemView.developer_item.text = gameList[position].developer
            itemView.platform_item.text = gameList[position].platform
            Picasso.get().load(gameList[position].thumbnail).into(photo)
        }
    }

    override fun getItemCount() = gameList.size

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<GamesApiItem>) {
        gameList = list
        notifyDataSetChanged()
    }
}

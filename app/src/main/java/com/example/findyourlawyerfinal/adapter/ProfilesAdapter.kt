package com.example.findyourlawyerfinal.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.findyourlawyerfinal.R
import de.hdodenhof.circleimageview.CircleImageView

interface OnItemClickListener {
    fun onItemClick(name: String, image : Int)
}

class ProfilesAdapter(val nameList : ArrayList<String> , val imageList : ArrayList<Int>) : RecyclerView.Adapter<ProfilesAdapter.ProfilesViewHolder>() {

    class ProfilesViewHolder(itemView: View) :  RecyclerView.ViewHolder(itemView){
        val name : TextView = itemView.findViewById(R.id.profileName)
        val image : CircleImageView = itemView.findViewById(R.id.profileImage)
        val myCardView : CardView = itemView.findViewById(R.id.profileCardview)

    }
    private var listener: OnItemClickListener? = null

    // Setter method for the listener
    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfilesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.profiles_cardview,
            parent, false)
        return ProfilesViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return nameList.size
    }

    override fun onBindViewHolder(holder: ProfilesViewHolder, position: Int) {
        holder.name.text = nameList[position]
        holder.image.setImageResource(imageList[position])

        // Set up click listener
        holder.itemView.setOnClickListener {
            listener?.onItemClick(nameList[position],imageList[position])
        }

    }
}
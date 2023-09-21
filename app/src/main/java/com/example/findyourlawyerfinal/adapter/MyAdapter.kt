package com.example.findyourlawyerfinal.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

import com.example.findyourlawyerfinal.R
import com.example.findyourlawyerfinal.customerSide.LegalHelpProfilesFragment


class MyAdapter(
    val arrayList: ArrayList<String>

) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val text : TextView = itemView.findViewById(R.id.textview_recycler)
        val myCardView : CardView = itemView.findViewById(R.id.myCardView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.legal_help_types_cardview,
            parent, false)

        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.text.text = arrayList.get(position)


        holder.myCardView.setOnClickListener {


            val context = holder.itemView.context
            // Create an instance of the LawyersFragment
            val lawyersFragment = LegalHelpProfilesFragment()

            // Get the FragmentManager
            val fragmentManager = (context as AppCompatActivity).supportFragmentManager

            // Start a FragmentTransaction to replace the current fragment with LawyersFragment
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentCustomerContainerView, lawyersFragment)
            fragmentTransaction.addToBackStack(null) // Optional: Adds the transaction to the back stack
            fragmentTransaction.commit()

        }

    }


}
package com.example.findyourlawyerfinal.customerSide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.findyourlawyerfinal.R

import com.example.findyourlawyerfinal.adapter.OnItemClickListener
import com.example.findyourlawyerfinal.adapter.ProfilesAdapter
import com.example.findyourlawyerfinal.databinding.FragmentLegalHelpProfilesBinding



class LegalHelpProfilesFragment : Fragment() {

    lateinit var binding : FragmentLegalHelpProfilesBinding

    private lateinit var adapter: ProfilesAdapter
    private lateinit var recyclerView: RecyclerView

    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLegalHelpProfilesBinding.inflate(layoutInflater,container,false)





        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recyclerView = binding.profileRecyclerView
        adapter = ProfilesAdapter(nameList,imageList)


        nameList.add("Dr. Kislay Pandey")
        nameList.add("Harish Salve")
        nameList.add("Mukul Rohatgi")
        nameList.add("Ram Jethmalani")

        imageList.add(R.drawable.advocate_pic)
        imageList.add(R.drawable.harish)
        imageList.add(R.drawable.mukul)
        imageList.add(R.drawable.remj)



        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        recyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : OnItemClickListener {
            override fun onItemClick(name: String, image: Int) {
                // Handle the click event here in your fragment or activity
                // You can use the 'name' parameter to identify which item was clicked
                val pname : String = name
                val pfp : Int = image

                Toast.makeText(requireContext(),pname,Toast.LENGTH_SHORT).show()

                val bundle = Bundle()
                bundle.putString("pname",pname)
                bundle.putInt("pfp",image)

                val enlargedFragment = EnlargedProfileFragment()
                enlargedFragment.arguments = bundle


                val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentCustomerContainerView, enlargedFragment)
                transaction.addToBackStack(null) // Optional: Adds the transaction to the back stack
                transaction.commit()
            }
        })
    }

}
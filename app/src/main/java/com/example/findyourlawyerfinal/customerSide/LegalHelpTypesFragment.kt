package com.example.findyourlawyerfinal.customerSide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.findyourlawyerfinal.R
import com.example.findyourlawyerfinal.adapter.MyAdapter
import com.example.findyourlawyerfinal.databinding.FragmentLegalHelpTypesBinding


class LegalHelpTypesFragment : Fragment() {

    private lateinit var adapter: MyAdapter
    private lateinit var recyclerView: RecyclerView



    var category = ArrayList<String>()
    lateinit var binding : FragmentLegalHelpTypesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLegalHelpTypesBinding.inflate(layoutInflater,container, false)




        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recyclerView = binding.lawyerTypes
        adapter = MyAdapter(category)


        category.add("Advocates")
        category.add("Notaries")
        category.add("Arbitrator")
        category.add("Mediator")
        category.add("Document writers")
//        category.add("Criminal Defence Lawyer")
//        category.add("Constitutional Lawyer")
//        category.add("Bankruptcy Lawyer")
//        category.add("Business Lawyer")
//        category.add("Estate Planning Lawyer")
//        category.add("Intellectual Property Lawyer")
//        category.add("Estate Planning Lawyer")
//        category.add("Estate Planning Lawyer")
//        category.add("Estate Planning Lawyer")
//        category.add("Estate Planning Lawyer")
//        category.add("Estate Planning Lawyer")


        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        recyclerView.adapter = adapter

    }


}
package com.example.findyourlawyerfinal.customerSide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.findyourlawyerfinal.R
import com.example.findyourlawyerfinal.databinding.FragmentCustomerHomeBinding


class CustomerHomeFragment : Fragment() {


    lateinit var binding : FragmentCustomerHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCustomerHomeBinding.inflate(layoutInflater,container,false)


        binding.lawyerCard.setOnClickListener {
            val fragmentManager : FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentCustomerContainerView, LegalHelpTypesFragment())
            fragmentTransaction.addToBackStack(null) // Optional: Adds the transaction to the back stack
            fragmentTransaction.commit()
        }


        return binding.root
    }

}
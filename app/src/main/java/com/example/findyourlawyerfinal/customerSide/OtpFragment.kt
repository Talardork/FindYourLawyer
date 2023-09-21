package com.example.findyourlawyerfinal.customerSide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.findyourlawyerfinal.R
import com.example.findyourlawyerfinal.databinding.FragmentOtpBinding


class OtpFragment : Fragment() {

    lateinit var binding : FragmentOtpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOtpBinding.inflate(layoutInflater,container,false)

        binding.custOtpBtn.setOnClickListener {
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentCustomerContainerView, CustomerHomeFragment())
            transaction.addToBackStack(null) // Optional: Adds the transaction to the back stack
            transaction.commit()
        }

        return binding.root
    }


}
package com.example.findyourlawyerfinal.customerSide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.findyourlawyerfinal.R
import com.example.findyourlawyerfinal.databinding.FragmentSignInBinding


class SignInFragment : Fragment() {

    lateinit var binding : FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignInBinding.inflate(layoutInflater,container,false)

        binding.button.setOnClickListener {

            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentCustomerContainerView, OtpFragment())
            transaction.addToBackStack(null) // Optional: Adds the transaction to the back stack
            transaction.commit()
        }
        binding.alreadyHaveAnAccount.setOnClickListener{
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentCustomerContainerView, LoginFragment())
            transaction.addToBackStack(null) // Optional: Adds the transaction to the back stack
            transaction.commit()
        }


        return binding.root




    }


}
package com.example.findyourlawyerfinal.customerSide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.findyourlawyerfinal.R
import com.example.findyourlawyerfinal.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    lateinit var binding : FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater,container,false)

        binding.createANewAccount.setOnClickListener{
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentCustomerContainerView, SignInFragment())
            transaction.addToBackStack(null) // Optional: Adds the transaction to the back stack
            transaction.commit()
        }
        binding.button.setOnClickListener {

            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentCustomerContainerView, OtpFragment())
            transaction.addToBackStack(null) // Optional: Adds the transaction to the back stack
            transaction.commit()
        }


        return binding.root
    }


}
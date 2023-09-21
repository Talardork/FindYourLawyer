package com.example.findyourlawyerfinal.providerSide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.findyourlawyerfinal.R
import com.example.findyourlawyerfinal.databinding.FragmentProviderLoginBinding


class ProviderLoginFragment : Fragment() {

    lateinit var binding: FragmentProviderLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater.inflate(R.layout.fragment_provider_login, container, false)
    }


}
package com.example.findyourlawyerfinal.providerSide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.findyourlawyerfinal.R

class LegalProviderActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legal_provider)

        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        val myFragment = ProviderSignInFragment()
        fragmentTransaction.add(R.id.fragmentProviderContainerView, myFragment)
        fragmentTransaction.commit()

    }
}
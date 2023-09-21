package com.example.findyourlawyerfinal.customerSide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.findyourlawyerfinal.R
import com.example.findyourlawyerfinal.databinding.FragmentEnlargedProfileBinding
import de.hdodenhof.circleimageview.CircleImageView


class EnlargedProfileFragment : Fragment() {



    lateinit var profileName : TextView
    lateinit var profilePfp : CircleImageView
    lateinit var binding : FragmentEnlargedProfileBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_enlarged_profile, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val receivedPname = arguments?.getString("pname")
        val receivedPfp = arguments?.getInt("pfp")

        profileName = view.findViewById(R.id.enlarged_pname)
        profilePfp = view.findViewById(R.id.enlargerd_pfp)

        receivedPname.let {
            profileName.text = it
        }
        receivedPfp?.let {
            profilePfp.setImageResource(it)
        }




    }

}
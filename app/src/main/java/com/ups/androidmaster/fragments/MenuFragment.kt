package com.ups.androidmaster.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.firebase.auth.FirebaseAuth
import com.ups.androidmaster.R
import com.ups.androidmaster.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {
    private lateinit var navController: NavController
    private lateinit var mAuth: FirebaseAuth
    private lateinit var binding:FragmentMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMenuBinding.inflate(inflater,container,false)
        return binding.root
        //return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init(view)
        binding.btnIMCApp.setOnClickListener {
            navController.navigate(R.id.action_menuFragment_to_imcCalculatorActivity)
        }
        binding.btnTask.setOnClickListener {
            navController.navigate(R.id.action_menuFragment_to_homeFragment)
        }
        binding.btnTODO.setOnClickListener {
            navController.navigate(R.id.action_menuFragment_to_todoActivity)
        }
    }

    private fun init(view: View) {
        navController = Navigation.findNavController(view)
        mAuth = FirebaseAuth.getInstance()
    }

}
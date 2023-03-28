package com.example.navcomponen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navcomponen.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    lateinit var binding : FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {
            val name = binding.txtUsername.text.toString()
            val password = binding.txtPassword.text.toString()
            val bundle = Bundle()
            bundle.putString("Name", name)
            bundle.putString("Password", password)
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment, bundle)
        }
        binding.SignUp.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
    }

}
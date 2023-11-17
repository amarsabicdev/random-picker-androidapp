package com.example.randompickerv3

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.randompickerv3.databinding.FragmentAdminLoginBinding
import com.example.randompickerv3.databinding.FragmentInputPlayerBinding


class AdminLoginFragment : Fragment() {
    private var _binding : FragmentAdminLoginBinding? = null
    private val binding get() = _binding!!




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAdminLoginBinding.inflate(inflater, container, false)
        val view = binding.root

        /*
        setting hard core password to administration login
         */
         val passwordFLogin : String = "9999"


        binding.buttonLogin.setOnClickListener {
             val passwordFLoginCheck = binding.ipPassword.text.toString()
            Log.i("loginTag","password je $passwordFLoginCheck")
            if (passwordFLoginCheck.equals(passwordFLogin)){
                findNavController().navigate(R.id.adminFragment)
            }else{
                Toast.makeText(requireContext(),"Pogresan password, unesite ispravan !",Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }


}
package com.example.randompickerv3

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.randompicker.Users.User
import com.example.randompickerv3.databinding.FragmentShowPickedPlayerBinding


class ShowPickedPlayerFragment : Fragment() {


    private var _binding: FragmentShowPickedPlayerBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
          var viewModelSPSF=ViewModelProvider(this).get(ShowPickedPlayerViewModel::class.java)
        _binding = FragmentShowPickedPlayerBinding.inflate(inflater, container, false)
        val view = binding.root


        var getInput2 = requireArguments().getParcelableArrayList<User>("bundleUserList")
         viewModelSPSF.getPlayerData(getInput2)

        viewModelSPSF.user.observe(viewLifecycleOwner){ user ->
            binding.textViewShowPickedPlayer.text = user.ime
        }

        return view
    }
 }
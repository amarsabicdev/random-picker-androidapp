package com.example.randompickerv3


import android.os.Bundle
import android.util.Log

import androidx.fragment.app.Fragment
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import android.widget.Button

import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.randompicker.Users.User
import com.example.randompicker.Users.UserDatabase
import com.example.randompickerv3.RecycleViewAdapter.UserRecyclerViewAdapter
import com.example.randompickerv3.Users.UserViewModel
import com.example.randompickerv3.Users.UserViewModelFactory
import com.example.randompickerv3.databinding.FragmentAdminBinding

import com.example.randompickerv3.test.CustomGesture
import com.example.randompickerv3.test.CommunicationInterface

import kotlin.collections.ArrayList



class AdminFragment : Fragment(),CommunicationInterface {
    private var _binding : FragmentAdminBinding? = null
    private val binding get() = _binding!!


    private lateinit var userViewModel: UserViewModel
    private lateinit var adapter: UserRecyclerViewAdapter

     var userList : ArrayList<User> = ArrayList()
    lateinit var  lIButton : Button




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("fragmentProvjera","ONCREATEVIEW")
        _binding = FragmentAdminBinding.inflate(inflater, container, false)
        val view = binding.root


        val dao= UserDatabase.getInstance(requireContext()).userdao
        val factory= UserViewModelFactory(dao)
        userViewModel= ViewModelProvider(this,factory).get(UserViewModel::class.java)

        displayStudentsList()

        binding.recyclerView.layoutManager=LinearLayoutManager(requireContext())
        adapter= UserRecyclerViewAdapter(this)
        binding.recyclerView.adapter=adapter

        binding.buttonPickRandomPlayer.setOnClickListener {
             var  bundle : Bundle? = null
            Log.i("sendArrayToNextFragment", "Bundle from AdminFragment : \n " + bundle.toString())
             bundle = bundleOf("bundleUserList" to userList)

            findNavController().navigate(R.id.showPickedPlayerFragment, bundle)
        }
        return view
    }

    private fun itemGestigure(viewCG : View,userCG : User,userViewModelCG : UserViewModel){
        var cg = CustomGesture(viewCG,userCG,userViewModelCG)


        viewCG.setOnTouchListener { v, event ->
            cg.onTouchEvent(event)
        }
    }

    private fun listItemDelete(user : User, view : View){
        lIButton = view.findViewById<Button>(R.id.buttonDeleteUser)
        lIButton.setOnClickListener {
            userViewModel.deleteUser(user)
            displayStudentsList()
        }

    }

    private fun displayStudentsList() {
        userViewModel.getUsers.observe(viewLifecycleOwner, {
            userList.clear()
            userList.addAll(it)
            adapter.setList(it)
            adapter.notifyDataSetChanged()
        })
    }

    override fun adminFandRVAdapterComm(viewT: View, user: User) {
        listItemDelete(user, viewT)
        itemGestigure(viewT,user,userViewModel)
    }
}


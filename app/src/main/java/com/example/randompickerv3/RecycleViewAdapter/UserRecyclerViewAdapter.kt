
package com.example.randompickerv3.RecycleViewAdapter

import android.util.Log
import android.view.GestureDetector
import android.view.LayoutInflater

import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

import com.example.randompicker.Users.User

import com.example.randompickerv3.R

import com.example.randompickerv3.test.CommunicationInterface

class UserRecyclerViewAdapter(
   /* private val clickListenerFuncion:(User)->Unit,
    private val clickGestureFunction:(User)-> Unit*/
    private val testinInterFace : CommunicationInterface
) : RecyclerView.Adapter<UserViewHolder>(){


    public val userList = ArrayList<User>()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item,parent,false)
        return UserViewHolder(listItem)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
      holder.bind(userList[position], /*clickListenerFuncion,this,clickGestureFunction*/testinInterFace)
    }


    fun setList(users:List<User>){
        userList.clear()
        userList.addAll(users)

    }



}



class UserViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    lateinit var adapter: UserRecyclerViewAdapter
  lateinit var gestigureV:GestureDetector

    fun bind(user : User,
             testinInterFace: CommunicationInterface
            /* clickListener: (User) -> Unit ,
             adapter: UserRecyclerViewAdapter,
             clickGestureFunction: (User) -> Unit*/ ){

    /////////////////////////////////////////////TEST


    testinInterFace.adminFandRVAdapterComm(view,user)

       var userIme = view.findViewById<TextView>(R.id.tvName)
        var userBroj =  view.findViewById<TextView>(R.id.tvNumber)
        userIme.setText(user.ime)
        userBroj.setText(user.bTelefona)
        Log.i("provjeraInterface","${user.ime}")
    /////////////////////////////////////////////TEST

    /*
        this.adapter = adapter
       // this.gestigureV=gestigure

//////////////////////////////
        // Dodajte ovu liniju kako biste postavili GestureDetector
        gestigureV = GestureDetector(view.context, object : GestureDetector.SimpleOnGestureListener() {
            override fun onDown(e: MotionEvent): Boolean {
                // Poziva se kada prst dodirne ekran
                Log.i("testing", "kliknutGestigure")
               // clickGestureFunction(user)
                return true
            }

            override fun onLongPress(e: MotionEvent) {
                Log.i("testing", "kliknutGestigureLong")
                clickGestureFunction(user)
                // Poziva se kada se desi long press

            }
        })
//////////////////////////////

        val nameTextView = view.findViewById<TextView>(R.id.tvName)
        val emailTextView = view.findViewById<TextView>(R.id.tvNumber)
        val deleteUserButton = view.findViewById<Button>(R.id.buttonDeleteUser)
        nameTextView.text = user.ime
        emailTextView.text = user.bTelefona

        lateinit var userViewModel: UserViewModel
        val dao= UserDatabase.getInstance(view.context).userdao
        val factory= UserViewModelFactory(dao)


        deleteUserButton.setOnClickListener {
            userViewModel = ViewModelProvider(view.context as ViewModelStoreOwner, factory).get(UserViewModel::class.java)


            userViewModel.deleteUser(
                user
            )
            userViewModel.getUsers.observe(view.context as LifecycleOwner,{

                adapter.setList(it)
                adapter.notifyDataSetChanged()



            })


///////////////////////////////////////////////////////////////


        }

        view.setOnClickListener {

            clickListener(user)
            Log.i("mytag","${user.ime}")
            Toast.makeText(view.context,"${user.ime}",Toast.LENGTH_SHORT)
        }

        view.setOnTouchListener { _, event ->
            gestigureV.onTouchEvent(event)

        }*/
 }


}

package com.example.contact_list
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contact_list.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayContact()

        binding.floatingActionButton.setOnClickListener {
            val intent = Intent(this, createActivity::class.java)
            startActivity(intent)
        }

    }
    fun displayContact(){
        val contact1=Contact("https://media.istockphoto.com/id/1403709099/photo/african-teenage.webp?b=1&s=170667a&w=0&k=20&c=b4ux5ZbPJFsSjo0b2-4PSXCuV5SdwuA6AQtI-mCUKoo= ","07886060933","cynthia@gmail.com","cynthia")
        val contact2= Contact("https://media.istockphoto.com/id/644806678/photo/little-girl-posing-on-gray-background.webp?b=1&s=170667a&w=0&k=20&c=yI4pUFLALj6BlLSi0TyNrkbwIrrCzLqzwYYOrV8QeqE=","07895543392","mary@gmail.com","mary")
        val contact3=Contact("https://images.unsplash.com/photo-1593878024377-b38927fc7689?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YmxhY2slMjBnaXJsfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","0784556789","jane@gmail.com","jane")
        val contact4=Contact("https://images.unsplash.com/photo-1522390108011-5f8667fd551d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8YmxhY2slMjBnaXJsfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","07567784399","ann@gmail.com","ann")
        val contact5=Contact("https://media.istockphoto.com/id/1382459668/photo/pretty-young-afro-woman-among-palm-trees.webp?b=1&s=170667a&w=0&k=20&c=V_278p-swKuB4vD95jh5etDyHyzupc53WlDBnLbMGUY=","0792035101","berly@gmail.com","berlyz")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5)
        val contactAdapter=ContactAdapter(contactList)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        binding.rvContact.adapter=contactAdapter

    }
}
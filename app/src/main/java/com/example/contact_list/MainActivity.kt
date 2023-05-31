package com.example.contact_list
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Create a list of contacts
        val contacts = mutableListOf(
            Contact( "Caro", "caro@gmail.com", "+254789453", imageResId = R.drawable.personal),
            Contact("Joy",  "joy@gmail.com", "+2567894532", imageResId = R.drawable.personal),
            Contact("Nancy","yvonne@gmail.com","0785645342", imageResId = R.drawable.personal),
            Contact("Rose" ,"rose@gmail.com", "annkelly@gmail.com", imageResId = R.drawable.personal),
            Contact( "Walter", "walter@gmail.com",  "075649384", imageResId = R.drawable.personal),
            Contact("Gramy", "gramy@gmai.com", "0798032356", imageResId = R.drawable.personal),
            Contact( "Nick", "nick@gmail.com",  "0789457458", imageResId = R.drawable.personal)
        )
        // Create a recycler view and set the adapter
        val recyclerView = findViewById<RecyclerView>(R.id.rvContact)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ContactRvAdapter(contacts)
    }
}
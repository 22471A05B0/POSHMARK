package com.example.poshee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
//import com.example.poshin.databinding.ActivityMain4Binding
import com.example.poshee.databinding.ActivityMain3Binding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    private lateinit var firebaseAuth: FirebaseAuth
    //private lateinit var databaseReference: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth=FirebaseAuth.getInstance()
        binding.signin.setOnClickListener {
            val i=Intent(this,MainActivity2::class.java)
            startActivity(i)

        }
        // databaseReference=firebaseDatabase.reference.child("users")

        binding.regis.setOnClickListener {
            val sname=binding.name.text.toString()
            val email=binding.email.text.toString()
            val pass=binding.password.text.toString()
            val confirmpass=binding.cpas.text.toString()

            if(sname.isNotEmpty() && email.isNotEmpty() && pass.isNotEmpty() && confirmpass.isNotEmpty()){
                if(pass == confirmpass){
                    firebaseAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener {
                        if(it.isSuccessful){
                            val i=Intent(this,MainActivity2::class.java)
                            startActivity(i)
                        }else{
                            Toast.makeText(this,it.exception.toString(),Toast.LENGTH_SHORT).show()
                        }
                    }

                }else{
                    Toast.makeText(this,"password is not matching",Toast.LENGTH_SHORT).show()
                }

            }else{
                Toast.makeText(this,"Empty fields are not allowed",Toast.LENGTH_SHORT).show()

            }

        }
    }


}
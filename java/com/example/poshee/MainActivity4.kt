package com.example.poshee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.window.OnBackInvokedDispatcher
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.poshee.databinding.ActivityMain4Binding
import com.example.poshee.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity4 : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityMain4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val toggle = ActionBarDrawerToggle(this, binding.drawerLayout, binding.toolbar, R.string.nav_open, R.string.nav_close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navigationDrawer.setNavigationItemSelectedListener(this)

        fragmentManager=supportFragmentManager
        openFragment(HomeFragment())


    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean{
        when(item.itemId){
            R.id.nav_home -> openFragment(HomeFragment())
            R.id.nav_cart -> openFragment(CartFragment())
            R.id.nav_profile -> openFragment(ProfileFragment())

        }
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }


    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)){
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()//Calls the superclass method to handle the back press
        }
    }
    private fun openFragment(fragment:Fragment){
        val fragmentTransaction:FragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container,fragment)
        fragmentTransaction.addToBackStack(null)//Optional:adds the transaction to the back stack
        fragmentTransaction.commit()

    }
}
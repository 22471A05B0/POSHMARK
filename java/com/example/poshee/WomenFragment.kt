package com.example.poshee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class WomenFragment : Fragment() {
    lateinit var btn1: Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var btn4:Button
    lateinit var btn5:Button
    lateinit var btn6:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_women, container, false)

        // Initialize the button
        btn1 = view.findViewById(R.id.one)
        btn2=view.findViewById(R.id.two)
        btn3=view.findViewById(R.id.three)
        btn4=view.findViewById(R.id.four)
        btn5=view.findViewById(R.id.five)
        btn6=view.findViewById(R.id.six)

        // Set up the button click listener to navigate to ThemeFragment
        btn1.setOnClickListener {
            val themeFragment = WomenFragment1()

            // Begin the fragment transaction
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

            // Replace the current fragment with the ThemeFragment
            fragmentTransaction.replace(R.id.fragment_container, themeFragment)

            // Optionally add the transaction to the back stack so the user can navigate back
            fragmentTransaction.addToBackStack(null)

            // Commit the transaction
            fragmentTransaction.commit()
        }
        btn2.setOnClickListener {
            val themeFragment = WomenFragment2()

            // Begin the fragment transaction
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

            // Replace the current fragment with the ThemeFragment
            fragmentTransaction.replace(R.id.fragment_container, themeFragment)

            // Optionally add the transaction to the back stack so the user can navigate back
            fragmentTransaction.addToBackStack(null)

            // Commit the transaction
            fragmentTransaction.commit()
        }
        btn3.setOnClickListener {
            val themeFragment = WomenFragment3()

            // Begin the fragment transaction
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

            // Replace the current fragment with the ThemeFragment
            fragmentTransaction.replace(R.id.fragment_container, themeFragment)

            // Optionally add the transaction to the back stack so the user can navigate back
            fragmentTransaction.addToBackStack(null)

            // Commit the transaction
            fragmentTransaction.commit()
        }
        btn4.setOnClickListener {
            val themeFragment = WomenFragment4()

            // Begin the fragment transaction
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

            // Replace the current fragment with the ThemeFragment
            fragmentTransaction.replace(R.id.fragment_container, themeFragment)

            // Optionally add the transaction to the back stack so the user can navigate back
            fragmentTransaction.addToBackStack(null)

            // Commit the transaction
            fragmentTransaction.commit()
        }
        btn5.setOnClickListener {
            val themeFragment = WomenFragment5()

            // Begin the fragment transaction
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

            // Replace the current fragment with the ThemeFragment
            fragmentTransaction.replace(R.id.fragment_container, themeFragment)

            // Optionally add the transaction to the back stack so the user can navigate back
            fragmentTransaction.addToBackStack(null)

            // Commit the transaction
            fragmentTransaction.commit()
        }
        btn6.setOnClickListener {
            val themeFragment = WomenFragment6()

            // Begin the fragment transaction
            val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

            // Replace the current fragment with the ThemeFragment
            fragmentTransaction.replace(R.id.fragment_container, themeFragment)

            // Optionally add the transaction to the back stack so the user can navigate back
            fragmentTransaction.addToBackStack(null)

            // Commit the transaction
            fragmentTransaction.commit()
        }

        return view
    }
}
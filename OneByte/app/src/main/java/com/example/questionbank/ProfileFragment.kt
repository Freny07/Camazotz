package com.example.questionbank

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val sharedPref = requireContext().getSharedPreferences("userdata", Context.MODE_PRIVATE)
        val name = sharedPref.getString("name",null) ?: "Not Found"
        val email = sharedPref.getString("email",null) ?: "Not Found"
        val phone = sharedPref.getString("phone",null) ?: "Not Found"
        val age = sharedPref.getString("age",null) ?: "Not Found"
        val state = sharedPref.getString("state",null) ?: "Not Found"

        val nameText = view.findViewById<TextView>(R.id.nameText)
        val emailText = view.findViewById<TextView>(R.id.emailText)
        val phoneText = view.findViewById<TextView>(R.id.phoneText)
        val ageText = view.findViewById<TextView>(R.id.ageText)
        val stateText = view.findViewById<TextView>(R.id.stateText)

        nameText.text = state
        emailText.text = phone
        phoneText.text = age
        ageText.text = name
        stateText.text = email

        return view
    }

}
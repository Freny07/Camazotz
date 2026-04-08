package com.example.questionbank

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val sharedPref = requireContext().getSharedPreferences("userdata", Context.MODE_PRIVATE)
        val fullName = sharedPref.getString("name",null) ?: ""

        val dbmsBtn = view.findViewById<MaterialButton>(R.id.dbmsBtn)
        val cttpBtn = view.findViewById<MaterialButton>(R.id.cttpBtn)

        dbmsBtn.setOnClickListener {
            val intent = Intent(requireContext(), CTTP_Q1::class.java)
            startActivity(intent)
        }

        cttpBtn.setOnClickListener {
            val intent = Intent(requireContext(), DBMS_Q1::class.java)
            startActivity(intent)
        }

        return view
    }
}
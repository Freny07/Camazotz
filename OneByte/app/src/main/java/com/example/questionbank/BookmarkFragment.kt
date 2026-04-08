package com.example.questionbank

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import org.w3c.dom.Text

class BookmarkFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_bookmark, container, false)

        val dbms1 = view.findViewById<TextView>(R.id.dbms1)
        val dbms2 = view.findViewById<TextView>(R.id.dbms2)
        val noBookmark = view.findViewById<TextView>(R.id.noBookmark)

        val sharedPrefDbms1 = requireContext().getSharedPreferences("bookmarkdbms1", Context.MODE_PRIVATE)
        val sharedPrefDbms2 = requireContext().getSharedPreferences("bookmarkdbms2", Context.MODE_PRIVATE)

        val dbmsq1 = sharedPrefDbms1.contains("dbms1")
        val dbmsq2 = sharedPrefDbms2.contains("dbms2")

        if (dbmsq1){
            dbms1.text = sharedPrefDbms1.getString("dbms1","")
        }

        if (dbmsq2){
            dbms2.text = sharedPrefDbms2.getString("dbms2","")
        }

        if (!dbmsq1 && !dbmsq2){
            noBookmark.text = "No Bookmarks Yet"
        }

        val cttp1 = view.findViewById<TextView>(R.id.cttp1)
        val cttp2 = view.findViewById<TextView>(R.id.cttp2)
        val noBookmark1 = view.findViewById<TextView>(R.id.noBookmark1)

        val sharedPrefCttp1 = requireContext().getSharedPreferences("bookmarkcttp1", Context.MODE_PRIVATE)
        val sharedPrefCttp2 = requireContext().getSharedPreferences("bookmarkcttp2", Context.MODE_PRIVATE)

        val cttpq1 = sharedPrefCttp1.contains("cttp1")
        val cttpq2 = sharedPrefCttp2.contains("cttp2")

        if (cttpq1){
            cttp1.text = sharedPrefCttp1.getString("cttp1","")
        }

        if (cttpq2){
            cttp2.text = sharedPrefCttp2.getString("cttp2","")
        }

        if (!cttpq1 && !cttpq2){
            noBookmark1.text = "No Bookmarks Yet"
        }

        return view

    }
}
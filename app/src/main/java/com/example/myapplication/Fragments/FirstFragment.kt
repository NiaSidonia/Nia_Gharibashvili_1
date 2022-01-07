package com.example.myapplication.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val send_btn = view.findViewById<Button>(R.id.button)
        val userInput = view.findViewById<EditText>(R.id.amount)

        val controller = Navigation.findNavController(view)

        send_btn.setOnClickListener {

            val string = userInput.text.toString()

            if (string.isEmpty()) {
                return@setOnClickListener
            }

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(string)
            controller.navigate(action)
        }

    }

}
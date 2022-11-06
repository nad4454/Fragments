package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.fragments.databinding.Fragment1Binding

class Fragment1 : Fragment() {

    lateinit var binding: Fragment1Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = Fragment1Binding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.floatingBtn.setOnClickListener{
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView2, Fragment2())
                .addToBackStack("Fragment2")
                .commit()
        }
    }


}
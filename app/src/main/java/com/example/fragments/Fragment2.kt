package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragments.databinding.Fragment1Binding
import com.example.fragments.databinding.Fragment2Binding

class Fragment2 : Fragment() {


    lateinit var binding: Fragment2Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = Fragment2Binding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.switch3.setOnCheckedChangeListener { buttonView, isChecked ->
            run {
                if (isChecked) {
                    changeFragmentContainer(ItemFragment2())
                }
                else {
                    changeFragmentContainer(ItemFragment1())
                }
            }
        }
    }

    private fun changeFragmentContainer(fragment: Fragment){
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView2, fragment)
            .commit()
    }

}

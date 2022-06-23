package com.example.fragment_m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment_m.databinding.FragmentResultBinding
import com.example.fragment_m.databinding.FragmentSecondBinding

class ResultFragment : Fragment() {
    private var b: FragmentResultBinding? = null
    private val binding get() = b!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        b = FragmentResultBinding.inflate(inflater, container, false)


        return binding.root
    }


}
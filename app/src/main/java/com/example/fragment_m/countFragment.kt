package com.example.fragment_m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import com.example.fragment_m.databinding.FragmentCountBinding


class countFragment : Fragment() {
    private var _b:FragmentCountBinding? = null
    private val b get() = _b!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setFragmentResultListener("Paquete1"){ paquete, datos ->
            b.tvCount.text = datos.getString("PrimerDato")
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentCountBinding.inflate(inflater, container, false)
        return b.root
    }


}
package com.example.fragment_m

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import com.example.fragment_m.databinding.FragmentFirstBinding
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random


class FirstFragment : Fragment(R.layout.fragment_first) {
    private var b:FragmentFirstBinding? = null
    private val binding get() = b!!
    private val dados = arrayOf<Int>(
        R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        b = FragmentFirstBinding.inflate(inflater, container, false)
        val Vista= binding.root
        return Vista
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGo.setOnClickListener {
            clickOnDado(binding.btnGo)
        }
    }

    fun clickOnDado(view: View){
        val d1 = Random.nextInt(1, 6)
        val d2 = Random.nextInt(1, 6)
        binding.imvDado1.setImageResource(dados[d1-1])
        binding.imvDado2.setImageResource(dados[d2-1])
        binding.tvResoult.text = (d1 + d2).toString()
        setFragmentResult("Paquete1", bundleOf("PrimerDato" to binding.tvResoult.text))
    }
}
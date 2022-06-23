package com.example.fragment_m

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import com.example.fragment_m.databinding.FragmentFirstBinding
import com.example.fragment_m.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {
    private var b: FragmentSecondBinding? = null
    private val binding get() = b!!
    private var lista = mutableMapOf<String, String>()
    private var total = 0.0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        b = FragmentSecondBinding.inflate(inflater, container, false)
//        lista.forEach { k,v ->
//            myIntent.putExtra(k,v)
//            total += v.toDouble()
//            myIntent.putExtra("TOTAL",total.toString())



        return binding.root
    }
//    fun addItem (view:View){
//        if (binding.etArticulo.text.isNotEmpty() and binding.etArticulo.text.isNotEmpty()){
//            lista.put(binding.etArticulo.text.toString(), binding.etPrecio.text.toString())
//            binding.etArticulo.text.clear()
//            binding.etPrecio.text.clear()
//            msj(lista.toString())
//        } else {
//            msj("Todos los campos son obligatorios")
//        }
//    }

//    fun replaceFragment(fragment: Fragment){
//        val fragmentManager = FragmentManager.commit{
//            setReorderingAllowed(true)
//            // Replace whatever is in the fragment_container view with this fragment
//            replace<SecondFragment>(R.id.fragmentResult)
//        }
//    }

//    fun msj (str:String){
//        Toast.makeText(this, str, Toast.LENGTH_LONG).show()
//    }
}
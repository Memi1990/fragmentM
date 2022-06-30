package com.example.fragment_m

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.fragment_m.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        val actionBar= supportActionBar
        actionBar!!.title = "Shop"
        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.appbar_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    fun fragmentTrans(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.count_frg,fragment)
//            Poner en la pila. Eso repercute a la hora de volver
            addToBackStack(null)
            commit()
        }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.icShop -> fragmentTrans(SecondFragment())
            R.id.icBack -> fragmentTrans(countFragment())
        }
        return super.onOptionsItemSelected(item)
    }
}
package com.example.fragmenttransaction

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.fragmenttransaction.fragment.BlueFragment
import com.example.fragmenttransaction.fragment.GreenFragment

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.kill_fragment)
            .setOnClickListener {
                val fragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
                fragment?.let {
                    supportFragmentManager
                        .beginTransaction()
                        .remove(it)
                        .addToBackStack(null)
                        .commit()
                }
            }

        findViewById<Button>(R.id.replace_fragment)
            .setOnClickListener {
                val text = findViewById<EditText>(R.id.name).text.toString()

                val fragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
                fragment?.let {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, GreenFragment.newInstance(text))
                        .addToBackStack(null)
                        .commit()
                }
            }


        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, BlueFragment())
            .addToBackStack(null)
            .commit()
    }
}

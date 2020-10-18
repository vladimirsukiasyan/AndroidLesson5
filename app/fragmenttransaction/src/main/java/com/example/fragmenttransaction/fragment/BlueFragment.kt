package com.example.fragmenttransaction.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmenttransaction.R

/**
 * Fragment, демонстрирующий создание UI для фрагмента через LayoutInflater.
 */
class BlueFragment : BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
        return inflater.inflate(R.layout.fragment_blue, container, false)
    }


    private val logTag = javaClass.simpleName + " Lifecycle"
}
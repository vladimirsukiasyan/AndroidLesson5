package com.example.fragmenttransaction.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * Базовый фрагмент, логирующий методы жизненного цикла.
 */
abstract class BaseFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
        return super.onCreateView(inflater, container, savedInstanceState)
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
    }

    override fun onStart() {
        super.onStart()
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
    }

    override fun onResume() {
        super.onResume()
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
    }

    override fun onPause() {
        super.onPause()
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
    }

    override fun onStop() {
        super.onStop()
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
    }

    private val logTag = javaClass.simpleName + " Lifecycle"
}
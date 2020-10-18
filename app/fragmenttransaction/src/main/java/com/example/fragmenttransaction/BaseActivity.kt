package com.example.fragmenttransaction

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    override fun onStart() {
        super.onStart()
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
    }

    override fun onRestart() {
        super.onRestart()
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

    override fun onDestroy() {
        super.onDestroy()
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

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(
            logTag,
            Thread.currentThread().stackTrace[2].methodName
        )
    }

    private val logTag: String
        private get() = javaClass.simpleName + " Lifecycle"

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

//         Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show()
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show()
        }
    }
}
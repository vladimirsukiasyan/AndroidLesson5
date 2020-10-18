package com.example.fragmenttransaction.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragmenttransaction.R

/**
 * Fragment, демонстрирующий передачу параметра аргументом
 */
class GreenFragment : BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_green, container, false)
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        arguments?.let {
            view.findViewById<TextView>(R.id.my_green_text)
                .text = it.getString(EXTRA_TEXT) ?: "DEFAULT"
        }
    }

    companion object {
        private const val EXTRA_TEXT = "name"

        fun newInstance(text: String): GreenFragment {
            val fragment = GreenFragment()
            val bundle = Bundle()
            bundle.putString(EXTRA_TEXT, text)
            fragment.arguments = bundle
            return fragment
        }
    }
}
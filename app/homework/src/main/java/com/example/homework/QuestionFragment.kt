package com.example.homework

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.homework.model.Question

class QuestionFragment : Fragment() {

    override fun onAttach(context: Context) {
        //TODO проделать то же самое что и в HomeFragment
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        arguments?.let {
            //TODO тут получишь данные вопроса
        }
//        return inflater.inflate(R.layout., container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //TODO заполнить все view данными из bundle, поставить все необхдимые listener на кнопки
    }

    companion object {
        const val ARGS_QUESTION = "question"

        fun newInstance(question: Question) : QuestionFragment {
            val args = Bundle()
            args.putSerializable(ARGS_QUESTION, question)

            val fragment = QuestionFragment()
            fragment.arguments = args
            return fragment
        }
    }
}

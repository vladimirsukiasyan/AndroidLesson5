package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.homework.model.Question

class MainActivity : AppCompatActivity(), OnActionClickListener {

    private val questionList = listOf<Question>()
    private var questionPosition: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.container, HomeFragment())
            .commit()
    }

    override fun startTest() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, QuestionFragment.newInstance(questionList[0]))
            .addToBackStack(null)
            .commit()
    }

    override fun nextQuestion(/*TODO здесь тебе нужно получить информацию о том как ответил пользователь в фрагменте вопроса, который эту функцию и вызвал*/) {
        //TODO нужно заменить на новый фрагмент вопроса
    }
}

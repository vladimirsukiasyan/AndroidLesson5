package com.example.homework.model

import java.io.Serializable

class Question(val title:String, val answers: List<String>, val correctAnswer: String) : Serializable

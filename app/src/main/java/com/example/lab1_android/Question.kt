package com.example.lab1_android

class Question(
    val description: String,
    var answers: List<Answer>
)

class Answer(
    val title: String,
    val isCorrect: Boolean
)



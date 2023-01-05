package com.example.lab1_android

class Question(
    val description: String,
    var answers: List<Answer>
)

class Answer(
    val title: String,
    val isCorrect: Boolean
)

fun generateQuestions(): List<Question> {
    return listOf(
        Question(
            ("В якому місті США знаходиться Бруклінський міст?"), listOf(
                Answer("Нью-Йорк", true),
                Answer("Чікаго", false),
                Answer("Новий Орлеан", false),
                Answer("Сан Франциско", false)
            )
        ),
        Question(
            ("Яку індичку традиційно подають на свята?"), listOf(
                Answer("Фаршировану", true),
                Answer("Варену", false),
                Answer("Крадену", false),
                Answer("Глазуровану", false)
            )
        ),
        Question(
            ("В якому виді спорту використовується металевий шар?"), listOf(
                Answer("Футбол", false),
                Answer("Штовхання ядра", true),
                Answer("Хокей", false),
                Answer("Кидання молота", false)
            )
        ),
        Question(
            ("Кого вирогідніше за все можна побачити в гідрокостюмі?"), listOf(
                Answer("Крікетіста", false),
                Answer("Серфера", true),
                Answer("Гольфіста", false),
                Answer("Хокеіста", false)
            )
        ),
        Question(
            ("В якій країні друкується газета Лє Монде?"), listOf(
                Answer("Франція", true),
                Answer("Нідерланди", false),
                Answer("Італія", false),
                Answer("Китай", false)
            )
        ),
        Question(
            ("Сіріус - зірка, що належить до сузір'я?"), listOf(
                Answer("Великий лев", false),
                Answer("Великий кіт", false),
                Answer("Великий пес", true),
                Answer("Великі зірки", false)
            )
        ),
        Question(
            ("Яке слово означає поширення аудіофайлів в Інтернеті"), listOf(
                Answer("Подкаст", true),
                Answer("Піркаст", false),
                Answer("Пікаст", false),
                Answer(" Піпкаст", false)
            )
        ),
        Question(
            ("Чим офіційно можуть користуватись важкоатлети, щоб покращити хватку на снаряді?"), listOf(
                Answer("Стрічками", true),
                Answer("Клеєм", false),
                Answer("Магнітами", false),
                Answer("Крейдою", false)
            )
        ),
        Question(
            ("Куди зазвичай приземляються олімпійські стрибуни завдовжки?"), listOf(
                Answer("На подушки", false),
                Answer("На бігову доріжку", false),
                Answer("У воду", false),
                Answer("У пісок", true)
            )
        ),
        Question(
            ("На честь якої британської королеви названо найбільше озеро в Африці?"), listOf(
                Answer("Королева |", false),
                Answer("Вікторія", true),
                Answer("Марія Тюрдо", false),
                Answer("Вальнесса Гамбуська", false)
            )
        ),
        Question(
            ("Яка шахова фігура на початку партії присутня у кількості 16 штук?"), listOf(
                Answer("Слон", false),
                Answer("Ладья", false),
                Answer("Кінь", false),
                Answer("Пішак", true)
            )
        ),
        Question(
            ("У якому місті народився Шекспір?"), listOf(
                Answer("Стоктон-он-Тіс", false),
                Answer("Хенлі-он-Темз", false),
                Answer("Стратфорд-апон-Ейвон", true),
                Answer("Фрінтон-он-Сі", false)
            )
        )
    )
}

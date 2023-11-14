// Создать приложение, с помощью которого пользователь, введя два числа и символ операции, узнает результат.
// Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание. Числа могут быть вещественными.
fun main(args: Array<String>) {
    var op:String
    var num1:Double=0.0
    var num2:Double=0.0
    print("Введите число1: ");num1=readln().toDouble();
    print("Введите число2: ");num2=readln().toDouble();
    print("Введите знак: ");op=readln();
    when (op) {
        "+" -> print(num1 + num2)
        "-" -> print(num1 - num2)
        "*" -> print(num1 * num2)
        "/" -> print(num1 / num2)
        else -> {
        }
    }
}
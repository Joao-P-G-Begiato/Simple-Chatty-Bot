package bot

import java.util.Scanner


val scanner = Scanner(System.`in`) 

fun main() {
    greet("Begiato 3000", "2023")
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
}

fun remindName() {
    println("Please, remind me your name.")
    val name = scanner.nextLine()
    println("What a great name you have, ${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    println("How to declare arguments of a function?")
    println("1. fun test(answer, Int) {}")
    println("2. fun test(answer; Int) {}")
    println("3. fun test(answer- Int) {}")
    println("4. fun test(answer: Int) {}")
    val answer = scanner.nextInt()
    if(answer != 4){
        println("Please, try again.")
        test()
        }
    }

fun end() {
    println("Congratulations, have a nice day!") 
}
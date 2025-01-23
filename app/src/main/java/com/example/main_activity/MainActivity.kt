package com.example.main_activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import java.util.Scanner

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlcoholEligibility()
        }
    }
}

class AlcoholEligibility {

    data class User(val name: String, val age: Int, val gender: String)

    fun main() {
        val scanner = Scanner(System.`in`)

        print("What is your name?: ")
        val name = scanner.nextLine()

        print("How old are you?: ")
        val age = scanner.nextInt()

        print("What is your gender?: ")
        val gender = scanner.next()

        val user = User(name, age, gender)
        val users = mutableListOf<User>()

        if (age >= 18) {
            println("Hello, ${user.name}! You are allowed to drink alcohol.")
        } else {
            println("Sorry, ${user.name}. You are not allowed to drink alcohol")
        }

        println("Do you want to reset for another user? (yes/no)")
        val reset = scanner.next()
        if (reset == "yes") {
            main()
        } else {
            println("END")
        }

        println("Do you want to see the list of users? (yes/no)")
        val showUsers = scanner.next()
        if (showUsers == "yes") {
            val users = mutableListOf<User>()
            users.add(user)
        }
    }
}

@Composable

fun AlcoholEligibilityComposable() {
    val scanner = Scanner(System.`in`)

    print("What is your name?: ")
    val name = scanner.nextLine()

    print("How old are you?: ")
    val age = scanner.nextInt()

    print("What is your gender?: ")
    val gender = scanner.next()

    }

@Preview(showBackground = true)
@Composable
fun AlcoholEligibilityPreview() {
    AlcoholEligibilityComposable()
}
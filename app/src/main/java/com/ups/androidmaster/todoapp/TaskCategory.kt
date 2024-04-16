package com.ups.androidmaster.todoapp

sealed class TaskCategory {
    object Personal: TaskCategory()
    object Bisiness: TaskCategory()
    object Other:TaskCategory()
}

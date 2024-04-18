package com.ups.androidmaster.todoapp

sealed class TaskCategory(var isSelected:Boolean = true) {
    object Personal: TaskCategory()
    object Bisiness: TaskCategory()
    object Other:TaskCategory()
}

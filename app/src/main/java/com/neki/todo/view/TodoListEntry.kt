package com.neki.todo.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import com.neki.todo.model.TodoList
import com.neki.todo.viewModel.TodoListViewModel

@Composable
fun TodoListEntry(todoListViewModel: TodoListViewModel){
    var text by remember { mutableStateOf("") }
    Row(
        horizontalArrangement = Arrangement.Center,
    ){
        TextField(
            value = text,
            onValueChange = {
                newText-> text=newText
            },
            label = {
                Text("Enter Text")
            }
        )
        Button(onClick =  {
            val todoList=TodoList(
                data = text
            )
            todoListViewModel.insertTodoList(todoList)
        }){
            Text("Save")
        }
    }
}
package com.neki.todo.view

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.neki.todo.model.TodoList
import com.neki.todo.viewModel.TodoListViewModel

@Composable
fun TodoListEntry(todoListViewModel: TodoListViewModel){
    var text by remember { mutableStateOf("") }
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ){
        TextField(
            value = text,
            onValueChange = {
                    newText-> text=newText
            },
            label = {
                Text("Enter Text")
            },

            modifier = Modifier.weight(1f)
                .heightIn(min=65.dp),

            maxLines = 8

        )
        Button(
            onClick =  {
                if(text.isNotEmpty()) {
                    val todoList = TodoList(
                        data = text
                    )
                    todoListViewModel.insertTodoList(todoList)
                    text = ""
                }
            },
            shape = RectangleShape,
            modifier = Modifier.height(65.dp)
        ){
            Text("Save")
        }
    }
}
package com.neki.todo.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.neki.todo.viewModel.TodoListViewModel

@Composable
fun TodoListItems(todoListViewModel: TodoListViewModel){

    val list by todoListViewModel.todoList.collectAsState(initial = emptyList())
    LazyColumn {
        items(list){ data->
            Column {
                Text(text = data.data)
            }

        }
    }
}
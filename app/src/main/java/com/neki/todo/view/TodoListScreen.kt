package com.neki.todo.view

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.neki.todo.viewModel.TodoListViewModel

@Composable
fun TodoListScreen(todoListViewModel: TodoListViewModel){
    Column {
        TodoListEntry(todoListViewModel)
        TodoListItems(todoListViewModel)
    }
}
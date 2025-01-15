package com.neki.todo.view

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.neki.todo.viewModel.TodoListViewModel

@Composable
fun TodoListScreen(todoListViewModel: TodoListViewModel){
    Column(
        modifier = Modifier.fillMaxSize()
            .border(2.dp, Color.Red)
            .padding(10.dp)
    ) {
        TodoListEntry(todoListViewModel)
        TodoListItems(todoListViewModel)
    }
}
package com.neki.todo.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.neki.todo.model.TodoList
import com.neki.todo.repo.TodoListRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TodoListViewModel @Inject constructor(
    private val todoListRepo: TodoListRepo
) : ViewModel() {

    val _todoList= MutableStateFlow<List<TodoList>>(emptyList())
    val todoList:Flow<List<TodoList>> = _todoList
    init{
        viewModelScope.launch {
            todoListRepo.getAllTodoList().collect{list->
                _todoList.value=list
            }
        }
    }
    fun insertTodoList(todoList: TodoList){
        viewModelScope.launch {
            todoListRepo.insert(todoList)
        }
    }
}
package com.neki.todo.view

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon

import androidx.compose.material3.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SettingFloatingButton(navigateToNewActivity:()->Unit){
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        FloatingActionButton(
            onClick = {
                navigateToNewActivity()
            },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp),
        ) {
            Icon(
                imageVector = Icons.Filled.Settings,
                contentDescription = "Add",
                tint = Color.White
            )
        }
    }
}
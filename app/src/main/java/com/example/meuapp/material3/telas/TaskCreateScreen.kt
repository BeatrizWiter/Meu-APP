package com.example.meuapp.material3.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskCreateScreen(){
    var taskTitleInitialValue: String = ""
    Column {
        Text(text = "Título da Tarefa:")
        TextField(
            value = taskTitleInitialValue,
            onValueChange = {
                Log.i("### fun TaskCreateScreen(){",it)
            })
    }
}
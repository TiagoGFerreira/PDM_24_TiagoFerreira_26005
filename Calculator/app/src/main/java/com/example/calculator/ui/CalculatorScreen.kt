package com.example.calculator.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorScreen(displayValue: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(1.dp),
        contentAlignment = Alignment.TopEnd
    ) {
        Text(
            text = displayValue,
            fontSize = 32.sp,
            textAlign = TextAlign.Right
        )
    }
}
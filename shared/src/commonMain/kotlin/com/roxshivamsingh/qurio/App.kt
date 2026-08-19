package com.roxshivamsingh.qurio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            val isShowFinalScreen = remember { mutableStateOf(false) }
            Button(onClick = {
                isShowFinalScreen.value = !isShowFinalScreen.value
            }) {
                Icon(Icons.Filled.ArrowBackIosNew, contentDescription = "Back Icons")
                Text(text = "Back")
            }
            if (isShowFinalScreen.value) {
                FeedbackMessage()
            } else {
                OnBoardingScreen(isShowFinalScreen)
            }
        }
    }
}


//fun todaysDate(): String {
//    fun LocalDateTime.format() = toString().substringBefore('T')
//
//    val now = Clock.System.now()
//    val zone = TimeZone.currentSystemDefault()
//    return now.toLocalDateTime(zone).format()
//}

//@Composable
//fun CustomCounter() {
//    var count by remember { mutableIntStateOf(0) }
//    Button(
//        onClick = {
//            count += 1
//        },
//        modifier = Modifier.fillMaxWidth()
//    ) {
//        Text(text = "CLICK", fontWeight = FontWeight.SemiBold)
//    }
//    Column(
//        modifier = Modifier.safeContentPadding()
//    ) {
//        Text(text = "$count")
//    }
//}

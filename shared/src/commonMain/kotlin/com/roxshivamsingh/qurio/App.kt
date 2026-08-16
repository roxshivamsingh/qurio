package com.roxshivamsingh.qurio

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import qurio.shared.generated.resources.Res
import qurio.shared.generated.resources.image

@Composable
@Preview
fun App() {
    MaterialTheme {
        val isShowFinalScreen = remember { mutableStateOf(false) }

        if (isShowFinalScreen.value) {
            FeedbackMessage()
        } else {
            OnBoardingScreen(isShowFinalScreen)
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

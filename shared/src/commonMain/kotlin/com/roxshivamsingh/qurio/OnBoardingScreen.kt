package com.roxshivamsingh.qurio

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import qurio.shared.generated.resources.Res
import qurio.shared.generated.resources.image

@Composable
fun OnBoardingScreen(show: MutableState<Boolean>) {
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primaryContainer)
            .safeContentPadding()
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Column {
            Text(
                text = "Welcome to Future Quiro",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Column { BasicImage() }
        Column(
            modifier = Modifier.safeContentPadding()
        ) {
            TextField(
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Email")
                },
                value = email.value, onValueChange = {
                    email.value = it
                })
            Spacer(modifier = Modifier.height(30.dp))
            TextField(
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Password")
                },
                value = password.value,
                onValueChange = {
                    password.value = it
                }
            )
        }
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = false, onCheckedChange = {})
                Text(text = "Yes, I agree about Privacy and policies.")
            }
        }
        Column {
            Button(
                onClick = {
                    show.value = true
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Sign-Up")
            }
        }

//            Column {
//                Text(text = todaysDate())
//            }

    }
}

@Composable
fun BasicImage() {
    Image(
        painter = org.jetbrains.compose.resources.painterResource(resource = Res.drawable.image),
        contentDescription = "Image",
        modifier = Modifier.clip(CircleShape).size(150.dp),
        contentScale = ContentScale.FillHeight
    )
}

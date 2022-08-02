package com.example.floatingactionbutton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.floatingactionbutton.ui.theme.FloatingActionButtonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFAB()
        }
    }
}

@Composable
fun MyFAB() {
    Scaffold(
        content = {},
        floatingActionButton = {
            FloatingActionButton(
                shape = RoundedCornerShape(
                    topStart = 30.dp, topEnd = 30.dp, bottomStart = 30.dp, bottomEnd = 2.dp),
                onClick = { /*TODO*/ },
                backgroundColor = Color(0xFF442c2E),
                contentColor = Color(0xFFFEDBD0)
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Icon")
            }
        },
        bottomBar = { BottomNavigation(
            backgroundColor = Color(0xFFFEDBD0),
            contentColor = Color(0xFF442c2E)
        ) {}}
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyFAB()
}
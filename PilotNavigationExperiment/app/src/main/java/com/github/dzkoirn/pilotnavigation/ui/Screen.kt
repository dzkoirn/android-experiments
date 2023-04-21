package com.github.dzkoirn.pilotnavigation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.dzkoirn.pilotnavigation.ui.theme.MyApplicationTheme

@Composable
fun Screen(width: Int, height: Int, modifier: Modifier = Modifier) {
    val focusManager = LocalFocusManager.current
    Box(
        modifier
//            .background(color = Color.Cyan)
            .padding(4.dp)
            .fillMaxSize()
    ) {
        Row(
            modifier = modifier
//                .background(color = Color.Magenta)
                .fillMaxSize()
        ) {
            repeat(width) { x ->
                Column(modifier = modifier
                    .background(color = Color.LightGray)
                    .weight(weight = 1f, fill = true)
                    .fillMaxHeight()
                ) {
                    repeat(height) { y ->
                        Card(
                            modifier = Modifier
//                                .background(color = Color.DarkGray)
                                .weight(weight = 1f, fill = true)
                                .fillMaxSize()
                                .padding(all = 4.dp),
                        ) {
                            Box(modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center) {
                                Text(text = "x = $x, y = $y")
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenPreview() {
    MyApplicationTheme {
        Screen(width = 3, height = 4)
    }
}

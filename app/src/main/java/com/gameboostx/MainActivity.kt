
package com.gameboostx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme(
                colorScheme = darkColorScheme(
                    primary = Color(0xFF39E7FF),
                    background = Color(0xFF090D18),
                    surface = Color(0xFF141C2D)
                )
            ) {
                var mode by remember { mutableStateOf("Balanced") }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFF090D18))
                        .padding(24.dp),
                    verticalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    Text(
                        "GAMEBOOST X",
                        color = Color(0xFF39E7FF),
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Black
                    )
                    Text("ANDROID GAMING TOOLKIT", color = Color.LightGray)

                    Card(shape = RoundedCornerShape(20.dp)) {
                        Column(
                            Modifier.padding(20.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text("PERFORMANCE PROFILE")
                            listOf("Battery", "Balanced", "Performance").forEach {
                                FilterChip(
                                    selected = mode == it,
                                    onClick = { mode = it },
                                    label = { Text(it) }
                                )
                            }
                            Text("Selected: $mode")
                        }
                    }

                    Text(
                        "GameBoost X is ready for further optimization.",
                        color = Color.LightGray
                    )
                }
            }
        }
    }
}

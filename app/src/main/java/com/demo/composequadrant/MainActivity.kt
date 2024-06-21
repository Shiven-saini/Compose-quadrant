package com.demo.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.demo.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    QuadrantDesign(
                        text1a = stringResource(R.string.text1a_content),
                        text1b = stringResource(R.string.text1b_content),
                        text2a = stringResource(R.string.text2a_content),
                        text2b = stringResource(R.string.text2b_content),
                        text3a = stringResource(R.string.text3a_content),
                        text3b = stringResource(R.string.text3b_content),
                        text4a = stringResource(R.string.text4a_content),
                        text4b = stringResource(R.string.text4b_content),
                    )
                }
            }
        }
    }
}


@Composable
fun InfoCard(header: String, body: String, color_value: Long, modifier: Modifier = Modifier) {
    Column (modifier = modifier
        .fillMaxSize()
        .background(color = Color(color_value))
        .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = header,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = body,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun QuadrantDesign(text1a: String, text1b: String,
                   text2a: String, text2b: String,
                   text3a: String, text3b: String,
                   text4a: String, text4b: String,
                   modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier.fillMaxWidth()
    )
    {
        Row (Modifier.weight(1f)) {
            InfoCard(header = text1a, body = text1b, color_value = 0xFFEADDFF, modifier = Modifier.weight(1f))
            InfoCard(header = text2a, body = text2b, color_value = 0xFFD0BCFF, modifier = Modifier.weight(1f))
        }

        Row (Modifier.weight(1f)){
            InfoCard(header = text3a, body = text3b, color_value = 0xFFB69DF8, modifier = Modifier.weight(1f))
            InfoCard(header = text4a, body = text4b, color_value = 0xFFF6EDFF, modifier = Modifier.weight(1f))
        }
    }
}


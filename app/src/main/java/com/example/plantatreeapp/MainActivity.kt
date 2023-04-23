package com.example.plantatreeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.plantatreeapp.ui.theme.PlantATreeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlantATreeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    PlantApp()
                }
            }
        }
    }
}

@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
fun PlantApp(){
    val brush = Brush.verticalGradient(listOf(Color.White, Color(0xFF367020)))
    Column(modifier = Modifier
        .fillMaxSize()
        .background(brush = brush)) {
        Column(modifier = Modifier.fillMaxWidth()) {
            //Top part Section 1
            Text(
                text = "One Gift, One Tree, One Planet"
                , color = Color(0xFF264E17),
                modifier = Modifier.padding(start = 16.dp, top = 30.dp, bottom = 10.dp)
            )
            Text(
                text = buildAnnotatedString {
                    append("Plant a\n")
                    append(" \n")
                    append("billion trees")
                }, fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF264E17),
                modifier = Modifier.padding(start = 16.dp)
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PlantATreeAppTheme {
//        Greeting("Android")
        PlantApp()
    }
}
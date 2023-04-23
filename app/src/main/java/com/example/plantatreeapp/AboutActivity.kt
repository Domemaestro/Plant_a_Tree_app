package com.example.plantatreeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.plantatreeapp.ui.theme.PlantATreeAppTheme

class AboutActivity : ComponentActivity() {
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
                    AboutTab()
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
fun AboutTab(){
    Column(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxWidth()) {
            //section 1
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(230.dp)) {
                Box(modifier = Modifier.fillMaxWidth()) {
                    val image = painterResource(id = R.drawable.kerela)
                    Image(painter = image, contentDescription = null, contentScale = ContentScale.Crop)
                    Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.BottomStart) {
                        Text(text = "Kerala",
                        color = Color.White, modifier = Modifier.padding(start = 16.dp, bottom = 30.dp),
                            fontSize = 47.sp
                        )
                    }
                }
            }
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            //section 2
        }
        
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    PlantATreeAppTheme {
//        Greeting("Android")
        AboutTab()
    }
}
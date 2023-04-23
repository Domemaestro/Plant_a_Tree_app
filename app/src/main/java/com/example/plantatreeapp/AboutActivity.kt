package com.example.plantatreeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
    Box(modifier = Modifier.fillMaxSize()) {
        //top Box
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)) {
            val image = painterResource(id = R.drawable.kerela)
            Image(painter = image, contentDescription = null, contentScale = ContentScale.Crop)

            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomStart) {
                Text(text = "Kerala",
                color = Color.White,
                fontSize = 47.sp, modifier = Modifier.padding(start = 16.dp, bottom = 60.dp))
            }
        }
        //second Box
        Box(modifier = Modifier.fillMaxSize()) {
            Card(elevation = CardDefaults.cardElevation(20.dp),
            shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 350.dp)
            ) {
                Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "Planting Trees for a Better Tomorrow: Kerala's Mission ",
                    color = Color(0xFF367020), modifier = Modifier.padding(20.dp),
                        fontWeight = FontWeight.Bold, fontSize = 25.sp, textAlign = TextAlign.Center
                    )
                    Text(text = "Kerala is actively promoting the planting of trees to combat deforestation and climate change. The state government has launched initiatives like Haritha Keralam Mission to increase the forest cover and encourage individuals and communities to participate in tree planting efforts. Planting more trees in Kerala will not only help combat climate change but also contribute to the state's rich biodiversity and ensure a better tomorrow for generations to come.",
                    modifier = Modifier.padding(20.dp), textAlign = TextAlign.Justify, color = Color.Black,
                    fontSize = 18.sp)
                }
            }
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
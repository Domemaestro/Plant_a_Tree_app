package com.example.plantatreeapp

import android.content.Intent
import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

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
                    PlantApp()
                }
            }
        }
    }
}

@Composable

fun PlantApp(){
    val brush = Brush.verticalGradient(listOf(Color.White, Color(0xFF264E17)))
    Column(modifier = Modifier
        .fillMaxSize()
        .background(brush = brush)) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 60.dp)) {
            //Top part Section 1
            Text(
                text = "One Gift, One Tree, One Planet"
                , color = Color(0xFF264E17),
                modifier = Modifier.padding(start = 16.dp, bottom = 10.dp)
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

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 50.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            //Middle part Section 2
            Box(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Planting Location",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF264E17),
                    modifier = Modifier.padding(bottom = 20.dp, start = 30.dp), textAlign = TextAlign.Start)
            }

            Card(elevation = CardDefaults.cardElevation(10.dp),
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier
                    .width(350.dp)
                    .height(370.dp)
                    ) {
                Box() {
                    val image = painterResource(id = R.drawable.kerela)
                    Image(painter = image, contentDescription = null, contentScale = ContentScale.Crop,
                        )
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomStart) {
                        Column() {
                            Text(text = "Kerala",
                                color = Color.White,
                                fontSize = 42.sp,
                                modifier = Modifier.padding(start = 16.dp)
                            )
                            Text(text ="Kerala is actively promoting tree planting to combat deforestation and climate change, and has launched initiatives like Haritha Keralam Mission to increase the forest cover.",
                                color = Color.White, modifier = Modifier.padding(16.dp))
                        }
                    }
                }
                //cardview end
            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp), contentAlignment = Alignment.Center) {
                val mContext = LocalContext.current
                Button(onClick = {
                    //to About Activity
                    mContext.startActivity(Intent(mContext,AboutActivity::class.java))
                },
                colors = ButtonDefaults.buttonColors(Color(0xFF164E17)),
                    modifier = Modifier.width(150.dp).height(50.dp)
                ) {
                    Text(
                        text = "About",
                    fontSize = 20.sp)
                }
            }

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
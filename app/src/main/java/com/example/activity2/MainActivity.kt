package com.example.activity2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activity2.ui.theme.Activity2Theme
import com.example.activity2.ui.theme.Activity2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Activity2Theme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    BasicCompose(
                        koko = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Composable
fun BasicCompose(koko: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(6.dp),
        verticalArrangement = Arrangement.spacedBy(2.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Login", fontSize = 30.sp, fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Yellow,
                    offset = Offset(4f, 4f),  // Mengatur offset shadow
                    blurRadius = 8f  // Mengatur seberapa buram bayangan
                )
            )
        )
        Text(text = "Ini Halaman Login", fontSize = 16.sp, fontStyle = FontStyle.Italic)
        Image(painter = painterResource(id = R.drawable.umy),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .padding(top = 20.dp)
        )
        Text(text = "Nama", fontSize =25.sp)
        Text(text = "Putra Raimmar Delvin", fontSize =30.sp, fontWeight = FontWeight.Bold, color = Color.Black)
        Text(text = "20220140017", fontSize = 25.sp,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Yellow,
                    offset = Offset(4f, 4f),  // Mengatur offset shadow
                    blurRadius = 8f  // Mengatur seberapa buram bayangan
                )
            ))
        Box(
            modifier = koko
                .size(430.dp),
            contentAlignment = Alignment.Center  // Mengatur konten di tengah
        ) {

            Image(
                painter = painterResource(id = R.drawable.delvin),
                contentDescription = null,
                modifier = koko
                    .size(400.dp)
                    .clip(RectangleShape),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Activity2Theme{
        Greeting("Android")
    }
}
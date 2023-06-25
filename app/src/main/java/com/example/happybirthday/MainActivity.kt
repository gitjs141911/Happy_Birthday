package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    //BirthdayGreetingWithText(message = "Happy Birthday Sam!",from= "From: Sergio")
                    BirthdayGreetingWithImage(message = stringResource(R.string.happy_birthday_text),from= stringResource(
                        R.string.From_text))
                }
            }
        }
    }
}

/*
@Composable

fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

 */
@Composable
fun BirthdayGreetingWithImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box(modifier = modifier){
        Image(
            painter = image,
            contentDescription = null,
            //contentScale = ContentScale.Crop
        )
        BirthdayGreetingWithText(message = message, from = from)
    }



}
@Composable
fun BirthdayGreetingWithText(message: String,from: String, modifier: Modifier = Modifier) {
Column(modifier = modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Top,
    horizontalAlignment = Alignment.CenterHorizontally){
    Text(
        text = message,
        fontSize = 36.sp,
        // Solid element background color
        //modifier = Modifier.background(color = Color.Red)
    )
    Text(
        text = from,
        fontSize = 24.sp,
        //modifier = Modifier.background(color = Color.Yellow)
        modifier = Modifier.align(alignment = Alignment.End)
    )

}
}



/*
@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
       // Greeting("Android")
        BirthdayGreetingWithText("Happy Birthday Sam!","From : Sergio")
    }
}

 */
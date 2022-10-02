package com.example.gittestthree

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gittestthree.sdks.Swish
import com.example.gittestthree.ui.theme.GitTestThreeTheme

class MainActivity : ComponentActivity() {
//    val swish : Swish = TODO()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//      swish.isSwishInstalled(baseContext)
        setContent {
            GitTestThreeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Row(
                            Modifier
                                .align(Alignment.CenterEnd)
                        ) {
                            Spacer(Modifier.fillMaxWidth(0.2f))
                           Button(onClick = { /*TODO*/ }) {
                               Text(text = "Button one")

                           }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GitTestThreeTheme {
        Greeting("Android")
    }
}
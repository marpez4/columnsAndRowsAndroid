package com.example.columnsandrows

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.columnsandrows.ui.theme.ColumnsAndRowsTheme
import androidx.constraintlayout.compose.ConstraintLayout

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColumnsAndRowsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BotoneraComponent()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BotoneraComponent() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()){
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.width(400.dp).padding(top = 42.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)){
                CalculatorButton("1")
                CalculatorButton("2")
                CalculatorButton("3")
                CalculatorButton("+")
            }
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)){
                CalculatorButton("4")
                CalculatorButton("5")
                CalculatorButton("6")
                CalculatorButton("-")
            }
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)){
                CalculatorButton("7")
                CalculatorButton("8")
                CalculatorButton("9")
                CalculatorButton("*")
            }
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)){
                CalculatorButton("0")
                CalculatorButton("C")
                CalculatorButton("=")
                CalculatorButton("/")
            }
        }
    }

}

@Composable
fun CalculatorButton(text: String) {
    val morado = Color(0xFF800080);
    Button(onClick = { },
            colors = ButtonDefaults.textButtonColors(containerColor = morado, contentColor = Color.White),
            modifier = Modifier
                .size(75.dp)
                .padding(5.dp),
            shape = CircleShape
        ) {
        Text(text, style = TextStyle(fontSize = 24.sp))
    }
}
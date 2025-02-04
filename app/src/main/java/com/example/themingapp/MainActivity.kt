package com.example.themingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.themingapp.ui.theme.ThemingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThemingAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    val appModifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 8.dp)

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "My title",
            modifier = appModifier,
            style = MaterialTheme.typography.titleLarge
        )
        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            modifier = appModifier
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = appModifier
        ) {
            Text("Submit")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    ThemingAppTheme {
        MyApp()
    }
}

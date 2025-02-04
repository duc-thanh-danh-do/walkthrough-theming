package com.example.themingapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

// Define Dark Theme Colors
private val DarkColorScheme = darkColorScheme(
    primary = OrangePrimary,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

// Define Light Theme Colors
private val LightColorScheme = lightColorScheme(
    primary = OrangePrimary,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

@Composable
fun ThemingAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = shapes,
        content = content
    )
}

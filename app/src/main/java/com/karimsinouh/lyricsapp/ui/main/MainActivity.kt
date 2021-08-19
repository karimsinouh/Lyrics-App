package com.karimsinouh.lyricsapp.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.karimsinouh.lyricsapp.ui.theme.LyricsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LyricsAppTheme {

                Scaffold(
                    topBar = { MainTopBar() }
                ){

                }

            }
        }
    }


    @Composable
    private fun MainTopBar(){
        MainAppBar(
            title = null,
            activeNotifications = false,
            onNotificationsClick = {},
            onPicturesClick = {}
        )
    }

}
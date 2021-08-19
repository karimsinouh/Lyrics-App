package com.karimsinouh.lyricsapp.ui.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.karimsinouh.lyricsapp.R

@Composable
fun MainAppBar(
    title:String?=null,
    activeNotifications:Boolean?=false,
    onNotificationsClick:()->Unit,
    onPicturesClick:()->Unit
){
    TopAppBar(
        contentColor = MaterialTheme.colors.onSurface,
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 0.dp,
    ) {
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = title?:stringResource(id = R.string.app_name),
            modifier=Modifier.weight(0.8f),
            fontWeight = FontWeight.Bold,
        )

        IconButton(onClick = onNotificationsClick) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription =null,
                tint=MaterialTheme.colors.onSurface.copy(alpha = 0.8f)
            )
        }

        Spacer(modifier = Modifier.width(8.dp))
        Image(
            painter = painterResource(id = R.drawable.eminem),
            contentDescription = null,
            modifier= Modifier
                .size(40.dp)
                .clip(CircleShape)
                .clickable(onClick = onPicturesClick),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(12.dp))


    }
}


package com.example.moviecounter

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun ProfileRow(name: String, modifier: Modifier = Modifier) {
    Row(modifier = modifier.padding(16.dp)) {
        Icon(
            imageVector = Icons.Filled.Person,
            contentDescription = "Profile icon",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )
        Text(text = name, modifier = Modifier.padding(start = 8.dp))
    }
}
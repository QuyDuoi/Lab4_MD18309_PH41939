package com.quyduoi.lab4_md18309_ph41939

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.quyduoi.lab4_md18309_ph41939.ui.theme.Lab4_MD18309_PH41939Theme

class Bai2_Lab4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4_MD18309_PH41939Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ImageListScreen()
                }
            }
        }
    }
}

@Composable
fun ImageListScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Icon",
            modifier = Modifier.size(64.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text("Horizontal Image List", style = MaterialTheme.typography.titleLarge)
        HorizontalImageList()
        Spacer(modifier = Modifier.height(16.dp))
        Text("Vertical Image List", style = MaterialTheme.typography.titleLarge)
        VerticalImageList()
    }
}

@Composable
fun HorizontalImageList() {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        val imageIds = listOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3
        ) // Replace with actual drawable resources
        items(imageIds.size) { index ->
            Image(
                painter = painterResource(id = imageIds[index]),
                contentDescription = "Image",
                modifier = Modifier
                    .size(200.dp)
                    .padding(end = 8.dp)
                    .background(Color.LightGray, shape = RoundedCornerShape(12.dp))
            )
        }
    }
}

@Composable
fun VerticalImageList() {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        val imageIds = listOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3
        ) // Replace with actual drawable resources
        items(imageIds.size) { index ->
            Image(
                painter = painterResource(id = imageIds[index]),
                contentDescription = "Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(bottom = 8.dp)
                    .background(Color.LightGray, shape = RoundedCornerShape(12.dp))
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewImageListScreen() {
    Lab4_MD18309_PH41939Theme {
        ImageListScreen()
    }
}

package com.example.act1_3.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Act2048(){
    Row(
        modifier = Modifier.width(250.dp).background(Color(0xFFBBADA0))
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(color = Color(0xFFF59563))
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "16",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(color = Color(0xFFEDCF72))
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "128",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(color = Color(0xFFF67C5F))
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "32",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(color = Color(0xFFF59563))
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "16",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
        }
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(color = Color(0xFFCDC1B4))
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(color = Color(0xFFF59563))
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "16",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(color = Color(0xFFF65E3B))
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "64",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(color = Color(0xFFF2B179))
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "8",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
        }
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(color = Color(0xFFCDC1B4))
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(color = Color(0xFFCDC1B4))
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(color = Color(0xFFEEE4DA))
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "2",
                    color = Color(0xFF9B9999),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(color = Color(0xFFF2B179))
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "8",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
        }
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(color = Color(0xFFEDE0C8))
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "4",
                    color = Color(0xFF9B9999),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(color = Color(0xFFCDC1B4))
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(color = Color(0xFFCDC1B4))
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(color = Color(0xFFEEE4DA))
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "2",
                    color = Color(0xFF9B9999),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.Center),
                )
            }
        }
    }
}
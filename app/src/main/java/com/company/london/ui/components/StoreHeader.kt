package com.company.london.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.london.R

@Composable
fun StoreHeader (
    title: String,
){
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(top = 24.dp)
            .height(30.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
       Text(
           modifier = Modifier.width(173.dp)
               .fillMaxHeight(),
           text = title,
           fontSize = 20.sp,
           fontWeight = FontWeight(600),
           color= Color(0xFF1F1F1E)
       )
        Row(
           modifier = Modifier.padding(top = 6.dp,bottom = 6.dp)
               .width(60.dp)
               .fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center


           ) {
            Text(
                text = "view all",
                fontSize = 12.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF03578A)
            )
            Spacer(modifier = Modifier.width(1.dp))
            Image(
                painter = painterResource(id = R.drawable.arrow_right),
                modifier = Modifier.size(12.dp),
                contentDescription = null,

                )
        }

    }
}
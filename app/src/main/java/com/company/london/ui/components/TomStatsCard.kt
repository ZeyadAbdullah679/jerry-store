package com.company.london.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.london.R

@Composable
fun TomStatsCard(
    modifier: Modifier = Modifier,
    backGroundColor: Color,
    image: Int,
    title: String,
    description: String,
) {
    Row(
        modifier = modifier
            .height(56.dp)
            .clip(RoundedCornerShape(12.dp))
            .fillMaxWidth()
            .background(backGroundColor)
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            painter = painterResource(id = image),
            contentDescription = null,
            tint = Color.Unspecified
        )

        Column(
            modifier = Modifier
                .padding(start = 10.dp)
                .fillMaxHeight()
        ) {
            Text(
                text = title,
                modifier = modifier
                    .padding(bottom = 2.dp)
                    .height(16.dp),
                fontSize = 16.sp,
                fontWeight = FontWeight(600),
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp,
                textAlign = TextAlign.Center,
                color = Color(0x99121212),
            )

            Text(
                text = description,
                modifier = Modifier.height(16.dp),
                fontSize = 12.sp,
                fontWeight = FontWeight(500),
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp,
                textAlign = TextAlign.Center,
                color = Color(0x5E121212)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StatsContainerPreview() {
    TomStatsCard(
        backGroundColor = Color(0XFFD0E5F0),
        image = R.drawable.circle_devil,
        title = "2M 12K",
        description = "No. of quarrels"
    )
}
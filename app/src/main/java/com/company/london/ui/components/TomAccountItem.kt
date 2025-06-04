package com.company.london.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.company.london.ui.theme.BackGround

@Composable
fun TomAccountItem(
    image: Int,
    text: String,
) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(40.dp)
        .background(BackGround)) {
        Icon(
            painter = painterResource(id = image),
            modifier = Modifier
                .padding(end = 8.dp)
                .clip(RoundedCornerShape(8.dp)),
            contentDescription = null,
            tint = Color.Unspecified
        )

        Text(
            text = text,
            modifier = Modifier.padding(vertical = 8.dp),
            fontSize = 16.sp,
            fontWeight = FontWeight(500),
            textAlign = TextAlign.Center,
            color = Color(0xDE1F1F1E)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TomItemPreview() {
    TomAccountItem(image = R.drawable.bed, text = "Change sleeping place")
}
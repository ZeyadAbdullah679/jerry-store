package com.company.london.ui.components.preparation_item

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.london.R
import com.company.london.ui.theme.LightGray

@Composable
fun CircleWithNumber(
    number: Int,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .size(36.dp)
            .clip(CircleShape)
            .background(Color.White)
            .border(
                width = 1.dp,
                color = LightGray,
                shape = CircleShape
            )
    ) {
        Text(
            text = number.toString(),
            style = MaterialTheme.typography.bodyLarge.copy(
                fontFamily = FontFamily(Font(R.font.ibm_plex_sans_arabic_medium)),
                fontSize = 12.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF035587),
                textAlign = TextAlign.Center,
                letterSpacing = 0.5.sp
            )
        )
    }
}

@Preview
@Composable
private fun CircleWithNumberPreview() {
    CircleWithNumber(
        number = 1
    )
}
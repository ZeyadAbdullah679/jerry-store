package com.company.london.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import com.company.london.ui.theme.LightGray

@Composable
fun StatsItem(
    stats: String,
    description: String,
    @DrawableRes icon: Int,
    color: Color,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .height(56.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(color)
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = description
        )

        Spacer(modifier = Modifier.width(10.dp))

        Column{
            Text(
                text = stats,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 18.sp,
                    lineHeight = 16.sp,
                    color = Color.Black,
                    fontWeight = FontWeight(500),
                    textAlign = TextAlign.Center,
                )
            )

            Text(
                text = description,
                style = MaterialTheme.typography.labelSmall.copy(
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    color = LightGray,
                    fontWeight = FontWeight(400),
                    textAlign = TextAlign.Center,
                )
            )
        }
    }

}

@Preview
@Composable
private fun StatsItemPreview() {
    StatsItem(
        stats = "+ 500 h",
        description = "Chase time",
        icon = R.drawable.circle_broken_heart,
        color =  Color(0xFFFAEDCF)
    )
}
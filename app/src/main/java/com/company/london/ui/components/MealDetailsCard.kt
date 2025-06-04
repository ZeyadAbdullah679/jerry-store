package com.company.london.ui.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.london.R
import com.company.london.ui.theme.DarkGray
import com.company.london.ui.theme.LightBlue
import com.company.london.ui.theme.LightGray

@Composable
fun MealDetailsCard(
    title: String,
    @DrawableRes icon: Int,
    @StringRes unit: Int,
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .size(104.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(LightBlue)
            .padding(12.dp)
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = stringResource(unit),
            tint = Color.Unspecified
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 12.sp,
                lineHeight = 16.sp,
                color = DarkGray,
                fontWeight = FontWeight(500),
                textAlign = TextAlign.Center,
                letterSpacing = 0.5.sp,
            )
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = stringResource(unit),
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 12.sp,
                lineHeight = 16.sp,
                color = LightGray,
                fontWeight = FontWeight(500),
                textAlign = TextAlign.Center,
                letterSpacing = 0.5.sp,
            )
        )
    }
}


@Preview
@Composable
private fun MealDetailsCardPreview() {
    MealDetailsCard(
        title = "1000 V",
        icon = R.drawable.temperature,
        unit = R.string.temperature,
        modifier = Modifier
    )
}
package com.company.london.ui.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.london.R

@Composable
fun KitchenBackgroundItem(
    @StringRes title: Int,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = stringResource(title),
            tint = Color.Unspecified
        )
        Text(
            text = stringResource(title),
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 16.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight(500),
                color = Color(0xDEFFFFFF),
                textAlign = TextAlign.Center,
                letterSpacing = 0.5.sp,
            )
        )
    }
}

@Preview
@Composable
private fun KitchenBackgroundItemPreview() {
    KitchenBackgroundItem(
        modifier = Modifier,
        icon = R.drawable.ruler,
        title = R.string.high_tension
    )
}
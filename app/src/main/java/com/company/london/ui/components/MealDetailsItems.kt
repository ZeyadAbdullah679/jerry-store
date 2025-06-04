package com.company.london.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.london.R

@Composable
fun MealDetailsItems(
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        Text(
            text = stringResource(R.string.details),
            style = MaterialTheme.typography.titleLarge.copy(
                fontSize = 18.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight(500),
                color = Color(0xDE1F1F1E)
            )
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            MealDetailsCard(
                title = "1000 V",
                icon = R.drawable.temperature,
                unit = R.string.temperature,
                modifier = Modifier.weight(1f)
            )

            MealDetailsCard(
                title = "3 sparks",
                icon = R.drawable.timer,
                unit = R.string.time,
                modifier = Modifier.weight(1f)
            )

            MealDetailsCard(
                title = "1M 12K",
                icon = R.drawable.evil,
                unit = R.string.no_of_deaths,
                modifier = Modifier.weight(1f)
            )
        }
    }

}

@Preview
@Composable
private fun PreparationItemsPreview() {
    MealDetailsItems(
        modifier = Modifier
    )
}
package com.company.london.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.london.R
import com.company.london.ui.components.preparation_item.PreparationItem

@Composable
fun PreparationItems(
    preparationItems: List<String>,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = modifier.verticalScroll(rememberScrollState())
    ) {
        Text(
            text = stringResource(R.string.preparation_method),
            style = MaterialTheme.typography.titleLarge.copy(
                fontSize = 18.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight(500),
                color = Color(0xDE1F1F1E),
            )
        )
        preparationItems.forEachIndexed { index, item ->
            PreparationItem(
                item = item,
                number = index + 1,
                modifier = Modifier.padding(vertical = 6.dp)
            )
        }
    }
}

@Preview
@Composable
private fun PreparationItemsPreview() {
    PreparationItems(
        preparationItems = listOf(
            "Chop the vegetables",
            "Marinate the chicken",
            "Preheat the oven",
            "Prepare the sauce"
        ),
        modifier = Modifier
    )
}
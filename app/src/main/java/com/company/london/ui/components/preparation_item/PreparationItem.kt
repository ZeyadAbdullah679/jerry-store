package com.company.london.ui.components.preparation_item

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex

@Composable
fun PreparationItem(
    item: String,
    number: Int,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.CenterStart,
        modifier = modifier.fillMaxWidth()
    ) {
        CircleWithNumber(
            number = number,
            modifier = Modifier.zIndex(1f)
        )
        RectangleWithItem(
            item = item,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

@Preview
@Composable
private fun PreparationItemPreview() {
    PreparationItem(
        item = "Preparation Item",
        number = 1,
        modifier = Modifier
    )
}
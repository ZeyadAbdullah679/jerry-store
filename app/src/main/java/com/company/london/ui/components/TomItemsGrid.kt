package com.company.london.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.company.london.R
import com.company.london.ui.model.TomModel


@Composable
fun TomItemsGrid(
    tomList: List<TomModel> = listOf(
        TomModel(
            "Sport Tom",
            "He runs 1 meter... trips over his boot.",
            3, R.drawable.tom_eating
        ),
        TomModel(
            "Tom the lover",
            "He loves one-sidedly... and is beaten by the other side.",
            5,
            R.drawable.tom_love
        ),
        TomModel(
            "Tom the bomb",
            "He blows himself up before Jerry can catch him.",
            10,
            R.drawable.tom_screaming
        ),
        TomModel(
            "Spy Tom",
            "Disguises itself as a table.",
            12,
            R.drawable.tom_crying
        ),
        TomModel(
            "Frozen Tom",
            "He was chasing Jerry, he froze after the first look.",
            6,
            R.drawable.tom_afraid
        ),
        TomModel(
            "Sleeping Tom",
            "He doesn't chase anyone, he just snores in stereo.",
            4,
            R.drawable.tom_screaming2
        )
    )
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
    ) {
        itemsIndexed(tomList) { index, tom ->
            ShoppingItemCard(
                price = tom.cheeseCount,
                oldPrice = if (index == 0) 5 else null,
                title = tom.name,
                description = tom.description,
                icon = tom.image,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview
@Composable
private fun TomItemsGridPreview() {
    TomItemsGrid()
}
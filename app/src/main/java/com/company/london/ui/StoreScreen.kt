package com.company.london.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.company.london.R
import com.company.london.ui.components.StoreHeader
import com.company.london.ui.components.StorePromoCard
import com.company.london.ui.components.StoreSearchBar
import com.company.london.ui.components.TomItemsGrid
import com.company.london.ui.components.TopBar
import com.company.london.ui.theme.Background


@Composable
fun StoreScreen() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
            .padding(start = 16.dp, end = 16.dp, top = 42.dp),

        topBar = {
            TopBar(
                profileImage = R.drawable.profile_jerry,
                title = stringResource(R.string.hi_jerry),
                subtitle = stringResource(R.string.which_tom_do_you_want_to_buy)
            )
        }
    ) { padding ->
        StoreScreenContent(padding = padding)
    }
}


@Composable
private fun StoreScreenContent(padding: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(padding)
            .background(Background)
    ) {
        StoreSearchBar()
        StorePromoCard()
        StoreHeader(title = "Cheap tom Section")
        TomItemsGrid()
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StoreScreenPreview() {
    StoreScreen()
}
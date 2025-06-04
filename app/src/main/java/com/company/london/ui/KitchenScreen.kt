package com.company.london.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.london.R
import com.company.london.ui.components.CartButton
import com.company.london.ui.components.KitchenBackgroundItem
import com.company.london.ui.components.MealDetailsItems
import com.company.london.ui.components.PreparationItems
import com.company.london.ui.components.PriceWithCheese
import com.company.london.ui.theme.White90

@Composable
fun KitchenScreen(modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.background_kitchen),
            contentDescription = stringResource(R.string.kitchen_background),
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .padding(top = 24.dp, bottom = 16.dp)
        ) {
            KitchenBackgroundItem(
                title = R.string.high_tension,
                icon = R.drawable.ruler,
                modifier = Modifier.padding(bottom = 16.dp, start = 16.dp)
            )

            KitchenBackgroundItem(
                title = R.string.shocking_foods,
                icon = R.drawable.chef,
                modifier = Modifier.padding(bottom = 68.dp, start = 16.dp)
            )

            KitchenDetails()
        }

        Image(
            painter = painterResource(id = R.drawable.pasta),
            contentDescription = stringResource(R.string.pasta),
            modifier = Modifier
                .size(188.dp)
                .offset(x = (-16).dp, y = 52.dp)
        )

        CartButton(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(Color(0xFFEEF4F6))
                .padding(bottom = 8.dp)
                .padding(16.dp),
            price = 5,
            oldPrice = 10
        )
    }
}

@Composable
fun KitchenDetails() {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .clip(RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp))
            .fillMaxWidth()
            .background(White90)
            .padding(top = 32.dp, start = 16.dp, end = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = stringResource(R.string.electric_tom_pasta),
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontSize = 20.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xDE1F1F1E),
                        textAlign = TextAlign.Center,
                        letterSpacing = 0.5.sp,
                    )
                )

                PriceWithCheese(
                    price = 5,
                )
            }

            Icon(
                painter = painterResource(R.drawable.filled_favourite_icon),
                contentDescription = stringResource(R.string.favourite),
                tint = Color.Unspecified,
            )
        }

        Text(
            text = stringResource(R.string.description_meal),
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight(500),
                color = Color(0x99121212),
                letterSpacing = 0.5.sp,
            )
        )

        MealDetailsItems(
            modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
        )

        PreparationItems(
            preparationItems = listOf(
                "Put the pasta in a toaster.",
                "Pour battery juice over it.",
                "Wait for the spark to ignite.",
                "Serve with an insulating glove.",
                "Put the pasta in a toaster.",
                "Pour battery juice over it.",
                "Wait for the spark to ignite.",
                "Serve with an insulating glove.",
            )
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun KitchenScreenPreview() {
    KitchenScreen(Modifier)
}
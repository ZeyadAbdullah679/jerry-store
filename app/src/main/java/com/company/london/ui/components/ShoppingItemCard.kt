package com.company.london.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.london.R
import com.company.london.ui.theme.LightGray

@Composable
fun ShoppingItemCard(
    price: Int,
    title: String,
    description: String,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    oldPrice: Int? = null
) {
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = modifier.clickable {  }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .height(220.dp)
                .padding(top = 15.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
                .padding(top = 90.dp, bottom = 8.dp, start = 8.dp, end = 8.dp)
        ) {

            Text(
                text = title,
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
                ),
                modifier = Modifier.weight(1f)
            )

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                PriceWithCheese(
                    price = price,
                    oldPrice = oldPrice,
                    modifier = Modifier.weight(1f)
                )

                Spacer(modifier = Modifier.width(4.dp))

                Icon(
                    painter = painterResource(R.drawable.cart),
                    contentDescription = stringResource(R.string.cart),
                    tint = Color.Unspecified,
                    modifier = Modifier.clickable { }
                )
            }
        }
        Image(
            painter = painterResource(icon),
            contentDescription = title,
            modifier = Modifier
                .size(100.dp)
        )
    }

}

@Preview
@Composable
private fun ShoppingItemCardPreview() {
    ShoppingItemCard(
        title = "Tom Sport",
        description = "He runs 1 meter... trips over his boot.",
        icon = R.drawable.tom_eating,
        price = 5,
        oldPrice = 10,
        modifier = Modifier
    )
}
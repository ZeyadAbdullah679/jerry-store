package com.company.london.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.london.R
import com.company.london.ui.theme.DarkBlue
import com.company.london.ui.theme.LightBlue

@Composable
fun PriceWithCheese(
    price: Int,
    modifier: Modifier = Modifier,
    oldPrice: Int? = null
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = modifier
            .height(30.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(LightBlue)
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Icon(
            painter = painterResource(R.drawable.money),
            contentDescription = stringResource(R.string.money_icon),
            tint = Color.Unspecified
        )

        Spacer(modifier = Modifier.width(4.dp))

        Text(
            text = buildAnnotatedString {
                if (oldPrice != null) {
                    withStyle(style = SpanStyle(textDecoration = TextDecoration.LineThrough)) {
                        append("$oldPrice")
                    }
                }
                append(" $price cheeses")
            },
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 12.sp,
                color = DarkBlue,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier
        )
    }
}

@Preview
@Composable
private fun PriceWithCheesePreview() {
    PriceWithCheese(
        price = 5,
        oldPrice = 10
    )
}
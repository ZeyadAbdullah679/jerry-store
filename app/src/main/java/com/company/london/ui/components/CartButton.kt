package com.company.london.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.london.R

@Composable
fun CartButton(
    modifier: Modifier = Modifier,
    price: Int,
    oldPrice: Int? = null,
) {
    Button(
        onClick = {},
        modifier = modifier.height(56.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors().copy(
            containerColor = Color(0xFF226993)
        )
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = stringResource(R.string.add_to_cart),
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontFamily = FontFamily(Font(R.font.ibm_plex_sans_arabic_medium)),
                    fontSize = 16.sp,
                    lineHeight = 16.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xDEFFFFFF),
                    textAlign = TextAlign.Center,
                    letterSpacing = 0.5.sp,
                )
            )

            Spacer(
                modifier = Modifier
                    .size(4.dp)
                    .clip(CircleShape)
                    .background(color = Color(0x61FFFFFF))
            )

            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "$price cheeses",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontFamily = FontFamily(Font(R.font.ibm_plex_sans_arabic_medium)),
                        fontSize = 14.sp,
                        lineHeight = 16.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Center,
                    )
                )

                if (oldPrice != null) {
                    Text(
                        text = "$oldPrice cheeses",
                        style = MaterialTheme.typography.bodyLarge.copy(
                            fontFamily = FontFamily(Font(R.font.ibm_plex_sans_arabic_medium)),
                            fontSize = 12.sp,
                            lineHeight = 16.sp,
                            fontWeight = FontWeight(500),
                            textDecoration = TextDecoration.LineThrough,
                            color = Color(0xCCFFFFFF),
                            textAlign = TextAlign.Center,
                        )
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun CartButtonPreview() {
    CartButton(
        modifier = Modifier,
        price = 5,
        oldPrice = 10
    )
}
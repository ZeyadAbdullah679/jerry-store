package com.company.london.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.london.R
import com.company.london.ui.theme.DarkBlueGradientStart
import com.company.london.ui.theme.LightBlueGradientEnd
import com.company.london.ui.theme.LightGrayNeutral

@Composable
fun StorePromoCard(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 24.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(92.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(DarkBlueGradientStart, LightBlueGradientEnd)
                    )
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 12.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        text = stringResource(R.string.buy_1_tom_and_get_2_for_free),
                        modifier = Modifier.width(208.dp),
                        fontSize = 16.sp,
                        fontWeight = FontWeight(600),
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = stringResource(R.string.adopt_tom_free_fail_free_guarantee),
                        modifier = Modifier.width(177.dp),
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        color = LightGrayNeutral
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))
            }
        }

        Image(
            painter = painterResource(id = R.drawable.tom_money),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .offset(y = (-16).dp, x = (-12).dp)
                .width(115.dp)
                .height(108.dp),
            contentScale = ContentScale.Crop
        )
    }
}

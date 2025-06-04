package com.company.london.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.london.R
import com.company.london.ui.theme.GreyText
import com.company.london.ui.theme.PrimaryBlue

@Composable
fun StoreSearchBar(modifier: Modifier=Modifier){

    Row(modifier
        .fillMaxWidth()
        .padding(top = 20.dp)
        .height(48.dp)
        .fillMaxWidth(),
    ) {

    Card(modifier=modifier
        .weight(3F)
        .height(48.dp),
        colors = CardDefaults.cardColors(Color.White),
        elevation =  CardDefaults.cardElevation(defaultElevation = 1.dp),
    ){
        Row(modifier=modifier
            .height(48.dp)
            .padding(horizontal = 12.dp, vertical = 8.dp),
          verticalAlignment = Alignment.CenterVertically
            ) {
            Image(
                painter = painterResource(id= R.drawable.search),
                contentDescription = null,
                )

            Spacer(modifier = modifier.width(8.dp))
            Text(
                modifier = modifier.size(width = 216.dp, height = 21.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
                color = GreyText,
                text = stringResource(R.string.search_about_tom)
            )

        }}
        Spacer(modifier = modifier.width(8.dp))
        Image(
            painter = painterResource(id= R.drawable.filter_horizontal),
            modifier = modifier
                .size(width = 48.dp, height = 48.dp)
                .clip(RoundedCornerShape(12))
                .background(PrimaryBlue)
                .padding(8.dp),
            contentDescription = null)

    }

}
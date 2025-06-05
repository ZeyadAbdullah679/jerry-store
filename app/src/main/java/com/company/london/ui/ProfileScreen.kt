package com.company.london.ui

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.london.R
import com.company.london.ui.components.TomAccountItem
import com.company.london.ui.components.TomStatsCard
import com.company.london.ui.model.TomAccountOption
import com.company.london.ui.model.TomStatCardModel
import com.company.london.ui.theme.White90

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxWidth()
    ) {
        AccountBackground()
    }
    Box(
        modifier = Modifier
            .padding(top = 208.dp)
            .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            .fillMaxSize()
            .background(com.company.london.ui.theme.AccountBackground)
    ) {
        AccountScreenContent()
    }
}


@Composable
fun AccountScreenContent(
    statsCards: List<TomStatCardModel> = listOf(
        TomStatCardModel(Color(0XFFD0E5F0), R.drawable.circle_devil, "2M 12K", "No. of quarrels"),
        TomStatCardModel(Color(0XFFDEEECD), R.drawable.circle_run, "+500 h", "Chase time"),
        TomStatCardModel(Color(0XFFF2D9E7), R.drawable.circle_sad, "2M 12K", "Hunting times"),
        TomStatCardModel(Color(0XFFFAEDCF), R.drawable.circle_broken_heart, "3M 7K", "Heartbroken"),
    ), tomSettings: List<TomAccountOption> = listOf(
        TomAccountOption(R.drawable.bed, "Change sleeping place"),
        TomAccountOption(R.drawable.meow, "Meow settings"),
        TomAccountOption(R.drawable.fridge, "Password to open the fridge"),
    ),
    favoriteFoods: List<TomAccountOption> = listOf(
        TomAccountOption(R.drawable.warning, "Mouses"),
        TomAccountOption(R.drawable.burger, "Last stolen meal"),
        TomAccountOption(R.drawable.sleeping, "Change sleep mood"),
    )
) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 23.dp)
    ) {

        Row(
            modifier = Modifier
                .padding(bottom = 8.dp)
                .height(56.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            TomStatsCard(
                backGroundColor = statsCards[0].backgroundColor,
                image = statsCards[0].imageRes,
                title = statsCards[0].title,
                description = statsCards[0].description,
                modifier = Modifier.weight(1f)
            )

            TomStatsCard(
                backGroundColor = statsCards[1].backgroundColor,
                image = statsCards[1].imageRes,
                title = statsCards[1].title,
                description = statsCards[1].description,
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier
                .padding(bottom = 24.dp)
                .height(56.dp),

            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            TomStatsCard(
                backGroundColor = statsCards[2].backgroundColor,
                image = statsCards[2].imageRes,
                title = statsCards[2].title,
                description = statsCards[2].description,
                modifier = Modifier.weight(1f)
            )

            TomStatsCard(
                backGroundColor = statsCards[3].backgroundColor,
                image = statsCards[3].imageRes,
                title = statsCards[3].title,
                description = statsCards[3].description,
                modifier = Modifier.weight(1f)
            )
        }

        Text(
            text = "Tom settings",
            modifier = Modifier.height(30.dp),
            fontWeight = FontWeight(700),
            fontSize = 20.sp,
            color = Color(0xDE1F1F1E),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(8.dp))

        TomAccountItem(image = tomSettings[0].icon, text = tomSettings[0].text)
        Spacer(modifier = Modifier.height(12.dp))
        TomAccountItem(image = tomSettings[1].icon, text = tomSettings[1].text)
        Spacer(modifier = Modifier.height(12.dp))
        TomAccountItem(image = tomSettings[2].icon, text = tomSettings[2].text)

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "His favorite foods",
            modifier = Modifier.height(30.dp),
            fontWeight = FontWeight(700),
            fontSize = 20.sp,
            color = Color(0xDE1F1F1E),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(8.dp))

        TomAccountItem(image = favoriteFoods[0].icon, text = favoriteFoods[0].text)
        Spacer(modifier = Modifier.height(12.dp))
        TomAccountItem(image = favoriteFoods[1].icon, text = favoriteFoods[1].text)
        Spacer(modifier = Modifier.height(12.dp))
        TomAccountItem(image = favoriteFoods[2].icon, text = favoriteFoods[2].text)

        Text(
            text = stringResource(R.string.v_tombeta),
            modifier = Modifier
                .padding(top = 24.dp)
                .fillMaxWidth(),
            fontSize = 12.sp,
            fontWeight = FontWeight(400),
            color = Color(0x99121212),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun AccountBackground() {
    Spacer(modifier = Modifier.height(20.dp))
    Image(
        painter = painterResource(id = R.drawable.background_container),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .height(242.dp),
        contentScale = ContentScale.Crop
    )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
    ) {
        Image(
            painter = painterResource(id = R.drawable.tom_donkey),
            contentDescription = null,
            modifier = Modifier
                .padding(bottom = 4.dp)
                .size(64.dp)
                .clip(RoundedCornerShape(12.dp))
        )

        Text(
            text = "Tom",
            modifier = Modifier.height(23.dp),
            fontWeight = FontWeight(500),
            fontSize = 18.sp,
            lineHeight = (16 * 1.3).sp,
            textAlign = TextAlign.Center,
            color = White
        )

        Text(
            text = "specializes in failure!",
            modifier = Modifier
                .padding(bottom = 4.dp)
                .height(23.dp),
            fontWeight = FontWeight(400),
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            lineHeight = (12 * 1.8).sp,
            color = White90
        )

        Text(
            text = "Edit foolishness",
            fontSize = 10.sp,
            fontWeight = FontWeight(500),
            color = White,
            textAlign = TextAlign.Center,
            lineHeight = (10 * 1.3).sp,
            modifier = Modifier
                .background(
                    Color(0xFF4B87A2).copy(alpha = 0.4f), shape = RoundedCornerShape(50)
                )
                .padding(horizontal = 12.dp, vertical = 6.dp)
        )
    }
    Spacer(modifier = Modifier.height(8.dp))
}


@Preview(
    showBackground = true, showSystemUi = true, device = "spec:width=411dp,height=891dp"
)
@Composable
fun AccountScreenPreview() {
    ProfileScreen()
}
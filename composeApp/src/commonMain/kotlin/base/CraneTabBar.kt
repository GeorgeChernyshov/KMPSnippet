package base

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.unit.dp
import getLocalizedUppercase
import home.CraneScreen
import kmpsnippet.composeapp.generated.resources.Res
import kmpsnippet.composeapp.generated.resources.cd_menu
import kmpsnippet.composeapp.generated.resources.ic_crane_logo
import kmpsnippet.composeapp.generated.resources.ic_menu
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun CraneTabBar(
    modifier: Modifier = Modifier,
    onMenuClicked: () -> Unit,
    children: @Composable (Modifier) -> Unit
) {
    Row(modifier) {
        Row(Modifier.padding(top = 8.dp)) {
            Image(
                modifier = Modifier
                    .padding(top = 8.dp)
                    .clickable(onClick = onMenuClicked),
                painter = painterResource(Res.drawable.ic_menu),
                contentDescription = stringResource(Res.string.cd_menu)
            )

            Spacer(Modifier.width(8.dp))

            Image(
                painter = painterResource(Res.drawable.ic_crane_logo),
                contentDescription = null
            )
        }

        children(
            Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        )
    }
}

@Composable
fun CraneTabs(
    modifier: Modifier = Modifier,
    titles: List<String>,
    tabSelected: CraneScreen,
    onTabSelected: (CraneScreen) -> Unit
) {
    TabRow(
        selectedTabIndex = tabSelected.ordinal,
        modifier = modifier,
        contentColor = MaterialTheme.colors.onSurface,
        indicator = { },
        divider = { }
    ) {
        titles.forEachIndexed { index, title ->
            val selected = index == tabSelected.ordinal

            var textModifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
            if (selected) {
                textModifier = Modifier
                    .border(BorderStroke(2.dp, Color.White), RoundedCornerShape(16.dp))
                    .then(textModifier)
            }

            Tab(
                selected = selected,
                onClick = { onTabSelected(CraneScreen.values()[index]) }
            ) {
                Text(
                    modifier = textModifier,
                    text = getLocalizedUppercase(title)
                )
            }
        }
    }
}
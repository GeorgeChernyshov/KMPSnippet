package ui

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kmpsnippet.composeapp.generated.resources.Res
import kmpsnippet.composeapp.generated.resources.raleway_light
import kmpsnippet.composeapp.generated.resources.raleway_medium
import kmpsnippet.composeapp.generated.resources.raleway_regular
import kmpsnippet.composeapp.generated.resources.raleway_semibold
import org.jetbrains.compose.resources.Font

@Composable
private fun light() = Font(Res.font.raleway_light, FontWeight.W300)

@Composable
private fun regular() = Font(Res.font.raleway_regular, FontWeight.W400)

@Composable
private fun medium() = Font(Res.font.raleway_medium, FontWeight.W500)

@Composable
private fun semibold() = Font(Res.font.raleway_semibold, FontWeight.W600)

@Composable
private fun craneFontFamily() = FontFamily(fonts = listOf(light(), regular(), medium(), semibold()))

@Composable
fun captionTextStyle() = TextStyle(
    fontFamily = craneFontFamily(),
    fontWeight = FontWeight.W400,
    fontSize = 16.sp
)

@Composable
fun craneTypography() = Typography(
    h1 = TextStyle(
        fontFamily = craneFontFamily(),
        fontWeight = FontWeight.W300,
        fontSize = 96.sp
    ),
    h2 = TextStyle(
        fontFamily = craneFontFamily(),
        fontWeight = FontWeight.W400,
        fontSize = 60.sp
    ),
    h3 = TextStyle(
        fontFamily = craneFontFamily(),
        fontWeight = FontWeight.W600,
        fontSize = 48.sp
    ),
    h4 = TextStyle(
        fontFamily = craneFontFamily(),
        fontWeight = FontWeight.W600,
        fontSize = 34.sp
    ),
    h5 = TextStyle(
        fontFamily = craneFontFamily(),
        fontWeight = FontWeight.W600,
        fontSize = 24.sp
    ),
    h6 = TextStyle(
        fontFamily = craneFontFamily(),
        fontWeight = FontWeight.W400,
        fontSize = 20.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = craneFontFamily(),
        fontWeight = FontWeight.W500,
        fontSize = 16.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = craneFontFamily(),
        fontWeight = FontWeight.W600,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontFamily = craneFontFamily(),
        fontWeight = FontWeight.W600,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = craneFontFamily(),
        fontWeight = FontWeight.W400,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontFamily = craneFontFamily(),
        fontWeight = FontWeight.W600,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = craneFontFamily(),
        fontWeight = FontWeight.W500,
        fontSize = 12.sp
    ),
    overline = TextStyle(
        fontFamily = craneFontFamily(),
        fontWeight = FontWeight.W400,
        fontSize = 12.sp
    )
)

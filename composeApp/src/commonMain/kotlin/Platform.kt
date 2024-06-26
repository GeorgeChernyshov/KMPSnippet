import androidx.compose.runtime.Composable

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

@Composable
expect fun getLocalizedUppercase(title: String): String
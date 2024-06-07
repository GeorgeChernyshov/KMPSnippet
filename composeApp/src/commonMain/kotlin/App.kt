import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import home.CraneHome
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.CraneTheme

@Composable
@Preview
fun App() {
    CraneTheme {
        CraneHome()
    }
}
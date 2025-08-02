import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.realism.core.ui.R

@Preview(showBackground = false)
@Composable
fun LogoPreview() {
    Logo()
}

@Composable
fun Logo() {
    Box(
        modifier = Modifier
            .width(280.dp)
            .height(63.dp),
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Daily Quiz",
        )
    }
}
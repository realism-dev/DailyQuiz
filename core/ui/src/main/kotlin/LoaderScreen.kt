import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = false)
@Composable
fun LoaderScreenPreview() {
    LoaderScreen(true)
}

@Composable
fun LoaderScreen(isLoading: Boolean) {
    Scaffold(
        topBar = {
            StatusBar()
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .background(Blue400)
            ) {
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Spacer(modifier = Modifier.size(178.dp))
                    Logo(280.dp,63.dp)
                    Spacer(modifier = Modifier.size(112.dp))
                    if (isLoading) {
                        CircularProgressIndicator(
                            modifier = Modifier.width(56.dp),
                            color = White,
                            trackColor = Gray400,
                            strokeWidth = 4.dp
                        )
                    }
                }
            }
        })
}

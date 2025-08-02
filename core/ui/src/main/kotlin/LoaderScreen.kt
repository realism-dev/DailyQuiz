import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.realism.core.ui.R

@Preview(showBackground = false)
@Composable
fun LoaderScreenPreview() {
    LoaderScreen(true)
}

@Composable
fun LoaderScreen(isLoading: Boolean) {
    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .background(Blue400),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "12:31",
                    modifier = Modifier
                        .padding(start = 20.dp),
                    style = interRegular,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W400,
                    color = White
                )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(1.dp),
                    modifier = Modifier.padding(end = 20.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.wifi),
                        contentDescription = "Clock",
                        modifier = Modifier
                            .size(15.dp),
                        tint = White
                    )
                    Icon(
                        painter = painterResource(R.drawable.network),
                        contentDescription = "Clock",
                        modifier = Modifier
                            .size(15.dp),
                        tint = White
                    )
                    Icon(
                        painter = painterResource(R.drawable.power),
                        contentDescription = "Clock",
                        modifier = Modifier
                            .size(15.dp),
                        tint = White
                    )
                }
            }
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
                    Logo()
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

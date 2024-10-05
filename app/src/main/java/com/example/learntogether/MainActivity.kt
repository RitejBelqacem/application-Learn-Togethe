package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.learntogether.ui.theme.LearnTogetherTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ContentText(
                        Text1 = stringResource(R.string.TextOne),
                        Text2 = stringResource(R.string.TextTwo),
                        Text3 = stringResource(R.string.TextThree),
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
            }
        }
    }


@Composable
fun ContentText(Text1 : String,Text2:String,Text3 : String,modifier:Modifier=Modifier){
Column(
    modifier = Modifier.fillMaxSize()
){
    val image = painterResource(R.drawable.bg_compose_background)
    Image(painter=image,contentDescription = null,modifier=modifier.fillMaxWidth())
    Text(
        text=Text1,
        fontSize=24.sp,
        modifier=Modifier
            .padding(16.dp),
        textAlign = TextAlign.Justify
    )
    Text(
        text=Text2,
        modifier=Modifier
            .padding(16.dp),
        textAlign = TextAlign.Justify
    )
    Text(
        text=Text3,
        modifier=Modifier
            .padding(16.dp),
        textAlign = TextAlign.Justify
    )
}
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        ContentText(
            Text1=stringResource(R.string.TextOne),
            Text2= stringResource(R.string.TextTwo),
            Text3=stringResource(R.string.TextThree)
        )

    }
}
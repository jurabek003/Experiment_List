package uz.turgunboyevjurabek.experiment_list

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.turgunboyevjurabek.experiment_list.ui.theme.Experiment_ListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            Experiment_ListTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Column {

                        val context= LocalContext.current
                        Greeting(context)

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(context:Context) {

    val list=ArrayList<Data>()
    list.addAll(listOf(
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android1","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android2","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android3","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android4","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android5","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android6","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android7","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android8","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android9","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android00","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android0","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
        Data(painterResource(id = R.drawable.ic_launcher_foreground),"Android","the bast OT"),
    ))
    LazyColumn{
        items(list.size){
            Column {
                ItemUI(data = list[it], context = context)
            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    Experiment_ListTheme {
        val rasm= painterResource(id = R.drawable.ic_launcher_foreground)
        val data=Data(rasm,"android","the bast")
        val context= LocalContext.current

        Column {
            ItemUI(data,context)
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemUI(data:Data,context:Context,) {
    var showDialog by remember { mutableStateOf(false) }



    Card(modifier = Modifier
        .padding(horizontal = 10.dp, vertical = 5.dp)
        .clip(RoundedCornerShape(topEndPercent = 40, bottomStartPercent = 40))
        .clickable {
            Toast
                .makeText(context, data.nomi, Toast.LENGTH_SHORT)
                .show()
            showDialog=true
        }
        .height(70.dp)
    ){


        var isVisible by remember { mutableStateOf(true) }

        val alpha by animateFloatAsState(
            targetValue = if (isVisible) 1f else 0f, label = "",
            animationSpec = tween(durationMillis = 3000
            ))
        val offsetY by animateDpAsState(
            targetValue = if (isVisible) 0.dp else 50.dp,
            animationSpec = tween(durationMillis = 3000), label = ""
        )

        if (showDialog){
            AlertDialog(
                onDismissRequest = {showDialog=false },
                title = { Text(text = data.nomi,)},
                text = { Text(text = "Android app with Jetpack Compose",)},
                dismissButton = {
                    Button(onClick = {showDialog=false}) {
                        Text(text = "Cancel", color = Color.Black)
                    }
                },
                confirmButton = {
                    Button(onClick = { showDialog=false }) {
                        Text(text = "Ok", color = Color.Black)
                    }
                },
                modifier = Modifier
                    .offset(offsetY)
                    .alpha(alpha)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
            .fillMaxWidth()
        ) {
            Image(painter = data.img, contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier
                .clip(
                    CircleShape
                )
                .size(70.dp))
            Column {
                Text(text = data.nomi, fontSize = 20.sp, fontFamily = FontFamily.Monospace, color = Color.Black, fontWeight = FontWeight.ExtraBold)
            }
        }
    }
}


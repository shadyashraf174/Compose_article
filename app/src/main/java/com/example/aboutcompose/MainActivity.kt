package com.example.aboutcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aboutcompose.ui.theme.AboutComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AboutComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeNavigation()
                }
            }
        }
    }
}

@Composable
fun ComposeNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "S_1") {
        composable("S_1") {
            HomeScreen (navController)
        }
        composable("S_2") {
            Corniche (navController)
        }
        composable("S_3") {
            Montazah (navController)
        }
        composable("S_4") {
            RasElTinPalace (navController)
        }
        composable("S_5") {
            LibraryOfAlexandria (navController)
        }
    }
}
//Corniche--------------------------------------------------------------------------------------------------
@Composable
fun HomeScreen(navHostController: NavHostController) {

    Image(
        painter = painterResource(R.drawable.alexandria_tany),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxSize()
    )
    Column(modifier = Modifier) {
        Text(
            text = stringResource(R.string.title_jetpack_compose_tutorial),
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth(),
            Color.DarkGray,
            fontSize = 50.sp,
            textAlign = TextAlign.Center,

        )
        //Corniche--------------------------------------------------------------------------------
        Surface(
            shape = MaterialTheme.shapes.medium,
            color = MaterialTheme.colorScheme.surfaceVariant,
            modifier = Modifier.offset(x=70.dp,y=200.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.width(255.dp),

            ) {
                Image(
                    painter = painterResource(R.drawable.corniche),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(80.dp)
                )
                Button( modifier = Modifier
                    .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors( Color.Transparent),
                    onClick = {navHostController.navigate("S_2")}
                ) {
                    Text(
                        stringResource(id = R.string.Corniche),
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }
            }
        }
        //Montazah--------------------------------------------------------------------------------
        Surface(
            shape = MaterialTheme.shapes.medium,
            color = MaterialTheme.colorScheme.surfaceVariant,
            modifier = Modifier.offset(x=70.dp,y=210.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.width(255.dp),

                ) {
                Image(
                    painter = painterResource(R.drawable.montazah),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(80.dp)
                )
                Button( modifier = Modifier
                    .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors( Color.Transparent),
                    onClick = {navHostController.navigate("S_3")}
                ) {
                    Text(
                        stringResource(id = R.string.Montazah),
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }
            }
        }
        //RasElTinPalace--------------------------------------------------------------------------------
        Surface(
            shape = MaterialTheme.shapes.medium,
            color = MaterialTheme.colorScheme.surfaceVariant,
            modifier = Modifier.offset(x=70.dp,y=220.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.width(255.dp),

                ) {
                Image(
                    painter = painterResource(R.drawable.raseltinpalace),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(80.dp)
                )
                Button( modifier = Modifier
                    .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors( Color.Transparent),
                    onClick = {navHostController.navigate("S_4")}
                ) {
                    Text(
                        stringResource(id = R.string.RasElTinPalace),
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }
            }
        }
        //LibraryOfAlexandria--------------------------------------------------------------------------------
        Surface(
            shape = MaterialTheme.shapes.medium,
            color = MaterialTheme.colorScheme.surfaceVariant,
            modifier = Modifier.offset(x=70.dp,y=230.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.width(255.dp),

                ) {
                Image(
                    painter = painterResource(R.drawable.libraryofalexandria),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(80.dp)
                )
                Button( modifier = Modifier
                    .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors( Color.Transparent),
                    onClick = {navHostController.navigate("S_5")}
                ) {
                    Text(
                        stringResource(id = R.string.LibraryOfAlexandria),
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreen_Preview() {
    val navController = rememberNavController()
    AboutComposeTheme {
        HomeScreen(navController)
    }
}
//Corniche--------------------------------------------------------------------------------------------------
@Composable
fun Corniche(navHostController: NavHostController) {
    Column(modifier = Modifier) {
        Image(painter = painterResource(R.drawable.corniche), contentDescription = null)
        Text(
            text = stringResource(R.string.Corniche),
            modifier = Modifier.padding(24.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.compose_short_desc),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.compose_long_desc),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.compose_Overall_desc),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(Color(0xFF275168)),
            shape = RoundedCornerShape(0),

            onClick = {navHostController.navigate("S_1")}
        ) {
            Text(
                "Back",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Corniche_Preview() {
    val navController = rememberNavController()
    AboutComposeTheme {
        Corniche(navController)
    }
}
//Montazah--------------------------------------------------------------------------------------------------
@Composable
fun Montazah(navHostController: NavHostController) {
    Column(modifier = Modifier) {
        Image(
            painter = painterResource(R.drawable.montazah),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = stringResource(R.string.Montazah),
            modifier = Modifier.padding(24.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.compose_short_desc),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.compose_long_desc),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.compose_Overall_desc),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(Color(0xFF275168)),
            shape = RoundedCornerShape(0),

            onClick = {navHostController.navigate("S_1")}
        ) {
            Text(
                "Back",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Montazah_Preview() {
    val navController = rememberNavController()
    AboutComposeTheme {
        Montazah(navController)
    }
}
//RasElTinPalace--------------------------------------------------------------------------------------------------
@Composable
fun RasElTinPalace(navHostController: NavHostController) {
    Column(modifier = Modifier) {
        Image(painter = painterResource(R.drawable.raseltinpalace), contentDescription = null)
        Text(
            text = stringResource(R.string.RasElTinPalace),
            modifier = Modifier.padding(24.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.compose_short_desc),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.compose_long_desc),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.compose_Overall_desc),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(Color(0xFF275168)),
            shape = RoundedCornerShape(0),

            onClick = {navHostController.navigate("S_2")}
        ) {
            Text(
                "Back",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RasElTinPalace_Preview() {
    val navController = rememberNavController()
    AboutComposeTheme {
        RasElTinPalace(navController)
    }
}
//LibraryOfAlexandria--------------------------------------------------------------------------------------------------
@Composable
fun LibraryOfAlexandria(navHostController: NavHostController) {
    Column(modifier = Modifier) {
        Image(painter = painterResource(R.drawable.libraryofalexandria), contentDescription = null)
        Text(
            text = stringResource(R.string.LibraryOfAlexandria),
            modifier = Modifier.padding(24.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.compose_short_desc),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.compose_long_desc),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.compose_Overall_desc),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(Color(0xFF275168)),
            shape = RoundedCornerShape(0),

            onClick = {navHostController.navigate("S_1")}
        ) {
            Text(
                "Back",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LibraryOfAlexandria_Preview() {
    val navController = rememberNavController()
    AboutComposeTheme {
        LibraryOfAlexandria(navController)
    }
}
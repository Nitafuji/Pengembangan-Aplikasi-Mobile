package com.example.project_activity_intent

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.transformable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import com.example.project_activity_intent.ui.theme.Project_Activity_IntentTheme
import org.w3c.dom.Text

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project_Activity_IntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ){
                MainScreen()
                }
            }
        }
    }
}

@Composable
fun TopBar(){

    val context = LocalContext.current

    TopAppBar(
        title = {Text(
            textAlign = TextAlign.Left,
            text = "Selamat Pagi",
            fontSize = 23.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            color = Color.White,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold
        )},
        actions = {
            IconButton(onClick = {
                Toast.makeText(context, "Setting", Toast.LENGTH_SHORT).show()
            }) {
                Icon(Icons.Default.Settings, "Setting")
            }
        },
        backgroundColor = Color.Transparent,
        contentColor = Color.White,
    )
}

fun Text(textAlign: TextAlign, text: String, fontSize: Dp, maxLines: Int, overflow: TextOverflow) {

}
//@Preview(showBackground = true)
//@Composable
//fun TopBarPreview() {
//    TopBar()
//}

//MainScreen Brow.

@Composable
fun MainScreen() {
    Scaffold(
        modifier = Modifier.shadow(70.dp),
        topBar = { TopBar() },
        bottomBar = { BottomNavigationBar() },

        content = { padding -> // We have to pass the scaffold inner padding to our content. That's why we use Box.
            Box(modifier = Modifier
                .padding(padding)
                .shadow(0.dp)) {
                /* Add code later */
                Box(modifier = Modifier.shadow(0.dp))
            }
        },
        backgroundColor = Color.Transparent // Set background color to avoid the white flashing when you switch between

    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    BackgroundImage()
    MainScreen()
    MostPlayedSection()
    RecommendSection()

}


//Card Besar 2
@Composable
fun MostPlayedSection() {
    Row(
        modifier = Modifier.padding(
            top = 60.dp, start = 8.dp, end = 8.dp
        ),
        horizontalArrangement = Arrangement.Start,
    ) {
        Image(
            modifier = Modifier
                .padding(top = 2.dp, start = 8.dp, end = 8.dp)
                .width(170.dp)
                .height(60.dp),
            painter = painterResource(
                id = R.drawable.liked
            ),
            contentDescription = null,
        )
        Image(
            modifier = Modifier
                .padding(top = 2.dp, start = 8.dp, end = 8.dp)
                .width(170.dp)
                .height(60.dp),
            painter = painterResource(
                id = R.drawable.post
            ),
            contentDescription = null,
        )

    }
    Row(
        modifier = Modifier.padding(
            top = 115.dp, start = 8.dp, end = 8.dp
        ),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Image(
            modifier = Modifier
                .padding(top = 2.dp, start = 8.dp, end = 8.dp)
                .width(170.dp)
                .height(60.dp),
            painter = painterResource(
                id = R.drawable.fiji
            ),
            contentDescription = null,
        )
        Image(
            modifier = Modifier
                .padding(top = 2.dp, start = 8.dp, end = 8.dp)
                .width(170.dp)
                .height(60.dp),
            painter = painterResource(
                id = R.drawable.pagi
            ),
            contentDescription = null,
        )
    }
    Row(
        modifier = Modifier.padding(
            top = 170.dp, start = 8.dp, end = 8.dp
        ),
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier
                .padding(top = 2.dp, start = 8.dp, end = 8.dp)
                .width(170.dp)
                .height(60.dp),
            painter = painterResource(
                id = R.drawable.feby
            ),
            contentDescription = null,
        )
        Image(
            modifier = Modifier
                .padding(top = 2.dp, start = 8.dp, end = 8.dp)
                .width(170.dp)
                .height(60.dp),
            painter = painterResource(
                id = R.drawable.virgoun
            ),
            contentDescription = null,
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 255.dp, start = 5.dp, end = 5.dp)
    ) {
        Text(text = "    Most Played",
            color = Color.White,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Left)
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, start = 5.dp, end = 5.dp)
    ) {
    }

    Row(
        modifier = Modifier.padding(
            top = 285.dp, start = 3.dp
        ),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            modifier = Modifier
                .padding(top = 2.dp, start = 8.dp, end = 8.dp)
                .width(150.dp)
                .height(200.dp),
            painter = painterResource(
                id = R.drawable.justin
            ),
            contentDescription = null,
        )
        Image(
            modifier = Modifier
                .padding(top = 2.dp, start = 8.dp, end = 8.dp)
                .width(150.dp)
                .height(200.dp),
            painter = painterResource(
                id = R.drawable.soegi
            ),
            contentDescription = null,
        )
        Image(
            modifier = Modifier
                .padding(top = 2.dp, start = 8.dp, end = 8.dp)
                .width(150.dp)
                .height(200.dp),
            painter = painterResource(
                id = R.drawable.habibi
            ),
            contentDescription = null,
        )
    }
}

//Card Bawah
@Composable
fun RecommendSection(){
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 515.dp, start = 5.dp, end = 5.dp)
    ) {
        Text(text = "    Mix For You",
            color = Color.White,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Left)
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp, start = 5.dp, end = 5.dp)
    ) {
    }

    Row(
        modifier = Modifier
            .padding(
                top = 280.dp, start = 3.dp
            )
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            modifier = Modifier
                .padding(top = 270.dp, start = 8.dp, end = 8.dp)
                .width(150.dp)
                .height(200.dp),
            painter = painterResource(
                id = R.drawable.mood
            ),
            contentDescription = null,
        )
        Image(
            modifier = Modifier
                .padding(top = 270.dp, start = 8.dp, end = 8.dp)
                .width(150.dp)
                .height(200.dp),
            painter = painterResource(
                id = R.drawable.payung
            ),
            contentDescription = null,
        )
        Image(
            modifier = Modifier
                .padding(top = 270.dp, start = 8.dp, end = 8.dp)
                .width(150.dp)
                .height(200.dp),
            painter = painterResource(
                id = R.drawable.west
            ),
            contentDescription = null,
        )
    }
}


@Composable
fun BackgroundImage(){
    Image(
        modifier = Modifier
            .width(900.dp)
            ,
        painter = painterResource(
            id = R.drawable.bg
        ),
        contentDescription = null,
    )
}

//Coba


//Card Atas 1
//@Composable
//fun MostPlayedSection(){
//
//    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally) {
//
//        Card{
//
//            Column(Modifier.padding(10.dp)) {
//
//                Text("GeeksforGeeks", fontWeight = FontWeight.W700)
//
//                Text("+91 1800 2584458")
//
//                Text("Noida, India", color = Color.Gray)
//
//            }
//
//        }
//
//    }
//}

//Bottom Navigation Brow

@Composable
fun BottomNavigationBar() {
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Search,
        NavigationItem.Library
    )

    BottomNavigation(
        backgroundColor = androidx.compose.ui.graphics.Color.Black,
        contentColor = androidx.compose.ui.graphics.Color.White,
    ){
//        val navBackStackEntry by navController.currentBackStackEntryAsState()
//        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            BottomNavigationItem(
                icon = {Icon(painterResource(id = item.icon), contentDescription = item.title)},
                label = {Text(text = item.title)},
                selectedContentColor = androidx.compose.ui.graphics.Color.White,
                unselectedContentColor = androidx.compose.ui.graphics.Color.Gray,
                alwaysShowLabel = true,
                selected = false,
                onClick = {
                }
            )
        }
    }
}
//@Preview(showBackground = true)
//@Composable
//fun BottomNavigationBarPreview() {
//    BottomNavigationBar()
//}

//@Composable
//fun Navigation(navController : NavHostController){
//    NavHost(navController, startDestination = Navigation.Home.route){
//        composable(Navigation.Home.route){
//            HomeScreen()
//        }
//        composable(Navigation.Search.route){
//            SearchScreen()
//        }
//        composable(Navigation.Library.route){
//            ChatScreen()
//        }
//
//
//    }
//}


package com.example.project_activity_intent

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
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
                    val username = getIntent().getStringExtra("username") ?: ""
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
        title = {Text(text = "Good evening", fontSize = 30.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )},

        navigationIcon = {
            IconButton(onClick = {
                Toast.makeText(context, "Menu", Toast.LENGTH_SHORT).show()
            }) {
//                Icon(Icons.Default.Menu, "Menu")
            }},
        actions = {
            IconButton(onClick = {
                Toast.makeText(context, "Setting", Toast.LENGTH_SHORT).show()
            }) {
                Icon(Icons.Default.Settings, "Setting")
            }
        },
        backgroundColor = androidx.compose.ui.graphics.Color.Black,
        contentColor = androidx.compose.ui.graphics.Color.White,
    )
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
        topBar = { TopBar() },
        bottomBar = { BottomNavigationBar() },

        content = { padding -> // We have to pass the scaffold inner padding to our content. That's why we use Box.
            Box(modifier = Modifier.padding(padding)) {
                /* Add code later */
            }
        },
        backgroundColor = Color.Black // Set background color to avoid the white flashing when you switch between screens
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
    MostPlayedSection()
}

//Card Atas 2
@Composable
fun MostPlayedSection() {
        Row(
            modifier = Modifier.padding(
                top = 100.dp, start = 35.dp, end = 8.dp
            ),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                modifier = Modifier
                    .padding(top = 2.dp, start = 8.dp, end = 8.dp)
                    .width(150.dp)
                    .height(60.dp),
                painter = painterResource(
                    id = R.drawable.pagi
                ),
                contentDescription = null,
            )
            Image(
                modifier = Modifier
                    .padding(top = 2.dp, start = 8.dp, end = 8.dp)
                    .width(150.dp)
                    .height(60.dp),
                painter = painterResource(
                    id = R.drawable.pagi
                ),
                contentDescription = null,
            )

        }
    Row(
        modifier = Modifier.padding(
            top = 150.dp, start = 35.dp, end = 8.dp
        ),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            modifier = Modifier
                .padding(top = 2.dp, start = 8.dp, end = 8.dp)
                .width(150.dp)
                .height(60.dp),
            painter = painterResource(
                id = R.drawable.pagi
            ),
            contentDescription = null,
        )
        Image(
            modifier = Modifier
                .padding(top = 2.dp, start = 8.dp, end = 8.dp)
                .width(150.dp)
                .height(60.dp),
            painter = painterResource(
                id = R.drawable.pagi
            ),
            contentDescription = null,
        )
    }
    Row(
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 230.dp, start = 5.dp, end = 5.dp)
    ) {
        Box(
            modifier = Modifier
                .width(450.dp)
                .height(60.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(Color.White, shape = RoundedCornerShape(15.dp))
                .border(
                    BorderStroke(2.dp, Color(0xFFB5B5B5))
                )
        )
    }
        Row(
//        verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 240.dp, start = 20.dp, end = 50.dp)
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = " How,s Your Day Nita?",
                fontSize = 15.sp,
                color = Color.Black,
            )
        }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top= 320.dp, start = 2.dp, end = 20.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.runtuh),
                        contentDescription = "album",
                        modifier = Modifier
                            .size(220.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.billie),
                        contentDescription = "album",
                        modifier = Modifier
                            .size(220.dp)
                    )

                }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top= 550.dp, start = 2.dp, end = 20.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.runtuh),
            contentDescription = "album",
            modifier = Modifier
                .size(220.dp)
        )
        Image(
            painter = painterResource(R.drawable.billie),
            contentDescription = "album",
            modifier = Modifier
                .size(220.dp)
        )
    }
}






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
    ) {
//        val navBackStackEntry by navController.currentBackStackEntryAsState()
//        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = { Text(text = item.title) },
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


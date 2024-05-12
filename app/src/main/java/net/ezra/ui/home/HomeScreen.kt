package net.ezra.ui.home


import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.activity.compose.ManagedActivityResultLauncher
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.BottomNavigation
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.MainActivity
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_DASHBOARD
import net.ezra.navigation.ROUTE_FAITH
import net.ezra.navigation.ROUTE_GROUPS
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_MEMBERSHIP
import net.ezra.navigation.ROUTE_PARTNERSHIP
import net.ezra.navigation.ROUTE_REGISTER
import net.ezra.navigation.ROUTE_SEARCH
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_SIGNIN
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.navigation.ROUTE_TITHE
import net.ezra.navigation.ROUTE_VIEW_STUDENTS
import net.ezra.ui.register.BottomBar


data class Screen(val title: String, val icon: Int)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {


    Box(
        modifier = Modifier,

        ) {
        Image(
            painter = painterResource(id = R.drawable.img_2), contentDescription = "",
            modifier = Modifier
////        .background(Color.Cyan)
                .fillMaxSize()
//              .clip(RoundedCornerShape(50))
                .size(200.dp),
//
////    colorFilter = ColorFilter.tint(Color.Red),
            contentScale = ContentScale.Crop
            //contentScale = ContentScale.FillBounds

        )


    }

    var isDrawerOpen by remember { mutableStateOf(false) }

    val callLauncher: ManagedActivityResultLauncher<Intent, ActivityResult> =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) { _ ->

        }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Faith Tv",
                        color = Color.Blue,
                        fontSize = (40.sp),
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Cursive
                    )
                },

                navigationIcon = @Composable {
                    if (!isDrawerOpen) {
                        IconButton(onClick = { isDrawerOpen = true }) {
                            Icon(
                                Icons.Default.Menu,
                                contentDescription = "Menu",
                                tint = Color.Black
                            )
                        }
                    }
                },

                actions = {
                    IconButton(onClick = {
                        navController.navigate(ROUTE_LOGIN) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }

                    }) {

                    }
                },

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color.White,

                    )

            )
        },

        content = @Composable {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable {
                        if (isDrawerOpen) {
                            isDrawerOpen = false
                        }
                    }
            ) {

                Box {
                    Image(
                        painter = painterResource(id = R.drawable.img_2), contentDescription = "",
                        modifier = Modifier
////        .background(Color.Cyan)
                            .fillMaxSize()
////                .clip(RoundedCornerShape(50))
                            .size(200.dp),
//
////    colorFilter = ColorFilter.tint(Color.Red),
                        contentScale = ContentScale.Crop
                        //contentScale = ContentScale.FillBounds

                    )


                }




                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White)

                    ) {
                        item {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize(),
                            ) {


                                Column(
//                horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(10.dp),
                                ) {

                                    Row(
                                        horizontalArrangement = Arrangement.SpaceEvenly,
                                        modifier = Modifier
                                            .fillMaxSize()

                                    ) {


                                        Text(
                                            text = "CHRISTIAN  FOUNDATION FELLOWSHIP",
                                            fontWeight = FontWeight.Bold,
                                            fontFamily = FontFamily.Cursive,
                                            fontSize = (20.sp)
                                        )

                                    }
                                    Spacer(modifier = Modifier.height(40.dp))
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier
                                            .fillMaxSize()
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.img),
                                            contentDescription = "",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.Crop
                                        )

                                    }
                                    Spacer(modifier = Modifier.height(5.dp))

                                    Column(
//                horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .padding(10.dp),
                                    ) {


                                        Row(
                                            horizontalArrangement = Arrangement.SpaceEvenly,
                                            modifier = Modifier
                                                .fillMaxSize()
                                        ) {

                                            val hotel = LocalContext.current
                                            Button(
                                                onClick = {
                                                    navController.navigate(ROUTE_TITHE) {
                                                        popUpTo(ROUTE_ABOUT) { inclusive = true }
                                                    }


                                                },
                                                shape = RoundedCornerShape(10.dp),
                                                colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                                                border = BorderStroke(1.5.dp, Color.Black),
                                                contentPadding = PaddingValues(15.dp),
                                                modifier = Modifier

                                                    .height(50.dp)
                                                    .width(150.dp)
                                            ) {


                                                Text(
                                                    "TITHE&OFFERING",
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontWeight = FontWeight.ExtraBold,
                                                    color = Color.Black
                                                )
                                            }

                                            val taxi = LocalContext.current
                                            Button(
                                                onClick = {
                                                    navController.navigate(ROUTE_PARTNERSHIP) {
                                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                                    }
                                                },
                                                shape = RoundedCornerShape(10.dp),
                                                colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                                                border = BorderStroke(1.5.dp, Color.Black),
                                                modifier = Modifier
                                                    .height(50.dp)
                                                    .width(150.dp)
                                            ) {

                                                Text(
                                                    "PARTNERSHIP ",
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontWeight = FontWeight.ExtraBold,
                                                    color = Color.Black
                                                )
                                            }


                                        }

                                        Spacer(modifier = Modifier.height(10.dp))

                                        Row(
                                            horizontalArrangement = Arrangement.SpaceEvenly,
                                            modifier = Modifier
                                                .fillMaxSize()
                                        ) {

                                            val harbour = LocalContext.current
                                            Button(
                                                onClick = {
                                                    navController.navigate(ROUTE_GROUPS) {
                                                        popUpTo(ROUTE_HOME) { inclusive = true }

                                                    }


                                                },
                                                shape = RoundedCornerShape(10.dp),
                                                colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                                                border = BorderStroke(1.5.dp, Color.Black),
                                                modifier = Modifier
                                                    .height(50.dp)
                                                    .width(150.dp)
                                            ) {

                                                Text(
                                                    "GROUPS",
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontWeight = FontWeight.ExtraBold,
                                                    color = Color.Black
                                                )
                                            }
                                            val airplane = LocalContext.current
                                            Button(
                                                onClick = {
                                                    navController.navigate(ROUTE_FAITH) {
                                                        popUpTo(ROUTE_HOME) { inclusive = true }


                                                    }

                                                },
                                                shape = RoundedCornerShape(10.dp),
                                                colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                                                border = BorderStroke(1.5.dp, Color.Black),
                                                modifier = Modifier
                                                    .height(50.dp)
                                                    .width(150.dp)
                                            ) {

                                                Text(
                                                    "FAITH TV",
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontWeight = FontWeight.ExtraBold,
                                                    color = Color.Black
                                                )

                                            }


                                        }

                                        Spacer(modifier = Modifier.height(10.dp))

                                        Row(
                                            horizontalArrangement = Arrangement.SpaceEvenly,
                                            modifier = Modifier
                                                .fillMaxSize()
                                        ) {
                                            val holiday = LocalContext.current
                                            Button(
                                                onClick = {
                                                    navController.navigate(ROUTE_SIGNIN) {
                                                        popUpTo(ROUTE_HOME) { inclusive = true }


                                                    }
                                                },
                                                shape = RoundedCornerShape(10.dp),
                                                colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                                                border = BorderStroke(1.5.dp, Color.Black),
                                                contentPadding = PaddingValues(15.dp),
                                                modifier = Modifier
                                                    .height(50.dp)
                                                    .width(150.dp)

                                            ) {

                                                Text(
                                                    "MEMBERSHIP",
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontWeight = FontWeight.ExtraBold,
                                                    color = Color.Black
                                                )
                                            }

                                            val ticket = LocalContext.current
                                            Button(
                                                onClick = {
                                                    navController.navigate(ROUTE_ABOUT) {
                                                        popUpTo(ROUTE_HOME) { inclusive = true }


                                                    }
                                                },
                                                shape = RoundedCornerShape(10.dp),
                                                colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                                                border = BorderStroke(1.5.dp, Color.Black),
                                                modifier = Modifier
                                                    .height(50.dp)
                                                    .width(150.dp)
                                            ) {

                                                Text(
                                                    "ABOUT US",
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontWeight = FontWeight.ExtraBold,
                                                    color = Color.Black
                                                )
                                            }


                                        }

                                        Spacer(modifier = Modifier.height(20.dp))


                                    }

                                }


                            }

                        }

                    }

                }

            }

        },


        bottomBar = { BottomBar(navController = navController) })










    fun ClickableText(text: AnnotatedString, onClick: () -> Unit, function: () -> Unit) {

    }


    @Composable
    fun BottomBar(navController: NavHostController) {
        val selectedIndex = remember { mutableStateOf(0) }
        BottomNavigation(
            elevation = 10.dp,
            backgroundColor = Color.White


        ) {

            BottomNavigationItem(icon = {
                Icon(imageVector = Icons.Default.Home, "", tint = Color.Black)
            },
                label = {
                    Text(
                        text = "Home",
                        fontFamily = FontFamily.Cursive,
                        fontSize = (20.sp),
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }, selected = (selectedIndex.value == 0), onClick = {

                })

            Spacer(modifier = Modifier.width(25.dp))

            BottomNavigationItem(icon = {
                Icon(imageVector = Icons.Default.Call, "", tint = Color.Black)
            },
                label = {
                    Text(
                        text = "Contact Us ",
                        fontFamily = FontFamily.Cursive,
                        fontSize = (20.sp),
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }, selected = (selectedIndex.value == 1), onClick = {


                    navController.navigate(ROUTE_CONTACT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }


                    }

                })
        }

    }
}























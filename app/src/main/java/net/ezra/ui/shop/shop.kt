
package net.ezra.ui.shop






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
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.tooling.preview.Preview
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
import net.ezra.navigation.ROUTE_PLEASE
import net.ezra.navigation.ROUTE_REGISTER
import net.ezra.navigation.ROUTE_SEARCH
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.navigation.ROUTE_TITHE
import net.ezra.navigation.ROUTE_VIEWPRODUCTS
import net.ezra.navigation.ROUTE_VIEW_STUDENTS

import net.ezra.ui.register.BottomBar


data class Screen(val title: String, val icon: Int)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShopScreen(navController: NavHostController) {


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



    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Church Main Page",
                        color = Color.White,
                        fontSize = (40.sp),
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Cursive
                    )
                },

                navigationIcon = @Composable {

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
                    containerColor = Color.Blue,
                    titleContentColor = Color.Blue,

                    )

            )
        },

        content = @Composable {
            Box(
                modifier = Modifier
                    .fillMaxSize()

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
                Spacer(modifier = Modifier.height(77.dp))




                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()


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
                                            text = "Members Screen",
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
                                                    navController.navigate(ROUTE_ADD_STUDENTS) {
                                                        popUpTo(ROUTE_ABOUT) { inclusive = true }
                                                    }


                                                },
                                                shape = RoundedCornerShape(20.dp),
                                                colors = ButtonDefaults.outlinedButtonColors(Color.Green),
                                                border = BorderStroke(1.5.dp, Color.Black),
                                                contentPadding = PaddingValues(15.dp),
                                                modifier = Modifier

                                                    .height(50.dp)
                                                    .width(150.dp)
                                            ) {


                                                Text(
                                                    "Dancing",
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontWeight = FontWeight.ExtraBold,
                                                    color = Color.Black
                                                )
                                            }

                                            val taxi = LocalContext.current
                                            Button(
                                                onClick = {
                                                    navController.navigate(ROUTE_ADD_STUDENTS) {
                                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                                    }
                                                },
                                                shape = RoundedCornerShape(20.dp),
                                                colors = ButtonDefaults.outlinedButtonColors(Color.Yellow),
                                                border = BorderStroke(1.5.dp, Color.Black),
                                                modifier = Modifier
                                                    .height(50.dp)
                                                    .width(150.dp)
                                            ) {

                                                Text(
                                                    "Ushers ",
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
                                                    navController.navigate(ROUTE_ADD_STUDENTS) {
                                                        popUpTo(ROUTE_HOME) { inclusive = true }

                                                    }


                                                },
                                                shape = RoundedCornerShape(20.dp),
                                                colors = ButtonDefaults.outlinedButtonColors(Color.Magenta),
                                                border = BorderStroke(1.5.dp, Color.Black),
                                                modifier = Modifier
                                                    .height(50.dp)
                                                    .width(150.dp)
                                            ) {

                                                Text(
                                                    "Choir",
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontWeight = FontWeight.ExtraBold,
                                                    color = Color.Black
                                                )
                                            }
                                            val airplane = LocalContext.current
                                            Button(
                                                onClick = {
                                                    navController.navigate(ROUTE_ADD_STUDENTS) {
                                                        popUpTo(ROUTE_HOME) { inclusive = true }


                                                    }

                                                },
                                                shape = RoundedCornerShape(20.dp),
                                                colors = ButtonDefaults.outlinedButtonColors(Color.Cyan),
                                                border = BorderStroke(1.5.dp, Color.Black),
                                                modifier = Modifier
                                                    .height(50.dp)
                                                    .width(150.dp)
                                            ) {

                                                Text(
                                                    "Intercessors",
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
                                                    navController.navigate(ROUTE_ADD_STUDENTS) {
                                                        popUpTo(ROUTE_HOME) { inclusive = true }


                                                    }
                                                },
                                                shape = RoundedCornerShape(20.dp),
                                                colors = ButtonDefaults.outlinedButtonColors(Color.Blue),
                                                border = BorderStroke(1.5.dp, Color.Black),
                                                contentPadding = PaddingValues(15.dp),
                                                modifier = Modifier
                                                    .height(50.dp)
                                                    .width(150.dp)

                                            ) {

                                                Text(
                                                    "Technical Team",
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontWeight = FontWeight.ExtraBold,
                                                    color = Color.Black
                                                )
                                            }

                                            val ticket = LocalContext.current
                                            Button(
                                                onClick = {
                                                    navController.navigate(ROUTE_VIEW_STUDENTS) {
                                                        popUpTo(ROUTE_HOME) { inclusive = true }


                                                    }
                                                },
                                                shape = RoundedCornerShape(20.dp),
                                                colors = ButtonDefaults.outlinedButtonColors(Color.Red),
                                                border = BorderStroke(1.5.dp, Color.Black),
                                                modifier = Modifier
                                                    .height(50.dp)
                                                    .width(150.dp)
                                            ) {

                                                Text(
                                                    "Pastors",
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontWeight = FontWeight.ExtraBold,
                                                    color = Color.Black
                                                )
                                            }





                                        }
                                        Spacer(modifier = Modifier.height(7.dp))

                                        val please = LocalContext.current
                                        Button(
                                            onClick = {
                                                navController.navigate(ROUTE_PLEASE) {
                                                    popUpTo(ROUTE_HOME) { inclusive = true }


                                                }
                                            },
                                            shape = RoundedCornerShape(20.dp),
                                            colors = ButtonDefaults.outlinedButtonColors(Color.Red),
                                            border = BorderStroke(1.5.dp, Color.Black),
                                            modifier = Modifier
                                                .height(50.dp)
                                                .width(150.dp)
                                        ) {

                                            Text(
                                                "Membership",
                                                fontFamily = FontFamily.SansSerif,
                                                fontWeight = FontWeight.ExtraBold,
                                                color = Color.Black
                                            )
                                        }





                                        Spacer(modifier = Modifier.height(20.dp))

                                        Column(
                                            modifier = Modifier
                                                .size(width = 350.dp, height = 200.dp)
                                        ) {
                                            Card(

                                                colors = CardDefaults.cardColors(Color.White),onClick = {
                                                navController.navigate(ROUTE_ABOUT) {
                                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                                }
                                            }) {
                                                Row(

                                                ) {
                                                    Image(
                                                        painter = painterResource(id = R.drawable.img),
                                                        contentDescription = "QAQA SOFTWARES",
                                                        modifier = Modifier
                                                            .size(100.dp),
                                                    )
                                                    Column(
                                                        modifier = Modifier
                                                            .padding(20.dp)
                                                    ) {
                                                        Text(text = "Christian Foundation Felllowship", fontWeight = FontWeight.Bold)
                                                        Text("Bishop's Message", fontWeight = FontWeight.Bold )
                                                    }

                                                }
                                                Text(
                                                    text = AnnotatedString("'Therefore, my beloved brothers, be steadfast, immovable, always abounding in the work of the Lord, knowing that in the Lord your labor is not in vain.'"  ),
                                                    Modifier.padding(5.dp)
                                                )
                                                Row(
                                                    modifier = Modifier
                                                        .padding(10.dp)
                                                        .size(width = 300.dp, height = 20.dp),
                                                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                                                ) {
                                                    Image(
                                                        imageVector = Icons.Default.LocationOn,
                                                        contentDescription = "" + Text(text = "Nairobi, Kenya")
                                                    )


                                                }


                                            }

                                        }

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


                    navController.navigate(ROUTE_CONTACT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }


                    }


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







@Preview(showBackground = true )
@Composable
fun HomeScreenPreviewLight() {
    ShopScreen(rememberNavController())
}























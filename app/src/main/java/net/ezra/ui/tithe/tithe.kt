package net.ezra.ui.tithe










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
import androidx.compose.foundation.text.KeyboardOptions
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.BottomNavigation
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.MainActivity
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_ALEX
import net.ezra.navigation.ROUTE_DASHBOARD
import net.ezra.navigation.ROUTE_GROUPS
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_PARTNERSHIP
import net.ezra.navigation.ROUTE_REGISTER
import net.ezra.navigation.ROUTE_SEARCH
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.navigation.ROUTE_VIEW_STUDENTS
@OptIn(ExperimentalMaterial3Api::class)





            data class Screen(val title: String, val icon: Int)

            @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor")
            @OptIn(ExperimentalMaterial3Api::class)
            @Composable
            fun TitheScreen(navController: NavHostController) {


                    TopAppBar(title = { Text(text = "Home "  , color = Color.Black) },

                        colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Cyan),
                        navigationIcon = {
                            IconButton(onClick = { /*TODO*/ }) {

                            }


                        })

                androidx.compose.material.Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "",

                    tint = Color.White
                    )





                                Box(
                                    modifier = Modifier,

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.img_2),
                                        contentDescription = "",
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




                                Column(

                                    modifier = Modifier

                                        .fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally

                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.img_1),
                                        contentDescription = ""
                                    )


                                    val mContext = LocalContext.current
                                    val navController: NavHostController

                                    Text(
                                        text = "Christian Foundation Fellowship",
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = (20.sp)
                                    )

                                    Text(
                                        text = "Tithe&Offering",
                                        fontFamily = FontFamily.Cursive,
                                        color = Color.Black,
                                        fontWeight = FontWeight.Black,
                                        fontSize = (20.sp)
                                    )
                                    Spacer(modifier = Modifier.height(7.dp))
                                    Text(
                                        text = "ACTS 20:35",
                                        fontFamily = FontFamily.Cursive,
                                        color = Color.Blue,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Spacer(modifier = Modifier.height(3.dp))

                                    Text(
                                        text = " 'I have shewed you all things, how that so labouring ye ought to support the weak, and to remember the words of the Lord Jesus, how he said, It is more blessed to give than to receive.'",
                                        fontFamily = FontFamily.Monospace
                                    )


                                    Spacer(modifier = Modifier.height(30.dp))

                                    Text(
                                        text = "Support Our Ministry;",
                                        fontFamily = FontFamily.Monospace,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Spacer(modifier = Modifier.height(40.dp))
                                    Text(
                                        text = "Paybill Number: 335446 / Account no:Tithing ",
                                        fontFamily = FontFamily.Monospace,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Text(
                                        text = "Send Money : 0712678863 / Offering ",
                                        fontFamily = FontFamily.Monospace,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Spacer(modifier = Modifier.height(30.dp))
                                    Text(
                                        text = "Reach Us Through:",
                                        fontFamily = FontFamily.Monospace,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Text(
                                        text = "0712345678/079876543",
                                        fontFamily = FontFamily.Monospace,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Spacer(modifier = Modifier.height(14.dp))
                                    Text(
                                        text = "Support  Us Directly Through Mpesa;",
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Spacer(modifier = Modifier.height(25.dp))
                                    val hotel = LocalContext.current
                                    Button(
                                        onClick = {
                                            val simToolKitLaunchIntent =
                                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }
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
                                            "Mpesa",
                                            color = Color.Black,
                                            fontFamily = FontFamily.Monospace,
                                            fontWeight = FontWeight.Bold
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(17.dp))


                                    Text(
                                        text = "Visit Our Shop For Exclusive Items  ",
                                        fontFamily = FontFamily.Monospace,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Spacer(modifier = Modifier.height(5.dp))
                                    Icon(
                                        imageVector = Icons.Default.ArrowDropDown,
                                        contentDescription = ""
                                    )
                                    Spacer(modifier = Modifier.height(5.dp))


                                    val shop = LocalContext.current
                                    Button(
                                        onClick = {
                                            hotel.startActivity(
                                                Intent(
                                                    hotel,
                                                    MainActivity::class.java
                                                )
                                            )
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
                                            "Our Shop ",
                                            color = Color.Black,
                                            fontWeight = FontWeight.Bold,
                                            fontFamily = FontFamily.SansSerif
                                        )
                                    }


                                }
                            }















































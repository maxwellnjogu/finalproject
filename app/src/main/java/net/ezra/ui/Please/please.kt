package net.ezra.ui.Please

import android.content.Intent
import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.widget.Group
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.MainActivity
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_ALEX
import net.ezra.navigation.ROUTE_ANNE
import net.ezra.navigation.ROUTE_GROUPS
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MARY
import net.ezra.navigation.ROUTE_MEMBERSHIP
import net.ezra.navigation.ROUTE_MENS
import net.ezra.navigation.ROUTE_PETER
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_TITHE
import net.ezra.navigation.ROUTE_YOUTH


@Composable
fun PleaseScreen(navController: NavHostController) {

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

    Column(
        modifier = Modifier
            .fillMaxSize()
        ,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {
        Image(painter = painterResource(id = R.drawable.img) , modifier = Modifier ,  contentDescription = "")
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Members Fellowship  Page" , fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive , color = Color.Blue, fontSize = (35.sp) )
        Spacer(modifier = Modifier.height(67.dp))



        val holiday = LocalContext.current
        Button(
            onClick = {
                navController.navigate(ROUTE_MEMBERSHIP) {
                    popUpTo(ROUTE_HOME) { inclusive = true }


                }
            },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
            border = BorderStroke(1.5.dp, Color.Black),
            contentPadding = PaddingValues(15.dp),
            modifier = Modifier
                .height(50.dp)
                .width(150.dp)

        ) {

            Text(
                "Announcements",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.height(15.dp))

        val ticket = LocalContext.current
        Button(
            onClick = {
                navController.navigate(ROUTE_SHOP) {
                    popUpTo(ROUTE_HOME) { inclusive = true }


                }
            },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
            border = BorderStroke(1.5.dp, Color.Black),
            modifier = Modifier
                .height(50.dp)
                .width(150.dp)
        ) {

            Text(
                "Church Roles",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.height(15.dp))


        val ocean = LocalContext.current
        Button(
            onClick = {
                navController.navigate(ROUTE_TITHE) {
                    popUpTo(ROUTE_HOME) { inclusive = true }


                }
            },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
            border = BorderStroke(1.5.dp, Color.Black),
            modifier = Modifier
                .height(50.dp)
                .width(150.dp)
        ) {

            Text(
                "Tithe&Offering",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.height(50.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxSize()
                .horizontalScroll(state = ScrollState(2))

        ) {

            Button(
                onClick = {
                    navController.navigate(ROUTE_YOUTH) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.outlinedButtonColors(Color(0xff5bb4fa)),
                border = BorderStroke(1.5.dp, Color.Transparent),
                contentPadding = PaddingValues(15.dp),
                modifier = Modifier
                    .height(50.dp)
                    .width(150.dp)
            ) {
                Text("Youth Group", color = Color.Black)
            }

            Spacer(modifier = Modifier.width(20.dp))

            Button(
                onClick = {
                    navController.navigate(ROUTE_MENS) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.outlinedButtonColors(Color(0xff581845)),
                border = BorderStroke(1.5.dp, Color.Transparent),
                contentPadding = PaddingValues(15.dp),
                modifier = Modifier
                    .height(50.dp)
                    .width(150.dp)

            ) {
                Text("Men's Fellowship", color = Color.Black)
            }

            Spacer(modifier = Modifier.width(20.dp))


            Button(
                onClick = {
                    navController.navigate(ROUTE_ABOUT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.outlinedButtonColors(Color(0xff3bf975)),
                border = BorderStroke(1.5.dp, Color.Transparent),
                modifier = Modifier
                    .height(50.dp)
                    .width(150.dp)
            ) {

                Text("Women's Fellowship", color = Color.Black)
            }

            Spacer(modifier = Modifier.width(20.dp))



            Spacer(modifier = Modifier.width(20.dp))




        }

        Spacer(modifier = Modifier.height(20.dp))



        //Text


    }



}
















@Preview(showBackground = true )
@Composable
fun HomeScreenPreviewLight() {
    PleaseScreen(rememberNavController())
}


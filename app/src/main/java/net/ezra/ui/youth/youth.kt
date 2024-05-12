package net.ezra.ui.youth








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
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
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
import net.ezra.navigation.ROUTE_VIEW_STUDENTS

import net.ezra.ui.register.BottomBar


data class Screen(val title: String, val icon: Int)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun YouthScreen(navController: NavHostController) {


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

            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Image(painter = painterResource(id = R.drawable.img), contentDescription ="" )

        Spacer(modifier = Modifier.height(5.dp))






        Text(text = "Become  A CFF  Church Youth" , fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive, fontSize = (20.sp) )

        Spacer(modifier = Modifier.height(20.dp))


        var name by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            shape = RoundedCornerShape(20.dp),
            label = { Text(text = "Enter Name",  fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive, fontSize = (20.sp) ,color = Color.Black)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription = "")}
        )

        Spacer(modifier = Modifier.height(20.dp))

        var email by remember{ mutableStateOf(TextFieldValue(""))}
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            shape = RoundedCornerShape(20.dp),
            label = { Text(text = "Email", fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive, fontSize = (20.sp)  , color = Color.Black)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        var phone by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(
            value = phone,
            onValueChange = { phone = it},
            shape = RoundedCornerShape(20.dp),
            leadingIcon = {Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "")},
            label = {Text(text = "Membership Card Number", fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive, fontSize = (20.sp), color = Color.Black)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),

            )

        Spacer(modifier = Modifier.height(20.dp))

        var passw by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(
            value = passw,
            onValueChange = { passw = it},
            shape = RoundedCornerShape(20.dp),
            label = {Text(text = "Tithe Number", fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive, fontSize = (20.sp) , color = Color.Black)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            textStyle = TextStyle(Color.White),
            leadingIcon = {Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "")},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Black,
                focusedLabelColor = Color.White,
                focusedLeadingIconColor = Color.White,
                unfocusedBorderColor = Color.Black,
                unfocusedLabelColor = Color.Black,
                cursorColor = Color.Gray

            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        var passc by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(
            value = passc,
            onValueChange = { passc = it},
            shape = RoundedCornerShape(20.dp),
            label = {Text(text = "Phone Number", fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive, fontSize = (20.sp) ,  color = Color.Black)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType. Number),
            textStyle = TextStyle(Color.White),
            leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "") }
        )

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Further Instructions To Be Given At The Church Desk")
        Spacer(modifier = Modifier.height(7.dp))


        // BUTTON SECTION
        val sign = LocalContext.current
        Button(
            onClick = {

                navController.navigate(ROUTE_PLEASE) {
                    popUpTo(ROUTE_HOME) { inclusive = true }

                }
            },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.outlinedButtonColors(Color.White),
            border = BorderStroke(1.5.dp, Color.Black),

            ){


            Text("Become a Partner", color = Color.Black)
        }




    }















}







@Preview(showBackground = true )
@Composable
fun HomeScreenPreviewLight() {
    YouthScreen(rememberNavController())
}























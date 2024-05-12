package net.ezra.ui.contact










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
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Send
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
import androidx.compose.material3.TextField
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
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


data class Screen(val title: String, val icon: Int)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactScreen(navController: NavHostController) {

    Box(modifier=Modifier,

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


        Image(painter = painterResource(id = R.drawable.img), contentDescription = "")
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Faith Tv", fontWeight = FontWeight.Bold, fontFamily = FontFamily.SansSerif, fontSize = (30.sp) )

        val mContext = LocalContext.current
        val  navController: NavHostController

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Reach Us Through;" , fontSize = (20.sp) )

        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "Give Us A Phone Call" , fontSize = (20.sp) )

        val login = LocalContext.current
        Button(onClick = {
            val callIntent=Intent(Intent.ACTION_DIAL)
            callIntent.data="tel:0712678863".toUri()
            mContext.startActivity(callIntent)

            


        }, modifier = Modifier, colors = ButtonDefaults.buttonColors(Color.Black)) {
            Icon(imageVector = Icons.Default.Call, contentDescription = "")


            Text(text = "CALL US", color = Color.White)


        }
        
        Spacer(modifier = Modifier.height(7.dp))
        
        Text(text = "Have a prayer request?", fontSize = (20.sp) )
        Spacer(modifier = Modifier.height(15.dp))
        val sms = LocalContext.current
        Button(onClick = {val smsIntent=Intent(Intent.ACTION_SENDTO)
            smsIntent.data="smsto:0712678863".toUri()
            smsIntent.putExtra("sms_body","I have a prayer request")
            mContext.startActivity(smsIntent)





        }, modifier = Modifier, colors = ButtonDefaults.buttonColors(Color.Black)) {
            Icon(imageVector = Icons.Default.Send, contentDescription = "")


            Text(text = "Send Sms", color = Color.White)


        }

        Spacer(modifier = Modifier.height(7.dp))


        Text(text = "Send us an email;" ,fontSize = (20.sp) )
        Spacer(modifier = Modifier.height(15.dp))

        val email = LocalContext.current
        Button(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("maxwellleryss@gmail.com"))
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
            shareIntent.putExtra(Intent.EXTRA_TEXT, "FAITH TV LIVE")
            mContext.startActivity(shareIntent)




        }, modifier = Modifier, colors = ButtonDefaults.buttonColors(Color.Black)) {
            Icon(imageVector = Icons.Default.Email, contentDescription = "")


            Text(text = "Email", color = Color.White)


        }









    }

}







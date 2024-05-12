package net.ezra.ui.announcements










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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import net.ezra.ui.shop.ShopScreen


data class Screen(val title: String, val icon: Int)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AnnouncementScreen(navController: NavHostController) {


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


        Text(text = "CFF TIME SCHEDULE", fontSize = (20.sp), fontFamily = FontFamily.SansSerif)
        Spacer(modifier = Modifier.height(35.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(Color.Blue)


        ) {


            Text(
                text = "SUNDAY",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "9:00AM - Worship Service")
        Spacer(modifier = Modifier.height(2.dp))
        Text(text = "10:30AM - Sunday School")
        Spacer(modifier = Modifier.height(2.dp))
        Text(text = "11:30AM - Fellowship Hour")
        Spacer(modifier = Modifier.height(37.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(Color.Blue)


        ) {


            Text(
                text = "WEDNESDAY",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

        }

        Spacer(modifier = Modifier.height(27.dp))
        Text(text = "10:00AM -Men's Fellowship")
        Spacer(modifier = Modifier.height(2.dp))
        Text(text = "1:00PM - Lunch Hour")

        Spacer(modifier = Modifier.height(37.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(Color.Blue)


        ) {


            Text(
                text = "FRIDAY",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

        }

        Spacer(modifier = Modifier.height(17.dp))
        Text(text = "10:00AM -Men's Fellowship")
        Spacer(modifier = Modifier.height(2.dp))
        Text(text = "1:00PM - Lunch Hour")
        Spacer(modifier = Modifier.height(37.dp))



        Card(
            modifier = Modifier
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(Color.Blue)


        ) {


            Text(
                text = "SATURDAY",
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

        }

        Spacer(modifier = Modifier.height(17.dp))
        Text(text = "10:00AM -Women's  Fellowship")
        Spacer(modifier = Modifier.height(2.dp))
        Text(text = "1:00PM - Lunch Hour")
        Spacer(modifier = Modifier.height(37.dp))

        Column(
            modifier = Modifier
                .size(width = 350.dp, height = 200.dp)
        ) {
            Card(

                colors = CardDefaults.cardColors(Color.White),
                ) {
                Row(

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "QAQA SOFTWARES",
                        modifier = Modifier
                            .size(100.dp),
                    )
                    Column(
                        modifier = Modifier
                            .padding(20.dp)
                    ) {
                        Text(
                            text = "Christian Foundation Felllowship",
                            fontWeight = FontWeight.Bold
                        )
                        Text("Tent Meetings", fontWeight = FontWeight.Bold)
                    }

                }
                Text(
                    text = AnnotatedString("Tent Meeting Held On A Weekly Basis"),
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

@Preview(showBackground = true )
@Composable
fun AnnouncementScreenPreviewLight() {
    AnnouncementScreen(rememberNavController())
}







package net.ezra.ui.about

import android.content.Intent
import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
import net.ezra.navigation.ROUTE_HOME







@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavHostController) {








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

    Column (

        modifier = Modifier
            .fillMaxSize()
            ,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {
        TopAppBar(title = { Text(text = "Home "  , color = Color.Black) },

            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Cyan),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {

                }


            })

        androidx.compose.material.Icon(imageVector = Icons.Default.ArrowBack, modifier = Modifier .padding(17.dp), contentDescription = "",

            tint = Color.White
        )




        Image(painter = painterResource(id = R.drawable.img), contentDescription ="" )

        Spacer(modifier = Modifier.height(5.dp))

        val mContext = LocalContext.current
        Text(
            text = "Christian Foundation Fellowship",
            fontWeight = FontWeight.Bold,
            fontSize = (30.sp),
            fontFamily = FontFamily.Cursive,
            color = Color.Blue
        )
        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = " 'For With God Nothing Shall Be Impossible  ",
            fontWeight = FontWeight.Bold,
            fontSize = (30.sp),
            fontFamily = FontFamily.Cursive,
            color = Color.Blue
        )
        Spacer(modifier = Modifier.height(5.dp))


        Text(
            text = " When Was The Church Formed?",
            fontWeight = FontWeight.Bold,
            fontSize = (20.sp),
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Christian Foundation Fellowship was Formed in 1996 with its first branch situated at Sheikh Karume Road",
            fontWeight = FontWeight.Bold,
            fontSize = (20.sp),
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = " What Was The Aim Of The Church?",
            fontWeight = FontWeight.Bold,
            fontSize = (20.sp),
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(5.dp))



        Text(
            text = "The Church's Main aim was to bring revival to the world and nourish many of the christians providing a path for them to get saved.",
            fontWeight = FontWeight.Bold,
            fontSize = (20.sp),
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = " The Church has many pastors who work tirelessly to nourish christians souls and make them enjoy the word of God. ",
            fontWeight = FontWeight.Bold,
            fontSize = (20.sp),
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(25.dp))

        val hotel = LocalContext.current
        Button(
            onClick = {  val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) } },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.outlinedButtonColors(Color.White),
            border = BorderStroke(1.5.dp, Color.Black),
            contentPadding = PaddingValues(15.dp),
            modifier = Modifier
                .height(50.dp)
                .width(150.dp),

            ) {


            Text("Support Us", color = Color.Black, fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold, fontSize = (15.sp))


        }


    }


}



@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AboutScreen(rememberNavController())
}


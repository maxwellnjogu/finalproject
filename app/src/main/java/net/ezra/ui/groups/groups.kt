package net.ezra.ui.groups




import android.content.Intent
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
import net.ezra.navigation.ROUTE_PETER


@Composable
fun GroupScreen(navController: NavHostController) {

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
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()


        )


        {
            Text(text = "", fontWeight = FontWeight.Black, color = Color.Black, fontFamily = FontFamily.Monospace, fontSize = (20.sp) )
            
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                colors = CardDefaults.cardColors(Color.White)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "",
                    modifier = Modifier.size(25.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))



                Spacer(modifier = Modifier.height(20.dp))


                Text(
                    text = "Pastor Mary's Group",
                    fontFamily = FontFamily.Cursive,

                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "All Members",
                    fontFamily = FontFamily.Cursive,

                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.width(15.dp))
                val login = LocalContext.current
                Button(onClick = {
                    navController.navigate(ROUTE_MARY) {
                        popUpTo(ROUTE_HOME) { inclusive = true }

                    }




                }, modifier = Modifier, colors = ButtonDefaults.buttonColors(Color.Black)) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "")


                    Text(text = "Request to join", color = Color.White)


                }
                Spacer(modifier = Modifier.height(10.dp))


            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                colors = CardDefaults.cardColors(Color.White)


            ) {
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "",
                    modifier = Modifier.size(25.dp)
                )


                Spacer(modifier = Modifier.height(20.dp))


                Text(
                    text = "Pastor Alex's Group",

                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "All Members",
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.width(15.dp))
                val login = LocalContext.current
                Button(onClick = {
                    navController.navigate(ROUTE_ALEX) {
                        popUpTo(ROUTE_HOME) { inclusive = true }

                    }




                }, modifier = Modifier, colors = ButtonDefaults.buttonColors(Color.Black)) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "")


                    Text(text = "Request to join", color = Color.White)


                }


            }


            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                colors = CardDefaults.cardColors(Color.White)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "",
                    modifier = Modifier.size(25.dp)
                )


                Spacer(modifier = Modifier.height(20.dp))


                Text(
                    text = " Pastor Anne's  Group",

                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "All Members",
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.width(15.dp))
                val login = LocalContext.current
                Button(onClick = {


                    navController.navigate(ROUTE_PETER) {
                        popUpTo(ROUTE_HOME) { inclusive = true }

                    }

                }, modifier = Modifier, colors = ButtonDefaults.buttonColors(Color.Black)) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "")


                    Text(text = "Request to join", color = Color.White)


                }

            }



            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                colors = CardDefaults.cardColors(Color.White)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "",
                    modifier = Modifier.size(25.dp)
                )


                Spacer(modifier = Modifier.height(20.dp))


                Text(
                    text = "Pastor John's Group",

                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "All Members",
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.width(15.dp))
                val login = LocalContext.current
                Button(onClick = {


                    navController.navigate(ROUTE_ANNE) {
                        popUpTo(ROUTE_HOME) { inclusive = true }

                    }


                    }, modifier = Modifier, colors = ButtonDefaults.buttonColors(Color.Black)) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "")



                    Text(text = "Request to join", color = Color.White)


                }

            }



            }
        }






@Preview(showBackground = true )
@Composable
fun HomeScreenPreviewLight() {
    GroupScreen(rememberNavController())
}


package net.ezra.ui.womens







import android.content.Intent
import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
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
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_PLEASE


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WomensScreen(navController: NavHostController) {

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


        Image(painter = painterResource(id = R.drawable.img), contentDescription ="" )

        Spacer(modifier = Modifier.height(5.dp))






        Text(text = "Join CFF Women's  Fellowship Program " , fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive, fontSize = (20.sp) )

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
        Spacer(modifier = Modifier.height(5.dp))


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


            Text("Join", color = Color.Black)
        }
        
       




    }










}

@Preview(showBackground = true )
@Composable
fun HomeScreenPreviewLight() {
    WomensScreen(rememberNavController())
}


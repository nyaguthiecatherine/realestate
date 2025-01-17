package com.example.realestate.ui.theme.screens.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.navigation.ROUT_INTENT
import com.example.realestate.ui.theme.newGreen1
import kotlin.random.Random


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize()) {

        TopAppBar(
            title = { Text(text ="MagicBricks", ) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(newGreen1),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu , contentDescription ="menu", tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription ="menu" , tint = Color.White)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription ="menu" , tint = Color.White)
                    
                }
            }

        )


        Box (modifier = Modifier
            .fillMaxWidth()
            .height(250.dp),
            contentAlignment = Alignment.Center) {

            Image(
                painter = painterResource(id = R.drawable.home),
                contentDescription = "home",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }

            Spacer(modifier = Modifier.height(20.dp))


            //Searchbar
            var search by remember { mutableStateOf("") }
            OutlinedTextField(
                value = search ,
                onValueChange = {search = it},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search")},
                placeholder = { Text(text = "What's your location")}
            )
            //End Searchbar

            Spacer(modifier = Modifier.height(20.dp))

            Row (
                modifier = Modifier
                    .padding(start = 20.dp)
                    .horizontalScroll(rememberScrollState())
            ) {
                //Card1
                Card(
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp)
                ) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.img_2),
                            contentDescription = "house",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )


                    }
                }
                //End of card

                Spacer(modifier = Modifier.width(20.dp))

                //Card1
                Card(
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp)
                ) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.img_3),
                            contentDescription = "house",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )


                    }
                }
                //End of card

                Spacer(modifier = Modifier.width(20.dp))

                //Card1
                Card(
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp)
                ) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.img_4),
                            contentDescription = "house",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )


                    }
                }
                //End of card

                Spacer(modifier = Modifier.width(20.dp))

                //Card1
                Card(
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp)
                ) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.house),
                            contentDescription = "house",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )


                    }
                }
                //End of card

                Spacer(modifier = Modifier.width(20.dp))

                //Card1
                Card(
                    modifier = Modifier
                        .height(180.dp)
                        .width(200.dp)
                ) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.house),
                            contentDescription = "house",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )


                    }
                }
                //End of card
            }

            Spacer(modifier = Modifier.height(20.dp))  
             
            Button(onClick = {
                navController.navigate(ROUT_INTENT)
            },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(start = 20.dp, end = 20.dp),
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = RoundedCornerShape(10.dp)
             ){
                Text(text = "Continue")
    
                
                
                
            }








            }



    }


val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="home",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),



    BottomNavItem(
        title = "Login",
        route="login",
        selectedIcon=Icons.Filled.Person,
        unselectedIcon=Icons.Outlined.Person,
        hasNews = true,
        badges=5
    ),

    BottomNavItem(
        title = "Signup",
        route="signup",
        selectedIcon=Icons.Filled.Face,
        unselectedIcon=Icons.Outlined.Face,
        hasNews = true,
        badges=1
    ),


    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon : ImageVector,
    val hasNews :Boolean,
    val badges :Int
)



@Composable
@Preview(showBackground = true)
fun DetailScreenPreview(){
    DetailScreen(rememberNavController())

}
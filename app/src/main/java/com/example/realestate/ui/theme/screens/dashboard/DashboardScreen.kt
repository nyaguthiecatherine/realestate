package com.example.realestate.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.navigation.ROUT_HOME
import com.example.realestate.navigation.ROUT_PROPERTY
import com.example.realestate.ui.theme.mycolor
import com.example.realestate.ui.theme.mycolor

@Composable
fun DashboardScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.img_13),
            contentDescription = "img_6",
            modifier = Modifier.size(100.dp),
            )
        Spacer(modifier = Modifier.height(5.dp))

        Text(text = "Manage your properties with ease",
            fontSize = 18.sp

        )
        Spacer(modifier = Modifier.height(10.dp))

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

            Card (modifier = Modifier
                .fillMaxWidth()
                .height(700.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),

            ){
                //Row1
                Row (modifier = Modifier.padding(20.dp)){
                    //Card1
                    Card (modifier = Modifier
                        .clickable { navController.navigate(ROUT_HOME) }
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(40.dp)
                    ){

                        Spacer(modifier = Modifier.height(20.dp))
                        Column {
                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.img_5), contentDescription = "",
                                    modifier = Modifier.size(100.dp))

                            }

                        }
                        Spacer(modifier = Modifier.height(20.dp))

                        Text(text = "Home",
                            fontSize = 18.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )


                    }
                    //End of card
                    Spacer(modifier = Modifier.width(20.dp))

                    //Card1
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(40.dp)
                    ){

                        Spacer(modifier = Modifier.height(20.dp))
                        Column {
                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.img_11), contentDescription = "",
                                    modifier = Modifier.size(100.dp))

                            }

                        }
                        Spacer(modifier = Modifier.height(20.dp))

                        Text(text = "Setting",
                            fontSize = 18.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )


                    }
                    //End of card

                }
                //End of row1

                //Row1
                Row (modifier = Modifier.padding(20.dp)){
                    //Card1
                    Card (modifier = Modifier
                        .clickable { navController.navigate(ROUT_PROPERTY) }
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(40.dp)
                    ){

                        Spacer(modifier = Modifier.height(20.dp))
                        Column {
                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.img_10), contentDescription = "",
                                    modifier = Modifier.size(100.dp))

                            }

                        }
                        Spacer(modifier = Modifier.height(20.dp))

                        Text(text = "Property",
                            fontSize = 18.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )


                    }
                    //End of card
                    Spacer(modifier = Modifier.width(20.dp))

                    //Card1
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(40.dp)
                    ){

                        Spacer(modifier = Modifier.height(20.dp))
                        Column {
                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.img_12), contentDescription = "",
                                    modifier = Modifier.size(100.dp))

                            }

                        }
                        Spacer(modifier = Modifier.height(20.dp))

                        Text(text = "Profile",
                            fontSize = 18.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )


                    }
                    //End of card

                }
                //End of row1

                //Row1
                Row (modifier = Modifier.padding(20.dp)){
                    //Card1
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(40.dp)

                    ){

                        Spacer(modifier = Modifier.height(20.dp))
                        Column {
                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.img_5), contentDescription = "",
                                    modifier = Modifier.size(100.dp))

                            }

                        }
                        Spacer(modifier = Modifier.height(20.dp))

                        Text(text = "Home",
                            fontSize = 18.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )


                    }
                    //End of card
                    Spacer(modifier = Modifier.width(20.dp))

                    //Card1
                    Card (modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(40.dp)
                    ){

                        Spacer(modifier = Modifier.height(20.dp))
                        Column {
                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Image(painter = painterResource(id = R.drawable.img_6), contentDescription = "",
                                    modifier = Modifier.size(100.dp))

                            }

                        }
                        Spacer(modifier = Modifier.height(20.dp))

                        Text(text = "Home",
                            fontSize = 18.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )


                    }
                    //End of card

                }
                //End of row1

            }
            //End of main card



        }









    }






}

@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
   DashboardScreen(rememberNavController())

}
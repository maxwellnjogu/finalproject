package net.ezra.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.Please.PleaseScreen


import net.ezra.ui.SplashScreen
import net.ezra.ui.about.AboutScreen
import net.ezra.ui.alex.AlexScreen
import net.ezra.ui.anne.AnneScreen
import net.ezra.ui.announcements.AnnouncementScreen
import net.ezra.ui.auth.LoginScreen
import net.ezra.ui.auth.SignUpScreen
import net.ezra.ui.contact.ContactScreen
import net.ezra.ui.dashboard.DashboardScreen

import net.ezra.ui.faith.FaithScreen
import net.ezra.ui.groups.GroupScreen
//import net.ezra.ui.auth.SignupScreen
import net.ezra.ui.home.HomeScreen

import net.ezra.ui.inputdata.viewproducts.ProductScreen

import net.ezra.ui.mary.MaryScreen
import net.ezra.ui.partnership.PartnershipScreen
import net.ezra.ui.peter.PeterScreen

import net.ezra.ui.shop.ShopScreen
import net.ezra.ui.students.AddStudents

import net.ezra.ui.students.Search
import net.ezra.ui.students.Students
import net.ezra.ui.tithe.TitheScreen
import net.ezra.ui.womens.WomensScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_HOME


) {
    BackHandler {
        navController.popBackStack()

        }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {




//        composable(ROUTE_SIGNUP) {
//            SignupScreen(navController)
//        }


        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }

        composable(ROUTE_VIEWPRODUCTS) {
            ProductScreen(navController)
        }
        composable(ROUTE_MENS) {
            HomeScreen(navController)
        }

        composable(ROUTE_PASTORS) {
            HomeScreen(navController)
        }
        composable(ROUTE_ADD_STUDENTS) {
            AddStudents(navController)
        }

        composable(ROUTE_ANNOUNCEMENTS) {
            AnnouncementScreen(navController)
        }



        composable(ROUTE_CONTACT) {
            ContactScreen(navController)
        }

        composable(ROUTE_YOUTH) {
            ContactScreen(navController)
        }


        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }


        composable(ROUTE_PLEASE) {
            PleaseScreen(navController)
        }

        composable(ROUTE_PARTNERSHIP) {
            PartnershipScreen(navController)
        }
        composable(ROUTE_FAITH) {
            FaithScreen(navController)
        }
        composable(ROUTE_FAITH) {
            FaithScreen(navController)
        }


        composable(ROUTE_TITHE) {
            TitheScreen(navController)
        }
        composable(ROUTE_SIGNIN) {
            LoginScreen(navController = navController){}
            }


        composable(ROUTE_REGISTER) {
            SignUpScreen(navController = navController){}
            }








        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUTE_VIEW_STUDENTS) {
           Students(navController = navController, viewModel = viewModel() )
        }

        composable(ROUTE_SEARCH) {
            Search(navController)
        }
        composable(ROUTE_WOMENS) {
            WomensScreen(navController)
        }













        composable(ROUTE_DASHBOARD) {
            DashboardScreen(navController)
        }

        composable(ROUTE_GROUPS) {
            GroupScreen(navController)
        }



        composable(ROUTE_SHOP) {
            ShopScreen(navController)
        }

        composable(ROUTE_ANNE) {
            AnneScreen(navController)
        }

        composable(ROUTE_PETER) {
            PeterScreen(navController)
        }

        composable(ROUTE_ALEX) {
            AlexScreen(navController)
        }
        composable(ROUTE_MARY) {
            MaryScreen(navController)
        }

        composable(ROUTE_REGISTER) {
           SignUpScreen(navController = navController) {

           }
        }

        composable(ROUTE_LOGIN) {
            LoginScreen(navController = navController){}
        }



        }




































    }

fun ProductScreen(navController: NavHostController) {

}


fun LoginScreen(navController: NavHostController, function: () -> Unit) {

}

package com.example.flightscry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flightscry.ui.theme.FlightscryTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            FlightscryTheme {
                FlightscryApp()
            }
        }
    }
}

@Composable
fun FlightscryApp() {

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F5F5))
                .padding(innerPadding)
                .padding(16.dp)
        ) {

            Text(
                text = "Flight itinerary",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF111111)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Your upcoming journey",
                fontSize = 16.sp,
                color = Color(0xFF555555)
            )

            Spacer(modifier = Modifier.height(20.dp))

            FlightCard(
                airline = "Skyscanner Airways",
                flightNumber = "SK 123",
                departureAirport = "Mumbai",
                departureCode = "BOM",
                departureTime = "10:30",
                arrivalAirport = "London",
                arrivalCode = "LHR",
                arrivalTime = "15:45"
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Travel details",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF111111)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Passenger",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )

                    Text(
                        text = "Ayan Sawant",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Date",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )

                    Text(
                        text = "30 August 2026",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}

@Composable
fun FlightCard(
    airline: String,
    flightNumber: String,
    departureAirport: String,
    departureCode: String,
    departureTime: String,
    arrivalAirport: String,
    arrivalCode: String,
    arrivalTime: String
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {

        Column(
            modifier = Modifier.padding(20.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = airline,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = flightNumber,
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Column {
                    Text(
                        text = departureTime,
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = departureCode,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Text(
                        text = departureAirport,
                        fontSize = 13.sp,
                        color = Color.Gray
                    )
                }

                Text(
                    text = "✈",
                    fontSize = 28.sp
                )

                Column(
                    horizontalAlignment = Alignment.End
                ) {
                    Text(
                        text = arrivalTime,
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = arrivalCode,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Text(
                        text = arrivalAirport,
                        fontSize = 13.sp,
                        color = Color.Gray
                    )
                }
            }
        }
    }
}
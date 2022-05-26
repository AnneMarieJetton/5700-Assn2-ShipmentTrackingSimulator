// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
fun App() {
    MaterialTheme {
//        TrackingSimulator.runSimulation()

        var textFieldInput by remember { mutableStateOf("") }
        var trackedShipments = remember { mutableStateListOf<TrackerViewHelper>() }

    Column {
        Row {
            TextField(textFieldInput,
                onValueChange = { newValue ->
                    textFieldInput = newValue
                }
            )
            Button(
                onClick = { trackedShipments.add(TrackerViewHelper(textFieldInput)) }) {
                Text("Track")

            }
        }
        Row {
            LazyColumn {
                items(trackedShipments) {
                    Message(it)
                }
            }
        }
    }

    }
}

@Composable
fun Message(shipment: TrackerViewHelper){
    Row (modifier = androidx.compose.ui.Modifier.padding(16.dp)) {
        Surface(elevation = 3.dp) {
            Column{
                Text("Id: " + shipment.shipmentId)
                Text("Status: " + shipment.shipmentStatus)
                Text("Location: " + shipment.currentLocation)
                Text("Expected Delivery: " + shipment.expectedShipmentDeliveryDate)
                Text("Status Updates: put updates array here ")
                Text("Notes: put Notes here")
            }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}

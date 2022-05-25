// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
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
import java.lang.reflect.Modifier

//stuff to ask
    //composable from another file?
    //stuff in folders?
    //example of one of the strategies

@Composable
fun App() {
    MaterialTheme {

        var textFieldInput by remember { mutableStateOf("") }
//        var trackedShipments by remember { mutableStateOf(mutableListOf<Shipment>()) }
        var messages = remember { mutableStateListOf<String>() }

    Column {
        Row {
            TextField(textFieldInput,
                onValueChange = { newValue ->
                    textFieldInput = newValue
                }
            )
            Button(
                onClick = {/*add TrackingSimulator.addShipment(id) here*/messages.add("tracking item") }) {
                Text("Track")

            }
        }
        Row {
            LazyColumn {
                items(messages) {
                    Message(it)
                }
            }
        }
    }

    }
}

@Composable
fun Message(message: String){
    Row (modifier = androidx.compose.ui.Modifier.padding(16.dp)) {
        Surface(elevation = 3.dp) {
            Column{
                Text(message)
                Text("Id:")
                Text("Status:")
                Text("Location: ")
                Text("Expected Delivery: ")
                Text("Status Updates:")
                Text("Notes")
            }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}

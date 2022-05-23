import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

class TrackerViewHelper (){

    var shipmentId by remember { mutableStateOf("") }
    var shipmentTotes by remember { mutableStateOf(mutableListOf<String>()) }
    var shipmentUpdateHistory by remember { mutableStateOf(mutableListOf<String>()) }
    var expectedShipmentDeliveryDate by remember { mutableStateOf(mutableListOf<String>()) }
    var shipmentStatus by remember { mutableStateOf("") }

    init {

    }

    fun trackShipment(id: String){

    }

    fun stopTracking(){

    }

}
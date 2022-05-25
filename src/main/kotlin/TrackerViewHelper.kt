import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

class TrackerViewHelper (){

    var shipmentId by mutableStateOf("")
    var shipmentNotes by mutableStateOf(mutableListOf<String>())
    var shipmentUpdateHistory by mutableStateOf(mutableListOf<String>())
    var expectedShipmentDeliveryDate by mutableStateOf(mutableListOf<String>())
    var shipmentStatus by mutableStateOf("")

    init {

    }

    fun trackShipment(id: String){

    }

    fun stopTracking(){

    }

}
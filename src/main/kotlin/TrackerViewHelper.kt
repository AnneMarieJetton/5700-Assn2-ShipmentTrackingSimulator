import androidx.compose.runtime.*


class TrackerViewHelper (_id: String): Observer{

//    var shipment: Shipment
    var shipmentId by mutableStateOf("")
    var shipmentNotes by mutableStateOf(mutableListOf<String>())
    var shipmentUpdateHistory by mutableStateOf(mutableListOf<ShippingUpdate>())
    var expectedShipmentDeliveryDate by mutableStateOf(111111111111111111)
    var shipmentStatus by mutableStateOf("")
    var currentLocation by mutableStateOf("")

    init {
        var shipment = trackShipment(_id)
        shipmentId = _id
        if (shipment != null) {
            shipmentNotes = shipment.notes
            shipmentUpdateHistory = shipment.updateHistory
            expectedShipmentDeliveryDate = shipment.expectedDeliveryDateTimestamp
            shipmentStatus = shipment.status
            currentLocation = shipment.currentLocation
        }
    }

    fun trackShipment(id: String): Shipment? {
        return TrackingSimulator.findShipment(id)
    }

    fun stopTracking(){
        //removes from list of observers
        var shipment = trackShipment(shipmentId)
        if (shipment != null) {
            shipment.removeObserver(this)
        }
    }

    override fun update(status: String, id: String, notes: MutableList<String>, updateHistory: MutableList<ShippingUpdate>, expectedDeliveryDate: Long, location: String){
        shipmentNotes.clear()
        shipmentUpdateHistory.clear()

        shipmentId = id
        shipmentNotes.addAll(notes)
        shipmentUpdateHistory.addAll(updateHistory)
        expectedShipmentDeliveryDate = expectedDeliveryDate
        shipmentStatus = status
        currentLocation = location
    }

}
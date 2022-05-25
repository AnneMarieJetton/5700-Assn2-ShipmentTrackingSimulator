class Shipment(shipmentInfo: List<String>) {

    var status: String = shipmentInfo[0]
    var id: String = shipmentInfo[1]
    var notes: MutableList<String> = mutableListOf()
        private set
    var updateHistory: MutableList<ShippingUpdate> = mutableListOf()
        private set
    var expectedDeliveryDateTimestamp: Long = shipmentInfo[2].toLong()
    var currentLocation: String = shipmentInfo[0]

    init {

    }

    fun addNote(note: String){

    }

    fun addUpdate(update: ShippingUpdate){

    }

}
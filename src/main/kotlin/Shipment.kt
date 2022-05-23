class Shipment(_status: String, _id: String, _notes: MutableList<String>, _updateHistory: MutableList<ShippingUpdate>, _expectedDeliveryDateTimestamp: Long, _currentLocation: String) {

    var status: String = _status
    var id: String = _id
    var notes: MutableList<String> = _notes
        private set
    var updateHistory: MutableList<ShippingUpdate> = _updateHistory
        private set
    var expectedDeliveryDateTimestamp: Long = _expectedDeliveryDateTimestamp
    var currentLocation: String = _currentLocation

    init {

    }

    fun addNote(note: String){

    }

    fun addUpdate(update: ShippingUpdate){

    }

}
class Shipment(shipmentInfo: List<String>): Observable {

    var status: String = shipmentInfo[0]
        set(value){
            field = value
            notifyObservers()
        }
    var id: String = shipmentInfo[1]
        set(value){
            field = value
            notifyObservers()
        }
    var notes: MutableList<String> = mutableListOf()
        private set
    var updateHistory: MutableList<ShippingUpdate> = mutableListOf()
        private set
    var expectedDeliveryDateTimestamp: Long = shipmentInfo[2].toLong()
        set(value){
            field = value
            notifyObservers()
        }
    var currentLocation: String = shipmentInfo[0]
        set(value){
            field = value
            notifyObservers()
        }

    var observers: MutableList<TrackerViewHelper> = mutableListOf()

    fun addNote(note: String){
        notes.add(note)
        notifyObservers()
    }

    fun addUpdate(update: ShippingUpdate){
        updateHistory.add(update)
        notifyObservers()
    }

    override fun addObserver(observer: TrackerViewHelper) {
        observers.add(observer)
    }

    override fun removeObserver(observer: TrackerViewHelper) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update(status, id, notes, updateHistory, expectedDeliveryDateTimestamp, currentLocation)
        }
    }

}
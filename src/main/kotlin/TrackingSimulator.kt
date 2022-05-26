import Strategies.*
import java.io.File

class TrackingSimulator private constructor(){

    companion object {
//        var shipments = MutableList<Shipment>()
        var shipments = mutableListOf<Shipment>()
            private set


        fun findShipment(id: String): Shipment? {
            shipments.forEach {
                if (it.id == id){
                    return it
                }
            }
            return null
        }

        fun addShipment(shipment: Shipment) {
            shipments.add(shipment)
        }

        fun runSimulation() {
            val canceled = Canceled()
            val created = Created()
            val delayed = Delayed()
            val delivered = Delivered()
            val location = Location()
            val lost = Lost()
            val noteAdded = NoteAdded()
            val shipped = Shipped()
            val dictionary = mapOf<String, ShipmentStrategyPattern>("canceled" to canceled, "created" to created, "delayed" to delayed, "delivered" to delivered, "location" to location, "lost" to lost, "noteadded" to noteAdded, "shipped" to shipped)

            var file = File("text.txt")
            file.forEachLine{
                var splitLine = it.split(",")
//                var shippingUpdate = ShippingUpdate(splitLine)
                //no imputs on creation, just input to function

                if (splitLine[0] == "Created") {
                    var shipment =  Shipment(splitLine)
                    if (findShipment(shipment.id) == null) {
                        addShipment(shipment)
                    }
                }

                dictionary[splitLine[0]]?.updateStatus(splitLine)

            }
        }

        //make an instance of each strategy and keep it in a dictionary
    }

}
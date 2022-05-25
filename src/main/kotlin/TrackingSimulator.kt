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
//            val delayed = Delayed()
            val delivered = Delivered()
//            val location = Location()
            val lost = Lost()
//            val noteAdded = NoteAdded()
//            val shipped = Shipped()
//            val dictionary = mapOf<ShipmentStrategyPattern, Int>(canceled to 1, )

            var file = File("text.txt")
            file.forEachLine{
                var splitLine = it.split(",")
                var shipment =  Shipment(splitLine)
//                var shippingUpdate = ShippingUpdate(splitLine)

                if(findShipment(shipment.id) == null){
                    addShipment(shipment)
                }
            }
        }

        //make an instance of each strategy and keep it in a dictionary
    }

}
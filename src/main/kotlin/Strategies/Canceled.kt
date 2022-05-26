package Strategies

import ShipmentStrategyPattern
import ShippingUpdate
import TrackingSimulator

class Canceled(): ShipmentStrategyPattern{

    override fun updateStatus(updateInfo: List<String>) {
        //give this the whole string
        //find shipment with id
        //update shipment
        //creates shipment update instance
        //give to shipment with add update

        var shipment = TrackingSimulator.findShipment(updateInfo[1])

        if (shipment != null) {
            shipment.addUpdate(ShippingUpdate(shipment.status, updateInfo[0], updateInfo[2].toLong()))

            shipment.status = updateInfo[0]
            shipment.expectedDeliveryDateTimestamp = 1000000000000000
        }
    }

}
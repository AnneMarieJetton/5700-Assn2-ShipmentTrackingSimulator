package Strategies

import ShipmentStrategyPattern
import ShippingUpdate

class Delayed (): ShipmentStrategyPattern{

    override fun updateStatus(updateInfo: List<String>) {

        var shipment = TrackingSimulator.findShipment(updateInfo[1])

        if (shipment != null) {
            shipment.addUpdate(ShippingUpdate(shipment.status, updateInfo[0], updateInfo[2].toLong()))

            shipment.status = updateInfo[0]
            shipment.expectedDeliveryDateTimestamp = updateInfo[3].toLong()
        }

    }

}
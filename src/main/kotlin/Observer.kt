interface Observer {

    fun update(status: String, id: String, notes: MutableList<String>, updateHistory: MutableList<ShippingUpdate>, expectedDeliveryDate: Long, location: String) {

    }
}
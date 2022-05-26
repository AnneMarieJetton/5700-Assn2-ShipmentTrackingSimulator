//import Strategies.*
//import org.junit.jupiter.api.Test
//import kotlin.test.assertEquals
//
//class StrategiesTest {
//    @Test
//    fun CanceledTest() {
//        var info = listOf<String>("canceled","s10003","1652712855468")
//        var strategy = Canceled()
//        strategy.updateStatus(info)
//
//        TrackingSimulator.findShipment(info[1])?.let { assertEquals(it.status, "canceled") }
//    }
//
//    @Test
//    fun CreatedTest() {
//        var info = listOf<String>("created","s10000","1652712855468")
//        var strategy = Created()
//        strategy.updateStatus(info)
//
//        TrackingSimulator.findShipment(info[1])?.let { assertEquals(it.status, "created") }
//    }
//
//    @Test
//    fun DelayedTest() {
//        var info = listOf<String>("delayed","s10000","1652712855468","1652718051403")
//        var strategy = Delayed()
//        strategy.updateStatus(info)
//
//        TrackingSimulator.findShipment(info[1])?.let { assertEquals(it.status, "delayed") }
//    }
//
//    @Test
//    fun DeliveredTest() {
//        var info = listOf<String>("delivered","s10006","1652712855468")
//        var strategy = Delivered()
//        strategy.updateStatus(info)
//
//        TrackingSimulator.findShipment(info[1])?.let { assertEquals(it.status, "delivered") }
//    }
//
//    @Test
//    fun LocationTest() {
//        var info = listOf<String>("location","s10000","1652712855468","Los Angeles CA")
//        var strategy = Location()
//        strategy.updateStatus(info)
//
//        TrackingSimulator.findShipment(info[1])?.let { assertEquals(it.currentLocation, "") }
//    }
//
//    @Test
//    fun LostTest() {
//        var info = listOf<String>("lost","s10000","1652712855468")
//        var strategy = Lost()
//        strategy.updateStatus(info)
//
//        TrackingSimulator.findShipment(info[1])?.let { assertEquals(it.status, "lost") }
//    }
//
//    @Test
//    fun NoteAddedTest() {
//        var info = listOf<String>("noteadded","s10000","1652712855468","package was damaged slightly during shipping")
//        var strategy = NoteAdded()
//        strategy.updateStatus(info)
//
//        TrackingSimulator.findShipment(info[1])?.let { assertEquals(it.status, "noteadded") }
//    }
//
//    @Test
//    fun ShippedTest() {
//        var info = listOf<String>("shipped","s10000","1652712855468","1652713940874")
//        var strategy = Shipped()
//        strategy.updateStatus(info)
//
//        TrackingSimulator.findShipment(info[1])?.let { assertEquals(it.status, "shipped") }
//    }
//
//}
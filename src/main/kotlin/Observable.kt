interface Observable {

    fun addObserver(observer: TrackerViewHelper){

    }

    fun removeObserver(observer: TrackerViewHelper){

    }

    fun notifyObservers(){

    }
}
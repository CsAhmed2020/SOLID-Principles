package DIP

//interface for switches
//This interface will give us the flexibility to plug in other types of switches
interface Switch {
    val isOn: Boolean
    fun press()
}
//see this class after the next one
class LightBulbDIP : Switchable {
    override fun turnOn() {
        println("LightBulb: Bulb turned on...")
    }

    override fun turnOff() {
        println("LightBulb: Bulb turned off...")
    }
}

// abstraction (interface) that both the ElectricPowerSwitch and LightBulb classes will depend on
//any switchable devices in the application can implement this interface and provide their own functionality.

interface Switchable {
    fun turnOn()
    fun turnOff()
}

//In the ElectricPowerSwitch class we implemented the Switch interface and referred the Switchable interface
// instead of any concrete class in a field. We then called the turnOn() and turnoff() methods on the interface,
// which at run time will get invoked on the object passed to the constructor.
// Now, we can add low-level switchable classes without worrying about modifying the ElectricPowerSwitch class.
class ElectricPowerSwitchDIP(var client: Switchable) : Switch {
    override var isOn = false

    override fun press() {
        val checkOn = isOn
        if (checkOn) {
            client.turnOff()
            isOn = false
        } else {
            client.turnOn()
            isOn = true
        }
    }
    }

//we can use another class with no problem (Like : Fan)
//we implemented the Switchable interface to provide their own functionality for turning on and off.

class Fan : Switchable {
    override fun turnOn() {
        println("Fan: Fan turned on...")
    }

    override fun turnOff() {
        println("Fan: Fan turned off...")
    }
}


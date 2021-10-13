package DIP

//turnOn() and turnOff() methods to turn a bulb on and off.
class LightBulb {
    fun turnOn() {
        println("LightBulb: Bulb turned on...")
    }

    fun turnOff() {
        println("LightBulb: Bulb turned off...")
    }
}

//ElectricPowerSwitch class that referencing LightBulb class  In the constructor
// we created a LightBulb object and assigned it to the field
// We then wrote a isOn() method that returns the state of ElectricPowerSwitch as a boolean value
// In the press() method, based on the state, we called the turnOn() and turnOff() methods.

class ElectricPowerSwitch(var lightBulb: LightBulb) {
    var isOn = false

    fun press() {
        val checkOn = isOn
        if (checkOn) {
            lightBulb.turnOff()
            isOn = false
        } else {
            lightBulb.turnOn()
            isOn = true
        }
    }
}
//high-level ElectricPowerSwitch class is directly dependent on the low-level LightBulb class.
//a switch should not be tied to a bulb. It should be able to turn on and off other appliances and devices too, like an AC, or the entire lightning system
// imagine the modifications we will require in the ElectricPowerSwitch class each time we add a new appliance or device


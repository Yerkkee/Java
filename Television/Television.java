/**
 The purpose of this class is to model a television
 Yerkebulan Zhaiylkan 55903 and 17.11.2021
 */

public class Television {
    // Declare variables
    String MANUFACTURER; // The manufacturer attribute will hold the brand name
    int SCREEN_SIZE; // The screenSize attribute will hold the size of the television screen.
    boolean powerOn = false; // The powerOn attribute will hold the value true if the power is on and false if the power is off.
    int channel = 2; // The channel attribute will hold the value of the station that the television is showing.
    int volume = 20; // The volume attribute will hold a number value representing the loudness (0 being no sound).

    //Creating a constructor definition that has two parameters, a manufacturer’s brand
    //and a screen size. These parameters will bring in information.
    public Television(String MANUFACTURER, int SCREEN_SIZE){
        this.MANUFACTURER = MANUFACTURER;
        this.SCREEN_SIZE = SCREEN_SIZE;
    }
    //Task #3 Methods
    /*
    The power method will toggle the power between on and off, changing
    the value stored in the powerOn field from true to false or from false to
    true
     */
    public void power(){
        powerOn = !powerOn;
    }
    /*
    The getVolume method will return the value stored in the volume field.
    @return powerON inverse value;
     */
    public int getVolume(){
        return volume;
    }
    /*
    The increaseVolume method will increase the value
    stored in the volume field by 1.
     */
    public void increaseVolume(){
        volume++;
    }
    /*
    The decreaseVolume method will decrease the value
    stored in the volume field by 1.
     */
    public void decreaseVolume(){
        volume--;
    }
    /*
    The getChannel method will return the value stored in the
    channel field.
    @return variable channel
     */
    public int getChannel(){
        return channel;
    }
    /*
    The setChannel method will store the desired station in the
    channel field.
    @param int station is channel field
     */
    public void setChannel(int station){
        this.channel = station;
    }
    /*
    The getManufacturer method will return the
    constant value stored in the MANUFACTURER field
    @return variable MANUFACTURER.
     */
    public String getManufacturer(){
        return MANUFACTURER;
    }
    /*
    The getScreenSize method will return the constant
    value stored in the SCREEN_SIZE field
    @return variable SCREEN_SIZE
     */
    public int getScreenSize(){
        return SCREEN_SIZE;
    }
}

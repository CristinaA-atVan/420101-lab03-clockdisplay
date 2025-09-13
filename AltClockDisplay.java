
/**
 * The AltClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class AltClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    // simulates the actual display
    
    /**
     * Constructor for AltClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     * Changed to a 12-hour clock for Question 37 but failed
     * Extracts system time for Question 51, but I have no clue what to do
     * with it
     */
    public AltClockDisplay()
    {
        long millis = System.currentTimeMillis();
        long seconds = millis / 1000;
        // use a ‘cast’ to convert long integers to int.
        int currentMinutes = (int) (seconds / 60 % 60);
        int currentHours = (int) (seconds / (60 * 60) % 24);
    }

    /**
     * Constructor for AltClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     * Changed to a 12-hour clock for Question 37 but failed
     */
    public AltClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {
            // It just rolled over!
            hours.increment();
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and minute.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue();
    }
}

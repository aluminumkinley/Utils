package com.example.utilsdg;

public class Utils {
    private static String dummyText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    /**
     * This function return a dummy text for testing.
     * @return
     */
    public static String returnDummyText(){
        return dummyText;
    }

    /**
    * @param millisecond time in milliseconds
    * @return formated time 
    */
    public static String formatTime(int millisecond){
        if(millisecond==0)
            return "0.00.0";
        return String.format(Locale.ENGLISH,timeFormat,
                TimeUnit.MILLISECONDS.toMinutes(millisecond),
                (millisecond/1000f)%60);
    }
}
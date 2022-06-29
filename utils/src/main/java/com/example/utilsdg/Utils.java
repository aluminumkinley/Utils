package com.example.utilsdg;

public class Utils {
    private static String dummyText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public  static final  String timeFormat="%d.%02.1f";

    /**
     * This function return a dummy text for testing.
     * 
     * @return
     */
    public static String returnDummyText() {
        return dummyText;
    }

    /**
     * @param millisecond time in milliseconds
     * @return formated time
     */
    public static String formatTime(int millisecond) {
        if (millisecond == 0)
            return "0.00.0";
        return String.format(Locale.ENGLISH, timeFormat,
                TimeUnit.MILLISECONDS.toMinutes(millisecond),
                (millisecond / 1000f) % 60);
    }

    /**
     * 
     * @param rgb android int rgb value 
     * @return return RRGGBB hex color
     */
    public static String getRGB(int rgb){
        return String.format("#%06X", (0xFFFFFF & rgb));
    }
    public static class Math {
        
        public static float epsilon = .0009f;

        /**
         * Scale value in a range.
         * 
         * @param x   source scale value
         * @param min source scale min value
         * @param max source scale max value
         * @param a   target scale min value
         * @param b   target scale max value
         * @return target scale value
         */
        public static float scaleRange(float x, float min, float max, float a, float b) {
            return (b - a) * (x - min) / (max - min) + a;
        }

        public static boolean isEqual(float a, float b) {
            return Math.abs(a - b) < epsilon;
        }

        public static boolean isEqual(double a, double b) {
            return Math.abs(a - b) < epsilon;
        }

        /**
         * divide a by b.
         * return 0 if b is zero
         * use this function if there is a chance that divisor can be 0 to avoid NAN
         * value
         * 
         * @param a dividend
         * @param b divisor
         * @return
         */
        public static float divide(float a, float b) {
            if (b == 0)
                return 0;
            return a / b;
        }
    }

}
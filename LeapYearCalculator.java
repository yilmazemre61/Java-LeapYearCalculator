public class LeapYearCalculator {

    //Write a method isLeapYear with a parameter of type int named year. The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
    //If the parameter is not in that range return false. Otherwise, if it is in the valid range, calculate if the year is a leap year and return true.
    //If it is a leap year, otherwise return false.
    //
    //To determine whether a year is a leap year, follow these steps:
    //1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
    //2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
    //3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
    //4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
    //5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
    //
    //Examples of input/output:
    //* isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)
    //* isLeapYear(1600); → should return true since 1600 is a leap year
    //* isLeapYear(2017); → should return false since 2017 is not a leap year
    //* isLeapYear(2000);  → should return true because 2000 is a leap year

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

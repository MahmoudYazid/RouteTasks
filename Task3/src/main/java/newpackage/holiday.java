/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author ahmed
 */
public class holiday {
    private String name;
    private int day;
    private String month;

    public holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public String getMonth() {
        return month;
    }
    public Boolean inSameMonth(String MonthNo1 ,String MonthNo2){
        //Compare 2 month with Lowercase (To prevent Capital and Lower Problems)
        if(MonthNo1.toLowerCase()  == MonthNo2.toLowerCase() ){
            return  true;
        }else{
            return  false;
        }
        
    }

    public int getDay() {
        return day;
    }
    
    public static double avgDate(holiday[] ArrOfHolidays){
        //if there is no Items retun 0
        if(ArrOfHolidays.length ==0){
            return 0;
        }
        int TotalCount = 0;
        //accumulate the count ++
        for(int Counter = 0; Counter < ArrOfHolidays.length; Counter++) {
            TotalCount= TotalCount+ArrOfHolidays[Counter].getDay();
        }
        //return Avg
        return TotalCount/ArrOfHolidays.length;
    }
}

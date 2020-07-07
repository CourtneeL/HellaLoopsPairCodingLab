package hbcu.stay.ready.mastering_loops;

public class TableUtilities {
    public static String getLargeMultiplicationTable() 
    {
        String result = "\n";
 
         for(int row = 1; row <=10; ++row)
         {
             for(int column = 1; column <=10; ++column)
             {
                result += row * column + "|" +"\n";
             }
             result += "\n";
         }
         return result;
     }

     public static String getSmallMultiplicationTable()
     {
        String str = "\n";
        for(int row = 1; row <= 5; row++)
        {
            for(int column = 1; column <= 5; column++)
            {
                str += row*column + " | ";
            }
            str += "\n";
        }
        return str;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}

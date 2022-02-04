public class LinearSearch
{
    public static int linearSearchMethod (int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)
            {
                return i;
            }
        } // end for loop
        return -1;
    } // end linearSearchMethod
} // end linearSearch class

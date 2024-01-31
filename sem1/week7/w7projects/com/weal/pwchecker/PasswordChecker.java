package com.weal.pwchecker;
public class PasswordChecker
{
    private static final int PWLENGTH = 8;
    /*
     * the string instance variable (which will be used to store passwords 
     * being checked) does not have either the public or private access
     * specifier. this means that the variable pw is avail anywhere in the 
     * package. 
     * 
     * so other classes in this package have direct access to that variable but
     * classes in other packages have no access to that variable
     * 
     * we wanna avoid this level of access so use 'private'
     */
    String pw;
    public PasswordChecker(String pw)
    {
        this.pw = pw;
    }

    /**
     * 'args' is an array of strings that holds command-line arguments.
     * the elements of the array are the individual arguments provided when running
     * the program.
     * 
     * ex: if u run the program with java MyClass arg1 arg2 arg3, then the args will be
     * an array ["arg1", "arg2", "arg3"].
     * 
     * can access indiv arguments by their index in the array.
     * ex: args[0] would be "arg1" and so on -> basic indexing
     * 
     * in our case that is just the string 'password' or wtv password u wanna use so there's
     * only one element in the args array so we can j refer to it as args[0]
     * 
     * the element args[0] contains the password
     */    
    public static void main(String[] args) 
    {
        PasswordChecker pwChecker1 = new PasswordChecker("Eight888");
        if (pwChecker1.check()) 
        {
            System.out.println("Password OK.");
        }
        else
        {
            System.out.println("Password not compliant.");
        }
    }

    /*
     * check method returns true if the password meets the constraints or false
     * if not.
     * 
     * the first check (if statement) is to confirm whether the length of the password 
     * is correct. 
     * 
     * the second check makes use of the methodfs in the Character class and loops through 
     * the password and counts the number of digits, upper-case and lower-case characters.
     * 
     *
     */
    private boolean check()
    {
        if (pw.length() != PWLENGTH)
        {
            return false;
        }
        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;

        /*
         * for every index i where i is smaller than the password length and i is incremented
         * each time,
         * 
         * if the character is upper case at that index, increment the countUpper variable
         * as that variable is used as a counter to keep track of the number of uppercase 
         * chars. 
         * 
         * same concept with lowercase and digits.
         * 
         */

        for (int i = 0; i < pw.length(); i++)
        {
        
        /* pw.charAt(i):
         * 'charAt' method is part of the String class and is used to retrieve the character 
         * at a specified index within a string. the index i is already defined within the
         * for-loop parameter and it is specified as an argument to the 'charAt' method.
         * by default it starts from zero for the first character.
         */
        
             if (Character.isUpperCase(pw.charAt(i)))
            {
                countUpper++;
            }
            else if (Character.isLowerCase(pw.charAt(i)))
            {
                countLower++;
            }
            else if (Character.isDigit(pw.charAt(i))) 
            {
                countDigit++;   
            }
        }

        if (countDigit == 0) 
        {
            return false;   
        }

        if (countLower < 1)
        {
            return false;
        }

        if (countUpper < 1)
        {
            return false;
        }

        return true;
    }
}       /* parameters and arguments are used interchangeably but they can be defined differently
         * as well: 
         * - parameters are variables used in the method decleration to define the types and 
         * order of values that the method expects 
         * - arguments are the acfual values that are passed into the method when it is called 
         * 
         * parameters are part of the method's signature, while arguments are part of the 
         * method's call.
         */
public class WhileLoops
{
    
    public static void main(String[] args)
    {
        WhileLoops whileLoop1 = new WhileLoops();
        whileLoop1.printNumber();

        int a = 5;
        int b = 10;
        int sumOf = whileLoop1.sum(a, b);
        System.out.println("The sum of numbers between " + a + " and " + b + " is: " + sumOf);

        int c = 8;
        if (whileLoop1.isPrime(c)) 
        {
            System.out.println(c + " is a prime number");
        }
        else 
        {
            System.out.println(c + " is not a prime number");
        }
    }

    public void printNumber()
    {
        int i = 0;
        while (i < 100) 
        {
            System.out.println(i);
            i++;    
        }
    }

    public int sum(int a, int b)
    {
        //Ensure a is less than or equal to b
        if (a > b)
        {
            int var = a;
            a = b;
            b = var; 
        }
        
        //Initialise the sum and the current number
        int totalSum = 0;
        int currentNumber = 0;

        //Use a while loop to iterate through the numbers and add them to the sum
        while (currentNumber <= b) {
            totalSum = totalSum + currentNumber;
            currentNumber++;
        }

        return totalSum;
    }
    
    public boolean isPrime(int n)
    {
        int i = 2;
        while (i < n) 
        {
            if (n % i == 0)
            {
                return false;
            }

            i++;
        }
        return true;
    }
}
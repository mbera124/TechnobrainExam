package QuestionOne;

public class Fibonacci {
    static int fibonacci(int no)
    {
        if (no <= 1)
            return no;
        return fibonacci(no - 1) + fibonacci(no - 2);
    }

    public static void main(String args[])
    {
        int number = 13;
        System.out.println("Number at position 13 in fibonacci sequence\n"+fibonacci(number));
    }
}


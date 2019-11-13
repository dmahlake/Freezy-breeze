class practice{
    public static void main(String[] args) {
        
        int number = 30;

        for (int i = 1; i < number; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i + "FIZZBUZZ");
            else if (i % 3 == 0)
                System.out.println(i + "FIZZ");
            else if (i % 5 == 0)
                System.out.println(i + "BUZZ");
        }
    }
}
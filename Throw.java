class Throw
{
    public static void cnic(int a)
    {
        if(a<18)
        {
            throw new ArithmeticException("Not Eligible for CNIC");
        }
        if(a>=18)
        {
            System.out.println("Eligible for CNIC");
        }
    }
    public static void main(String a[])
    {
        try{
            cnic(15);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
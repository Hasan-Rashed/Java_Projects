package emailapplication;

public class EmailApplication
{
    public static void main(String[] args)
    {
        Email email = new Email("Hasan", "Rashed");

        email.setAlternateEmail("hs@gmail.com");
        System.out.println(email.showInfo());
    }
}

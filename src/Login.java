public class Login {
    private String user = "admin";
    private int pass = 12345;
    public boolean verify(String username, int passwd) {

        if (username.equals(user) && passwd == pass)
        {
            System.out.println("Authorized.");
            return true;
        }
        else{
            System.out.println("Invalid username or password.");
            return false;
        }
    }
}

package ehu.eus.bussines_logic;

public class LenPassChecker implements PassChecker{
    public boolean checkCredentials(String username, String passwd) {
        return username.length() == passwd.length();
    }
}

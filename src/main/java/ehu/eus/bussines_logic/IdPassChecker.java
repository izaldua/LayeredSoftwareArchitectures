package ehu.eus.bussines_logic;

public class IdPassChecker implements PassChecker {
    public boolean checkCredentials(String username, String passwd) {
        return username.equals(passwd);
    }
    //PassChecker wtf = new IdPassChecker();
}

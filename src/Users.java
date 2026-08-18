import java.util.HashSet;
import java.util.Set;

public class Users {
    private String name;
    private String email;
    private static Set<String> emails = new HashSet<>();

    public Users(String name, String email) {
        if (!emails.add(email)) {
            throw new IllegalArgumentException("\nEmail já cadastrado!\n");
        }
        
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }




}

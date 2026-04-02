package hawk.api.okta;

public class OktaIdInfo {
    private final String username;

    public OktaIdInfo(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

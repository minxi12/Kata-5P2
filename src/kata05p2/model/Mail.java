package kata05p2.model;

public class Mail {

    private String mail;

    public Mail(String mailPass) {
        this.mail = mailPass;
    }

    public String getDomain() {
        String[] emailDiv = this.mail.split("@");
        String dominio = emailDiv[1];
        return dominio;
    }
}

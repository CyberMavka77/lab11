package task2;

public class GiftMail implements MailCode{
    private static String TEMPLATE = "BLACK FRIDAY! %name receive discount!!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replace("%name", client.getName());
    }
}

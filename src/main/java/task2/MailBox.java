package task2;

import java.util.List;

public class MailBox {
    private List<MailInfo> infos;

    public void ddMailInfo(MailInfo mail){
        infos.add(mail);
    }

    public void endAll() {

    }
}

import org.testng.annotations.Test;

public class Payload {

 private static String accountId;
    private static String accountNum;

    Payload(String id, String num)  {
        accountId =  id;
        accountNum = num;
    }

    public String getPayload() {
        String payload;
        payload = accountId + accountNum;
        return payload;
    }
}

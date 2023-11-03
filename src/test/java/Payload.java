import org.testng.annotations.Test;

public class Payload {

 private static String accountId;
    private static String accountNum;
 private static String address;

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

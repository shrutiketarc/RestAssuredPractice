import java.util.List;

public class POJO {

    int id;
    String name;
    double amount;
    List<String> accounts;
    List<Cards> cards;
    Address address;
}

class Address {
    String streetName;
    String city;
    String country;
}

class Cards {
    String debit;
    String credit;
}
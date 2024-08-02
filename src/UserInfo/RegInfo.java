package UserInfo;

public class RegInfo {
    private String fullName;
    private int age;
    private int phonNumber;
    private int password;
    private int cardNumber;

    public RegInfo(String fullName, int age, int phonNumber, int password, String cardNumber) {
        this.fullName = fullName;
        this.age = age;
        this.phonNumber = phonNumber;
        this.password = password;
        this.cardNumber = Integer.parseInt(cardNumber);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhonNumber() {
        return phonNumber;
    }

    public void setPhonNumber(int phonNumber) {
        this.phonNumber = phonNumber;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}

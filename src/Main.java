public class Main {
    public static void main(String[] args) {
       ValidatePhone validatePhone=new ValidatePhone();
       String[] strings=new String[]{"(84)-(0978489648)","(a8)-(22222222)"};
        for (String phone: strings
             ) {
            boolean isPhone=validatePhone.Validate(phone);
            System.out.println("phone number "+phone+" is valid:"+isPhone);
        }
    }
}

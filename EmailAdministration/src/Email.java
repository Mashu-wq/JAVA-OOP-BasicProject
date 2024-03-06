import java.util.Scanner;

class Email{
     private String firstName;
     private String lastName;
    private String departmentName;
    private int mailBoxCapacity = 50;
    private String alternateEmail;
    private String password;
    private String email;
    private String company_suffix = "habijabi.com";
    private int defaultPasswordLength = 10;
    
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        // System.out.println("Email created: " + this.firstName + " " + this.lastName);

        this.departmentName = setDepartment();
       

        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + '@' + departmentName + "." + company_suffix;
        // System.out.println("Your email is: " + email);
        
    }
    private String setDepartment(){
        System.out.println("Department codes\n1 for Sales\n2 for Department\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if (depChoice == 1){
            return "sales";
        }
        else if(depChoice == 2){
            return "dev";
        }
        else if (depChoice == 3){
            return "acct";
        }
        else{
            return "";
        }
    }
    //generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    public void changePassword(String password){
        this.password = password;
    }
    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "Display Name: " + firstName + " " + lastName + "\nCompany Email: " + email + "\nMailBox Capacity: " + mailBoxCapacity + "mb";
    }
    
} 
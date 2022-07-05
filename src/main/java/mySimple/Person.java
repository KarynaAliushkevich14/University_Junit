package mySimple;

public class Person {
    private int id;
    private int age;
    private String name;
    private String email;
    private String password;
    private String PESEL;

    public Person( int id, int age, String name, String email, String password, String PESEL) {
        this.id= id;
        this.age = age;
        this.name = name;
        this.email = email;
        this.password = password;
        this.PESEL = PESEL;
    }

    public Person(){}

    public int getId() {
        return id;
    }

    public void setId(int id) throws  Exception {
        if (id != getId()) {
            throw new Exception("Id can't be changed");
        }this.id =id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age < 0 || age > 120) {
            throw new Exception("Age shold be positive number and less than 120");
        }
        if (String.valueOf(age).length() > 3) {
            throw new Exception("Age shouldn't have more than 3 characters");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)throws Exception {
        if(name.length()>30){
            throw new Exception("Max number of letters is 30");
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if(email.contains("@")){
            this.email = email;
        }else {
            throw new Exception("Email should contain @ in their name");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) throws Exception {
        if (PESEL.length() != 11){
            throw new Exception("PESEL should have 11 characters");
        }
        this.PESEL = PESEL;
    }
}

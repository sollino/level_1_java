package Less_5;

public class Sotr {

//    ФИО, должность, email, телефон, зарплата, возраст

    private String FIO;
    private String dolg;
    private String email;
    private String phone;
    private int ZP;
    private int age;


    public Sotr(String FIO,
                String dolg,
                String email,
                String phone,
                int ZP,
                int age) {
        System.out.println(FIO + " " + dolg + " " + email + " " + phone + " " + ZP + " " + age);
    }


    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public String getFIO() {
        return FIO;
    }

    public  void search (){
        if (age > 40){
            System.out.println(FIO);
        }
    }


      }


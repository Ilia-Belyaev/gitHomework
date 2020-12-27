package lesson4;

public class Workman {
    private String name;//Имя
    private String lastName;//Фамилия
    private String patronymic;//Отчество
    private String post;//Должность
    private String telephone;//Телефон
    private int money;//Зарплата
    private int age;//Возраст

    Workman(String name, String lastName, String patronymic, String post, String telephone, int money, int age){
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.post = post;
        this.telephone = telephone;
        this.money = money;
        this.age = age;
    }
    public String getName() {return name;}
    public String getLastName(){return lastName;}
    public String getPatronymic(){ return patronymic;}
    public String getPost(){ return post;}
    public String getTelephone(){return telephone;}
    public int getMoney(){return money;}
    public int getAge(){ return age;}


    public int setMoney() {
        this.money = money+10000;
        return money;
    }



    void nLpp(){
        System.out.println("Ваше имя: " + name);
        System.out.println("Ваша фамилия: " + lastName);
        System.out.println("Ваше отчество: " + patronymic);
        System.out.println("Ваша должность: " + post);
    }
    void allInf(){
        System.out.println("Ваше имя: " + name);
        System.out.println("Ваша фамилия: " + lastName);
        System.out.println("Ваше отчество: " + patronymic);
        System.out.println("Ваша должность: " + post);
        System.out.println("Ваш телефон: " + telephone);
        System.out.println("Ваша зарплата: " + money);
        System.out.println("Ваш возраст: " + age);
    }


}



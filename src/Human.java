import java.util.Date;

public class Human {
    int id;
    String name;
    String gender;
    Division division;
    int salary;
    String birth;

    public Human(int id, String name, String gender, Division division, int salary, String birth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.division = division;
        this.salary = salary;
        this.birth = birth;
    }

    public String toString() {
        return
                "ID = " + id + ", Имя: " + name  + ", Пол: " + gender    +", Заработная плата: " + salary + ", Дата рождения: " + birth+ ",[Подразделение: "+ division.toStringDivision() + "]"  ;
    }
}

public class Division {
    private static int divisionID = 0;
    private int id;
    private String title;

    public Division(String title) {
        this.id = divisionID;
        divisionID++;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String toStringDivision() {
        return
                "ID = " + id + ", Наименование " + title  ;}
}

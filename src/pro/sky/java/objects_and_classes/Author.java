package pro.sky.java.objects_and_classes;
public class Author {
    private String authorFirstName;
    private String authorLastName;
    private String authorPatronymic;
    public Author (String authorFirstName, String authorLastName, String authorPatronymic) {
        this.authorFirstName=authorFirstName;
        this.authorLastName=authorLastName;
        this.authorPatronymic=authorPatronymic;
    }
    public String getAuthorFirstName() {
        return this.authorFirstName;
    }
    public String getAuthorLastName() {
        return this.authorLastName;
    }
    public String getAuthorPatronymic() {
        return this.authorPatronymic;
    }
}

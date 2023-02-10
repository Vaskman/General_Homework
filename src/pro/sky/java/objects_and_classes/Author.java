package pro.sky.java.objects_and_classes;

import java.util.Objects;

public class Author {

    private String authorFirstName;
    private String authorLastName;
    private String authorPatronymic;

    public Author(String authorFirstName, String authorLastName, String authorPatronymic) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.authorPatronymic = authorPatronymic;
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

    @Override
    public String toString() {
        return this.getAuthorFirstName() + " " + this.getAuthorLastName() + " " + this.getAuthorPatronymic();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorFirstName, author.authorFirstName) && Objects.equals(authorLastName, author.authorLastName) && Objects.equals(authorPatronymic, author.authorPatronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorLastName, authorPatronymic);
    }
}

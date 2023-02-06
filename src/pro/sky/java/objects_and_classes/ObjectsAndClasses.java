package pro.sky.java.objects_and_classes;

public class ObjectsAndClasses {
    public static void separation() {
        System.out.println("_________________________");
    }
    public static void main(String[] args) {
        Book theWisdomOfCrowds = new Book("Аберкромби", "Мудрость Толпы", 2021);
        Author joeAbercrombie = new Author("Joe", "Abercrombie", " ");
        Book dollOnTheThrone = new Book("Суржиков", "Кукла на Троне", 2022);
        Author romanSurgikov = new Author("Роман", "Cуржиков", "Евгеньевич");
        separation();
        System.out.println(dollOnTheThrone.getBookName());
        System.out.println(dollOnTheThrone.getAuthor());
        dollOnTheThrone.setPublishingYear(2023);
        System.out.println(dollOnTheThrone.getPublishingYear());
        separation();
        System.out.print(romanSurgikov.getAuthorLastName() + " ");
        System.out.print(romanSurgikov.getAuthorFirstName() + " ");
        System.out.println(romanSurgikov.getAuthorPatronymic());
        separation();
        System.out.println(theWisdomOfCrowds.getBookName());
        System.out.println(theWisdomOfCrowds.getAuthor());
        theWisdomOfCrowds.setPublishingYear(2020);
        System.out.println(theWisdomOfCrowds.getPublishingYear());
        separation();
        System.out.print(joeAbercrombie.getAuthorFirstName() + " ");
        System.out.print(joeAbercrombie.getAuthorLastName() + " ");
        System.out.println(joeAbercrombie.getAuthorPatronymic());
        separation();
    }
}

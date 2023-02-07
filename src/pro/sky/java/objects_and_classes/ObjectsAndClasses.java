package pro.sky.java.objects_and_classes;

public class ObjectsAndClasses {
    public static void separation() {
        System.out.println("_________________________");
    }
    public static void main(String[] args) {
        Author JoeAbercrombie = new Author("Joe", "Abercrombie", " ");
        Author RomSurgikov = new Author("Суржиков", "Роман", "Евгеньевич");
        Book theWisdomOfCrowds = new Book("Мудрость Толпы", 2021, JoeAbercrombie);
        Book dollOnTheThrone = new Book("Кукла на Троне", 2022, RomSurgikov);
        separation();
        System.out.println(theWisdomOfCrowds);
        theWisdomOfCrowds.setPublishingYear(2020);
        System.out.println(theWisdomOfCrowds.getPublishingYear());
        separation();
        System.out.println(dollOnTheThrone);
        dollOnTheThrone.setPublishingYear(2023);
        System.out.println(dollOnTheThrone.getPublishingYear());
        separation();
    }
}

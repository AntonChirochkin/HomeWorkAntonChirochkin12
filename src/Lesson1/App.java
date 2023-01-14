package Lesson1;

public class App {

        public static void main (String[] args) {
            Author bulgakov = new Author ("Михаил", "Булгаков");
            Author verne = new Author ("Жюль", "Верн");
            Author martin = new Author ("Роберт", "Мартин");

            Book mAM = new Book("Мастер и Маргарита", bulgakov, 1940);
            Book desertIsland = new Book("Необитаемый остров", verne, 1874);
            Book cleanCod = new Book("Чистый код", martin, 2013);

            mAM.setPublishingYear(1960);

            System.out.println(mAM.getBookName() + " " + mAM.getFullName() + " " + mAM.getPublishingYear());
            System.out.println(desertIsland.getBookName() + " " + desertIsland.getFullName() + " " + desertIsland.getPublishingYear());
            System.out.println(cleanCod.getBookName() + " " + cleanCod.getFullName() + " " + cleanCod.getPublishingYear());

            }
}

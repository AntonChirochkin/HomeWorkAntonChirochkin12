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

            System.out.println(mAM);
            System.out.println(desertIsland);
            System.out.println(cleanCod);

            System.out.println(mAM.equals(desertIsland));
            System.out.println(desertIsland.equals(cleanCod));

            System.out.println(mAM.hashCode());
            System.out.println(desertIsland.hashCode());
            System.out.println(cleanCod.hashCode());
            }
}

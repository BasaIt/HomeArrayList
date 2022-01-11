import java.util.ArrayList;

public class HomeWorkArrayList {

    public static void main(String[] args) {
        /**
         * Задание создать 3 Коллекции.
         * В первой Имя.
         * В второй номер.
         * В третей обьяденить имя и номер и вывести их через дефиз.
         */
        ArrayList<Integer> mNumer = new ArrayList<>();
        ArrayList<String> mName = new ArrayList<>();
        ArrayList<String> mNumerAndName = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            mNumer.add(i);
        }
        mName.add("Артур");
        mName.add("Мария");
        mName.add("Павел");
        mName.add("Александр");
        mName.add("Ольга");
        mName.add("Михаил");
        mName.add("Инакентий");
        mName.add("Тихон");
        mName.add("Ян");
        mName.add("Игорь");
        for (int i = 0; i < mNumer.size(); i++) {
            String mNaN = mNumer.get(i) + " - " + mName.get(i);
            mNumerAndName.add(mNaN);
        }
        for (String FullAnswer : mNumerAndName){
            System.out.println(FullAnswer);
        }
    }
}

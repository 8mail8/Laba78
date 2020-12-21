package laba78;
import java.util.ArrayList;
import java.io.*;
public class Laba78 {
    public static void main(String[] args) {
        ArrayList<String> CLOTHES = new ArrayList<String>();
        String[] clothes = new String[7];
        CLOTHES.add("Водолазка");
        CLOTHES.add("Брюки");
        CLOTHES.add("Пуховик");
        CLOTHES.add("Шапка");
        CLOTHES.add(1,"Свитер");
        CLOTHES.add("Джинсы");
        System.out.println(CLOTHES.get(1));
        CLOTHES.remove("Джинсы");
        for(int i = 0;i<CLOTHES.size();i++)System.out.println(CLOTHES.get(i));
        System.out.println("////////////////////////");
        Object[] clothess = CLOTHES.toArray();
        for(Object count : clothess){

            System.out.println(count);
        }
        System.out.println("////////////////////////");
        try{
            FileWriter writer = new FileWriter("C:\\Users\\И\\IdeaProjects\\laba78\\src\\laba78.txt", true);

            // запись всей строки
            writer.append("\n");
            writer.append("Подарки к новому году:");
            String text = "маме, папе, брату, друзьям";
            writer.write(text);
            // запись по символам
            writer.append('.');
            writer.append('\n');
            writer.append("Список закончен.");
            writer.append("\n");
            writer.write("девушке");




            writer.flush();
            FileReader reader = new FileReader("C:\\Users\\И\\IdeaProjects\\laba78\\src\\laba78.txt");
            System.out.println("////////////////////////");
            // читаем по символьно
            int c;
            while((c=reader.read())!=-1){

                //System.out.print(" c= "+c);// Если добавить данну строчку мы увидим Unicode символов
                System.out.print((char)c);

            }

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());


        }

    }
}
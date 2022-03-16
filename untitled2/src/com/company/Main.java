package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{

        Scanner in = new Scanner(System.in);

        System.out.println("Введите выражение");
        String aaa = in.nextLine();

        Strokaa obj = new Strokaa(aaa);
        int cl = obj.razbienie();

        int[] aa = new int[2];

        if (cl == 3)
            obj.proverka();
    }

}

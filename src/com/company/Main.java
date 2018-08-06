package com.company;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    static void printMenu()
    {
        System.out.println();
        System.out.println("Меню: ");
        System.out.println("1 - количество символов в строке");
        System.out.println("2 - подсчет вхождений символа в строку");
        System.out.println("3 - позиция первого вхождения символа в строку");
        System.out.println("4 - количество вхождений подстроки в строку");
        System.out.println("5 - позиция первого вхождения подстроки в строку");
        System.out.println("6 - количество слов в строке");
        System.out.println("7 - разбиение строки на слова");
        System.out.println("8 - печать строки");
        System.out.println("0 - выход");
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int k;
        int p;
        char c1;
        System.out.println("Введите строку");
        MyStringClass string = new MyStringClass(scanner.nextLine().toCharArray());
        System.out.println("Строка создана");
        do
        {
            printMenu();
            k = scanner.nextInt();

            switch (k)
            {
                case 1:
                    int c = string.lenStr();
                    System.out.print("Количество символов: ");
                    System.out.println(c);
                    break;

                case 2:
                    System.out.println("Введите символ");
                    c1 = scanner.next().toCharArray()[0];
                    System.out.print("Количество вхождений: ");
                    System.out.println(string.countChar(c1));
                    break;

                case 3:
                    System.out.println("Введите символ");
                    c1 = scanner.next().toCharArray()[0];
                    p = string.charPos(c1);
                    if (p!= -1)
                        {System.out.println("Позиция первого вхождения символа: "+p);}
                    else {
                        System.out.println("Символ не найден");}
                    break;

                case 4:
                    System.out.println("Введите подстроку");
                    MyStringClass s = new MyStringClass(scanner.next().toCharArray());
                    System.out.println("Количество вхождений: "+string.countStr(s));
                    break;

                case 5:
                    System.out.println("Введите подстроку");
                    MyStringClass s1 = new MyStringClass(scanner.next().toCharArray());
                    p = string.posStr(s1);
                    if (p!= -1)
                    {System.out.println("Позиция первого вхождения строки: "+p);}
                    else {
                        System.out.println("Строка не найдена");}
                    break;

                case 6:
                    System.out.println("Количество слов: "+ string.countWords());
                    break;

                case 7:
                    MyStringClass[] mas;
                    mas = string.wordMas();
                    for (MyStringClass m:mas){
                        m.print();
                        System.out.println();
                    }
                    break;

                case 8:
                    string.print();
                    break;

                case 0:
                    System.out.println("Вы вышли");
                    break;

                default:
                    printMenu();
            }

        } while (k != 0);

    }
}


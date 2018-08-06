package com.company;

public class MyStringClass {
    char[] str;

    MyStringClass(char[] s){

        str = s;
    }

    public void print(){
        for(char c:str){
            System.out.print(c);
        }
    }
    //количество символов в строке
    public int lenStr(){
        return (str.length);
    }

    //подсчет вхождений символа в строку
    public int countChar(char c){
        int count = 0;
        for(char c1:str){
            if (c1==c) count++;
        }
        return count;
    }

    //позиция первого вхождения символа
    public int charPos(char c){
        for(int i=0;i<lenStr(); i++){
            if (str[i]==c) {
                return (++i);
            }
        }
        return (-1);
    }

    //количество вхождений подстроки
    public int countStr(MyStringClass s) {
        int count = 0;
        int len = lenStr();
        int sublen = s.lenStr();
        int i = 0;
        int j;
        boolean flag;
        while (i < len) {
            j = 0;
            if (str[i] == s.str[j]) {
                flag = true;
                int k=i;
                while (flag) {
                    if (j+1 == sublen){
                        count++;
                    }
                    k++;
                    j++;
                    if (j>=sublen || k >= len || str[k] != s.str[j]){
                        flag = false;
                    }
                }
            }
            i++;
        }
        return count;
    }

    public int countWords(){
        int len = lenStr();
        int count = 0;
        int i = 0;
        while (i<len){
            while (i<len && str[i]== ' '){
                i++;
            }
            if (i<len-1) count++;
            while (i<len && str[i]!= ' '){
                i++;
            }
        }
        return count;
    }

    //первое вхождение подстроки в строку
    public int posStr(MyStringClass s) {
        int len = lenStr();
        int sublen = s.lenStr();
        int i = 0;
        int j;
        boolean flag;
        while (i < len) {
            j = 0;
            if (str[i] == s.str[j]) {
                flag = true;
                int k=i;
                while (flag) {
                    if (flag && j+1 == sublen){
                        return i;
                    }
                    k++;
                    j++;
                    if (j>=sublen || k >= len || str[k] != s.str[j]){
                        flag = false;
                    }
                }
            }
            i++;
        }
        return -1;
    }

    //разбиение строки на слова
    public MyStringClass[] wordMas(){
        MyStringClass[] res = new MyStringClass[countWords()];
        int k = 0;
        int j = 0;
        int i;
        int pos;
        int length;
        int len = this.lenStr();
        while (j < len) {
            while (j < len && this.str[j] == ' ') j++;
            i = 0;
            pos = j;
            length = 0;
            while (j < len && this.str[j] != ' ') {
                length++;
                j++;
            }
            j=pos;
            if(length>0) {char[] wrd = new char[length];
            while (j < len && i<length){
                wrd[i] = this.str[j];
                i++;
                j++;
            }
            MyStringClass s = new MyStringClass(wrd);
            res[k]=s;
            k++;}
        }
        return res;
    }
}
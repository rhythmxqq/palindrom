package com.company;

public class Main {

    public static void main(String[] args) {
        String slovo = "d e d" ;
        String zxc = slovo.toLowerCase(); // для пущей проверки, чтобы не мораться с учетом регистра
        String qq = zxc.replaceAll(" ","" ); //пихаем в общую переменную
        String qq_1 = qq.replaceAll("\\p{Punct}", "")  ; //удаляем пробельчики тупа
        StringBuilder prov_1 = new StringBuilder(qq_1) ;//присваеваем для проверки
        StringBuilder prov_2 = new StringBuilder(qq_1) ;//присваеваем для проверки
        prov_2 = prov_2.reverse() ; //переварачиваем 
        System.out.print(prov_1);
        System.out.print(" = ");
        System.out.print(prov_2 + " ?");
        System.out.println("\n" + (new String(prov_1)).equals(new String(prov_2))); //сравниваем
        // very hard lab
    }
}

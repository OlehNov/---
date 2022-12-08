package Constructions;

import java.util.Arrays;

public class TaskStep_10 {
    public static void main(String[] args) {
        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines={
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles,textLines));
    }

    public static String printTextPerRole(String[] roles, String[] textLines){
        for (int i = 0; i < roles.length; i++){
            System.out.println();
            System.out.println(roles[i] + ":");
            int k = 0;
            while (k<textLines.length){
                if(textLines[k].startsWith(roles[i])){
                    System.out.println((k+1 + ")") + textLines[k].substring(roles[i].length()+1));
                }
                k++;
            }
        }
        return "";
    }
}

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        for (Month m: Month.values()){
            System.out.println(m+" "+m.getCountDays());
        }
    }
}


   /* public static void main(String[] args) {
        switch (getSeason()) {
            case WINTER:
                System.out.println("take a jacket");
                break;
            case SPRING:
                System.out.println("take a t-shirt");
                break;
            case SUMMER:
                System.out.println("take anything");
                break;
            case AUTUMN:
                System.out.println("take good feels");
                break;
            default:
                System.out.println("do some wot you want");
                break;
        }
    }

    public static Seasons getSeason() {
        LocalDateTime now = LocalDateTime.now();
        int m = now.getMonthValue();
        switch (m) {
            case 1:
            case 2:
            case 12:
                return Seasons.WINTER;
            case 3:
            case 4:
            case 5:
                return Seasons.SPRING;
            case 6:
            case 7:
            case 8:
                return Seasons.SUMMER;
            case 9:
            case 10:
            case 11:
                return Seasons.AUTUMN;
            *//*default:
                System.out.println("not found");*//*
        }
//        return "";


}*/

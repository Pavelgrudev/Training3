import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String x444 = "10 20 30 40 50";{
            Scanner boom = new Scanner(x444);
            int a = boom.nextInt();
            int b = boom.nextInt();
            int c = boom.nextInt();
            int d = boom.nextInt();
            int e = boom.nextInt();
            System.out.println(a - b - c + d + e);
            //  System.out.println(name+age);
            String m = "Пошли вы все на хуй!!!";
            System.out.println(m.toUpperCase());
            System.out.println("=============================");
            String x1 = m.substring(13, 21).toUpperCase();
            System.out.println(x1);
            String s1 = "do".toUpperCase();
            String s2 = "re";
            String s3 = "mi";
            System.out.println(s1 + s2 + s3);
            String s4 = "321";
            String s5 = "2222";
            int number = Integer.parseInt(s4 + 0);
            int number1 = Integer.parseInt(s5 + 10);
            System.out.println(number);
            System.out.println(number1);
            int number2 = Integer.parseInt(s4) + Integer.parseInt(s5);
            System.out.println("s4+s5= " + number2);
            int number4 = number + number1 + number2;
            System.out.println(number4);
            int x = 2;
            int y = 4;
            int z = 0;
            String digits = x + y + "" + z;
            System.out.println(digits);
            String bigAmount = "500";
            String greatAmount = "100000";
            int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount); //напишите тут ваш код
            System.out.println(hugeAmount);
            String emptyString = "   ";
            System.out.println(emptyString.length());
            System.out.println("Gomu Gomu no Bazooka!".length());
            System.out.println((emptyString + 2 + 2 + "22").length());
            String title = "Senior Lead Principal Software Engineer Data Architect";
            String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
            String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";
            //напишите тут ваш код
            //  String title toLowerCase=(title,degree,career)
            System.out.println("RESUME".toLowerCase());
            System.out.println("TITLE: ".toLowerCase() + title.toLowerCase());
            System.out.println("DEGREE: ".toLowerCase() + degree.toLowerCase());
            System.out.println("CAREER: ".toLowerCase() + career.toLowerCase());
            System.out.println("===============================================================");
            String caps = "if I type in caps ";
            String usa = "сша";
            //напишите тут ваш код
            System.out.println(usa.toUpperCase());
            System.out.println("Винни Пух".toUpperCase());
            System.out.println(caps.toUpperCase() + "they know I mean business".toUpperCase());
            int a1 = 546;
            int a2 = a % 10;
            System.out.println(a1);
            int six = 6;
            six++;
            six++;
            six++;
            System.out.println(six);
            System.out.println("=================================");{
                String rome = "Rome2ааааааааааааааааааааааааааааааааааааааааааааааааааааааа";
                int coun = rome.length();
                System.out.println("В переменной rome кол-во символов = " + coun);}
            String rome = "Rome";
            int coun = rome.length();
            System.out.println("В переменной rome кол-во символов = " + coun);
            String str = "10 20 40 60";
            Scanner scanner = new Scanner(str);
            int ac = scanner.nextInt();
            int bb = scanner.nextInt();
            int zz = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(ac + bb - zz + n);
            int xx = 999;
            int yy = xx++;
            System.out.println(yy);
        }
        System.out.println("===============================================================");
        //private static final String TRIANGLE_EXISTS = "треугольник существует";
        // private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

        int x1 = 2, x2 = 3, x3 = 8;
        boolean aaa = x1 >= x2 + x3;
        boolean bbb = x2 >= x1 + x3;
        boolean ccc = x3 >= x1 + x2;
        if (aaa && bbb && ccc) {
            System.out.println("TRIANGLE_NOT_EXISTS");
        } else {
            System.out.println("TRIANGLE_EXISTS");
        }
        int x4=555;
        if (x4 < 20||x4 > 60) {
            System.out.println("можно не работать");
        }
        int a = 2;
        int b = 3;
        int min = a < b ?  a : b;
        System.out.println(min);
        System.out.println("==========================================================");
        int numberA=5;
        int numberB=4;
        int max=numberA > numberB?numberA:numberB;
        System.out.println(max);
        System.out.println("=========================================================");
int number =5;
        String result = "число равно 5";;
        if (number < 5)
            result = "число меньше 5";
        if (number > 5)
            result = "число больше 5";
        System.out.println(result);
        double a0=99.000005;
        double b0=99.000003;
        System.out.println( Math.abs(a0 - b0) < 0.000001 ? "числа равны" : "числа не равны");
        System.out.println("=========================================================");
        String string1 = "Амиго";
        String string2 = string1;
        String string3 = new String(string1);

            String same = "ссылки на строки одинаковые";
            String different = "ссылки на строки разные";
            String result1 = string1 == string2 ? same : different;
            String result2 = string2 == string3 ? same : different;
            String result3 = string1 == string3 ? same : different;
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);


            String secret = "AmIGo";
            String sc = "amigo";
            secret.equalsIgnoreCase(sc);
        System.out.println(sc);
            System.out.println(sc.equalsIgnoreCase(secret) ? "доступ разрешен" : "доступ запрещен");


        }




    }














     //   System.out.println("===============================================================");
    //    String s = "llццдддuдццll";
     ///   System.out.println(isPalindrome(s) ? "Это палиндром" : "это не Палиндром");
   // private static boolean isPalindrome(String s)
      //  if(s.length() == 1 || s.length() == 0) {
      //      return true;}
      //  if(s.charAt(0) == s.charAt(s.length() - 1)) {
        //    return  isPalindrome(s.substring(1,s.length()-1));}
     //   return  false;























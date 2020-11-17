import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("""
                Владимир Павлюков.
                Практические работы:
                9. Зоопарк.
                10. Коробки.
                11. Файлы и каталоги.
                Введите номер работы для запуска или 0 для ыхода из программы без запуска упражнений.
                >""");
        Scanner cin = new Scanner(System.in);
        int iN,iMinN = 9,iMaxN = 11;
        while(true){
            try{
                iN = cin.nextInt();
            }catch(java.util.InputMismatchException e){
                cin.next(); // считывает все символы, чтобы не зациклится
                iN = -1;
            }
            if (iN == 0){
                cin.close();
                return;
            }
            if((iN>=iMinN)&&(iN<=iMaxN))break;
            System.out.print("""
        Введено некорректное значение!
        Повторите ввод.
        Введите номер работы для запуска или 0 для выхода из программы.
        >""");
        }
        cin.close();
        switch (iN) {
            case 9 -> works.zoo_9.Main.main();
            case 10 -> works.box_10.Main.main();
            case 11 -> works.files_11.Main.main();
            default -> System.out.println("Что-то упустил, проверь код!");
        }
    }
}

import java.util.Scanner; 

class Pass {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите первое вещественное число:  ");
    double value1 = scanner.nextDouble();
    System.out.println("Введите второе вещественное число:  ");
    double value2 = scanner.nextDouble();
    System.out.println("Какую  операцию хотите выполнить?  ");
    System.out.println("1 - сравнить два числа?  ");
    System.out.println("2 - округлить оба числа?  ");
    System.out.println("3 - отбросить дробную часть?  ");
    System.out.println("4 - сложить два числа?  ");
    int choice = scanner.nextInt();
    
    // В зависимости от выбора пользователя проведём одну из операций
    switch (choice) {
      case 1:
           // Код в этом блоке сработает, только если переменная choice = 1;
           // Проведём сравнение двух чисел путём вычитание по модулю одного из другого и сравнением разницы с заведомо малой величиной 
           if (Math.abs(value1 - value2) < 0.00000001) {
               System.out.println("Числа равны");
           } else {
               System.out.println("Числа не равны");  
           }
           break;
      case 2:
           // Код в этом блоке сработает, только если переменная choice = 2;
           // Округлим оба числа с помощью метода Math.round()
           System.out.println("Первое округлённое число = " + Math.round(value1));
           System.out.println("Второе округлённое число = " + Math.round(value2));
           break;
      case 3:
           // Код в этом блоке сработает, только если переменная choice = 3;
           // Отбросим дробную часть путём приведения чисел к типу long
           long valueLong1 = (long) value1;
           long valueLong2 = (long) value2;
           System.out.println("Первое число без дробной части = " + valueLong1);
           System.out.println("Второе число без дробной части = " + valueLong2);
           break;
<<<<<<< HEAD
        case 4:
           // Код в этом блоке сработает, только если переменная choice = 3;
           // Отбросим дробную часть путём приведения чисел к типу long
           long valueLong1 = (long) value1;
           long valueLong2 = (long) value2;
           System.out.println("Первое число без дробной части = " + valueLong1);
           System.out.println("Второе число без дробной части = " + valueLong2);
           break;
=======
>>>>>>> double/pass
      default:
           // Код в этом блоке сработает, если пользователь ввёл неправильное число
           System.out.println("Вы ввели неправильное число, попробуйте ещё раз");     

    }

    scanner.close();
     

  }
}

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float indexMass = service.calculate(83, 1.79F);
        System.out.println("Индекс массы тела = " + (int) Math.round(indexMass));//Выводим округленное значение для ИМТ
    }
}

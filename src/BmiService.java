public class BmiService {
    public float calculate(int weight, float height) {
        float massSquared = height * height; //находим квадрат роста
        float bodyMassIndex = weight / massSquared; //формула определения ИМТ
        return bodyMassIndex;
    }
}

public class MainClass {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Snake snake = new Snake();

        Animal_Simulator animal_simulator = new Animal_Simulator();

        animal_simulator.make_noise(snake);
        animal_simulator.make_noise(dog);
        animal_simulator.make_noise(cat);
    }
}

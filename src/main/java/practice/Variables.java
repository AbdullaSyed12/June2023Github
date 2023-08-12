package practice;

public class Variables {

    int salary = 1000;

    public void intVariables () {
        System.out.println("My salary is: " + salary);
    }

    public void adamSalary () {
        System.out.println("Adam's salary is: " + salary);
    }

    public void floatVariables() {
        float price = 45.6f;
        System.out.println("Product price is: " + price);
    }

    public void booleanVariables() {
        boolean red = true;
        boolean green = false;
        System.out.println("Red light is: " + red + "Green light is: " + green);
    }

    public void characterVariables() {
        char alphabet = 'A';
        System.out.println("Alphabet is: " + alphabet);
    }

    public void stringVariables() {
        String name = "Robin";
        String city = "Philadelphia";
        System.out.println("My name is: " + name + " I live in: " + city);
    }

    public int addNumbers (int a, int b) {
        int sum = a + b;
        return sum;
    }
}

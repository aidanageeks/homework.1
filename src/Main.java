public class Main {
    public static void main(String[] args) {
        Address addressA = new Address("City A", "Street A");
        Address addressB = new Address("City B", "Street B");

        SubClass objectA = new SubClass("Object A", 25, addressA);
        FinalClass objectB = new FinalClass("Object B", 30, addressB, Gender.MALE);
        FinalClass objectC = new FinalClass("Object C", 28, addressA, Gender.FEMALE);

        // Вывод свойств объектов
        System.out.println("Object A:");
        objectA.printInfo();
        System.out.println();

        System.out.println("Object B:");
        objectB.printInfo();
        System.out.println();

        System.out.println("Object C:");
        objectC.printInfo();
        System.out.println();

        // Вызов перегруженных методов
        System.out.println("Calling overloaded method in Object A:");
        objectA.printInfo("Some additional information");
        System.out.println();

        System.out.println("Calling overloaded method in Object B:");
        objectB.printInfo("Additional data");
        System.out.println();

        System.out.println("Calling non-overridable method in Object A:");
        objectA.doSomething();
    }
}
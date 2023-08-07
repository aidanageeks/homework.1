 class SubClass extends BaseClass{
     private int age;
     private Address address;

     public SubClass(String name, int age, Address address) {
         super(name);
         this.age = age;
         this.address = address;
     }

     public int getAge() {
         return age;
     }

     public Address getAddress() {
         return address;
     }

     // Перегруженные методы
     public void printInfo() {
         System.out.println("Name: " + getName());
         System.out.println("Age: " + age);
         System.out.println("Address: " + address.getCity() + ", " + address.getStreet());
     }

     public void printInfo(String additionalInfo) {
         System.out.println("Name: " + getName());
         System.out.println("Age: " + age);
         System.out.println("Address: " + address.getCity() + ", " + address.getStreet());
         System.out.println("Additional Info: " + additionalInfo);
     }

     // Неперезаписываемый метод
     final void doSomething() {
         System.out.println("Doing something in SubClass");
     }
}

final class FinalClass extends SubClass{
    private Gender gender;

    public FinalClass(String name, int age, Address address, Gender gender) {
        super(name, age, address);
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    // Перезаписанный метод родителя
    @Override
    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress().getCity() + ", " + getAddress().getStreet());
        System.out.println("Gender: " + gender);
    }
}

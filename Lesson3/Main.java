package Lesson3;

public class Main {
    public static void main(String[] args) {
        Person a = new Person();
        a.newRecord("Иванов Алексей", "8-927-111-11-11 ivanov@mail.com");
        a.newRecord("Петров", "8-927-222-22-22 petrov@mail.com");
        a.newRecord("Сидоров", "8-927-333-33-33 sidorov@mail.com");
        a.newRecord("Александров","8-927-444-44-44 aleksandrov@mail.com");
        a.newRecord("Иванов Иван", "8-927-123-45-67 ivanov@mail.com");
        a.printBook();
        
        a.findPhone();
        a.findEmail();
        a.findPhone();
        a.findEmail();
    }


}

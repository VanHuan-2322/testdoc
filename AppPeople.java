public class AppPeople {
    public static void main(String[] args) {
        People people= new People();
        System.out.println(people.toString());
        People people1= new People("ABC",33,true,99,44);
        System.out.println(people1.toString());
        Teacher teacher= new Teacher();
        System.out.println(teacher.toString());
        Teacher teacher1= new Teacher("YTB",22,false,170,66,"TS","Yes","CNTT");
        System.out.println(teacher1.toString());
    }

}

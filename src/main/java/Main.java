public class Main {

    public static void main(String[] args){
        Employee[]persArrey=new Employee[5];
        persArrey[0]=new Employee("Ivanov Ivan Ivanovich","Driver","ivanov@mail.ru",891010100,30000,30);
        persArrey[1]=new Employee("Petrov Petr Petrovich","Programmer","petrov@mail.ru",892134567,35000,31);
        persArrey[2]=new Employee("Sidorov Pavel Vladimirovich","Mechanic","sidorov@mail.ru",891113579,32000,40);
        persArrey[3]=new Employee("Malkin Andreyi Viktorovich","Electrician","malkin@mail.ru",892264238,40000,39);
        persArrey[4]=new Employee("Koshkin Konstantin Petrovich","Loader","koshkin@mail.ru",891246579,50000,45);

        //проверка на возраст

        for(int i=0;i<persArrey.length;i++){
            if (persArrey[i].age>=40){
                //вывод на печать
                persArrey[i].show();
            }
        }

    }
}

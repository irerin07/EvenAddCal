public class EvenAddCal {
    public static void main(String[] args){
        Cal c1 = new Cal();

        for(int i = 1; i<=100; i++){
            if( i % 2 == 0){
                c1.plus(i);
            }
        }
        c1.print();
    }
}

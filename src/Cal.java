public class Cal {
    private int value;

    public void plus(int value){
        this.value = this.value + value;
    }
    public void minus(int value){
        this.value = this.value - value;
    }
    public void clear(){
        this.value = 0;
    }
    public void print(){
        System.out.println(value);
    }
}

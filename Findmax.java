package Assignment13;

public class Findmax<T extends Comparable<T>> {
    private T a;
    private T b;
    private T c;

    public Findmax(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public <Number extends Comparable> Number maxFind(Number x,Number y ,Number z){
        Number max1 = x;
        if(y.compareTo(max1) > 0){
            max1 = y;
        } if(z.compareTo(max1) > 0){
            max1 =z;
        }
        return max1;
    }

    public T testMaximum(){
        T max = a;
        if(a.compareTo(max) > 0){
            max = b;
        } if (c.compareTo(max) > 0){
            max =c;
        }
        return max;
    }

    public static void main(String[] args) {
        Findmax<Integer> maximum = new Findmax<>(1,1,1);
        System.out.println(maximum.maxFind(22,4,5));


        Findmax<Integer> maxInt = new Findmax<>(10,20,30);
        Integer max1 = maxInt.testMaximum();
        System.out.println(max1);

        Findmax<Float> maxFloat = new Findmax<>(65f,11f,43f);
        Float max2 = maxFloat.testMaximum();
        System.out.println(max2);

        Findmax<String> maxString = new Findmax<>("Apple", "Peach", "Banana");
        String max3 = maxString.testMaximum();
        System.out.println(max3);
    }
}
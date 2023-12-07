package Assignment13;

public class Findmax<T extends Comparable<T>> {
    private T a;
    private T b;
    private T c;

    public <Number extends Comparable> Number maxFind(Number x,Number y ,Number z){
        Number max1 = x;
        if(y.compareTo(max1) > 0){
            max1 = y;
        } if (z.compareTo(max1) > 0){
            max1 =z;
        }
        return max1;
    }

    public T findMax(T a,T b ,T c){
        T max = a;
        if(a.compareTo(max) > 0){
            max = b;
        } if (c.compareTo(max) > 0){
            max =c;
        }
        return max;
    }



    public static void main(String[] args) {
        System.out.println("Welcome to maximum finding program using generics.");

        Findmax<Integer> maximum = new Findmax<>();
        System.out.println(maximum.maxFind(22,4,5));

        Findmax<Integer> maxInt = new Findmax<>();
        Integer max1 = maxInt.findMax(2,6,8);
        System.out.println(max1);

        Findmax<Float> maxFloat = new Findmax<>();
        Float max2 = maxFloat.findMax(65f,11f,43f);
        System.out.println(max2);

        Findmax<String> maxString = new Findmax<>();
        String max3 = maxString.findMax("Apple", "Peach", "Banana");
        System.out.println(max3);

    }
}
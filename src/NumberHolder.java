public class NumberHolder {
    public int anInt;
    public float aFloat;

    public static void main(String[] args) {
        NumberHolder nh = new NumberHolder();
        nh.aFloat = 3.14f;
        System.out.println(nh.aFloat);
        nh.aFloat= (float)3.14;
        nh.anInt = 3;
        System.out.println(nh.anInt);
    }
}

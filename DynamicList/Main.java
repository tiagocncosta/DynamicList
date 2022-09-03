package DynamicList;

public class Main {
    public static void main(String[] args) {


        DynamicList dynamicList = new DynamicList();
        Object o = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        dynamicList.add(o);
        dynamicList.add(o2);
        dynamicList.add(o3);
        System.out.println(dynamicList.getO(o3));
    }
}

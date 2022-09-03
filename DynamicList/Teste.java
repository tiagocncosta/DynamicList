package DynamicList;

public class Teste {
    public static void main(String[] args) {
       addOneAndExpectNumberOfElementsEqualToOne();
        addTwoAndExpectNumberOfElementsEqualToTwo();
        tryToAddObjectAtIndexOutOfBoundsAndExpectError();
        addObjectAndExpectReturnOfSameObject();
        addNullObjectAndHopeItReturnFalse();
        removeElementAndExpectNull();
    }

    public static void addOneAndExpectNumberOfElementsEqualToOne(){
        DynamicList dynamicList = new DynamicList();
        Object o = new Object();
        dynamicList.add(o);

        if(dynamicList.getNumberOfElements() != 1){
            throw new RuntimeException("Number of elements must be one, not " + dynamicList.getNumberOfElements());
        }

    }

    public static void addTwoAndExpectNumberOfElementsEqualToTwo() {
        DynamicList dynamicList = new DynamicList();
        Object o = new Object();
        Object o2 = new Object();
        dynamicList.add(o);
        dynamicList.add(o2);

        if( dynamicList.getNumberOfElements() != 2){
            throw new RuntimeException("Number of elements must be two, not " + dynamicList.getNumberOfElements());
        }

    }

    public static void tryToAddObjectAtIndexOutOfBoundsAndExpectError(){
        DynamicList dynamicList = new DynamicList();
        Object o = new Object();
        try {
            dynamicList.addAtIndex(0, 3);
        } catch(ArrayIndexOutOfBoundsException e){
           System.out.println("You can't be adding objects out of bounds, " +
                   "choose index 3 but the capacity is " + dynamicList.size());
       }
    }

    public static void addObjectAndExpectReturnOfSameObject(){
    DynamicList dynamicList = new DynamicList();
    Object o = new Object();
    dynamicList.add(o);
    if (dynamicList.getObjectFromIndex(0) != o){
        throw new RuntimeException("The object must be the same to the position it was added.");

    }
    }

    public static void addNullObjectAndHopeItReturnFalse(){
        DynamicList dynamicList = new DynamicList();
        if (dynamicList.add(null)){
            throw new RuntimeException("You can't add nulls");
        }

    }

    public static void removeElementAndExpectNull(){
        DynamicList dynamicList = new DynamicList();
        Object o = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        dynamicList.add(o);
        dynamicList.add(o2);
        dynamicList.add(o3);
        try {
            dynamicList.pop(2);
            dynamicList.getObjectFromIndex(2);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This position is null");;
        }

    }

}


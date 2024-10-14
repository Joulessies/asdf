import java.util.ArrayList;

class Main {

    public static void addingElementsToArray(ArrayList<Integer> arr) {
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
    }

    public static void arrayListMethod(ArrayList<Integer> arr) {
        System.out.println("ArrayList for looped: ");
        addingElementsToArray(arr);
        printingArrayList(arr);
    }

    public static void myArray(ArrayList<Integer> arr) {
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }
    }

    public static void printingArrayList(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public static void addingElementsToMyArray(ArrayList<Integer> arr) {
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
    }

    public static void printingMyArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("My array for looped: ");
        myArray(arr);
        printingArrayList(arr);
        System.out.println("My array for looped after adding elements: ");
        addingElementsToMyArray(arr);
        printingArrayList(arr);
    }

    public static void bubbleSortElements(ArrayList<Integer> arrayList) {
        System.out.println("Bubble sort: ");
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = 0; j < arrayList.size() - 1 - i; j++) {
                if (arrayList.get(j) > arrayList.get(j + 1)) {
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
        printingArrayList(arrayList);
    }

    public static void selectionSortElements(ArrayList<Integer> arrayList) {
        System.out.println("Selection sort: ");

        for (int i = 0; i < arrayList.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(j) < arrayList.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(minIndex));
            arrayList.set(minIndex, temp);
        }
        printingArrayList(arrayList);
    }

    public static void insertionSortElements(ArrayList<Integer> arrayList) {
        System.out.println("Insertion sort: ");
        for (int i = 1; i < arrayList.size(); i++) {
            int key = arrayList.get(i);
            int j = i - 1;
            while (j >= 0 && arrayList.get(j) > key) {
                arrayList.set(j + 1, arrayList.get(j));
                j = j - 1;
            }
            arrayList.set(j + 1, key);
        }
        printingArrayList(arrayList);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        myArray(arr2);
        arrayListMethod(arr);

        System.out.println("Original arr: ");
        printingArrayList(arr);

        bubbleSortElements(arr);

        System.out.println("Original arr2: ");
        printingArrayList(arr2);

        selectionSortElements(arr2);
        insertionSortElements(arr2);

    }
}

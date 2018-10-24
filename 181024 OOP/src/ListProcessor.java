import java.util.List;

public class ListProcessor {
    private int majorItem;
    public ListProcessor(int majorItem){
        this.majorItem = majorItem;
    }

    //Параметризация метода, но не класса
    public <T> T getMajorValue(List<T> list){
        return list.get(majorItem);
    }

    public <T extends Comparable<T>> int compare(List<T> list, T value){
        return list.get(majorItem).compareTo(value);
    }
}

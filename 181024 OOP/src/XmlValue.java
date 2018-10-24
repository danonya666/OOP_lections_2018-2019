
// 1. Genegics(дженерики) - обобщения, шаблоны, по аналогии с шаблонами из С++
//Расширяемость, гибкость, безопасность

public class XmlValue<T>{
    private T value;
    public XmlValue(T value, Class<T> clazz){
        this.value = value;
        this.clazz = clazz; //для того, чтобы был виден тип класса внутри XmlValue
    }

    public String toString(){
        return "<" + value.getClass().getSimpleName() + ">" + value + "/<" + value.getClass().getSimpleName() + ">";
    }

    // Внутри класса нам не видно, что за T мы используем. T t = new T(); не работает

    private Class<T> clazz; // объект типа класс

}


/**
 * Java 11 以下：javah -jni -o hellojni.h HelloJNI
 * Java 11 以上：javac -h . HelloJNI.java
 */
public class HelloJNI {

    /**
     * 定义本地方法，Unsafe类有大量类似方法声明
     *
     * @param name 打招呼的对象
     */
    public native void sayHello(String name);

}

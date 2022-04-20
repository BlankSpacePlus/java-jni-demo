public class Main {

    public static void main(String[] args) {
        System.load("D:\\IDEA\\java-jni-demo\\src\\libhellojni.dll");
        new HelloJNI().sayHello("BlankSpace");
    }

}

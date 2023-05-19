package demo.annotation;

/**
 * 证明注解对代码没有侵入性
 */
public class AnnotationDemo {
    public static void main(String[] args) {
        ImoocCourse imoocCourse = new ImoocCourse();
        imoocCourse.getCourseInfo();
        System.out.println("finish");
    }
}

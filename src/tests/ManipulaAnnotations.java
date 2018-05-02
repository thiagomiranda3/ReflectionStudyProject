package tests;

import annotations.PrimeiraAnnotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import models.Pessoa;

/**
 *
 * @author wwthi
 */
public class ManipulaAnnotations {
    public static void main(String[] args) throws NoSuchFieldException {
        Pessoa p = new Pessoa();
        Class classPessoa = p.getClass();
        Field field = classPessoa.getDeclaredField("idade");
        PrimeiraAnnotation annotation = field.getAnnotation(PrimeiraAnnotation.class);
        System.out.println(annotation.exemplo());
        
        Method[] methods = classPessoa.getDeclaredMethods();
        for(Method method : methods) {
            if(method.isAnnotationPresent(PrimeiraAnnotation.class)) {
                annotation = method.getAnnotation(PrimeiraAnnotation.class);
                System.out.println(annotation.exemplo());
            }
        }
    }
}

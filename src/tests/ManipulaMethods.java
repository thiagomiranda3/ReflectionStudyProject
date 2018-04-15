package tests;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 *
 * @author wwthi
 */
public class ManipulaMethods {
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class classLoja = Class.forName("models.Loja");
        Method[] methods = classLoja.getDeclaredMethods();
        
        Object objLoja = classLoja.newInstance();
        
        for(Method method : methods) {
            // Se o método for privado, torna ele público
            if(Modifier.isPrivate(method.getModifiers()))
                method.setAccessible(true);
            
            // Define valores para objLoja pela API Reflection
            if(method.getName().equals("setNome"))
                method.invoke(objLoja, new Object[] {"Posto Estrela"});
            
            if(method.getName().equals("setCnpj"))
                method.invoke(objLoja, new Object[] {12345678987L});
            
            if(method.getName().equals("setTipo"))
                method.invoke(objLoja, new Object[] {"Posto de Combustível"});
            
            if(method.getName().equals("setMatriz"))
                method.invoke(objLoja, new Object[] {true});
        }
        
        for(Method method : methods) {
            if(method.getName().contains("get") || method.getName().contains("is"))
               System.out.println(method.getName() + ": " + method.invoke(objLoja));
        }
    }
}

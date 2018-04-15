package tests;

import models.Pessoa;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 *
 * @author wwthi
 */
public class ImpressaoAtributosDaClasse {

    public static void main(String[] args) {
        Class classPessoa = Pessoa.class;
        
        System.out.println("Imprimindo os atributos e métodos da classe: " + classPessoa.getSimpleName());
        
        for(Field field : classPessoa.getDeclaredFields()) {
            System.out.println("Nome do atributo: " + field.getName());
            System.out.println("Com os modificadores: " + Modifier.toString(field.getModifiers()));
            System.out.println();
        }
        
        for(Method method : classPessoa.getDeclaredMethods()) {
            System.out.println("Nome do atributo: " + method.getName());
            System.out.println("Com os modificadores: " + Modifier.toString(method.getModifiers()));
            System.out.println();
        }
    }    
}

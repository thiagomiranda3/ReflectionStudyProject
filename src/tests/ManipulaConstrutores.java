package tests;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import models.Cliente;
import models.Pessoa;

/**
 *
 * @author wwthi
 */
public class ManipulaConstrutores {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class classPessoa = Pessoa.class;
        Constructor[] construtors = classPessoa.getDeclaredConstructors();

        Constructor constructor = classPessoa.getDeclaredConstructor(new Class[]{String.class});

        // Faz com que o construtor privado se torne público
        if (Modifier.isPrivate(constructor.getModifiers()))
            constructor.setAccessible(true);

        Pessoa objPessoa = (Pessoa) constructor.newInstance(new Object[]{"Thiago"});
        System.out.println(objPessoa.getNome());

        // ------------------------------------------------------------------------------
        Object cliente = new Cliente(25);
        Class clazz = cliente.getClass();

        while (true) {
            if (clazz.getSuperclass().equals(Object.class))
                break;

            clazz = clazz.getSuperclass();
        }

        System.out.println("Classe: " + clazz.getSimpleName());

        // O polimofismo não permite chamar o método da classe mãe, mesmo que clazz seja do tipo Pessoa
        int idade = (int) clazz.getDeclaredMethod("getIdade").invoke(cliente);
    }
}

package tests;

import java.lang.reflect.ParameterizedType;
import models.PessoaDAO;

/**
 *
 * @author wwthi
 */
public class ManipulaGenericClass {
    public static Class getClass(Class clazz, int pos) {
        return (Class)((ParameterizedType)clazz.getGenericSuperclass()).getActualTypeArguments()[pos];
    }
    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        PessoaDAO dao = new PessoaDAO();
        System.out.println(dao.criaObjetoViaReflection());
    }
}

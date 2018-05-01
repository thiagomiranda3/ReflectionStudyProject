package models;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;

/**
 *
 * @author wwthi
 */
public class CollectionHandler implements InvocationHandler {

    private Collection col;

    public CollectionHandler(Collection col) {
        super();
        this.col = col;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Invocando o método: " + method.getName());
        long start = System.currentTimeMillis();
        Object obj = method.invoke(col, args);
        long end = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (end-start) + " mili-segundos");
        return obj;
    }
    
}

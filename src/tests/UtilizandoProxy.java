package tests;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import models.CollectionHandler;

/**
 *
 * @author wwthi
 */
public class UtilizandoProxy {

    public static void main(String[] args) {
        Collection<Object> colecaoNaoProxiada = new ArrayList<>();
        List<Object> colecaoComProxy = (List<Object>) Proxy.newProxyInstance(
                colecaoNaoProxiada.getClass().getClassLoader(),
                new Class[]{Collection.class, List.class},
                new CollectionHandler(colecaoNaoProxiada)
        );
        
        colecaoComProxy.add("Teste1");
        colecaoComProxy.add("Teste2");
        colecaoComProxy.add("Teste3");
        colecaoComProxy.add("Teste4");
        System.out.println(colecaoComProxy.toString());
        
    }
}

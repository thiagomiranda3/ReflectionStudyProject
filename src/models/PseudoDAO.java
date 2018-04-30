package models;

import tests.ManipulaGenericClass;

/**
 *
 * @author wwthi
 */
public abstract class PseudoDAO<T> {

    protected T retornaInstanciaPorTipo() throws InstantiationException, IllegalAccessException {
        return (T) ManipulaGenericClass.getClass(getClass(), 0).newInstance();
    }
}

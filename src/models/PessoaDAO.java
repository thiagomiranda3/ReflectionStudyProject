package models;

/**
 *
 * @author wwthi
 */
public class PessoaDAO extends PseudoDAO<Pessoa>{
    public Pessoa criaObjetoViaReflection() throws InstantiationException, IllegalAccessException {
        return retornaInstanciaPorTipo();
    }
}

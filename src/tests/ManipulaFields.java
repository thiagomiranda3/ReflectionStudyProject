package tests;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import models.Veiculo;

/**
 *
 * @author wwthi
 */
public class ManipulaFields {
        
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Fiat");
        veiculo.setPeso(550.0);
        veiculo.setPotencia(1.2);
        veiculo.setQuantidadeMaximaPassageiros(5);
        veiculo.setValor(new BigDecimal("20450.0"));
        
        Class classVeiculo = Veiculo.class;  //veiculo.getClass();
        Field[] fields = classVeiculo.getDeclaredFields();
        
        for(Field field : fields) {
            // faz os atributos privados se tornarem públicos
            if(Modifier.isPrivate(field.getModifiers()))
                field.setAccessible(true);
            
            // Altera o campo de um atributo pela API Reflection
            if(field.getName().equals("marca"))
                field.set(veiculo, "GM");
            
            System.out.println(field.get(veiculo));
        }
    }
}

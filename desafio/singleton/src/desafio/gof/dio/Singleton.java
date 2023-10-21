package desafio.gof.dio;

/**
 * Desafio de projeto utilizando o padrão de projeto Java - Singleton de Bill Pugh,
 * para criar um ponto de acesso global a instância criada.
 *
 * @autor aimwill16
 */
public class Singleton {
    // Classe aninhada estática (Encapsulador) auto-explicativa que encapsula a classe exemplo Singleton
    private static class Encapsulador {
        public static Singleton instancia = new Singleton();
    }

    // Construtor privado para impedir a criação de instância fora da classe.
    private Singleton(){
        super();
    }

    // Método estático para obter a instância Singleton, que retorna a instnacia armazenada no Encapsulador.
    public static Singleton getInstance(){
        return Encapsulador.instancia;
    }
}

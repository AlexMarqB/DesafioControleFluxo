public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }

    // Opcional: Sobrescrever o método toString() para personalizar a mensagem
    @Override
    public String toString() {
        return "ParametrosInvalidosException: " + getMessage();
    }
}

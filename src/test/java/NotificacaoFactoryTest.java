import org.example.INotificacao;
import org.example.NotificacaoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class NotificacaoFactoryTest {
    @Test
    void deveRetornarExcecaoParaNotificacaoInexistente(){
        try {
            INotificacao notificacao = NotificacaoFactory.obterNotificacao("WhatsApp");
            fail("Deveria ter lançado uma exceção"); // Garante que o teste falhe se a exceção não for lançada
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de notificação inexistente ou inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaNotificacaoInvalida() {
        try {
            INotificacao notificacao = NotificacaoFactory.obterNotificacao("");
            fail("Deveria ter lançado uma exceção");
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de notificação inválido", e.getMessage());
        }
    }

}

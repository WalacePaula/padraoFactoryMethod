import org.example.NotificacaoFactory;
import org.junit.jupiter.api.Test;
import org.example.INotificacao;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailNotificacaoTest {
    @Test
    void deveEnviarNotificacaoPorEmail() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Email");
        assertEquals("Notificação enviada por Email", notificacao.enviar());
    }
}

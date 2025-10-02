import org.example.INotificacao;
import org.example.NotificacaoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PushNotificacaoTest {
    @Test
    void deveEnviarNotificacaoPorPush() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("Push");
        assertEquals("Notificação enviada por Push", notificacao.enviar());
    }
}

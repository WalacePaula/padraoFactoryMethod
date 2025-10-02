import org.example.INotificacao;
import org.example.NotificacaoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SMSNotificacaoTest {
    @Test
    void deveEnviarNotificacaoPorSMS() {
        INotificacao notificacao = NotificacaoFactory.obterNotificacao("SMS");
        assertEquals("Notificação enviada por SMS", notificacao.enviar());
    }
}

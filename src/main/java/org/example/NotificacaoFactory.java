package org.example;

public class NotificacaoFactory {
    public static INotificacao obterNotificacao(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException("Tipo de notificação inválido");
        }
        Class classe = null;
        Object objeto = null;
        try {
            String nomeClasse = "org.example." + tipo + "Notificacao";
            classe = Class.forName(nomeClasse);
            objeto = classe.newInstance();
            return (INotificacao) objeto;
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo de notificação inexistente ou inválido");
        }
    }
}

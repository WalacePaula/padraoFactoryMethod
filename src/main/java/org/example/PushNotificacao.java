package org.example;

public class PushNotificacao implements INotificacao{
    @Override
    public String enviar() {
        return "Notificação enviada por Push";
    }
}

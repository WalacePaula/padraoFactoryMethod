package org.example;

public class SMSNotificacao implements INotificacao{
    @Override
    public String enviar() {
        return "Notificação enviada por SMS";
    }
}

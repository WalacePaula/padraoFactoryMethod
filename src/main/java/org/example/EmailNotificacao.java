package org.example;

public class EmailNotificacao implements INotificacao{
    @Override
    public String enviar() {
        return "Notificação enviada por Email";
    }
}

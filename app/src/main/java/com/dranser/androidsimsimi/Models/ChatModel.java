package com.dranser.androidsimsimi.Models;

/**
 * Created by Dranser on 13/11/2017.
 */

public class ChatModel {
    public String mensaje;
    public boolean isSend;

    public ChatModel(String mensaje, boolean isSend) {
        this.mensaje = mensaje;
        this.isSend = isSend;
    }

    public ChatModel() {
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isSend() {
        return isSend;
    }

    public void setSend(boolean send) {
        isSend = send;
    }
}

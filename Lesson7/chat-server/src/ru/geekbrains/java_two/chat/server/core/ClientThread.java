package ru.geekbrains.java_two.chat.server.core;

import ru.geekbrains.java_two.chat.library.Protocol;
import ru.geekbrains.java_two.network.SocketThread;
import ru.geekbrains.java_two.network.SocketThreadListener;

import java.net.Socket;

public class ClientThread extends SocketThread {

    private String nickname;
    private boolean isAuthorized;

    public ClientThread(SocketThreadListener listener, String name, Socket socket) {
        super(listener, name, socket);
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    void authAccept(String nickname) {
        isAuthorized = true;
        this.nickname = nickname;
        sendMessage(Protocol.getAuthAccept(nickname));
    }

    void authFail() {
        sendMessage(Protocol.getAuthDenied());
        close();
    }

    void msgFormatError(String msg) {
        sendMessage(Protocol.getMsgFormatError(msg));
        close();
    }


}

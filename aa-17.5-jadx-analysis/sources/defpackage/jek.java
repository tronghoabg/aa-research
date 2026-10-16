package defpackage;

import android.net.Network;
import j$.time.Duration;
import java.io.IOException;
import java.net.Socket;

/* loaded from: classes2.dex */
public final class jek {
    private static final yph a = yph.c("CAR.SETUP.WIFI");
    private static final Duration b = Duration.ofSeconds(10);

    public static Socket a(Network network) throws IOException {
        Duration duration = b;
        ((ype) ((ype) a.f()).ai((char) 1954)).u("Creating socket.");
        Socket socketCreateSocket = network.getSocketFactory().createSocket();
        socketCreateSocket.setSendBufferSize(16384);
        socketCreateSocket.setTcpNoDelay(true);
        if (a.X(duration)) {
            socketCreateSocket.setSoTimeout((int) duration.toMillis());
        }
        return socketCreateSocket;
    }
}

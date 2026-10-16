package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class jei implements Runnable {
    final /* synthetic */ jej a;
    public final jku b;
    private final Network c;
    private final String d;
    private final int e;
    private int f = 0;

    public jei(jej jejVar, Network network, String str, int i, jku jkuVar) {
        this.a = jejVar;
        this.c = network;
        this.d = str;
        this.e = i;
        this.b = jkuVar;
    }

    private final void a(Consumer consumer) {
        consumer.accept(this.b);
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        if (this.f == 0) {
            ((ype) jej.a.l().ai((char) 1946)).u("Initializing socket connect runnable");
            this.a.a();
        }
        yph yphVar = jej.a;
        ((ype) yphVar.l().ai((char) 1941)).u("Legacy connect to socket.");
        xxh xxhVarH = xvy.a;
        try {
            ((ype) ((ype) yphVar.f()).ai(1942)).w("Creating socket, attempt %d", this.f);
            Socket socketA = jek.a(this.c);
            xxhVarH = xxh.h(socketA);
            a(new iwu(3));
            ype ypeVar = (ype) yphVar.l().ai(1943);
            String str = this.d;
            int i = this.e;
            ypeVar.K("Connecting socket to %s:%d", str, i);
            socketA.connect(new InetSocketAddress(str, i), 10000);
            ((ype) ((ype) yphVar.f()).ai(1944)).K("Socket connected to %s:%d", str, i);
            a(new iwu(4));
            a(new iju(socketA, 14));
        } catch (IOException e) {
            yph yphVar2 = jej.a;
            ((ype) ((ype) ((ype) yphVar2.g()).p(e)).ai(1945)).w("Couldn't connect to socket on attempt %d", this.f);
            if (xxhVarH.f()) {
                try {
                    if (!((Socket) xxhVarH.b()).isClosed()) {
                        ((ype) ((ype) yphVar2.f()).ai(1939)).u("Closing old socket");
                        ((Socket) xxhVarH.b()).close();
                    }
                } catch (IOException e2) {
                    ((ype) ((ype) ((ype) jej.a.h()).p(e2)).ai((char) 1940)).u("Old socket failed to close");
                }
            }
            if (this.f < 2) {
                ((ype) jej.a.l().ai((char) 1951)).u("Will retry to create and connect socket");
                a(new iju(e, 13));
                this.f++;
                jej jejVar = this.a;
                jejVar.d = xxh.h(jejVar.b.schedule(this, 1000L, TimeUnit.MILLISECONDS));
                return;
            }
            ConnectivityManager connectivityManager = this.a.c;
            for (Network network : connectivityManager.getAllNetworks()) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities == null) {
                    ((ype) ((ype) jej.a.h()).ai((char) 1947)).y("Network=<%s> has null capabilities, skipping", network);
                } else if (!networkCapabilities.hasCapability(15)) {
                    ((ype) ((ype) jej.a.f()).ai((char) 1950)).u("Socket failed due to VPN connection");
                    a(new iju(e, 11));
                    return;
                }
            }
            ((ype) ((ype) jej.a.g()).ai((char) 1949)).u("Exhausted all socket retry attempts");
            a(new iju(e, 12));
        }
    }
}

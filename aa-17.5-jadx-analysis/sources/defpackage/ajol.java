package defpackage;

import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class ajol implements ajob {
    public final Socket a;
    public final AtomicInteger b = new AtomicInteger();
    public final ajoc c = new ajok(this);
    public final ajoa d = new ajoj(this);

    public ajol(Socket socket) {
        this.a = socket;
    }

    @Override // defpackage.ajob
    public final ajoa a() {
        return this.d;
    }

    @Override // defpackage.ajob
    public final ajoc b() {
        return this.c;
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }
}

package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public final class ajjb implements ajjt, ajkb {
    public final ajii a;
    public final List b;
    public Socket c;
    private final ajix d;
    private final ajjp e;
    private final ajjm f;
    private final ajjq g;
    private final ajid h;
    private final int i;
    private final boolean j;
    private volatile boolean k;
    private Socket l;
    private ajhu m;
    private ajib n;
    private ajjn o;
    private ajiy p;

    public ajjb(ajix ajixVar, ajjp ajjpVar, ajjm ajjmVar, ajjq ajjqVar, ajii ajiiVar, List list, ajid ajidVar, int i, boolean z) {
        this.d = ajixVar;
        this.e = ajjpVar;
        this.f = ajjmVar;
        this.g = ajjqVar;
        this.a = ajiiVar;
        this.b = list;
        this.h = ajidVar;
        this.i = i;
        this.j = z;
    }

    private final void k() throws IOException {
        Socket socket;
        int i;
        ajii ajiiVar = this.a;
        Proxy proxy = ajiiVar.b;
        Proxy.Type type = proxy.type();
        if (type != null && ((i = ajja.a[type.ordinal()]) == 1 || i == 2)) {
            socket = ajiiVar.a.b.createSocket();
            socket.getClass();
        } else {
            socket = new Socket(proxy);
        }
        this.l = socket;
        if (this.k) {
            throw new IOException("canceled");
        }
        socket.setSoTimeout(10000);
        try {
            ajly.c.i(socket, ajiiVar.c);
            try {
                this.p = ahef.b(socket);
            } catch (NullPointerException e) {
                if (affa.f(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            InetSocketAddress inetSocketAddress = this.a.c;
            Objects.toString(inetSocketAddress);
            ConnectException connectException = new ConnectException("Failed to connect to ".concat(inetSocketAddress.toString()));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    @Override // defpackage.ajkb
    public final ajii a() {
        return this.a;
    }

    public final ajjb b(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        list.getClass();
        int i = this.i;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ajhm ajhmVar = (ajhm) list.get(i2);
            if (ajhmVar.c && (((strArr = ajhmVar.f) == null || ajiq.j(strArr, sSLSocket.getEnabledProtocols(), afcf.b)) && ((strArr2 = ajhmVar.e) == null || ajiq.j(strArr2, sSLSocket.getEnabledCipherSuites(), ajhk.a)))) {
                return new ajjb(this.d, this.e, this.f, this.g, this.a, this.b, this.h, i2, i != -1);
            }
        }
        return null;
    }

    @Override // defpackage.ajjt
    public final ajjn c() throws IOException {
        ajjm ajjmVar = this.f;
        ajjmVar.a.r.Y(this.a);
        ajjn ajjnVar = this.o;
        ajjnVar.getClass();
        ajjr ajjrVarB = this.g.b(this, this.b);
        if (ajjrVarB != null) {
            return ajjrVarB.a;
        }
        synchronized (ajjnVar) {
            ajjp ajjpVar = this.e;
            TimeZone timeZone = ajis.a;
            ((ConcurrentLinkedQueue) ajjpVar.d).add(ajjnVar);
            ajjpVar.a();
            ajjmVar.e(ajjnVar);
        }
        return ajjnVar;
    }

    @Override // defpackage.ajjt
    public final ajjs d() throws IOException {
        Socket socket;
        Socket socket2;
        if (this.l != null) {
            throw new IllegalStateException("TCP already connected");
        }
        this.f.n.add(this);
        boolean z = false;
        try {
            try {
                k();
                z = true;
                ajjs ajjsVar = new ajjs(this, null, null);
                this.f.n.remove(this);
                return ajjsVar;
            } catch (IOException e) {
                ajii ajiiVar = this.a;
                ajhc ajhcVar = ajiiVar.a;
                Proxy proxy = ajiiVar.b;
                if (proxy.type() != Proxy.Type.DIRECT) {
                    ajhcVar.g.connectFailed(ajhcVar.h.f(), proxy.address(), e);
                }
                ajjs ajjsVar2 = new ajjs(this, null, e);
                this.f.n.remove(this);
                if (!z && (socket2 = this.l) != null) {
                    ajis.g(socket2);
                }
                return ajjsVar2;
            }
        } catch (Throwable th) {
            this.f.n.remove(this);
            if (!z && (socket = this.l) != null) {
                ajis.g(socket);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0505 A[Catch: all -> 0x053b, TryCatch #17 {all -> 0x053b, blocks: (B:239:0x04ff, B:257:0x0522, B:242:0x0505, B:245:0x050a, B:247:0x050e, B:250:0x0517, B:253:0x051c), top: B:299:0x04ff }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0545  */
    /* JADX WARN: Type inference failed for: r4v14, types: [int] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // defpackage.ajjt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ajjs e() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjb.e():ajjs");
    }

    @Override // defpackage.ajjt
    public final ajjt f() {
        return new ajjb(this.d, this.e, this.f, this.g, this.a, this.b, this.h, this.i, this.j);
    }

    @Override // defpackage.ajjt, defpackage.ajkb
    public final void g() throws IOException {
        this.k = true;
        Socket socket = this.l;
        if (socket != null) {
            ajis.g(socket);
        }
    }

    @Override // defpackage.ajjt
    public final boolean j() {
        return this.n != null;
    }

    @Override // defpackage.ajkb
    public final void h() {
    }

    @Override // defpackage.ajkb
    public final void i(ajjm ajjmVar, IOException iOException) {
    }
}

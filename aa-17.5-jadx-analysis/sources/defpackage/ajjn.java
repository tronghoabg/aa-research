package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ajjn extends ajla implements ajkb {
    public final ajix a;
    public final ajii b;
    public final Socket c;
    public final ajhu d;
    public final ajib e;
    public ajlc f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public final List l;
    public long m;
    public final ajiy n;
    private final Socket p;
    private int q;

    public ajjn(ajix ajixVar, ajii ajiiVar, Socket socket, Socket socket2, ajhu ajhuVar, ajib ajibVar, ajiy ajiyVar) {
        ajiyVar.getClass();
        this.a = ajixVar;
        this.b = ajiiVar;
        this.p = socket;
        this.c = socket2;
        this.d = ajhuVar;
        this.e = ajibVar;
        this.n = ajiyVar;
        this.k = 1;
        this.l = new ArrayList();
        this.m = Long.MAX_VALUE;
    }

    @Override // defpackage.ajkb
    public final ajii a() {
        return this.b;
    }

    @Override // defpackage.ajla
    public final void b(ajlj ajljVar) throws IOException {
        ajljVar.l(8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.ajhc r11, java.util.List r12) {
        /*
            r10 = this;
            java.util.TimeZone r0 = defpackage.ajis.a
            java.util.List r0 = r10.l
            int r0 = r0.size()
            int r1 = r10.k
            r2 = 0
            if (r0 >= r1) goto Lb2
            boolean r0 = r10.g
            if (r0 != 0) goto Lb2
            ajii r0 = r10.b
            ajhc r1 = r0.a
            boolean r3 = r1.a(r11)
            if (r3 == 0) goto Lb2
            ajhx r3 = r11.h
            ajhx r1 = r1.h
            java.lang.String r4 = r3.b
            java.lang.String r5 = r1.b
            boolean r6 = defpackage.affa.f(r4, r5)
            r7 = 1
            if (r6 == 0) goto L2b
            return r7
        L2b:
            ajlc r6 = r10.f
            if (r6 != 0) goto L30
            return r2
        L30:
            if (r12 == 0) goto Lb2
            boolean r6 = r12.isEmpty()
            if (r6 == 0) goto L3a
            goto Lb2
        L3a:
            java.util.Iterator r12 = r12.iterator()
        L3e:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Lb2
            java.lang.Object r6 = r12.next()
            ajii r6 = (defpackage.ajii) r6
            java.net.Proxy r8 = r6.b
            java.net.Proxy$Type r8 = r8.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.DIRECT
            if (r8 != r9) goto L3e
            java.net.Proxy r8 = r0.b
            java.net.Proxy$Type r8 = r8.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.DIRECT
            if (r8 != r9) goto L3e
            java.net.InetSocketAddress r6 = r6.c
            java.net.InetSocketAddress r8 = r0.c
            boolean r6 = defpackage.affa.f(r8, r6)
            if (r6 == 0) goto L3e
            javax.net.ssl.HostnameVerifier r12 = r11.d
            ajmo r0 = defpackage.ajmo.a
            if (r12 != r0) goto Lb2
            int r12 = r3.c
            int r0 = r1.c
            if (r12 != r0) goto Lb2
            boolean r12 = defpackage.affa.f(r4, r5)
            if (r12 == 0) goto L7b
            goto L9d
        L7b:
            boolean r12 = r10.h
            if (r12 != 0) goto Lb2
            ajhu r12 = r10.d
            if (r12 == 0) goto Lb2
            java.util.List r12 = r12.a()
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto Lb2
            java.lang.Object r12 = r12.get(r2)
            r12.getClass()
            java.security.cert.X509Certificate r12 = (java.security.cert.X509Certificate) r12
            boolean r12 = defpackage.ajmo.b(r4, r12)
            if (r12 != 0) goto L9d
            goto Lb2
        L9d:
            ajhj r11 = r11.e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb2
            r11.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb2
            ajhu r10 = r10.d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb2
            r10.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb2
            java.util.List r10 = r10.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb2
            r10.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb2
            r11.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lb2
            return r7
        Lb2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjn.c(ajhc, java.util.List):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(boolean r8) {
        /*
            r7 = this;
            java.util.TimeZone r0 = defpackage.ajis.a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r7.p
            boolean r2 = r2.isClosed()
            r3 = 0
            if (r2 != 0) goto L63
            java.net.Socket r2 = r7.c
            boolean r4 = r2.isClosed()
            if (r4 != 0) goto L63
            boolean r4 = r2.isInputShutdown()
            if (r4 != 0) goto L63
            boolean r2 = r2.isOutputShutdown()
            if (r2 == 0) goto L24
            goto L63
        L24:
            ajlc r2 = r7.f
            r4 = 1
            if (r2 == 0) goto L44
            monitor-enter(r2)
            boolean r7 = r2.g     // Catch: java.lang.Throwable -> L41
            if (r7 == 0) goto L2f
            goto L3f
        L2f:
            long r7 = r2.n     // Catch: java.lang.Throwable -> L41
            long r5 = r2.m     // Catch: java.lang.Throwable -> L41
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 >= 0) goto L3e
            long r7 = r2.p     // Catch: java.lang.Throwable -> L41
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3e
            goto L3f
        L3e:
            r3 = r4
        L3f:
            monitor-exit(r2)
            return r3
        L41:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L44:
            monitor-enter(r7)
            long r2 = r7.m     // Catch: java.lang.Throwable -> L60
            long r0 = r0 - r2
            monitor-exit(r7)
            r2 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L5f
            if (r8 == 0) goto L5f
            java.net.Socket r8 = r7.c
            ajiy r7 = r7.n
            ajna r7 = r7.b
            boolean r7 = defpackage.ajis.i(r8, r7)
            return r7
        L5f:
            return r4
        L60:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjn.d(boolean):boolean");
    }

    public final boolean e() {
        return this.f != null;
    }

    public final void f() {
        this.g = true;
    }

    @Override // defpackage.ajkb
    public final void g() throws IOException {
        ajis.g(this.p);
    }

    @Override // defpackage.ajkb
    public final void h() {
        synchronized (this) {
            this.g = true;
        }
    }

    @Override // defpackage.ajkb
    public final void i(ajjm ajjmVar, IOException iOException) {
        synchronized (this) {
            if (iOException instanceof ajlq) {
                int i = ((ajlq) iOException).a;
                if (i == 8) {
                    int i2 = this.q + 1;
                    this.q = i2;
                    if (i2 > 1) {
                        this.g = true;
                        this.i++;
                    }
                } else if (i != 9 || !ajjmVar.m) {
                    this.g = true;
                    this.i++;
                }
            } else if (!e() || (iOException instanceof ajko)) {
                this.g = true;
                if (this.j == 0) {
                    ajia ajiaVar = ajjmVar.a;
                    ajii ajiiVar = this.b;
                    Proxy proxy = ajiiVar.b;
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        ajhc ajhcVar = ajiiVar.a;
                        ajhcVar.g.connectFailed(ajhcVar.h.f(), proxy.address(), iOException);
                    }
                    ajiaVar.r.Z(ajiiVar);
                    this.i++;
                }
            }
        }
    }

    @Override // defpackage.ajla
    public final void j(ajlp ajlpVar) {
        ajlpVar.getClass();
        synchronized (this) {
            this.k = ajlpVar.d();
        }
    }

    public final String toString() {
        ajhu ajhuVar = this.d;
        String str = ajhuVar != null ? ajhuVar.b : "none";
        ajii ajiiVar = this.b;
        ajib ajibVar = this.e;
        StringBuilder sb = new StringBuilder("Connection{");
        ajhx ajhxVar = ajiiVar.a.h;
        sb.append(ajhxVar.b);
        sb.append(":");
        sb.append(ajhxVar.c);
        sb.append(", proxy=");
        sb.append(ajiiVar.b);
        sb.append(" hostAddress=");
        sb.append(ajiiVar.c);
        sb.append(" cipherSuite=");
        sb.append(str);
        sb.append(" protocol=");
        sb.append(ajibVar);
        sb.append("}");
        return sb.toString();
    }
}

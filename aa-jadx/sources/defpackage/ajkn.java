package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajkn extends defpackage.ajma implements defpackage.ajlb {
    public final defpackage.ajjx a;
    public final defpackage.ajji b;
    public final java.net.Socket c;
    public final defpackage.ajit d;
    public final defpackage.ajja e;
    public defpackage.ajmc f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public final java.util.List l;
    public long m;
    public final defpackage.ajjy n;
    private final java.net.Socket p;
    private int q;

    public ajkn(defpackage.ajjx ajjxVar, defpackage.ajji ajjiVar, java.net.Socket socket, java.net.Socket socket2, defpackage.ajit ajitVar, defpackage.ajja ajjaVar, defpackage.ajjy ajjyVar) {
        ajjyVar.getClass();
        this.a = ajjxVar;
        this.b = ajjiVar;
        this.p = socket;
        this.c = socket2;
        this.d = ajitVar;
        this.e = ajjaVar;
        this.n = ajjyVar;
        this.k = 1;
        this.l = new java.util.ArrayList();
        this.m = Long.MAX_VALUE;
    }

    @Override // defpackage.ajlb
    public final defpackage.ajji a() {
        return this.b;
    }

    @Override // defpackage.ajma
    public final void b(defpackage.ajmj ajmjVar) throws java.io.IOException {
        ajmjVar.l(8, null);
    }

    public final boolean c(defpackage.ajib ajibVar, java.util.List list) {
        defpackage.ajit ajitVar;
        java.util.TimeZone timeZone = defpackage.ajjs.a;
        if (this.l.size() < this.k && !this.g) {
            defpackage.ajji ajjiVar = this.b;
            defpackage.ajib ajibVar2 = ajjiVar.a;
            if (ajibVar2.a(ajibVar)) {
                defpackage.ajiw ajiwVar = ajibVar.h;
                defpackage.ajiw ajiwVar2 = ajibVar2.h;
                java.lang.String str = ajiwVar.b;
                java.lang.String str2 = ajiwVar2.b;
                if (defpackage.afga.f(str, str2)) {
                    return true;
                }
                if (this.f != null && list != null && !list.isEmpty()) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        defpackage.ajji ajjiVar2 = (defpackage.ajji) it.next();
                        if (ajjiVar2.b.type() == java.net.Proxy.Type.DIRECT && ajjiVar.b.type() == java.net.Proxy.Type.DIRECT) {
                            if (defpackage.afga.f(ajjiVar.c, ajjiVar2.c)) {
                                if (ajibVar.d != defpackage.ajno.a || ajiwVar.c != ajiwVar2.c) {
                                    break;
                                    break;
                                }
                                if (!defpackage.afga.f(str, str2)) {
                                    if (!this.h && (ajitVar = this.d) != null) {
                                        java.util.List listA = ajitVar.a();
                                        if (!listA.isEmpty()) {
                                            java.lang.Object obj = listA.get(0);
                                            obj.getClass();
                                            if (!defpackage.ajno.b(str, (java.security.cert.X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    defpackage.ajii ajiiVar = ajibVar.e;
                                    ajiiVar.getClass();
                                    defpackage.ajit ajitVar2 = this.d;
                                    ajitVar2.getClass();
                                    ajitVar2.a().getClass();
                                    ajiiVar.a();
                                    return true;
                                } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean d(boolean z) {
        long j;
        java.util.TimeZone timeZone = defpackage.ajjs.a;
        long jNanoTime = java.lang.System.nanoTime();
        boolean z2 = false;
        if (!this.p.isClosed()) {
            java.net.Socket socket = this.c;
            if (!socket.isClosed() && !socket.isInputShutdown() && !socket.isOutputShutdown()) {
                defpackage.ajmc ajmcVar = this.f;
                if (ajmcVar != null) {
                    synchronized (ajmcVar) {
                        if (!ajmcVar.g && (ajmcVar.n >= ajmcVar.m || jNanoTime < ajmcVar.p)) {
                            z2 = true;
                        }
                    }
                    return z2;
                }
                synchronized (this) {
                    j = jNanoTime - this.m;
                }
                if (j < 10000000000L || !z) {
                    return true;
                }
                return defpackage.ajjs.i(this.c, this.n.b);
            }
        }
        return false;
    }

    public final boolean e() {
        return this.f != null;
    }

    public final void f() {
        this.g = true;
    }

    @Override // defpackage.ajlb
    public final void g() {
        defpackage.ajjs.g(this.p);
    }

    @Override // defpackage.ajlb
    public final void h() {
        synchronized (this) {
            this.g = true;
        }
    }

    @Override // defpackage.ajlb
    public final void i(defpackage.ajkm ajkmVar, java.io.IOException iOException) {
        synchronized (this) {
            if (iOException instanceof defpackage.ajmq) {
                int i = ((defpackage.ajmq) iOException).a;
                if (i == 8) {
                    int i2 = this.q + 1;
                    this.q = i2;
                    if (i2 > 1) {
                        this.g = true;
                        this.i++;
                    }
                } else if (i != 9 || !ajkmVar.m) {
                    this.g = true;
                    this.i++;
                }
            } else if (!e() || (iOException instanceof defpackage.ajlo)) {
                this.g = true;
                if (this.j == 0) {
                    defpackage.ajiz ajizVar = ajkmVar.a;
                    defpackage.ajji ajjiVar = this.b;
                    java.net.Proxy proxy = ajjiVar.b;
                    if (proxy.type() != java.net.Proxy.Type.DIRECT) {
                        defpackage.ajib ajibVar = ajjiVar.a;
                        ajibVar.g.connectFailed(ajibVar.h.f(), proxy.address(), iOException);
                    }
                    ajizVar.s.aa(ajjiVar);
                    this.i++;
                }
            }
        }
    }

    @Override // defpackage.ajma
    public final void j(defpackage.ajmp ajmpVar) {
        ajmpVar.getClass();
        synchronized (this) {
            this.k = ajmpVar.d();
        }
    }

    public final java.lang.String toString() {
        defpackage.ajit ajitVar = this.d;
        java.lang.Object obj = ajitVar != null ? ajitVar.b : "none";
        defpackage.ajji ajjiVar = this.b;
        defpackage.ajja ajjaVar = this.e;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Connection{");
        defpackage.ajiw ajiwVar = ajjiVar.a.h;
        sb.append(ajiwVar.b);
        sb.append(":");
        sb.append(ajiwVar.c);
        sb.append(", proxy=");
        sb.append(ajjiVar.b);
        sb.append(" hostAddress=");
        sb.append(ajjiVar.c);
        sb.append(" cipherSuite=");
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(ajjaVar);
        sb.append("}");
        return sb.toString();
    }
}

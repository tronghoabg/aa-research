package okhttp3.internal.c;

import androidx.core.app.NotificationCompat;
import h.g.b.x;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import okhttp3.ai;
import okhttp3.aj;
import okhttp3.au;
import okhttp3.internal.f.ad;
import okhttp3.internal.f.w;
import okhttp3.y;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class m extends okhttp3.internal.f.j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f56033a = 0;

    /* renamed from: c, reason: collision with root package name */
    private final au f56034c;

    /* renamed from: d, reason: collision with root package name */
    private Socket f56035d;

    /* renamed from: e, reason: collision with root package name */
    private Socket f56036e;

    /* renamed from: f, reason: collision with root package name */
    private y f56037f;

    /* renamed from: g, reason: collision with root package name */
    private aj f56038g;

    /* renamed from: h, reason: collision with root package name */
    private w f56039h;

    /* renamed from: i, reason: collision with root package name */
    private k.j f56040i;

    /* renamed from: j, reason: collision with root package name */
    private k.i f56041j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f56042k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f56043l;
    private int m;
    private int n;
    private int o;
    private int p;
    private final List q;
    private long r;

    public m(o oVar, au auVar) {
        x.f(oVar, "connectionPool");
        x.f(auVar, "route");
        this.f56034c = auVar;
        this.p = 1;
        this.q = new ArrayList();
        this.r = Long.MAX_VALUE;
    }

    static final List d(m mVar) {
        y yVar = mVar.f56037f;
        x.c(yVar);
        List<Certificate> listB = yVar.b();
        ArrayList arrayList = new ArrayList(h.a.i.q(listB, 10));
        for (Certificate certificate : listB) {
            x.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    private final void w() throws SocketException {
        Socket socket = this.f56036e;
        x.c(socket);
        k.j jVar = this.f56040i;
        x.c(jVar);
        k.i iVar = this.f56041j;
        x.c(iVar);
        socket.setSoTimeout(0);
        okhttp3.internal.b.e eVar = okhttp3.internal.b.e.f55973a;
        okhttp3.internal.f.h hVar = new okhttp3.internal.f.h(eVar);
        String strF = this.f56034c.c().j().f();
        x.f(socket, "socket");
        x.f(strF, "peerName");
        x.f(jVar, "source");
        x.f(iVar, "sink");
        x.f(socket, "<set-?>");
        hVar.f56182a = socket;
        String str = okhttp3.internal.b.f55959e + " " + strF;
        x.f(str, "<set-?>");
        hVar.f56183b = str;
        x.f(jVar, "<set-?>");
        hVar.f56184c = jVar;
        x.f(iVar, "<set-?>");
        hVar.f56185d = iVar;
        w wVar = new w(hVar.b(this));
        this.f56039h = wVar;
        this.p = w.y.i();
        wVar.O(eVar);
    }

    private final void x(int i2, okhttp3.f fVar) throws IOException {
        Socket socket;
        int i3;
        au auVar = this.f56034c;
        Proxy proxyB = auVar.b();
        okhttp3.a aVarC = auVar.c();
        Proxy.Type type = proxyB.type();
        if (type != null && ((i3 = l.f56032a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = aVarC.d().createSocket();
            x.c(socket);
        } else {
            socket = new Socket(proxyB);
        }
        this.f56035d = socket;
        InetSocketAddress inetSocketAddressA = auVar.a();
        x.f(fVar, NotificationCompat.CATEGORY_CALL);
        x.f(inetSocketAddressA, "inetSocketAddress");
        x.f(proxyB, "proxy");
        socket.setSoTimeout(i2);
        try {
            okhttp3.internal.g.g.f56287a.i(socket, auVar.a());
            try {
                this.f56040i = k.y.c(k.y.g(socket));
                this.f56041j = k.y.b(k.y.d(socket));
            } catch (NullPointerException e2) {
                if (x.n(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            InetSocketAddress inetSocketAddressA2 = this.f56034c.a();
            Objects.toString(inetSocketAddressA2);
            ConnectException connectException = new ConnectException("Failed to connect to ".concat(String.valueOf(inetSocketAddressA2)));
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final int a() {
        return this.m;
    }

    public final long b() {
        return this.r;
    }

    public final Socket c() {
        Socket socket = this.f56036e;
        x.c(socket);
        return socket;
    }

    public final List e() {
        return this.q;
    }

    public final y f() {
        return this.f56037f;
    }

    public final au g() {
        return this.f56034c;
    }

    public final okhttp3.internal.d.e h(ai aiVar, okhttp3.internal.d.g gVar) throws SocketException {
        x.f(aiVar, "client");
        x.f(gVar, "chain");
        Socket socket = this.f56036e;
        x.c(socket);
        k.j jVar = this.f56040i;
        x.c(jVar);
        k.i iVar = this.f56041j;
        x.c(iVar);
        w wVar = this.f56039h;
        if (wVar != null) {
            return new okhttp3.internal.f.x(aiVar, this, gVar, wVar);
        }
        socket.setSoTimeout(gVar.c());
        jVar.h().t(gVar.a(), TimeUnit.MILLISECONDS);
        iVar.h().t(gVar.b(), TimeUnit.MILLISECONDS);
        return new okhttp3.internal.e.g(aiVar, this, jVar, iVar);
    }

    public final void i() {
        Socket socket = this.f56035d;
        if (socket != null) {
            okhttp3.internal.b.t(socket);
        }
    }

    public final synchronized void j() {
        this.n++;
    }

    public final synchronized void k() {
        this.f56043l = true;
    }

    public final synchronized void l() {
        this.f56042k = true;
    }

    @Override // okhttp3.internal.f.j
    public final void m(ad adVar) {
        x.f(adVar, "stream");
        adVar.t(okhttp3.internal.f.b.f56146h, null);
    }

    public final void n(long j2) {
        this.r = j2;
    }

    public final synchronized void o(j jVar, IOException iOException) {
        x.f(jVar, NotificationCompat.CATEGORY_CALL);
        if (iOException instanceof okhttp3.internal.f.aj) {
            okhttp3.internal.f.b bVar = ((okhttp3.internal.f.aj) iOException).f56138a;
            if (bVar == okhttp3.internal.f.b.f56146h) {
                int i2 = this.o + 1;
                this.o = i2;
                if (i2 > 1) {
                    this.f56042k = true;
                    this.m++;
                }
            } else if (bVar != okhttp3.internal.f.b.f56147i || !jVar.u()) {
                this.f56042k = true;
                this.m++;
            }
        } else if (!s() || (iOException instanceof okhttp3.internal.f.a)) {
            this.f56042k = true;
            if (this.n == 0) {
                ai aiVarJ = jVar.j();
                au auVar = this.f56034c;
                x.f(aiVarJ, "client");
                x.f(auVar, "failedRoute");
                x.f(iOException, "failure");
                if (auVar.b().type() != Proxy.Type.DIRECT) {
                    okhttp3.a aVarC = auVar.c();
                    aVarC.a().connectFailed(aVarC.j().i(), auVar.b().address(), iOException);
                }
                aiVarJ.y().f(auVar);
                this.m++;
            }
        }
    }

    public final boolean p() {
        return this.f56042k;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(okhttp3.a r7, java.util.List r8) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.c.m.q(okhttp3.a, java.util.List):boolean");
    }

    public final boolean r(boolean z) {
        long j2;
        byte[] bArr = okhttp3.internal.b.f55955a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f56035d;
        x.c(socket);
        Socket socket2 = this.f56036e;
        x.c(socket2);
        k.j jVar = this.f56040i;
        x.c(jVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        w wVar = this.f56039h;
        if (wVar != null) {
            return wVar.L(jNanoTime);
        }
        synchronized (this) {
            j2 = jNanoTime - this.r;
        }
        if (j2 < 10000000000L || !z) {
            return true;
        }
        return okhttp3.internal.b.x(socket2, jVar);
    }

    public final boolean s() {
        return this.f56039h != null;
    }

    public final void t() {
        this.f56042k = true;
    }

    public final String toString() {
        au auVar = this.f56034c;
        String strF = auVar.c().j().f();
        int iA = auVar.c().j().a();
        Proxy proxyB = auVar.b();
        InetSocketAddress inetSocketAddressA = auVar.a();
        y yVar = this.f56037f;
        return "Connection{" + strF + ":" + iA + ", proxy=" + proxyB + " hostAddress=" + inetSocketAddressA + " cipherSuite=" + (yVar != null ? yVar.d() : "none") + " protocol=" + this.f56038g + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x021f, code lost:
    
        throw new java.io.IOException("TLS tunnel buffered too many bytes!");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(int r19, int r20, boolean r21, okhttp3.f r22, okhttp3.w r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.c.m.u(int, int, boolean, okhttp3.f, okhttp3.w):void");
    }

    @Override // okhttp3.internal.f.j
    public final synchronized void v(w wVar, com.google.firebase.d.c.b bVar) {
        x.f(wVar, "connection");
        x.f(bVar, "settings");
        this.p = bVar.i();
    }
}

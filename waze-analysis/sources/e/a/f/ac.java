package e.a.f;

import e.a.az;
import e.a.ch;
import e.a.cm;
import e.a.cp;
import e.a.cq;
import e.a.d.as;
import e.a.d.da;
import e.a.d.db;
import e.a.d.df;
import e.a.d.dh;
import e.a.d.dl;
import e.a.d.dm;
import e.a.d.ek;
import e.a.d.el;
import e.a.d.gd;
import e.a.d.jj;
import e.a.d.js;
import e.a.d.jt;
import e.a.d.ka;
import e.a.d.kc;
import e.a.dt;
import e.a.ee;
import e.a.ef;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.URI;
import java.security.cert.X509Certificate;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ac implements as, g, ao, ek {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f47610a;

    /* renamed from: d, reason: collision with root package name */
    private static final Map f47611d;

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f47612e;
    private aa A;
    private e.a.c B;
    private ee C;
    private boolean D;
    private dl E;
    private boolean F;
    private boolean G;
    private final SocketFactory H;
    private SSLSocketFactory I;
    private HostnameVerifier J;
    private Socket K;
    private int L;
    private final Deque M;
    private final e.a.f.a.c N;
    private el O;
    private boolean P;
    private long Q;
    private long R;
    private boolean S;
    private final Runnable T;
    private final int U;
    private final kc V;
    private final Map W;
    private final dm X;

    /* renamed from: b, reason: collision with root package name */
    final e.a.aq f47613b;

    /* renamed from: c, reason: collision with root package name */
    int f47614c;

    /* renamed from: f, reason: collision with root package name */
    private Socket f47615f;

    /* renamed from: g, reason: collision with root package name */
    private SSLSession f47616g;

    /* renamed from: h, reason: collision with root package name */
    private final InetSocketAddress f47617h;

    /* renamed from: i, reason: collision with root package name */
    private final String f47618i;

    /* renamed from: j, reason: collision with root package name */
    private final String f47619j;

    /* renamed from: k, reason: collision with root package name */
    private final Random f47620k;

    /* renamed from: l, reason: collision with root package name */
    private final com.google.d.b.aj f47621l;
    private final int m;
    private final e.a.f.a.a.q n;
    private gd o;
    private h p;
    private aq q;
    private final Object r;
    private final az s;
    private int t;
    private final Map u;
    private final Executor v;
    private final jj w;
    private final ScheduledExecutorService x;
    private final int y;
    private int z;

    static {
        EnumMap enumMap = new EnumMap(e.a.f.a.a.a.class);
        enumMap.put((EnumMap) e.a.f.a.a.a.NO_ERROR, (e.a.f.a.a.a) ee.f47410j.g("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) e.a.f.a.a.a.PROTOCOL_ERROR, (e.a.f.a.a.a) ee.f47410j.g("Protocol error"));
        enumMap.put((EnumMap) e.a.f.a.a.a.INTERNAL_ERROR, (e.a.f.a.a.a) ee.f47410j.g("Internal error"));
        enumMap.put((EnumMap) e.a.f.a.a.a.FLOW_CONTROL_ERROR, (e.a.f.a.a.a) ee.f47410j.g("Flow control error"));
        enumMap.put((EnumMap) e.a.f.a.a.a.STREAM_CLOSED, (e.a.f.a.a.a) ee.f47410j.g("Stream closed"));
        enumMap.put((EnumMap) e.a.f.a.a.a.FRAME_TOO_LARGE, (e.a.f.a.a.a) ee.f47410j.g("Frame too large"));
        enumMap.put((EnumMap) e.a.f.a.a.a.REFUSED_STREAM, (e.a.f.a.a.a) ee.f47411k.g("Refused stream"));
        enumMap.put((EnumMap) e.a.f.a.a.a.CANCEL, (e.a.f.a.a.a) ee.f47402b.g("Cancelled"));
        enumMap.put((EnumMap) e.a.f.a.a.a.COMPRESSION_ERROR, (e.a.f.a.a.a) ee.f47410j.g("Compression error"));
        enumMap.put((EnumMap) e.a.f.a.a.a.CONNECT_ERROR, (e.a.f.a.a.a) ee.f47410j.g("Connect error"));
        enumMap.put((EnumMap) e.a.f.a.a.a.ENHANCE_YOUR_CALM, (e.a.f.a.a.a) ee.f47407g.g("Enhance your calm"));
        enumMap.put((EnumMap) e.a.f.a.a.a.INADEQUATE_SECURITY, (e.a.f.a.a.a) ee.f47405e.g("Inadequate security"));
        f47611d = DesugarCollections.unmodifiableMap(enumMap);
        f47612e = Logger.getLogger(ac.class.getName());
        ch chVar = dh.f46791a;
        f47610a = dt.j("GRPC_ENABLE_PER_RPC_AUTHORITY_CHECK", false);
        try {
            Class.forName("javax.net.ssl.X509ExtendedTrustManager").getMethod("checkServerTrusted", X509Certificate[].class, String.class, Socket.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
    }

    public ac(o oVar, InetSocketAddress inetSocketAddress, String str, e.a.c cVar, e.a.aq aqVar, Runnable runnable) {
        com.google.d.b.aj ajVar = dh.o;
        e.a.f.a.a.m mVar = new e.a.f.a.a.m();
        this.f47620k = new Random();
        Object obj = new Object();
        this.r = obj;
        this.u = new HashMap();
        this.L = 0;
        this.M = new LinkedList();
        this.W = new ab();
        this.X = new u(this);
        this.f47614c = 30000;
        com.google.d.b.an.C(inetSocketAddress, "address");
        this.f47617h = inetSocketAddress;
        this.f47618i = str;
        this.y = 4194304;
        this.m = 65535;
        Executor executor = oVar.f47694a;
        com.google.d.b.an.C(executor, "executor");
        this.v = executor;
        this.w = new jj(oVar.f47694a);
        ScheduledExecutorService scheduledExecutorService = oVar.f47695b;
        com.google.d.b.an.C(scheduledExecutorService, "scheduledExecutorService");
        this.x = scheduledExecutorService;
        this.t = 3;
        this.H = SocketFactory.getDefault();
        this.I = oVar.f47697d;
        this.J = e.a.f.a.g.f47570a;
        e.a.f.a.c cVar2 = oVar.f47698e;
        com.google.d.b.an.C(cVar2, "connectionSpec");
        this.N = cVar2;
        com.google.d.b.an.C(ajVar, "stopwatchFactory");
        this.f47621l = ajVar;
        this.n = mVar;
        this.f47619j = "grpc-java-okhttp/1.83.0-SNAPSHOT";
        this.f47613b = aqVar;
        this.T = runnable;
        this.U = Integer.MAX_VALUE;
        this.V = oVar.f47696c.a();
        this.s = az.b(getClass(), inetSocketAddress.toString());
        e.a.a aVarA = e.a.c.a();
        aVarA.c(db.f46778b, cVar);
        this.B = aVarA.a();
        synchronized (obj) {
            new v(this);
        }
    }

    static /* bridge */ /* synthetic */ Socket D(ac acVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws ef, NumberFormatException, IOException {
        Socket socketCreateSocket;
        int i2;
        String strSubstring;
        try {
            socketCreateSocket = inetSocketAddress2.getAddress() != null ? acVar.H.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : acVar.H.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                socketCreateSocket.setTcpNoDelay(true);
                socketCreateSocket.setSoTimeout(acVar.f47614c);
                k.am amVarG = k.y.g(socketCreateSocket);
                k.i iVarB = k.y.b(k.y.d(socketCreateSocket));
                e.a.f.a.b.a aVar = new e.a.f.a.b.a();
                aVar.e();
                aVar.c(inetSocketAddress.getHostName());
                aVar.d(inetSocketAddress.getPort());
                e.a.f.a.b.b bVarB = aVar.b();
                e.a.f.a.b.c cVar = new e.a.f.a.b.c();
                cVar.e(bVarB);
                cVar.d("Host", bVarB.d() + ":" + bVarB.c());
                cVar.d("User-Agent", acVar.f47619j);
                if (str != null && str2 != null) {
                    try {
                        cVar.d("Proxy-Authorization", "Basic " + k.k.j((str + ":" + str2).getBytes("ISO-8859-1")).g());
                    } catch (UnsupportedEncodingException unused) {
                        throw new AssertionError();
                    }
                }
                e.a.f.a.b.d dVarC = cVar.c();
                e.a.f.a.b.b bVarB2 = dVarC.b();
                iVarB.E(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", bVarB2.d(), Integer.valueOf(bVarB2.c()))).E("\r\n");
                int iA = dVarC.a().a();
                for (int i3 = 0; i3 < iA; i3++) {
                    iVarB.E(dVarC.a().b(i3)).E(": ").E(dVarC.a().c(i3)).E("\r\n");
                }
                iVarB.E("\r\n");
                iVarB.flush();
                String strAf = af(amVarG);
                if (strAf.startsWith("HTTP/1.")) {
                    i2 = 9;
                    if (strAf.length() < 9 || strAf.charAt(8) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(strAf));
                    }
                    int iCharAt = strAf.charAt(7) - '0';
                    if (iCharAt != 0 && iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(strAf));
                    }
                    e.a.f.a.m mVar = e.a.f.a.m.HTTP_1_0;
                } else {
                    if (!strAf.startsWith("ICY ")) {
                        throw new ProtocolException("Unexpected status line: ".concat(strAf));
                    }
                    e.a.f.a.m mVar2 = e.a.f.a.m.HTTP_1_0;
                    i2 = 4;
                }
                int i4 = i2 + 3;
                if (strAf.length() < i4) {
                    throw new ProtocolException("Unexpected status line: ".concat(strAf));
                }
                try {
                    int i5 = Integer.parseInt(strAf.substring(i2, i4));
                    if (strAf.length() <= i4) {
                        strSubstring = "";
                    } else {
                        if (strAf.charAt(i4) != ' ') {
                            throw new ProtocolException("Unexpected status line: ".concat(strAf));
                        }
                        strSubstring = strAf.substring(i2 + 4);
                    }
                    while (!af(amVarG).equals("")) {
                    }
                    if (i5 >= 200 && i5 < 300) {
                        socketCreateSocket.setSoTimeout(0);
                        return socketCreateSocket;
                    }
                    k.h hVar = new k.h();
                    try {
                        socketCreateSocket.shutdownOutput();
                        amVarG.a(hVar, 1024L);
                    } catch (IOException e2) {
                        hVar.ar("Unable to read body: " + e2.toString());
                    }
                    try {
                        socketCreateSocket.close();
                    } catch (IOException unused2) {
                    }
                    throw new ef(ee.f47411k.g(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(i5), strSubstring, hVar.v())));
                } catch (NumberFormatException unused3) {
                    throw new ProtocolException("Unexpected status line: ".concat(strAf));
                }
            } catch (IOException e3) {
                e = e3;
                if (socketCreateSocket != null) {
                    dh.g(socketCreateSocket);
                }
                throw new ef(ee.f47411k.g("Failed trying to connect with proxy").f(e));
            }
        } catch (IOException e4) {
            e = e4;
            socketCreateSocket = null;
        }
    }

    private final ee ae() {
        synchronized (this.r) {
            ee eeVar = this.C;
            if (eeVar != null) {
                return eeVar;
            }
            return ee.f47411k.g("Connection closed");
        }
    }

    private static String af(k.am amVar) throws EOFException {
        k.h hVar = new k.h();
        while (amVar.a(hVar, 1L) != -1) {
            if (hVar.b(hVar.q() - 1) == 10) {
                return hVar.x();
            }
        }
        throw new EOFException("\\n not found: ".concat(hVar.G().h()));
    }

    private final void ag(t tVar) {
        if (this.G && this.M.isEmpty() && this.u.isEmpty()) {
            this.G = false;
            el elVar = this.O;
            if (elVar != null) {
                elVar.m();
            }
        }
        if (tVar.u()) {
            this.X.c(tVar, false);
        }
    }

    private final void ah(t tVar) {
        if (!this.G) {
            this.G = true;
            el elVar = this.O;
            if (elVar != null) {
                elVar.l();
            }
        }
        if (tVar.u()) {
            this.X.c(tVar, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ai(int i2, e.a.f.a.a.a aVar, ee eeVar) {
        synchronized (this.r) {
            if (this.C == null) {
                this.C = eeVar;
                this.o.c(eeVar, new da(aVar == null ? df.NO_ERROR : df.c(aVar.s)));
            }
            if (aVar != null && !this.D) {
                this.D = true;
                this.p.j(aVar, new byte[0]);
            }
            Iterator it = this.u.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i2) {
                    it.remove();
                    ((t) entry.getValue()).F().p(eeVar, e.a.d.ag.f46606b, false, new cm());
                    ag((t) entry.getValue());
                }
            }
            Deque<t> deque = this.M;
            for (t tVar : deque) {
                tVar.F().p(eeVar, e.a.d.ag.f46608d, true, new cm());
                ag(tVar);
            }
            deque.clear();
            ak();
        }
    }

    private final void aj(t tVar) {
        com.google.d.b.an.v(tVar.F().C() == -1, "StreamId already assigned");
        this.u.put(Integer.valueOf(this.t), tVar);
        ah(tVar);
        tVar.F().H(this.t);
        if (tVar.z() == cp.f46544a || tVar.z() == cp.f46546c) {
            tVar.K();
        } else {
            this.p.g();
        }
        int i2 = this.t;
        if (i2 < 2147483645) {
            this.t = i2 + 2;
        } else {
            this.t = Integer.MAX_VALUE;
            ai(Integer.MAX_VALUE, e.a.f.a.a.a.NO_ERROR, ee.f47411k.g("Stream ids exhausted"));
        }
    }

    private final void ak() {
        if (this.C == null || !this.u.isEmpty() || !this.M.isEmpty() || this.F) {
            return;
        }
        this.F = true;
        el elVar = this.O;
        if (elVar != null) {
            elVar.o();
        }
        dl dlVar = this.E;
        if (dlVar != null) {
            dlVar.c(ae());
            this.E = null;
        }
        if (!this.D) {
            this.D = true;
            this.p.j(e.a.f.a.a.a.NO_ERROR, new byte[0]);
        }
        this.p.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean al() {
        boolean z = false;
        while (true) {
            Deque deque = this.M;
            if (deque.isEmpty() || this.u.size() >= this.L) {
                break;
            }
            aj((t) deque.poll());
            z = true;
        }
        return z;
    }

    static ee l(e.a.f.a.a.a aVar) {
        ee eeVar = (ee) f47611d.get(aVar);
        if (eeVar != null) {
            return eeVar;
        }
        return ee.f47403c.g("Unknown http2 error code: " + aVar.s);
    }

    final String A() {
        String str = this.f47618i;
        URI uriE = dh.e(str);
        return uriE.getHost() != null ? uriE.getHost() : str;
    }

    final void V(int i2, ee eeVar, e.a.d.ag agVar, boolean z, e.a.f.a.a.a aVar, cm cmVar) {
        synchronized (this.r) {
            t tVar = (t) this.u.remove(Integer.valueOf(i2));
            if (tVar != null) {
                if (aVar != null) {
                    this.p.c(i2, e.a.f.a.a.a.CANCEL);
                }
                if (eeVar != null) {
                    s sVarF = tVar.F();
                    if (cmVar == null) {
                        cmVar = new cm();
                    }
                    sVarF.p(eeVar, agVar, z, cmVar);
                }
                if (!al()) {
                    ak();
                }
                ag(tVar);
            }
        }
    }

    final void W(t tVar) {
        this.M.remove(tVar);
        ag(tVar);
    }

    final void X(t tVar, String str) {
        ee eeVar;
        ee eeVar2 = this.C;
        if (eeVar2 != null) {
            tVar.F().p(eeVar2, e.a.d.ag.f46608d, true, new cm());
            return;
        }
        if ((this.K instanceof SSLSocket) && !str.equals(this.f47618i)) {
            Map map = this.W;
            if (map.containsKey(str)) {
                eeVar = (ee) map.get(str);
            } else {
                ee eeVarG = this.J.verify(str, ((SSLSocket) this.K).getSession()) ? ee.f47401a : ee.f47411k.g(String.format("HostNameVerifier verification failed for authority '%s'", str));
                if (!eeVarG.l() && !f47610a) {
                    f47612e.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport", "verifyAuthority", String.format("HostNameVerifier verification failed for authority '%s'. This will be an error in the future.", str));
                }
                if (eeVarG.l()) {
                    eeVarG = ee.f47411k.g(String.format("Could not verify authority '%s' for the rpc with no X509TrustManager available", str));
                }
                map.put(str, eeVarG);
                eeVar = eeVarG;
            }
            if (!eeVar.l() && f47610a) {
                tVar.F().p(eeVar, e.a.d.ag.f46605a, true, new cm());
                return;
            }
        }
        if (this.u.size() < this.L) {
            aj(tVar);
        } else {
            this.M.add(tVar);
            ah(tVar);
        }
    }

    final boolean Y() {
        return this.I == null;
    }

    final boolean Z(int i2) {
        boolean z;
        synchronized (this.r) {
            z = false;
            if (i2 < this.t && (i2 & 1) == 1) {
                z = true;
            }
        }
        return z;
    }

    @Override // e.a.d.ek
    public final void a(ee eeVar) {
        t(eeVar);
        synchronized (this.r) {
            Iterator it = this.u.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                it.remove();
                ((t) entry.getValue()).F().o(eeVar, false, new cm());
                ag((t) entry.getValue());
            }
            Deque<t> deque = this.M;
            for (t tVar : deque) {
                tVar.F().p(eeVar, e.a.d.ag.f46608d, true, new cm());
                ag(tVar);
            }
            deque.clear();
            ak();
        }
    }

    @Override // e.a.f.ao
    public final an[] aa() {
        an[] anVarArr;
        synchronized (this.r) {
            Map map = this.u;
            anVarArr = new an[map.size()];
            Iterator it = map.values().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                anVarArr[i2] = ((t) it.next()).F().D();
                i2++;
            }
        }
        return anVarArr;
    }

    final void ad(long j2, long j3, boolean z) {
        this.P = true;
        this.Q = j2;
        this.R = j3;
        this.S = z;
    }

    @Override // e.a.d.aj
    public final /* bridge */ /* synthetic */ e.a.d.af b(cq cqVar, cm cmVar, e.a.h hVar, e.a.p[] pVarArr) {
        t tVar;
        com.google.d.b.an.C(cqVar, "method");
        com.google.d.b.an.C(cmVar, "headers");
        jt jtVarI = jt.i(pVarArr);
        Object obj = this.r;
        synchronized (obj) {
            tVar = new t(cqVar, cmVar, this.p, this, this.q, obj, this.y, this.m, this.f47618i, this.f47619j, jtVarI, this.V, hVar);
        }
        return tVar;
    }

    @Override // e.a.be
    public final az c() {
        return this.s;
    }

    @Override // e.a.d.ge
    public final Runnable d(gd gdVar) {
        this.o = gdVar;
        if (this.P) {
            el elVar = new el(new ka(this), this.x, this.Q, this.R, this.S);
            this.O = elVar;
            elVar.n();
        }
        f fVarO = f.o(this.w, this);
        d dVar = new d(fVarO, this.n.h(k.y.b(fVarO)));
        synchronized (this.r) {
            this.p = new h(this, dVar);
            this.q = new aq(this, this.p);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        this.w.execute(new x(this, countDownLatch, cyclicBarrier, fVarO, countDownLatch2));
        this.v.execute(new y(this, cyclicBarrier, countDownLatch2));
        try {
            synchronized (this.r) {
                this.p.e();
                e.a.f.a.a.p pVar = new e.a.f.a.a.p();
                pVar.f(7, this.m);
                this.p.h(pVar);
            }
            countDownLatch.countDown();
            this.w.execute(new z(this));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // e.a.f.g
    public final void e(Throwable th) {
        ai(0, e.a.f.a.a.a.INTERNAL_ERROR, ee.f47411k.f(th));
    }

    final int i() {
        URI uriE = dh.e(this.f47618i);
        return uriE.getPort() != -1 ? uriE.getPort() : this.f47617h.getPort();
    }

    final t q(int i2) {
        t tVar;
        synchronized (this.r) {
            tVar = (t) this.u.get(Integer.valueOf(i2));
        }
        return tVar;
    }

    @Override // e.a.d.aj
    public final void r(e.a.d.ai aiVar, Executor executor) {
        long jNextLong;
        synchronized (this.r) {
            boolean z = true;
            com.google.d.b.an.u(this.p != null);
            if (this.F) {
                ae();
                dl.e(aiVar, executor);
                return;
            }
            dl dlVar = this.E;
            if (dlVar != null) {
                jNextLong = 0;
                z = false;
            } else {
                jNextLong = this.f47620k.nextLong();
                com.google.d.b.ai aiVar2 = (com.google.d.b.ai) this.f47621l.get();
                aiVar2.e();
                dl dlVar2 = new dl(jNextLong, aiVar2);
                this.E = dlVar2;
                this.V.b();
                dlVar = dlVar2;
            }
            if (z) {
                this.p.b(false, (int) (jNextLong >>> 32), (int) jNextLong);
            }
            dlVar.b(aiVar, executor);
        }
    }

    @Override // e.a.d.ge
    public final void t(ee eeVar) {
        synchronized (this.r) {
            if (this.C != null) {
                return;
            }
            this.C = eeVar;
            this.o.c(eeVar, js.SUBCHANNEL_SHUTDOWN);
            ak();
        }
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.c("logId", this.s.a());
        zVarH.d("address", this.f47617h);
        return zVarH.toString();
    }

    @Override // e.a.d.as
    public final e.a.c v() {
        return this.B;
    }
}

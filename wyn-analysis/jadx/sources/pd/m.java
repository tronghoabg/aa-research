package pd;

import A7.AbstractC0279p0;
import A7.C0237b0;
import A7.RunnableC0280p1;
import E5.C0441b;
import N.I;
import ad.L;
import ba.C1521a;
import c7.C1576l;
import cg.AbstractC1613b;
import cg.C1609A;
import cg.C1615d;
import cg.C1618g;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.unity3d.services.UnityAdsConstants;
import g5.RunnableC2707d;
import j$.util.DesugarCollections;
import j.E;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import md.AbstractC3541i;
import md.C3533a;
import md.C3534b;
import md.C3535c;
import md.C3557z;
import md.F;
import md.b0;
import md.c0;
import md.k0;
import md.l0;
import od.AbstractC3669a0;
import od.C3684f0;
import od.C3687g0;
import od.C3725t0;
import od.C3728u0;
import od.EnumC3721s;
import od.InterfaceC3739y;
import od.P1;
import od.RunnableC3681e0;
import od.S1;
import od.T0;
import od.W1;
import od.Y;
import od.Y1;
import od.a2;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import pb.RunnableC3790a;
import qd.C3887b;
import qd.C3889d;
import rd.C3974i;
import rd.C3975j;
import rd.EnumC3966a;
import sd.C4034a;

/* loaded from: classes5.dex */
public final class m implements InterfaceC3739y {

    /* renamed from: P, reason: collision with root package name */
    public static final Map f43540P;

    /* renamed from: Q, reason: collision with root package name */
    public static final Logger f43541Q;

    /* renamed from: A, reason: collision with root package name */
    public final SocketFactory f43542A;

    /* renamed from: B, reason: collision with root package name */
    public final SSLSocketFactory f43543B;

    /* renamed from: C, reason: collision with root package name */
    public int f43544C;

    /* renamed from: D, reason: collision with root package name */
    public final LinkedList f43545D;

    /* renamed from: E, reason: collision with root package name */
    public final C3887b f43546E;

    /* renamed from: F, reason: collision with root package name */
    public C3728u0 f43547F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f43548G;

    /* renamed from: H, reason: collision with root package name */
    public long f43549H;

    /* renamed from: I, reason: collision with root package name */
    public long f43550I;

    /* renamed from: J, reason: collision with root package name */
    public final RunnableC2707d f43551J;

    /* renamed from: K, reason: collision with root package name */
    public final int f43552K;
    public final a2 L;

    /* renamed from: M, reason: collision with root package name */
    public final C3687g0 f43553M;

    /* renamed from: N, reason: collision with root package name */
    public final C3557z f43554N;

    /* renamed from: O, reason: collision with root package name */
    public final int f43555O;

    /* renamed from: a, reason: collision with root package name */
    public final InetSocketAddress f43556a;

    /* renamed from: b, reason: collision with root package name */
    public final String f43557b;

    /* renamed from: c, reason: collision with root package name */
    public final String f43558c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f43559d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f43560e;

    /* renamed from: f, reason: collision with root package name */
    public final int f43561f;

    /* renamed from: g, reason: collision with root package name */
    public final C3975j f43562g;

    /* renamed from: h, reason: collision with root package name */
    public C0441b f43563h;

    /* renamed from: i, reason: collision with root package name */
    public d f43564i;

    /* renamed from: j, reason: collision with root package name */
    public C1576l f43565j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public final F f43566l;

    /* renamed from: m, reason: collision with root package name */
    public int f43567m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f43568n;

    /* renamed from: o, reason: collision with root package name */
    public final Executor f43569o;

    /* renamed from: p, reason: collision with root package name */
    public final P1 f43570p;

    /* renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f43571q;

    /* renamed from: r, reason: collision with root package name */
    public final int f43572r;

    /* renamed from: s, reason: collision with root package name */
    public int f43573s;

    /* renamed from: t, reason: collision with root package name */
    public RunnableC0280p1 f43574t;

    /* renamed from: u, reason: collision with root package name */
    public C3534b f43575u;

    /* renamed from: v, reason: collision with root package name */
    public k0 f43576v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f43577w;

    /* renamed from: x, reason: collision with root package name */
    public C3684f0 f43578x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f43579y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f43580z;

    static {
        EnumMap enumMap = new EnumMap(EnumC3966a.class);
        EnumC3966a enumC3966a = EnumC3966a.NO_ERROR;
        k0 k0Var = k0.f40681m;
        enumMap.put((EnumMap) enumC3966a, (EnumC3966a) k0Var.h("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) EnumC3966a.PROTOCOL_ERROR, (EnumC3966a) k0Var.h("Protocol error"));
        enumMap.put((EnumMap) EnumC3966a.INTERNAL_ERROR, (EnumC3966a) k0Var.h(UnityAdsConstants.Messages.MSG_INTERNAL_ERROR));
        enumMap.put((EnumMap) EnumC3966a.FLOW_CONTROL_ERROR, (EnumC3966a) k0Var.h("Flow control error"));
        enumMap.put((EnumMap) EnumC3966a.STREAM_CLOSED, (EnumC3966a) k0Var.h("Stream closed"));
        enumMap.put((EnumMap) EnumC3966a.FRAME_TOO_LARGE, (EnumC3966a) k0Var.h("Frame too large"));
        enumMap.put((EnumMap) EnumC3966a.REFUSED_STREAM, (EnumC3966a) k0.f40682n.h("Refused stream"));
        enumMap.put((EnumMap) EnumC3966a.CANCEL, (EnumC3966a) k0.f40675f.h("Cancelled"));
        enumMap.put((EnumMap) EnumC3966a.COMPRESSION_ERROR, (EnumC3966a) k0Var.h("Compression error"));
        enumMap.put((EnumMap) EnumC3966a.CONNECT_ERROR, (EnumC3966a) k0Var.h("Connect error"));
        enumMap.put((EnumMap) EnumC3966a.ENHANCE_YOUR_CALM, (EnumC3966a) k0.k.h("Enhance your calm"));
        enumMap.put((EnumMap) EnumC3966a.INADEQUATE_SECURITY, (EnumC3966a) k0.f40678i.h("Inadequate security"));
        f43540P = DesugarCollections.unmodifiableMap(enumMap);
        f43541Q = Logger.getLogger(m.class.getName());
    }

    public m(g gVar, InetSocketAddress inetSocketAddress, String str, C3534b c3534b, C3557z c3557z, RunnableC2707d runnableC2707d) {
        Y y10 = AbstractC3669a0.f41901r;
        C3975j c3975j = new C3975j();
        this.f43559d = new Random();
        Object obj = new Object();
        this.k = obj;
        this.f43568n = new HashMap();
        this.f43544C = 0;
        this.f43545D = new LinkedList();
        this.f43553M = new C3687g0(this, 2);
        this.f43555O = 30000;
        Fe.e.t(inetSocketAddress, "address");
        this.f43556a = inetSocketAddress;
        this.f43557b = str;
        this.f43572r = gVar.f43496h;
        this.f43561f = gVar.f43499l;
        Executor executor = gVar.f43490b;
        Fe.e.t(executor, "executor");
        this.f43569o = executor;
        this.f43570p = new P1(gVar.f43490b);
        ScheduledExecutorService scheduledExecutorService = gVar.f43492d;
        Fe.e.t(scheduledExecutorService, "scheduledExecutorService");
        this.f43571q = scheduledExecutorService;
        this.f43567m = 3;
        this.f43542A = SocketFactory.getDefault();
        this.f43543B = gVar.f43494f;
        C3887b c3887b = gVar.f43495g;
        Fe.e.t(c3887b, "connectionSpec");
        this.f43546E = c3887b;
        Fe.e.t(y10, "stopwatchFactory");
        this.f43560e = y10;
        this.f43562g = c3975j;
        this.f43558c = "grpc-java-okhttp/1.62.2";
        this.f43554N = c3557z;
        this.f43551J = runnableC2707d;
        this.f43552K = gVar.f43500m;
        gVar.f43493e.getClass();
        this.L = new a2();
        this.f43566l = F.a(m.class, inetSocketAddress.toString());
        C3534b c3534b2 = C3534b.f40612b;
        C3533a c3533a = S1.f41808b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c3533a, c3534b);
        for (Map.Entry entry : c3534b2.f40613a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C3533a) entry.getKey(), entry.getValue());
            }
        }
        this.f43575u = new C3534b(identityHashMap);
        synchronized (obj) {
        }
    }

    public static void g(m mVar, String str) {
        EnumC3966a enumC3966a = EnumC3966a.PROTOCOL_ERROR;
        mVar.getClass();
        mVar.u(0, enumC3966a, y(enumC3966a).b(str));
    }

    public static Socket h(m mVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws l0, NumberFormatException, IOException {
        mVar.getClass();
        Socket socket = null;
        try {
            InetAddress address = inetSocketAddress2.getAddress();
            SocketFactory socketFactory = mVar.f43542A;
            Socket socketCreateSocket = address != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                socketCreateSocket.setTcpNoDelay(true);
                socketCreateSocket.setSoTimeout(mVar.f43555O);
                C1615d c1615dN = AbstractC1613b.n(socketCreateSocket);
                C1609A c1609aC = AbstractC1613b.c(AbstractC1613b.j(socketCreateSocket));
                C1521a c1521aI = mVar.i(inetSocketAddress, str, str2);
                C3889d c3889d = (C3889d) c1521aI.f19415c;
                C4034a c4034a = (C4034a) c1521aI.f19414b;
                Locale locale = Locale.US;
                c1609aC.writeUtf8("CONNECT " + c4034a.f45412a + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + c4034a.f45413b + " HTTP/1.1");
                c1609aC.writeUtf8("\r\n");
                int length = c3889d.f44222b.length / 2;
                for (int i5 = 0; i5 < length; i5++) {
                    int i10 = i5 * 2;
                    String[] strArr = c3889d.f44222b;
                    c1609aC.writeUtf8((i10 < 0 || i10 >= strArr.length) ? null : strArr[i10]);
                    c1609aC.writeUtf8(": ");
                    int i11 = i10 + 1;
                    c1609aC.writeUtf8((i11 < 0 || i11 >= strArr.length) ? null : strArr[i11]);
                    c1609aC.writeUtf8("\r\n");
                }
                c1609aC.writeUtf8("\r\n");
                c1609aC.flush();
                E4.n nVarQ = E4.n.q(s(c1615dN));
                while (!s(c1615dN).equals("")) {
                }
                int i12 = nVarQ.f2938b;
                if (i12 >= 200 && i12 < 300) {
                    socketCreateSocket.setSoTimeout(0);
                    return socketCreateSocket;
                }
                C1618g c1618g = new C1618g();
                try {
                    socketCreateSocket.shutdownOutput();
                    c1615dN.read(c1618g, RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
                } catch (IOException e7) {
                    c1618g.d0("Unable to read body: " + e7.toString());
                }
                try {
                    socketCreateSocket.close();
                } catch (IOException unused) {
                }
                Locale locale2 = Locale.US;
                throw new l0(k0.f40682n.h("Response returned from proxy was not successful (expected 2xx, got " + i12 + StringUtils.SPACE + ((String) nVarQ.f2940d) + "). Response body:\n" + c1618g.readUtf8()));
            } catch (IOException e10) {
                e = e10;
                socket = socketCreateSocket;
                if (socket != null) {
                    AbstractC3669a0.b(socket);
                }
                throw new l0(k0.f40682n.h("Failed trying to connect with proxy").g(e));
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public static String s(C1615d c1615d) throws EOFException {
        C1618g c1618g = new C1618g();
        while (c1615d.read(c1618g, 1L) != -1) {
            if (c1618g.o(c1618g.f19902b - 1) == 10) {
                if (Long.MAX_VALUE < 0) {
                    throw new IllegalArgumentException(AbstractC0279p0.k(Long.MAX_VALUE, "limit < 0: ").toString());
                }
                long j8 = Long.MAX_VALUE != Long.MAX_VALUE ? Long.MAX_VALUE + 1 : Long.MAX_VALUE;
                long jIndexOf = c1618g.indexOf((byte) 10, 0L, j8);
                if (jIndexOf != -1) {
                    return dg.a.b(c1618g, jIndexOf);
                }
                if (j8 < c1618g.f19902b && c1618g.o(j8 - 1) == 13 && c1618g.o(j8) == 10) {
                    return dg.a.b(c1618g, j8);
                }
                C1618g c1618g2 = new C1618g();
                c1618g.h(c1618g2, 0L, Math.min(32, c1618g.f19902b));
                throw new EOFException("\\n not found: limit=" + Math.min(c1618g.f19902b, Long.MAX_VALUE) + " content=" + c1618g2.z(c1618g2.f19902b).e() + (char) 8230);
            }
        }
        throw new EOFException("\\n not found: " + c1618g.z(c1618g.f19902b).e());
    }

    public static k0 y(EnumC3966a enumC3966a) {
        k0 k0Var = (k0) f43540P.get(enumC3966a);
        if (k0Var != null) {
            return k0Var;
        }
        return k0.f40676g.h("Unknown http2 error code: " + enumC3966a.f44753a);
    }

    @Override // od.U0
    public final void a(k0 k0Var) {
        d(k0Var);
        synchronized (this.k) {
            try {
                Iterator it = this.f43568n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((k) entry.getValue()).f43536n.h(k0Var, false, new b0());
                    p((k) entry.getValue());
                }
                for (k kVar : this.f43545D) {
                    kVar.f43536n.g(k0Var, EnumC3721s.f42085d, true, new b0());
                    p(kVar);
                }
                this.f43545D.clear();
                x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // od.InterfaceC3739y
    public final C3534b b() {
        return this.f43575u;
    }

    @Override // od.InterfaceC3727u
    public final od.r c(F6.r rVar, b0 b0Var, C3535c c3535c, AbstractC3541i[] abstractC3541iArr) {
        k kVar;
        Fe.e.t(rVar, "method");
        Fe.e.t(b0Var, "headers");
        C3534b c3534b = this.f43575u;
        W1 w12 = new W1(abstractC3541iArr);
        for (AbstractC3541i abstractC3541i : abstractC3541iArr) {
            abstractC3541i.n(c3534b, b0Var);
        }
        synchronized (this.k) {
            kVar = new k(rVar, b0Var, this.f43564i, this, this.f43565j, this.k, this.f43572r, this.f43561f, this.f43557b, this.f43558c, w12, this.L, c3535c);
        }
        return kVar;
    }

    @Override // od.U0
    public final void d(k0 k0Var) {
        synchronized (this.k) {
            try {
                if (this.f43576v != null) {
                    return;
                }
                this.f43576v = k0Var;
                this.f43563h.o(k0Var);
                x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // od.U0
    public final Runnable e(T0 t02) {
        this.f43563h = (C0441b) t02;
        if (this.f43548G) {
            C3728u0 c3728u0 = new C3728u0(new L(this, 17), this.f43571q, this.f43549H, this.f43550I);
            this.f43547F = c3728u0;
            c3728u0.c();
        }
        c cVar = new c(this.f43570p, this);
        C3975j c3975j = this.f43562g;
        C1609A c1609aC = AbstractC1613b.c(cVar);
        c3975j.getClass();
        C3793b c3793b = new C3793b(cVar, new C3974i(c1609aC));
        synchronized (this.k) {
            d dVar = new d(this, c3793b);
            this.f43564i = dVar;
            C1576l c1576l = new C1576l();
            c1576l.f19706b = this;
            c1576l.f19707c = dVar;
            c1576l.f19705a = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            c1576l.f19708d = new v(c1576l, 0, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
            this.f43565j = c1576l;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f43570p.execute(new RunnableC3790a(this, countDownLatch, cVar, 2));
        try {
            t();
            countDownLatch.countDown();
            this.f43570p.execute(new RunnableC2707d(this, 19));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // md.E
    public final F f() {
        return this.f43566l;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x019c A[EDGE_INSN: B:108:0x019c->B:160:0x0246 BREAK  A[LOOP:9: B:147:0x0223->B:158:0x0242]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x012f A[ADDED_TO_REGION, EDGE_INSN: B:203:0x012f->B:83:0x012f BREAK  A[LOOP:2: B:28:0x0093->B:98:0x0161], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x012f A[EDGE_INSN: B:226:0x012f->B:83:0x012f BREAK  A[LOOP:7: B:52:0x00d4->B:80:0x011c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011c A[LOOP:7: B:52:0x00d4->B:80:0x011c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ba.C1521a i(java.net.InetSocketAddress r21, java.lang.String r22, java.lang.String r23) throws java.net.UnknownHostException {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.m.i(java.net.InetSocketAddress, java.lang.String, java.lang.String):ba.a");
    }

    public final void j(int i5, k0 k0Var, EnumC3721s enumC3721s, boolean z2, EnumC3966a enumC3966a, b0 b0Var) {
        synchronized (this.k) {
            try {
                k kVar = (k) this.f43568n.remove(Integer.valueOf(i5));
                if (kVar != null) {
                    if (enumC3966a != null) {
                        this.f43564i.h(i5, EnumC3966a.CANCEL);
                    }
                    if (k0Var != null) {
                        j jVar = kVar.f43536n;
                        if (b0Var == null) {
                            b0Var = new b0();
                        }
                        jVar.g(k0Var, enumC3721s, z2, b0Var);
                    }
                    if (!v()) {
                        x();
                        p(kVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final v[] k() {
        v[] vVarArr;
        synchronized (this.k) {
            try {
                vVarArr = new v[this.f43568n.size()];
                Iterator it = this.f43568n.values().iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    vVarArr[i5] = ((k) it.next()).f43536n.o();
                    i5++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVarArr;
    }

    public final int l() {
        URI uriA = AbstractC3669a0.a(this.f43557b);
        return uriA.getPort() != -1 ? uriA.getPort() : this.f43556a.getPort();
    }

    public final l0 m() {
        synchronized (this.k) {
            k0 k0Var = this.f43576v;
            if (k0Var != null) {
                return new l0(k0Var);
            }
            return new l0(k0.f40682n.h("Connection closed"));
        }
    }

    public final k n(int i5) {
        k kVar;
        synchronized (this.k) {
            kVar = (k) this.f43568n.get(Integer.valueOf(i5));
        }
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.k
            monitor-enter(r0)
            int r1 = r2.f43567m     // Catch: java.lang.Throwable -> Lf
            if (r3 >= r1) goto Lc
            r1 = 1
            r3 = r3 & r1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.m.o(int):boolean");
    }

    public final void p(k kVar) {
        if (this.f43580z && this.f43545D.isEmpty() && this.f43568n.isEmpty()) {
            this.f43580z = false;
            C3728u0 c3728u0 = this.f43547F;
            if (c3728u0 != null) {
                synchronized (c3728u0) {
                    int i5 = c3728u0.f42101d;
                    if (i5 == 2 || i5 == 3) {
                        c3728u0.f42101d = 1;
                    }
                    if (c3728u0.f42101d == 4) {
                        c3728u0.f42101d = 5;
                    }
                }
            }
        }
        if (kVar.f41919e) {
            this.f43553M.W(kVar, false);
        }
    }

    public final void q(Exception exc) {
        u(0, EnumC3966a.INTERNAL_ERROR, k0.f40682n.g(exc));
    }

    public final void r(C3725t0 c3725t0) {
        long jNextLong;
        boolean z2 = true;
        p8.n nVar = p8.n.f43298a;
        synchronized (this.k) {
            try {
                Fe.e.x(this.f43564i != null);
                if (this.f43579y) {
                    l0 l0VarM = m();
                    Logger logger = C3684f0.f41948g;
                    try {
                        nVar.execute(new RunnableC3681e0(c3725t0, l0VarM));
                    } catch (Throwable th) {
                        C3684f0.f41948g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                    }
                    return;
                }
                C3684f0 c3684f0 = this.f43578x;
                if (c3684f0 != null) {
                    jNextLong = 0;
                    z2 = false;
                } else {
                    jNextLong = this.f43559d.nextLong();
                    this.f43560e.getClass();
                    E e7 = new E(1);
                    e7.b();
                    C3684f0 c3684f02 = new C3684f0(jNextLong, e7);
                    this.f43578x = c3684f02;
                    this.L.getClass();
                    c3684f0 = c3684f02;
                }
                if (z2) {
                    this.f43564i.d(false, (int) (jNextLong >>> 32), (int) jNextLong);
                }
                c3684f0.a(c3725t0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void t() {
        synchronized (this.k) {
            try {
                d dVar = this.f43564i;
                dVar.getClass();
                try {
                    dVar.f43481b.b();
                } catch (IOException e7) {
                    dVar.f43480a.q(e7);
                }
                I i5 = new I(1);
                i5.d(7, this.f43561f);
                d dVar2 = this.f43564i;
                dVar2.f43482c.F(2, i5);
                try {
                    dVar2.f43481b.o(i5);
                } catch (IOException e10) {
                    dVar2.f43480a.q(e10);
                }
                if (this.f43561f > 65535) {
                    this.f43564i.o(0, r1 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.e(this.f43566l.f40575c, "logId");
        c0237b0S.f(this.f43556a, "address");
        return c0237b0S.toString();
    }

    public final void u(int i5, EnumC3966a enumC3966a, k0 k0Var) {
        synchronized (this.k) {
            try {
                if (this.f43576v == null) {
                    this.f43576v = k0Var;
                    this.f43563h.o(k0Var);
                }
                if (enumC3966a != null && !this.f43577w) {
                    this.f43577w = true;
                    this.f43564i.b(enumC3966a, new byte[0]);
                }
                Iterator it = this.f43568n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i5) {
                        it.remove();
                        ((k) entry.getValue()).f43536n.g(k0Var, EnumC3721s.f42083b, false, new b0());
                        p((k) entry.getValue());
                    }
                }
                for (k kVar : this.f43545D) {
                    kVar.f43536n.g(k0Var, EnumC3721s.f42085d, true, new b0());
                    p(kVar);
                }
                this.f43545D.clear();
                x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean v() {
        boolean z2 = false;
        while (true) {
            LinkedList linkedList = this.f43545D;
            if (linkedList.isEmpty() || this.f43568n.size() >= this.f43544C) {
                break;
            }
            w((k) linkedList.poll());
            z2 = true;
        }
        return z2;
    }

    public final void w(k kVar) {
        Fe.e.w("StreamId already assigned", kVar.f43536n.f43526K == -1);
        this.f43568n.put(Integer.valueOf(this.f43567m), kVar);
        if (!this.f43580z) {
            this.f43580z = true;
            C3728u0 c3728u0 = this.f43547F;
            if (c3728u0 != null) {
                c3728u0.b();
            }
        }
        if (kVar.f41919e) {
            this.f43553M.W(kVar, true);
        }
        j jVar = kVar.f43536n;
        int i5 = this.f43567m;
        if (!(jVar.f43526K == -1)) {
            throw new IllegalStateException(Fe.g.E("the stream has been started with id %s", Integer.valueOf(i5)));
        }
        jVar.f43526K = i5;
        C1576l c1576l = jVar.f43521F;
        jVar.f43525J = new v(c1576l, i5, c1576l.f19705a, jVar);
        j jVar2 = jVar.L.f43536n;
        Fe.e.x(jVar2.f41879j != null);
        synchronized (jVar2.f41871b) {
            Fe.e.w("Already allocated", !jVar2.f41875f);
            jVar2.f41875f = true;
        }
        jVar2.f();
        a2 a2Var = jVar2.f41872c;
        a2Var.getClass();
        ((Y1) a2Var.f41914b).d();
        if (jVar.f43523H) {
            jVar.f43520E.i(jVar.L.f43539q, jVar.f43526K, jVar.f43529x);
            for (AbstractC3541i abstractC3541i : jVar.L.f43534l.f41842a) {
                abstractC3541i.h();
            }
            jVar.f43529x = null;
            C1618g c1618g = jVar.f43530y;
            if (c1618g.f19902b > 0) {
                jVar.f43521F.a(jVar.f43531z, jVar.f43525J, c1618g, jVar.f43516A);
            }
            jVar.f43523H = false;
        }
        c0 c0Var = (c0) kVar.f43533j.f4014e;
        if ((c0Var != c0.f40628a && c0Var != c0.f40629b) || kVar.f43539q) {
            this.f43564i.flush();
        }
        int i10 = this.f43567m;
        if (i10 < 2147483645) {
            this.f43567m = i10 + 2;
        } else {
            this.f43567m = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            u(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, EnumC3966a.NO_ERROR, k0.f40682n.h("Stream ids exhausted"));
        }
    }

    public final void x() {
        if (this.f43576v == null || !this.f43568n.isEmpty() || !this.f43545D.isEmpty() || this.f43579y) {
            return;
        }
        this.f43579y = true;
        C3728u0 c3728u0 = this.f43547F;
        if (c3728u0 != null) {
            synchronized (c3728u0) {
                try {
                    if (c3728u0.f42101d != 6) {
                        c3728u0.f42101d = 6;
                        ScheduledFuture scheduledFuture = c3728u0.f42102e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        ScheduledFuture scheduledFuture2 = c3728u0.f42103f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            c3728u0.f42103f = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C3684f0 c3684f0 = this.f43578x;
        if (c3684f0 != null) {
            c3684f0.c(m());
            this.f43578x = null;
        }
        if (!this.f43577w) {
            this.f43577w = true;
            this.f43564i.b(EnumC3966a.NO_ERROR, new byte[0]);
        }
        this.f43564i.close();
    }
}

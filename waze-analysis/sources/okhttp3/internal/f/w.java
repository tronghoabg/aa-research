package okhttp3.internal.f;

import androidx.media3.common.C;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class w implements Closeable {
    private static final com.google.firebase.d.c.b y;
    private com.google.firebase.d.c.b A;

    /* renamed from: a, reason: collision with root package name */
    private final j f56221a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f56222b;

    /* renamed from: c, reason: collision with root package name */
    private final String f56223c;

    /* renamed from: d, reason: collision with root package name */
    private int f56224d;

    /* renamed from: e, reason: collision with root package name */
    private int f56225e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f56226f;

    /* renamed from: g, reason: collision with root package name */
    private final okhttp3.internal.b.e f56227g;

    /* renamed from: h, reason: collision with root package name */
    private final okhttp3.internal.b.c f56228h;

    /* renamed from: i, reason: collision with root package name */
    private final okhttp3.internal.b.c f56229i;

    /* renamed from: j, reason: collision with root package name */
    private final okhttp3.internal.b.c f56230j;

    /* renamed from: k, reason: collision with root package name */
    private final ai f56231k;

    /* renamed from: l, reason: collision with root package name */
    private long f56232l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;
    private final Socket u;
    private final ae v;
    private final o w;
    private final Set x;
    private final com.google.firebase.d.c.b z;

    static {
        com.google.firebase.d.c.b bVar = new com.google.firebase.d.c.b((byte[]) null);
        bVar.m(7, 65535);
        bVar.m(5, 16384);
        y = bVar;
    }

    public w(h hVar) {
        h.g.b.x.f(hVar, "builder");
        this.f56221a = hVar.c();
        this.f56222b = new LinkedHashMap();
        String str = hVar.f56183b;
        k.j jVar = null;
        if (str == null) {
            h.g.b.x.j("connectionName");
            str = null;
        }
        this.f56223c = str;
        this.f56225e = 3;
        okhttp3.internal.b.e eVarA = hVar.a();
        this.f56227g = eVarA;
        this.f56228h = eVarA.c();
        this.f56229i = eVarA.c();
        this.f56230j = eVarA.c();
        this.f56231k = hVar.d();
        com.google.firebase.d.c.b bVar = new com.google.firebase.d.c.b((byte[]) null);
        bVar.m(7, 16777216);
        this.z = bVar;
        this.A = y;
        this.t = r0.h();
        Socket socket = hVar.f56182a;
        if (socket == null) {
            h.g.b.x.j("socket");
            socket = null;
        }
        this.u = socket;
        k.i iVar = hVar.f56185d;
        if (iVar == null) {
            h.g.b.x.j("sink");
            iVar = null;
        }
        this.v = new ae(iVar);
        k.j jVar2 = hVar.f56184c;
        if (jVar2 == null) {
            h.g.b.x.j("source");
        } else {
            jVar = jVar2;
        }
        this.w = new o(this, new z(jVar));
        this.x = new LinkedHashSet();
    }

    public static final boolean N(int i2) {
        return (i2 & 1) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(IOException iOException) throws IOException {
        b bVar = b.f56140b;
        x(bVar, bVar, iOException);
    }

    public final void A(int i2, b bVar) {
        h.g.b.x.f(bVar, "errorCode");
        this.f56229i.l(new s(this.f56223c + "[" + i2 + "] onReset", this, i2, bVar));
    }

    public final void B() {
        synchronized (this) {
            long j2 = this.n;
            long j3 = this.m;
            if (j2 >= j3) {
                this.m = j3 + 1;
                this.p = System.nanoTime() + C.NANOS_PER_SECOND;
                this.f56228h.l(new t(String.valueOf(this.f56223c).concat(" ping"), this));
            }
        }
    }

    public final void C(int i2) {
        this.f56224d = i2;
    }

    public final void D(b bVar) {
        h.g.b.x.f(bVar, "statusCode");
        synchronized (this.v) {
            synchronized (this) {
                if (!this.f56226f) {
                    this.f56226f = true;
                    this.v.f(this.f56224d, bVar, okhttp3.internal.b.f55955a);
                }
            }
        }
    }

    public final synchronized void E(long j2) {
        long j3 = this.q + j2;
        this.q = j3;
        long j4 = j3 - this.r;
        if (j4 >= this.z.h() / 2) {
            J(0, j4);
            this.r += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r2 = (int) java.lang.Math.min(r13, r6 - r4);
        r4 = r9.v;
        r2 = java.lang.Math.min(r2, r4.a());
        r7 = r2;
        r9.s += r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(int r10, boolean r11, k.h r12, long r13) {
        /*
            r9 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L66
        L7:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L65
            monitor-enter(r9)
        Lc:
            long r4 = r9.s     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            long r6 = r9.t     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L2f
            java.util.Map r2 = r9.f56222b     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            if (r2 == 0) goto L27
            r2 = r9
            java.lang.Object r2 = (java.lang.Object) r2     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            r2.wait()     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            goto Lc
        L27:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.String r11 = "stream closed"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            throw r10     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
        L2f:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r13, r6)     // Catch: java.lang.Throwable -> L54
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L54
            okhttp3.internal.f.ae r4 = r9.v     // Catch: java.lang.Throwable -> L54
            int r5 = r4.a()     // Catch: java.lang.Throwable -> L54
            int r2 = java.lang.Math.min(r2, r5)     // Catch: java.lang.Throwable -> L54
            long r5 = r9.s     // Catch: java.lang.Throwable -> L54
            long r7 = (long) r2     // Catch: java.lang.Throwable -> L54
            long r5 = r5 + r7
            r9.s = r5     // Catch: java.lang.Throwable -> L54
            monitor-exit(r9)
            long r13 = r13 - r7
            if (r11 == 0) goto L4f
            int r5 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r5 != 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = r3
        L50:
            r4.c(r5, r10, r12, r2)
            goto L7
        L54:
            r10 = move-exception
            goto L63
        L56:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L54
            r10.interrupt()     // Catch: java.lang.Throwable -> L54
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L54
            r10.<init>()     // Catch: java.lang.Throwable -> L54
            throw r10     // Catch: java.lang.Throwable -> L54
        L63:
            monitor-exit(r9)
            throw r10
        L65:
            return
        L66:
            okhttp3.internal.f.ae r9 = r9.v
            r9.c(r11, r10, r12, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.f.w.F(int, boolean, k.h, long):void");
    }

    public final void G(boolean z, int i2, int i3) throws IOException {
        try {
            this.v.h(z, i2, i3);
        } catch (IOException e2) {
            V(e2);
        }
    }

    public final void H(int i2, b bVar) {
        h.g.b.x.f(bVar, "statusCode");
        this.v.i(i2, bVar);
    }

    public final void I(int i2, b bVar) {
        h.g.b.x.f(bVar, "errorCode");
        this.f56228h.l(new u(this.f56223c + "[" + i2 + "] writeSynReset", this, i2, bVar));
    }

    public final void J(int i2, long j2) {
        this.f56228h.l(new v(this.f56223c + "[" + i2 + "] windowUpdate", this, i2, j2));
    }

    public final synchronized boolean L(long j2) {
        if (this.f56226f) {
            return false;
        }
        if (this.n < this.m) {
            if (j2 >= this.p) {
                return false;
            }
        }
        return true;
    }

    public final void O(okhttp3.internal.b.e eVar) {
        h.g.b.x.f(eVar, "taskRunner");
        ae aeVar = this.v;
        aeVar.b();
        com.google.firebase.d.c.b bVar = this.z;
        aeVar.l(bVar);
        if (bVar.h() != 65535) {
            aeVar.j(0, r1 - 65535);
        }
        eVar.c().l(new okhttp3.internal.b.b(this.f56223c, this.w));
    }

    public final void P(int i2, k.j jVar, int i3) {
        h.g.b.x.f(jVar, "source");
        k.h hVar = new k.h();
        long j2 = i3;
        jVar.O(j2);
        jVar.a(hVar, j2);
        this.f56229i.l(new p(this.f56223c + "[" + i2 + "] onData", this, i2, hVar, i3));
    }

    public final void Q(int i2, List list) {
        h.g.b.x.f(list, "requestHeaders");
        this.f56229i.l(new q(this.f56223c + "[" + i2 + "] onHeaders", this, i2, list));
    }

    public final com.google.firebase.d.c.b S() {
        return this.z;
    }

    public final com.google.firebase.d.c.b T() {
        return this.A;
    }

    public final void U(com.google.firebase.d.c.b bVar) {
        h.g.b.x.f(bVar, "<set-?>");
        this.A = bVar;
    }

    public final int a() {
        return this.f56224d;
    }

    public final int b() {
        return this.f56225e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        x(b.f56139a, b.f56147i, null);
    }

    public final long f() {
        return this.t;
    }

    public final String g() {
        return this.f56223c;
    }

    public final Map h() {
        return this.f56222b;
    }

    public final j m() {
        return this.f56221a;
    }

    public final synchronized ad n(int i2) {
        return (ad) this.f56222b.get(Integer.valueOf(i2));
    }

    public final ad o(List list, boolean z) {
        w wVar;
        Throwable th;
        int i2;
        ad adVar;
        boolean z2;
        boolean z3;
        h.g.b.x.f(list, "requestHeaders");
        synchronized (this.v) {
            synchronized (this) {
                try {
                    if (this.f56225e > 1073741823) {
                        try {
                            D(b.f56146h);
                        } catch (Throwable th2) {
                            th = th2;
                            wVar = this;
                            throw th;
                        }
                    }
                    try {
                        if (this.f56226f) {
                            throw new a();
                        }
                        i2 = this.f56225e;
                        this.f56225e = i2 + 2;
                        z2 = !z;
                        adVar = new ad(i2, this, z2, false, null);
                        z3 = true;
                        if (z && this.s < this.t && adVar.e() < adVar.d()) {
                            z3 = false;
                        }
                        if (adVar.D()) {
                            this.f56222b.put(Integer.valueOf(i2), adVar);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    wVar = this;
                }
            }
            this.v.g(z2, i2, list);
        }
        if (z3) {
            this.v.d();
        }
        return adVar;
    }

    public final synchronized ad p(int i2) {
        ad adVar;
        adVar = (ad) this.f56222b.remove(Integer.valueOf(i2));
        notifyAll();
        return adVar;
    }

    public final ae q() {
        return this.v;
    }

    public final void x(b bVar, b bVar2, IOException iOException) throws IOException {
        int i2;
        Object[] array;
        h.g.b.x.f(bVar, "connectionCode");
        h.g.b.x.f(bVar2, "streamCode");
        byte[] bArr = okhttp3.internal.b.f55955a;
        try {
            D(bVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            Map map = this.f56222b;
            if (map.isEmpty()) {
                array = null;
            } else {
                array = map.values().toArray(new ad[0]);
                map.clear();
            }
        }
        ad[] adVarArr = (ad[]) array;
        if (adVarArr != null) {
            for (ad adVar : adVarArr) {
                try {
                    adVar.t(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.v.close();
        } catch (IOException unused3) {
        }
        try {
            this.u.close();
        } catch (IOException unused4) {
        }
        this.f56228h.f();
        this.f56229i.f();
        this.f56230j.f();
    }

    public final void y() {
        this.v.d();
    }

    public final void z(int i2, List list) {
        h.g.b.x.f(list, "requestHeaders");
        synchronized (this) {
            Set set = this.x;
            Integer numValueOf = Integer.valueOf(i2);
            if (set.contains(numValueOf)) {
                I(i2, b.f56140b);
                return;
            }
            set.add(numValueOf);
            this.f56229i.l(new r(this.f56223c + "[" + i2 + "] onRequest", this, i2, list));
        }
    }
}

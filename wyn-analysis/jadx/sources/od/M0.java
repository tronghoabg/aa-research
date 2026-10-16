package od;

import A.AbstractC0213f;
import A7.AbstractC0279p0;
import A7.C0237b0;
import A7.RunnableC0299w0;
import Va.M6;
import Va.X7;
import Va.Y7;
import a2.C1323c;
import g2.C2690k;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import md.AbstractC3536d;
import md.AbstractC3538f;
import md.C3531C;
import md.C3535c;
import md.C3539g;
import md.C3542j;
import md.C3544l;
import md.C3551t;
import md.EnumC3545m;
import oc.C3665d;

/* loaded from: classes5.dex */
public final class M0 extends md.S implements md.E {

    /* renamed from: d0, reason: collision with root package name */
    public static final Logger f41645d0 = Logger.getLogger(M0.class.getName());

    /* renamed from: e0, reason: collision with root package name */
    public static final Pattern f41646e0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: f0, reason: collision with root package name */
    public static final md.k0 f41647f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final md.k0 f41648g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final md.k0 f41649h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final S0 f41650i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final C3737x0 f41651j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final C f41652k0;

    /* renamed from: A, reason: collision with root package name */
    public final HashSet f41653A;

    /* renamed from: B, reason: collision with root package name */
    public LinkedHashSet f41654B;

    /* renamed from: C, reason: collision with root package name */
    public final Object f41655C;

    /* renamed from: D, reason: collision with root package name */
    public final HashSet f41656D;

    /* renamed from: E, reason: collision with root package name */
    public final H f41657E;

    /* renamed from: F, reason: collision with root package name */
    public final Y7 f41658F;

    /* renamed from: G, reason: collision with root package name */
    public final AtomicBoolean f41659G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f41660H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f41661I;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f41662J;

    /* renamed from: K, reason: collision with root package name */
    public final CountDownLatch f41663K;
    public final Y1 L;

    /* renamed from: M, reason: collision with root package name */
    public final X7 f41664M;

    /* renamed from: N, reason: collision with root package name */
    public final C3704m f41665N;

    /* renamed from: O, reason: collision with root package name */
    public final C3698k f41666O;

    /* renamed from: P, reason: collision with root package name */
    public final C3531C f41667P;

    /* renamed from: Q, reason: collision with root package name */
    public final J0 f41668Q;

    /* renamed from: R, reason: collision with root package name */
    public S0 f41669R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f41670S;

    /* renamed from: T, reason: collision with root package name */
    public final boolean f41671T;

    /* renamed from: U, reason: collision with root package name */
    public final com.google.android.gms.ads.nativead.l f41672U;

    /* renamed from: V, reason: collision with root package name */
    public final long f41673V;

    /* renamed from: W, reason: collision with root package name */
    public final long f41674W;

    /* renamed from: X, reason: collision with root package name */
    public final boolean f41675X;

    /* renamed from: Y, reason: collision with root package name */
    public final C3542j f41676Y;

    /* renamed from: Z, reason: collision with root package name */
    public final C3687g0 f41677Z;

    /* renamed from: a, reason: collision with root package name */
    public final md.F f41678a;

    /* renamed from: a0, reason: collision with root package name */
    public final d7.j f41679a0;

    /* renamed from: b, reason: collision with root package name */
    public final String f41680b;

    /* renamed from: b0, reason: collision with root package name */
    public final C3665d f41681b0;

    /* renamed from: c, reason: collision with root package name */
    public final md.g0 f41682c;

    /* renamed from: c0, reason: collision with root package name */
    public int f41683c0;

    /* renamed from: d, reason: collision with root package name */
    public final Q9.a f41684d;

    /* renamed from: e, reason: collision with root package name */
    public final a2 f41685e;

    /* renamed from: f, reason: collision with root package name */
    public final C3695j f41686f;

    /* renamed from: g, reason: collision with root package name */
    public final K0 f41687g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f41688h;

    /* renamed from: i, reason: collision with root package name */
    public final a2.v f41689i;

    /* renamed from: j, reason: collision with root package name */
    public final D0 f41690j;
    public final D0 k;

    /* renamed from: l, reason: collision with root package name */
    public final Y1 f41691l;

    /* renamed from: m, reason: collision with root package name */
    public final md.n0 f41692m;

    /* renamed from: n, reason: collision with root package name */
    public final C3551t f41693n;

    /* renamed from: o, reason: collision with root package name */
    public final C3544l f41694o;

    /* renamed from: p, reason: collision with root package name */
    public final Y f41695p;

    /* renamed from: q, reason: collision with root package name */
    public final long f41696q;

    /* renamed from: r, reason: collision with root package name */
    public final d7.j f41697r;

    /* renamed from: s, reason: collision with root package name */
    public final Y1 f41698s;

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC3536d f41699t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f41700u;

    /* renamed from: v, reason: collision with root package name */
    public L1 f41701v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f41702w;

    /* renamed from: x, reason: collision with root package name */
    public E0 f41703x;

    /* renamed from: y, reason: collision with root package name */
    public volatile md.M f41704y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f41705z;

    static {
        md.k0 k0Var = md.k0.f40682n;
        f41647f0 = k0Var.h("Channel shutdownNow invoked");
        f41648g0 = k0Var.h("Channel shutdown invoked");
        f41649h0 = k0Var.h("Subchannel shutdown invoked");
        f41650i0 = new S0(null, new HashMap(), new HashMap(), null, null, null);
        f41651j0 = new C3737x0();
        f41652k0 = new C(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [md.g] */
    public M0(N0 n02, pd.g gVar, Y1 y12, a2.v vVar, Y y10, ArrayList arrayList) {
        int i5;
        Y1 y13 = Y1.f41850b;
        md.n0 n0Var = new md.n0(new A0(this, 0));
        this.f41692m = n0Var;
        d7.j jVar = new d7.j();
        jVar.f34137a = new ArrayList();
        jVar.f34138b = EnumC3545m.f40695d;
        this.f41697r = jVar;
        this.f41653A = new HashSet(16, 0.75f);
        this.f41655C = new Object();
        this.f41656D = new HashSet(1, 0.75f);
        Y7 y72 = new Y7();
        y72.f13870d = this;
        y72.f13867a = new Object();
        y72.f13868b = new HashSet();
        this.f41658F = y72;
        this.f41659G = new AtomicBoolean(false);
        this.f41663K = new CountDownLatch(1);
        this.f41683c0 = 1;
        this.f41669R = f41650i0;
        this.f41670S = false;
        this.f41672U = new com.google.android.gms.ads.nativead.l(12);
        this.f41676Y = md.r.f40714d;
        C1323c c1323c = new C1323c(this, 19);
        this.f41677Z = new C3687g0(this, 1);
        this.f41679a0 = new d7.j(this);
        String str = n02.f41721f;
        Fe.e.t(str, "target");
        this.f41680b = str;
        md.F f10 = new md.F("Channel", str, md.F.f40572d.incrementAndGet());
        this.f41678a = f10;
        this.f41691l = y13;
        a2.v vVar2 = n02.f41716a;
        Fe.e.t(vVar2, "executorPool");
        this.f41689i = vVar2;
        Executor executor = (Executor) V1.a((U1) vVar2.f17322b);
        Fe.e.t(executor, "executor");
        this.f41688h = executor;
        a2.v vVar3 = n02.f41717b;
        Fe.e.t(vVar3, "offloadExecutorPool");
        D0 d02 = new D0(vVar3);
        this.k = d02;
        C3695j c3695j = new C3695j(gVar, d02);
        this.f41686f = c3695j;
        K0 k02 = new K0(gVar.f43492d);
        this.f41687g = k02;
        C3704m c3704m = new C3704m(f10, y13.d(), AbstractC0279p0.l("Channel for '", str, "'"));
        this.f41665N = c3704m;
        C3698k c3698k = new C3698k(c3704m, y13);
        this.f41666O = c3698k;
        C3712o1 c3712o1 = AbstractC3669a0.f41896m;
        boolean z2 = n02.f41729o;
        this.f41675X = z2;
        a2 a2Var = new a2(n02.f41722g);
        this.f41685e = a2Var;
        md.g0 g0Var = n02.f41719d;
        this.f41682c = g0Var;
        C2690k c2690k = new C2690k(z2, n02.k, n02.f41726l, a2Var);
        pd.h hVar = (pd.h) n02.f41738x.f26356b;
        int iF = AbstractC0213f.f(hVar.f43511g);
        if (iF == 0) {
            i5 = 443;
        } else {
            if (iF != 1) {
                throw new AssertionError(pd.f.p(hVar.f43511g).concat(" not handled"));
            }
            i5 = 80;
        }
        Integer numValueOf = Integer.valueOf(i5);
        c3712o1.getClass();
        Q9.a aVar = new Q9.a(numValueOf, c3712o1, n0Var, c2690k, k02, c3698k, d02);
        this.f41684d = aVar;
        c3695j.f41993a.getClass();
        this.f41701v = t(str, g0Var, aVar, Collections.singleton(InetSocketAddress.class));
        this.f41690j = new D0(vVar);
        H h10 = new H(executor, n0Var);
        this.f41657E = h10;
        h10.e(c1323c);
        this.f41698s = y12;
        boolean z10 = n02.f41731q;
        this.f41671T = z10;
        J0 j02 = new J0(this, this.f41701v.f());
        this.f41668Q = j02;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j02 = new C3539g(j02, (ud.g) it.next());
        }
        this.f41699t = j02;
        this.f41700u = new ArrayList(n02.f41720e);
        Fe.e.t(y10, "stopwatchSupplier");
        this.f41695p = y10;
        long j8 = n02.f41725j;
        if (j8 == -1) {
            this.f41696q = j8;
        } else {
            Fe.e.o("invalid idleTimeoutMillis %s", j8, j8 >= N0.f41709A);
            this.f41696q = n02.f41725j;
        }
        RunnableC3740y0 runnableC3740y0 = new RunnableC3740y0(this, 5);
        ScheduledExecutorService scheduledExecutorService = c3695j.f41993a.f43492d;
        j.E e7 = new j.E(1);
        C3665d c3665d = new C3665d();
        c3665d.f41477e = runnableC3740y0;
        c3665d.f41476d = n0Var;
        c3665d.f41475c = scheduledExecutorService;
        c3665d.f41478f = e7;
        e7.b();
        this.f41681b0 = c3665d;
        C3551t c3551t = n02.f41723h;
        Fe.e.t(c3551t, "decompressorRegistry");
        this.f41693n = c3551t;
        C3544l c3544l = n02.f41724i;
        Fe.e.t(c3544l, "compressorRegistry");
        this.f41694o = c3544l;
        this.f41674W = n02.f41727m;
        this.f41673V = n02.f41728n;
        this.L = new Y1(13);
        this.f41664M = new X7();
        C3531C c3531c = n02.f41730p;
        c3531c.getClass();
        this.f41667P = c3531c;
        if (z10) {
            return;
        }
        this.f41670S = true;
    }

    public static void o(M0 m02) {
        m02.w(true);
        H h10 = m02.f41657E;
        h10.i(null);
        m02.f41666O.g(2, "Entering IDLE state");
        m02.f41697r.d(EnumC3545m.f40695d);
        Object[] objArr = {m02.f41655C, h10};
        C3687g0 c3687g0 = m02.f41677Z;
        c3687g0.getClass();
        for (int i5 = 0; i5 < 2; i5++) {
            if (((Set) c3687g0.f421a).contains(objArr[i5])) {
                m02.s();
                return;
            }
        }
    }

    public static void p(M0 m02) {
        if (m02.f41660H) {
            Iterator it = m02.f41653A.iterator();
            while (it.hasNext()) {
                C3711o0 c3711o0 = (C3711o0) it.next();
                c3711o0.getClass();
                md.k0 k0Var = f41647f0;
                RunnableC3693i0 runnableC3693i0 = new RunnableC3693i0(c3711o0, k0Var, 0);
                md.n0 n0Var = c3711o0.k;
                n0Var.execute(runnableC3693i0);
                n0Var.execute(new RunnableC3693i0(c3711o0, k0Var, 1));
            }
            Iterator it2 = m02.f41656D.iterator();
            if (it2.hasNext()) {
                throw M6.j(it2);
            }
        }
    }

    public static void q(M0 m02) {
        if (!m02.f41662J && m02.f41659G.get() && m02.f41653A.isEmpty() && m02.f41656D.isEmpty()) {
            m02.f41666O.g(2, "Terminated");
            a2.v vVar = m02.f41689i;
            V1.b((U1) vVar.f17322b, m02.f41688h);
            D0 d02 = m02.f41690j;
            synchronized (d02) {
                Executor executor = d02.f41536b;
                if (executor != null) {
                    V1.b((U1) d02.f41535a.f17322b, executor);
                    d02.f41536b = null;
                }
            }
            m02.k.b();
            m02.f41686f.close();
            m02.f41662J = true;
            m02.f41663K.countDown();
        }
    }

    public static L1 t(String str, md.g0 g0Var, Q9.a aVar, Collection collection) {
        URI uri;
        Q9.a aVar2;
        String str2;
        String str3;
        String str4;
        StringBuilder sb2 = new StringBuilder();
        O o7 = null;
        try {
            uri = new URI(str);
        } catch (URISyntaxException e7) {
            sb2.append(e7.getMessage());
            uri = null;
        }
        md.f0 f0VarB = uri != null ? g0Var.b(uri.getScheme()) : null;
        if (f0VarB == null && !f41646e0.matcher(str).matches()) {
            try {
                synchronized (g0Var) {
                    str4 = g0Var.f40644a;
                }
                uri = new URI(str4, "", "/" + str, null);
                f0VarB = g0Var.b(uri.getScheme());
            } catch (URISyntaxException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        if (f0VarB == null) {
            if (sb2.length() > 0) {
                str3 = " (" + ((Object) sb2) + ")";
            } else {
                str3 = "";
            }
            throw new IllegalArgumentException(AbstractC0279p0.l("Could not find a NameResolverProvider for ", str, str3));
        }
        if (collection != null && !collection.containsAll(Collections.singleton(InetSocketAddress.class))) {
            throw new IllegalArgumentException(R8.v.g("Address types of NameResolver '", uri.getScheme(), "' for '", str, "' not supported by transport"));
        }
        if ("dns".equals(uri.getScheme())) {
            String path = uri.getPath();
            Fe.e.t(path, "targetPath");
            if (!path.startsWith("/")) {
                throw new IllegalArgumentException(Fe.g.E("the path component (%s) of the target (%s) must start with '/'", path, uri));
            }
            String strSubstring = path.substring(1);
            uri.getAuthority();
            aVar2 = aVar;
            o7 = new O(strSubstring, aVar2, AbstractC3669a0.f41899p, new j.E(1), P.f41770a);
        } else {
            aVar2 = aVar;
        }
        if (o7 != null) {
            Y1 y12 = new Y1(7);
            K0 k02 = (K0) aVar2.f9916f;
            if (k02 == null) {
                throw new IllegalStateException("ScheduledExecutorService not set in Builder");
            }
            md.n0 n0Var = (md.n0) aVar2.f9914d;
            return new L1(o7, new C3689h(y12, k02, n0Var), n0Var);
        }
        if (sb2.length() > 0) {
            str2 = " (" + ((Object) sb2) + ")";
        } else {
            str2 = "";
        }
        throw new IllegalArgumentException(AbstractC0279p0.l("cannot create a NameResolver for ", str, str2));
    }

    @Override // md.E
    public final md.F f() {
        return this.f41678a;
    }

    @Override // md.AbstractC3536d
    public final String g() {
        return this.f41699t.g();
    }

    @Override // md.AbstractC3536d
    public final AbstractC3538f h(F6.r rVar, C3535c c3535c) {
        return this.f41699t.h(rVar, c3535c);
    }

    @Override // md.S
    public final boolean i(long j8) {
        return this.f41663K.await(j8, TimeUnit.SECONDS);
    }

    @Override // md.S
    public final void j() {
        this.f41692m.execute(new RunnableC3740y0(this, 1));
    }

    @Override // md.S
    public final EnumC3545m k() {
        EnumC3545m enumC3545m = (EnumC3545m) this.f41697r.f34138b;
        if (enumC3545m == null) {
            throw new UnsupportedOperationException("Channel state API is not implemented");
        }
        if (enumC3545m == EnumC3545m.f40695d) {
            this.f41692m.execute(new RunnableC3740y0(this, 2));
        }
        return enumC3545m;
    }

    @Override // md.S
    public final void l(EnumC3545m enumC3545m, v9.n nVar) {
        this.f41692m.execute(new RunnableC0299w0(this, nVar, enumC3545m, 28));
    }

    @Override // md.S
    public final /* bridge */ /* synthetic */ md.S m() {
        v();
        return this;
    }

    @Override // md.S
    public final md.S n() {
        this.f41666O.g(1, "shutdownNow() called");
        v();
        J0 j02 = this.f41668Q;
        j02.f41613d.f41692m.execute(new H0(j02, 1));
        this.f41692m.execute(new RunnableC3740y0(this, 4));
        return this;
    }

    public final void r(boolean z2) {
        ScheduledFuture scheduledFuture;
        C3665d c3665d = this.f41681b0;
        c3665d.f41474b = false;
        if (!z2 || (scheduledFuture = (ScheduledFuture) c3665d.f41479g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        c3665d.f41479g = null;
    }

    public final void s() {
        this.f41692m.e();
        if (this.f41659G.get() || this.f41705z) {
            return;
        }
        if (((Set) this.f41677Z.f421a).isEmpty()) {
            u();
        } else {
            r(false);
        }
        if (this.f41703x != null) {
            return;
        }
        this.f41666O.g(2, "Exiting idle mode");
        E0 e02 = new E0(this);
        a2 a2Var = this.f41685e;
        a2Var.getClass();
        S3.n nVar = new S3.n();
        nVar.f10973d = a2Var;
        nVar.f10970a = e02;
        md.Q q4 = (md.Q) a2Var.f41914b;
        String str = (String) a2Var.f41915c;
        md.P pC = q4.c(str);
        nVar.f10972c = pC;
        if (pC == null) {
            throw new IllegalStateException(AbstractC0279p0.l("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
        }
        nVar.f10971b = pC.b(e02);
        e02.f41548a = nVar;
        this.f41703x = e02;
        this.f41701v.k(new F0(this, e02, this.f41701v));
        this.f41702w = true;
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.e(this.f41678a.f40575c, "logId");
        c0237b0S.f(this.f41680b, "target");
        return c0237b0S.toString();
    }

    public final void u() {
        long j8 = this.f41696q;
        if (j8 == -1) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C3665d c3665d = this.f41681b0;
        c3665d.getClass();
        long nanos = timeUnit.toNanos(j8);
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jA = ((j.E) c3665d.f41478f).a() + nanos;
        c3665d.f41474b = true;
        if (jA - c3665d.f41473a < 0 || ((ScheduledFuture) c3665d.f41479g) == null) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) c3665d.f41479g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            c3665d.f41479g = ((ScheduledExecutorService) c3665d.f41475c).schedule(new RunnableC3726t1(c3665d, 1), nanos, timeUnit2);
        }
        c3665d.f41473a = jA;
    }

    public final void v() {
        this.f41666O.g(1, "shutdown() called");
        if (this.f41659G.compareAndSet(false, true)) {
            RunnableC3740y0 runnableC3740y0 = new RunnableC3740y0(this, 3);
            md.n0 n0Var = this.f41692m;
            n0Var.execute(runnableC3740y0);
            J0 j02 = this.f41668Q;
            j02.f41613d.f41692m.execute(new H0(j02, 0));
            n0Var.execute(new RunnableC3740y0(this, 0));
        }
    }

    public final void w(boolean z2) {
        this.f41692m.e();
        if (z2) {
            Fe.e.w("nameResolver is not started", this.f41702w);
            Fe.e.w("lbHelper is null", this.f41703x != null);
        }
        L1 l12 = this.f41701v;
        if (l12 != null) {
            l12.j();
            this.f41702w = false;
            if (z2) {
                String str = this.f41680b;
                md.g0 g0Var = this.f41682c;
                Q9.a aVar = this.f41684d;
                this.f41686f.f41993a.getClass();
                this.f41701v = t(str, g0Var, aVar, Collections.singleton(InetSocketAddress.class));
            } else {
                this.f41701v = null;
            }
        }
        E0 e02 = this.f41703x;
        if (e02 != null) {
            S3.n nVar = e02.f41548a;
            ((md.O) nVar.f10971b).f();
            nVar.f10971b = null;
            this.f41703x = null;
        }
        this.f41704y = null;
    }
}

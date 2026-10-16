package e.a.d;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fp extends e.a.bx implements e.a.ay {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f46944a = Logger.getLogger(fp.class.getName());

    /* renamed from: b, reason: collision with root package name */
    static final e.a.ee f46945b;

    /* renamed from: c, reason: collision with root package name */
    static final e.a.ee f46946c;

    /* renamed from: f, reason: collision with root package name */
    private static final gc f46947f;

    /* renamed from: g, reason: collision with root package name */
    private static final e.a.aw f46948g;

    /* renamed from: h, reason: collision with root package name */
    private static final e.a.bm f46949h;

    /* renamed from: i, reason: collision with root package name */
    private static final e.a.k f46950i;
    private final at A;
    private final e.a.i B;
    private final List C;
    private e.a.dd D;
    private boolean E;
    private fb F;
    private boolean G;
    private final Set H;
    private Collection I;
    private final Object J;
    private final bm K;
    private final fo L;
    private final AtomicBoolean M;
    private boolean N;
    private volatile boolean O;
    private final CountDownLatch P;
    private final t Q;
    private final u R;
    private final w S;
    private final e.a.j T;
    private final e.a.au U;
    private final fl V;
    private gc W;
    private final gc X;
    private boolean Y;
    private final boolean Z;
    private final long aa;
    private final long ab;
    private final boolean ac;
    private final gd ad;
    private final et ae;
    private final hv af;
    private final e.a.cs ag;
    private int ah;
    private final ka ai;

    /* renamed from: d, reason: collision with root package name */
    final e.a.el f46951d;

    /* renamed from: e, reason: collision with root package name */
    final dm f46952e;

    /* renamed from: j, reason: collision with root package name */
    private final e.a.az f46953j;

    /* renamed from: k, reason: collision with root package name */
    private final String f46954k;

    /* renamed from: l, reason: collision with root package name */
    private final kf f46955l;
    private final e.a.de m;
    private final e.a.cx n;
    private final e.a.bv o;
    private final am p;
    private final fm q;
    private final Executor r;
    private final gr s;
    private final ex t;
    private final ex u;
    private final jy v;
    private final e.a.ag w;
    private final e.a.t x;
    private final com.google.d.b.aj y;
    private final long z;

    static {
        e.a.ee.f47411k.g("Channel shutdownNow invoked");
        f46945b = e.a.ee.f47411k.g("Channel shutdown invoked");
        f46946c = e.a.ee.f47411k.g("Subchannel shutdown invoked");
        f46947f = new gc(null, new HashMap(), new HashMap(), null, null, null);
        f46948g = new eo();
        f46949h = new gs();
        f46950i = new es();
    }

    fp(fx fxVar, am amVar, kf kfVar, e.a.de deVar, gr grVar, com.google.d.b.aj ajVar, List list, jy jyVar) {
        e.a.el elVar = new e.a.el(new er(this));
        this.f46951d = elVar;
        this.A = new at();
        this.H = new HashSet(16, 0.75f);
        this.J = new Object();
        this.L = new fo(this);
        this.M = new AtomicBoolean(false);
        this.P = new CountDownLatch(1);
        this.ah = 1;
        this.W = f46947f;
        this.Y = false;
        this.ai = new ka();
        int i2 = e.a.ad.f46239a;
        this.ad = new ew(this);
        this.f46952e = new ey(this);
        this.ae = new et(this);
        String str = fxVar.f46970h;
        com.google.d.b.an.C(str, TypedValues.AttributesType.S_TARGET);
        this.f46954k = str;
        e.a.az azVarC = e.a.az.c("Channel", str);
        this.f46953j = azVarC;
        com.google.d.b.an.C(jyVar, "timeProvider");
        this.v = jyVar;
        gr grVar2 = fxVar.f46966d;
        com.google.d.b.an.C(grVar2, "executorPool");
        this.s = grVar2;
        Executor executor = (Executor) grVar2.a();
        com.google.d.b.an.C(executor, "executor");
        this.r = executor;
        gr grVar3 = fxVar.f46967e;
        com.google.d.b.an.C(grVar3, "offloadExecutorPool");
        ex exVar = new ex(grVar3);
        this.u = exVar;
        s sVar = new s(amVar, exVar);
        this.p = sVar;
        fm fmVar = new fm(sVar.c());
        this.q = fmVar;
        w wVar = new w(azVarC, jyVar.a(), "Channel for '" + str + "'");
        this.S = wVar;
        v vVar = new v(wVar, jyVar);
        this.T = vVar;
        e.a.dr drVar = dh.f46801k;
        boolean z = fxVar.o;
        this.ac = z;
        m mVar = new m(e.a.bw.b());
        this.o = mVar;
        this.f46955l = kfVar;
        this.m = deVar;
        je jeVar = new je(z, fxVar.n, mVar);
        gp gpVar = new gp(fxVar.r, e.a.cr.a());
        this.ag = gpVar;
        e.a.cv cvVarB = e.a.cx.b();
        cvVarB.u();
        cvVarB.q(drVar);
        cvVarB.t(elVar);
        cvVarB.r(fmVar);
        cvVarB.s(jeVar);
        cvVarB.m(vVar);
        cvVarB.p(exVar);
        cvVarB.n(gpVar);
        cvVarB.o(fxVar.f46968f);
        IdentityHashMap identityHashMap = fxVar.f46971i;
        if (identityHashMap != null) {
            for (Map.Entry entry : identityHashMap.entrySet()) {
                cvVarB.l((e.a.cw) entry.getKey(), entry.getValue());
            }
        }
        e.a.cx cxVarC = cvVarB.c();
        this.n = cxVarC;
        this.D = ai(kfVar, deVar, cxVarC);
        this.t = new ex(grVar);
        bm bmVar = new bm(this.r, this.f46951d);
        this.K = bmVar;
        bmVar.d(this.ad);
        Map map = fxVar.q;
        if (map != null) {
            e.a.cy cyVarA = jeVar.a(map);
            com.google.d.b.an.y(cyVarA.c() == null, "Default config is invalid: %s", cyVarA.c());
            gc gcVar = (gc) cyVarA.d();
            this.X = gcVar;
            this.ae.f46897a = gcVar.c();
        } else {
            this.X = null;
        }
        this.Z = true;
        fl flVar = new fl(this, this.D.a());
        this.V = flVar;
        this.B = e.a.dt.q(flVar, list);
        this.C = new ArrayList(fxVar.f46969g);
        com.google.d.b.an.C(ajVar, "stopwatchSupplier");
        this.y = ajVar;
        long j2 = fxVar.m;
        if (j2 == -1) {
            this.z = -1L;
        } else {
            com.google.d.b.an.p(j2 >= fx.f46964b, "invalid idleTimeoutMillis %s", j2);
            this.z = fxVar.m;
        }
        this.af = new hv(new ez(this), this.f46951d, this.p.c(), com.google.d.b.ai.c());
        e.a.ag agVar = fxVar.f46973k;
        com.google.d.b.an.C(agVar, "decompressorRegistry");
        this.w = agVar;
        e.a.t tVar = fxVar.f46974l;
        com.google.d.b.an.C(tVar, "compressorRegistry");
        this.x = tVar;
        this.ab = 16777216L;
        this.aa = 1048576L;
        ep epVar = new ep(this, jyVar);
        this.Q = epVar;
        this.R = epVar.a();
        e.a.au auVar = fxVar.p;
        com.google.d.b.an.B(auVar);
        this.U = auVar;
        auVar.d(this);
    }

    static /* bridge */ /* synthetic */ Executor L(fp fpVar, e.a.h hVar) {
        Executor executorS = hVar.s();
        return executorS == null ? fpVar.r : executorS;
    }

    static /* bridge */ /* synthetic */ void P(fp fpVar) {
        fpVar.am(true);
        bm bmVar = fpVar.K;
        bmVar.k(null);
        fpVar.T.a(2, "Entering IDLE state");
        fpVar.A.a(e.a.w.f47854d);
        if (fpVar.f46952e.d(fpVar.J, bmVar)) {
            fpVar.U();
        }
    }

    static /* bridge */ /* synthetic */ void Q(fp fpVar) {
        if (!fpVar.O && fpVar.M.get() && fpVar.H.isEmpty()) {
            fpVar.T.a(2, "Terminated");
            fpVar.U.g(fpVar);
            fpVar.s.b(fpVar.r);
            fpVar.t.b();
            fpVar.u.b();
            fpVar.p.close();
            fpVar.O = true;
            fpVar.P.countDown();
        }
    }

    static /* bridge */ /* synthetic */ void R(fp fpVar) {
        fpVar.f46951d.d();
        if (fpVar.E) {
            fpVar.D.b();
        }
    }

    static e.a.dd ai(kf kfVar, e.a.de deVar, e.a.cx cxVar) {
        e.a.dd ddVarA = kfVar.a(deVar, cxVar);
        if (ddVarA == null) {
            throw new IllegalArgumentException("cannot create a NameResolver for ".concat(String.valueOf(String.valueOf(kfVar))));
        }
        o oVar = new o(cxVar.h(), cxVar.e());
        cxVar.e();
        return new jd(ddVarA, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ak(boolean z) {
        this.af.g(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void al() {
        long j2 = this.z;
        if (j2 == -1) {
            return;
        }
        this.af.h(j2, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void am(boolean z) {
        this.f46951d.d();
        if (z) {
            com.google.d.b.an.v(this.E, "nameResolver is not started");
            com.google.d.b.an.v(this.F != null, "lbHelper is null");
        }
        e.a.dd ddVar = this.D;
        if (ddVar != null) {
            ddVar.c();
            this.E = false;
            if (z) {
                this.D = ai(this.f46955l, this.m, this.n);
            } else {
                this.D = null;
            }
        }
        fb fbVar = this.F;
        if (fbVar != null) {
            fbVar.f46915a.d();
            this.F = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void an(e.a.br brVar) {
        this.K.k(brVar);
    }

    final void U() {
        this.f46951d.d();
        if (this.M.get() || this.G) {
            return;
        }
        if (this.f46952e.e()) {
            ak(false);
        } else {
            al();
        }
        if (this.F == null) {
            this.T.a(2, "Exiting idle mode");
            fb fbVar = new fb(this);
            fbVar.f46915a = new l((m) this.o, fbVar);
            this.F = fbVar;
            this.A.a(e.a.w.f47851a);
            this.D.d(new fd(this, fbVar, this.D));
            this.E = true;
        }
    }

    final void V(Throwable th) {
        if (this.G) {
            return;
        }
        this.G = true;
        try {
            ak(true);
            am(false);
        } finally {
            an(new e.a.bk(e.a.bn.a(e.a.ee.f47410j.g("Panic! This is a bug!").f(th))));
            this.V.g(null);
            this.T.a(4, "PANIC! Entering TRANSIENT_FAILURE");
            this.A.a(e.a.w.f47853c);
        }
    }

    @Override // e.a.i
    public final e.a.k a(e.a.cq cqVar, e.a.h hVar) {
        return this.B.a(cqVar, hVar);
    }

    @Override // e.a.i
    public final String b() {
        return this.B.b();
    }

    @Override // e.a.be
    public final e.a.az c() {
        return this.f46953j;
    }

    @Override // e.a.bx
    public final void d() {
        this.f46951d.execute(new eq(this));
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.c("logId", this.f46953j.a());
        zVarH.d(TypedValues.AttributesType.S_TARGET, this.f46954k);
        return zVarH.toString();
    }
}

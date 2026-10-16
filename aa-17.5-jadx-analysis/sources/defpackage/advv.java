package defpackage;

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
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class advv extends adlm implements adkm {
    public static final adqq T;
    static final Logger a = Logger.getLogger(advv.class.getName());
    static final adnq b;
    static final adnq c;
    public static final adwg d;
    public static final adkk e;
    public static final adlb f;
    public boolean A;
    public volatile boolean B;
    public final adrv C;
    public final adrw D;
    public final adry E;
    public final adiy F;
    public final adkj G;
    public final advs H;
    public adwg I;
    public final adwg J;
    public boolean K;
    public final boolean L;
    public final long M;
    public final long N;
    public final boolean O;
    final aduj P;
    public final advh Q;
    public final admh R;
    public int S;
    public final sm U;
    private final aeaf V;
    private final adms W;
    private final admm X;
    private final adlk Y;
    private final adwt Z;
    private final advl aa;
    private final advl ab;
    private final long ac;
    private final adix ad;
    private final CountDownLatch ae;
    private final adwh af;
    private final adxo ag;
    private final adqs ah;
    public final adkn g;
    public final String h;
    public final adsm i;
    public final advt j;
    public final Executor k;
    public final aeaa l;
    final adnw m;
    public final adjt n;
    public final adst o;
    public final List p;
    public admr q;
    public boolean r;
    public advn s;
    public boolean t;
    public final Set u;
    public Collection v;
    public final Object w;
    public final adte x;
    public final advu y;
    public final AtomicBoolean z;

    static {
        adnq.m.e("Channel shutdownNow invoked");
        b = adnq.m.e("Channel shutdown invoked");
        c = adnq.m.e("Subchannel shutdown invoked");
        d = new adwg(null, new HashMap(), new HashMap(), null, null, null);
        e = new advd();
        f = new adwu();
        T = new advg();
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public advv(adwb adwbVar, adsm adsmVar, aeaf aeafVar, adms admsVar, adwt adwtVar, xyc xycVar, List list, aeaa aeaaVar) {
        adnw adnwVar = new adnw(new advf(this, 0));
        this.m = adnwVar;
        this.o = new adst();
        this.u = new HashSet(16, 0.75f);
        this.w = new Object();
        this.y = new advu(this);
        this.z = new AtomicBoolean(false);
        this.ae = new CountDownLatch(1);
        this.S = 1;
        this.I = d;
        this.K = false;
        this.U = new sm((int[]) null);
        adqq adqqVar = adjr.b;
        this.af = new advk(this);
        this.P = new advm(this);
        this.Q = new advh(this);
        adqs adqsVar = adwbVar.B;
        this.ah = adqsVar;
        String str = adwbVar.k;
        str.getClass();
        this.h = str;
        adkn adknVarB = adkn.b("Channel", str);
        this.g = adknVarB;
        aeaaVar.getClass();
        this.l = aeaaVar;
        adwt adwtVar2 = adwbVar.f;
        adwtVar2.getClass();
        this.Z = adwtVar2;
        ?? A = adwtVar2.a();
        A.getClass();
        this.k = A;
        adwt adwtVar3 = adwbVar.g;
        adwtVar3.getClass();
        advl advlVar = new advl(adwtVar3);
        this.ab = advlVar;
        adru adruVar = new adru(adsmVar, advlVar);
        this.i = adruVar;
        advt advtVar = new advt(adruVar.c());
        this.j = advtVar;
        adry adryVar = new adry(adknVarB, aeaaVar.a(), "Channel for '" + str + "'");
        this.E = adryVar;
        adrx adrxVar = new adrx(adryVar, aeaaVar);
        this.F = adrxVar;
        adnd adndVar = adue.m;
        boolean z = adwbVar.q;
        this.O = z;
        adrr adrrVar = new adrr(adll.b());
        this.Y = adrrVar;
        this.V = aeafVar;
        this.W = admsVar;
        admq admqVar = new admq(z, adrrVar);
        adwr adwrVar = new adwr(adwbVar.y, admg.a());
        this.R = adwrVar;
        admk admkVar = new admk();
        admkVar.a = 443;
        adndVar.getClass();
        admkVar.b = adndVar;
        admkVar.c = adnwVar;
        admkVar.e = advtVar;
        admkVar.d = admqVar;
        admkVar.f = adrxVar;
        admkVar.g = advlVar;
        admkVar.h = adwrVar;
        admkVar.i = adwbVar.i;
        adqsVar.getClass();
        IdentityHashMap identityHashMap = adwbVar.l;
        if (identityHashMap != null) {
            for (Map.Entry entry : identityHashMap.entrySet()) {
                adml admlVar = (adml) entry.getKey();
                Object value = entry.getValue();
                admlVar.getClass();
                value.getClass();
                if (admkVar.j == null) {
                    admkVar.j = new IdentityHashMap();
                }
                admkVar.j.put(admlVar, value);
            }
        }
        admm admmVar = new admm(admkVar);
        this.X = admmVar;
        this.q = n(aeafVar, admsVar, admmVar);
        this.aa = new advl(adwtVar);
        adte adteVar = new adte(this.k, this.m);
        this.x = adteVar;
        adwh adwhVar = this.af;
        adteVar.f = adwhVar;
        adteVar.c = new adpo(adwhVar, 6, null);
        adteVar.d = new adpo(adwhVar, 7, null);
        adteVar.e = new adpo(adwhVar, 8, null);
        Map map = adwbVar.s;
        if (map != null) {
            admn admnVarA = admqVar.a(map);
            adnq adnqVar = admnVarA.a;
            woy.ad(adnqVar == null, "Default config is invalid: %s", adnqVar);
            adwg adwgVar = (adwg) admnVarA.b;
            this.J = adwgVar;
            this.Q.a = adwgVar.a;
        } else {
            this.J = null;
        }
        this.L = true;
        advs advsVar = new advs(this, this.q.a());
        this.H = advsVar;
        this.ad = adqq.E(advsVar, list);
        this.p = new ArrayList(adwbVar.j);
        xycVar.getClass();
        long j = adwbVar.p;
        if (j == -1) {
            this.ac = -1L;
        } else {
            woy.R(j >= adwb.c, "invalid idleTimeoutMillis %s", j);
            this.ac = adwbVar.p;
        }
        this.ag = new adxo(new aduy(this, 6), this.m, this.i.c(), new xya());
        adjt adjtVar = adwbVar.n;
        adjtVar.getClass();
        this.n = adjtVar;
        adwbVar.o.getClass();
        this.N = 16777216L;
        this.M = 1048576L;
        adve adveVar = new adve(aeaaVar);
        this.C = adveVar;
        this.D = adveVar.a();
        adkj adkjVar = adwbVar.r;
        adkjVar.getClass();
        this.G = adkjVar;
        adkj.b(adkjVar.d, this);
    }

    static admr n(aeaf aeafVar, adms admsVar, admm admmVar) {
        admr admrVarA = aeafVar.a(admsVar, admmVar);
        if (admrVarA == null) {
            throw new IllegalArgumentException("cannot create a NameResolver for ".concat(String.valueOf(String.valueOf(aeafVar))));
        }
        ScheduledExecutorService scheduledExecutorService = admmVar.e;
        if (scheduledExecutorService != null) {
            return new adyl(admrVarA, new adrs(scheduledExecutorService, admmVar.c));
        }
        throw new IllegalStateException("ScheduledExecutorService not set in Builder");
    }

    @Override // defpackage.adix
    public final String a() {
        return this.ad.a();
    }

    @Override // defpackage.adlm
    public final void b() {
        this.m.execute(new aduy(this, 4));
    }

    @Override // defpackage.adlm
    public final /* bridge */ /* synthetic */ void c() {
        throw null;
    }

    @Override // defpackage.adix
    public final adqq d(admf admfVar, adiw adiwVar) {
        return this.ad.d(admfVar, adiwVar);
    }

    @Override // defpackage.adkt
    public final adkn e() {
        return this.g;
    }

    public final Executor f(adiw adiwVar) {
        Executor executor = adiwVar.c;
        return executor == null ? this.k : executor;
    }

    public final void g(boolean z) {
        ScheduledFuture scheduledFuture;
        adxo adxoVar = this.ag;
        adxoVar.e = false;
        if (!z || (scheduledFuture = adxoVar.f) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        adxoVar.f = null;
    }

    public final void h() {
        l(true);
        adte adteVar = this.x;
        adteVar.a(null);
        this.F.a(2, "Entering IDLE state");
        this.o.a(adjh.d);
        Object[] objArr = {this.w, adteVar};
        for (int i = 0; i < 2; i++) {
            if (this.P.a.contains(objArr[i])) {
                i();
                return;
            }
        }
    }

    final void i() {
        this.m.c();
        if (this.z.get() || this.t) {
            return;
        }
        if (this.P.a.isEmpty()) {
            k();
        } else {
            g(false);
        }
        if (this.s == null) {
            this.F.a(2, "Exiting idle mode");
            advn advnVar = new advn(this);
            advnVar.a = new adrq((adrr) this.Y, advnVar);
            this.s = advnVar;
            this.o.a(adjh.a);
            this.q.d(new advo(this, advnVar, this.q));
            this.r = true;
        }
    }

    public final void j() {
        if (!this.B && this.z.get() && this.u.isEmpty()) {
            this.F.a(2, "Terminated");
            adkj.c(this.G.d, this);
            this.Z.b(this.k);
            this.aa.b();
            this.ab.b();
            this.i.close();
            this.B = true;
            this.ae.countDown();
        }
    }

    public final void k() {
        long j = this.ac;
        if (j == -1) {
            return;
        }
        adxo adxoVar = this.ag;
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long jA = adxoVar.a() + nanos;
        adxoVar.e = true;
        if (jA - adxoVar.d < 0 || adxoVar.f == null) {
            ScheduledFuture scheduledFuture = adxoVar.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            adxoVar.f = adxoVar.a.schedule(new aduy(adxoVar, 17), nanos, TimeUnit.NANOSECONDS);
        }
        adxoVar.d = jA;
    }

    public final void l(boolean z) {
        this.m.c();
        if (z) {
            woy.aa(this.r, "nameResolver is not started");
            woy.aa(this.s != null, "lbHelper is null");
        }
        admr admrVar = this.q;
        if (admrVar != null) {
            admrVar.c();
            this.r = false;
            if (z) {
                this.q = n(this.V, this.W, this.X);
            } else {
                this.q = null;
            }
        }
        advn advnVar = this.s;
        if (advnVar != null) {
            advnVar.a.d();
            this.s = null;
        }
    }

    public final void m(adlg adlgVar) {
        this.x.a(adlgVar);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.g("logId", this.g.a);
        xxgVarAo.b("target", this.h);
        return xxgVarAo.toString();
    }
}

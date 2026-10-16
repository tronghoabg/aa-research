package e.a.b.a;

import android.content.ComponentName;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.waze.car_lib.be;
import e.a.az;
import e.a.cm;
import e.a.cq;
import e.a.d.cr;
import e.a.d.db;
import e.a.d.dh;
import e.a.d.gd;
import e.a.d.gr;
import e.a.d.js;
import e.a.d.jt;
import e.a.ds;
import e.a.ee;
import e.a.ef;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends k implements e.a.d.as {

    /* renamed from: f, reason: collision with root package name */
    private final gr f46368f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f46369g;

    /* renamed from: h, reason: collision with root package name */
    private final e.a.b.k f46370h;

    /* renamed from: i, reason: collision with root package name */
    private final a f46371i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicInteger f46372j;

    /* renamed from: k, reason: collision with root package name */
    private final long f46373k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f46374l;
    private gd m;
    private int n;
    private ScheduledFuture o;
    private final d p;
    private final ar q;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(g gVar, e.a.b.b bVar, e.a.d.al alVar) {
        gr grVar = gVar.f46385c;
        e.a.c cVarA = alVar.a();
        Context context = gVar.f46383a;
        e.a.b.h hVar = gVar.f46389g;
        e.a.a aVarA = e.a.c.a();
        aVarA.c(db.f46777a, ds.f47345a);
        aVarA.c(db.f46778b, cVarA);
        aVarA.c(e.a.ao.f46263b, e.a.b.b.c(new ComponentName(context, context.getClass())));
        aVarA.c(e.a.ao.f46262a, bVar);
        aVarA.c(f46400b, hVar);
        super(grVar, aVarA.a(), az.b(e.class, gVar.f46383a.getClass().getSimpleName() + "->" + String.valueOf(bVar)));
        this.n = 1001;
        gr grVar2 = gVar.f46386d;
        this.f46368f = grVar2;
        this.f46370h = gVar.f46387e;
        this.f46369g = (Executor) grVar2.a();
        this.f46373k = 60000L;
        Boolean bool = (Boolean) alVar.a().c(e.a.b.c.f46469c);
        this.f46374l = bool != null ? bool.booleanValue() : false;
        this.p = new d(this);
        this.f46372j = new AtomicInteger();
        int i2 = com.google.d.b.aq.f7222a;
        this.q = new ar(null);
        this.f46371i = new ap(gVar.f46384b, gVar.f46383a, bVar.a(), bVar.b(), gVar.f46388f.a(), this);
    }

    private final bm K(int i2) {
        e.a.b.k kVar = this.f46370h;
        return kVar instanceof e.a.b.d ? ((e.a.b.d) kVar).b() : bd.k(new b(this, i2, 0), this.f46369g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void L(ee eeVar) {
        if (I(2)) {
            if (eeVar.l()) {
                k(this.p.f46367a);
            } else {
                B(eeVar, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void M(Throwable th) {
        B(ee.f47410j.g("Could not evaluate SecurityPolicy").f(th), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void N(ee eeVar) {
        if (I(2)) {
            if (eeVar.l()) {
                this.f46371i.b();
            } else {
                B(eeVar, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void O() {
        if (I(2)) {
            this.o = null;
            long j2 = this.f46373k;
            B(ee.f47404d.g("Connect timeout " + j2 + "ms lapsed"), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void P() {
        if (I(1)) {
            H(2);
            try {
                boolean z = this.f46374l;
                a aVar = this.f46371i;
                if (z) {
                    bm bmVarK = K(aVar.a().applicationInfo.uid);
                    J(bmVarK);
                    bm bmVar = bmVarK;
                    bd.q(bmVarK, new c(this, 1, (byte[]) null), this.f46369g);
                } else {
                    aVar.b();
                }
                this.o = w().schedule(new be(this, 16), this.f46373k, TimeUnit.MILLISECONDS);
            } catch (ef e2) {
                B(e2.b(), true);
            }
        }
    }

    private static e.a.d.af Q(ee eeVar, e.a.p[] pVarArr) {
        jt.i(pVarArr).a();
        return new cr(eeVar, pVarArr);
    }

    static /* bridge */ /* synthetic */ void g(e eVar, int i2) {
        bm bmVarK = eVar.K(i2);
        eVar.J(bmVarK);
        bd.q(bmVarK, new c(eVar, 0), eVar.f46369g);
    }

    static /* bridge */ /* synthetic */ void k(e eVar) {
        eVar.H(3);
        gd gdVar = eVar.m;
        e.a.c cVar = eVar.f46403d;
        gdVar.h();
        eVar.f46403d = cVar;
        eVar.m.b();
        ScheduledFuture scheduledFuture = eVar.o;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            eVar.o = null;
        }
    }

    @Override // e.a.d.aj
    public final synchronized e.a.d.af b(cq cqVar, cm cmVar, e.a.h hVar, e.a.p[] pVarArr) throws Throwable {
        Throwable th;
        e eVar;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                eVar = this;
                th = th;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            if (!I(3)) {
                return Q(F() ? this.f46404e : ee.f47410j.g("newStream() before transportReady()"), pVarArr);
            }
            int i2 = this.n;
            int i3 = i2 + 1;
            this.n = i3;
            if (i3 == 16777215) {
                this.n = 1001;
            }
            jt jtVarI = jt.i(pVarArr);
            o oVar = new o(this, this.f46403d, i2, dh.h(hVar));
            if (this.f46402c.putIfAbsent(Integer.valueOf(i2), oVar) != null) {
                ee eeVarG = ee.f47410j.g("Clashing call IDs");
                B(eeVarG, true);
                return Q(eeVarG, pVarArr);
            }
            if (oVar.d() && this.f46372j.getAndIncrement() == 0) {
                this.m.a(true);
            }
            ai aiVar = new ai(this, i2, cqVar, cmVar, jtVarI);
            if (cqVar.b().a()) {
                return new aq(oVar, aiVar);
            }
            return new ad(oVar, aiVar);
        } catch (Throwable th4) {
            th = th4;
            eVar = this;
            throw th;
        }
    }

    @Override // e.a.d.ge
    public final synchronized Runnable d(gd gdVar) {
        this.m = gdVar;
        return new be(this, 17);
    }

    @Override // e.a.b.a.k
    protected final void l(Parcel parcel) {
        parcel.readInt();
        this.q.b();
    }

    @Override // e.a.b.a.k
    protected final void m(Parcel parcel) {
        if (I(2)) {
            if (parcel.readInt() != 1) {
                B(ee.f47411k.g("Wire format version mismatch"), true);
                return;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                B(ee.f47411k.g("Malformed SETUP_TRANSPORT data"), true);
                return;
            }
            if (!G(ah.b(strongBinder, this.f46369g))) {
                B(ee.f47411k.g("Failed to observe outgoing binder"), true);
                return;
            }
            e eVar = this.p.f46367a;
            int callingUid = Binder.getCallingUid();
            eVar.x(callingUid);
            e.a.a aVarB = eVar.f46403d.b();
            aVarB.c(f46399a, Integer.valueOf(callingUid));
            aVarB.c(db.f46777a, callingUid == Process.myUid() ? ds.f47347c : ds.f47346b);
            eVar.f46403d = aVarB.a();
            g(eVar, callingUid);
        }
    }

    @Override // e.a.b.a.k
    final void n(ee eeVar) {
        this.m.c(eeVar, js.UNKNOWN);
    }

    @Override // e.a.b.a.k
    final void o() {
        if (this.f46372j.getAndSet(0) > 0) {
            this.m.a(false);
        }
        ScheduledFuture scheduledFuture = this.o;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.o = null;
        }
        ((ap) this.f46371i).e(ee.f47402b);
        this.m.d();
    }

    public final synchronized void p(IBinder iBinder) {
        this.p.f46367a.z(ah.b(iBinder, this.f46369g));
    }

    public final synchronized void q(ee eeVar) {
        B(eeVar, true);
    }

    @Override // e.a.d.aj
    public final void r(e.a.d.ai aiVar, Executor executor) {
        throw null;
    }

    @Override // e.a.b.a.k
    final void s() {
        super.s();
        this.f46368f.b(this.f46369g);
    }

    @Override // e.a.d.ge
    public final synchronized void t(ee eeVar) {
        com.google.d.b.an.C(eeVar, "reason");
        B(eeVar, false);
    }

    @Override // e.a.b.a.k
    protected final void u(r rVar) {
        if (rVar.d() && this.f46372j.decrementAndGet() == 0) {
            this.m.a(false);
        }
        C(rVar.f46438c);
    }
}

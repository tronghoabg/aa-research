package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class ador extends adoz implements adss {
    private final ajmd A;
    public final Executor a;
    public final adom b;
    public final adop c;
    public adwh d;
    public ScheduledFuture e;
    private final adwt u;
    private final AtomicInteger v;
    private final long w;
    private final boolean x;
    private int y;
    private final adqq z;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public ador(adot adotVar, adod adodVar, adsl adslVar) {
        adwt adwtVar = adotVar.c;
        adis adisVar = adslVar.b;
        Context context = adotVar.a;
        adoj adojVar = adotVar.g;
        adis adisVar2 = adis.a;
        adqn adqnVar = new adqn(adis.a);
        adqnVar.c(adua.a, adne.a);
        adqnVar.c(adua.b, adisVar);
        adqnVar.c(adkd.b, adod.b(context));
        adqnVar.c(adkd.a, adodVar);
        adqnVar.c(i, adojVar);
        super(adwtVar, adqnVar.a(), adkn.a(ador.class, adotVar.a.getClass().getSimpleName() + "->" + String.valueOf(adodVar)));
        this.y = 1001;
        adwt adwtVar2 = adotVar.d;
        this.u = adwtVar2;
        this.b = adotVar.e;
        this.a = adwtVar2.a();
        this.w = 60000L;
        Boolean bool = (Boolean) adslVar.b.a(adoe.c);
        this.x = bool != null ? bool.booleanValue() : false;
        this.A = new ajmd(this, null);
        this.v = new AtomicInteger();
        xyi xyiVar = xyi.d;
        this.z = new adqq();
        this.c = new adqm(adotVar.b, adotVar.a, adodVar.a.cloneFilter(), adodVar.b, this);
    }

    private static adsh E(adnq adnqVar, adis adisVar, adjb[] adjbVarArr) {
        adzv.h(adjbVarArr, adisVar).a();
        return new adtq(adnqVar, adjbVarArr);
    }

    public final zgp a(final int i) {
        adom adomVar = this.b;
        return adomVar instanceof adof ? ((adof) adomVar).b() : wub.ac(new Callable() { // from class: adoq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.b.a(i);
            }
        }, this.a);
    }

    @Override // defpackage.adsk
    public final synchronized adsh b(admf admfVar, admc admcVar, adiw adiwVar, adjb[] adjbVarArr) throws Throwable {
        Throwable th;
        ador adorVar;
        try {
            try {
                try {
                    if (!C(3)) {
                        return E(z() ? this.o : adnq.l.e("newStream() before transportReady()"), this.n, adjbVarArr);
                    }
                    int i = this.y;
                    int i2 = i + 1;
                    this.y = i2;
                    if (i2 == 16777215) {
                        this.y = 1001;
                    }
                    adzv adzvVarH = adzv.h(adjbVarArr, this.n);
                    adph adphVar = new adph(this, this.n, i, adue.h(adiwVar));
                    if (this.l.putIfAbsent(Integer.valueOf(i), adphVar) != null) {
                        adnq adnqVarE = adnq.l.e("Clashing call IDs");
                        w(adnqVarE, true);
                        return E(adnqVarE, this.n, adjbVarArr);
                    }
                    if (adphVar.a && this.v.getAndIncrement() == 0) {
                        this.d.a(true);
                    }
                    adqc adqcVar = new adqc(this, i, admfVar, admcVar, adzvVarH);
                    if (admfVar.a.a()) {
                        return new adqo(adphVar, adqcVar);
                    }
                    return new adpw(adphVar, adqcVar);
                } catch (Throwable th2) {
                    th = th2;
                    adorVar = this;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                adorVar = this;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.adwi
    public final synchronized Runnable c(adwh adwhVar) {
        this.d = adwhVar;
        return new aabr(this, 15);
    }

    public final synchronized void d(adnq adnqVar) {
        if (C(2)) {
            if (!adnqVar.g()) {
                w(adnqVar, true);
                return;
            }
            Object obj = this.A.a;
            ((adoz) obj).B(3);
            adwh adwhVar = ((ador) obj).d;
            adis adisVar = ((ador) obj).n;
            adwhVar.h();
            ((ador) obj).n = adisVar;
            ((ador) obj).d.b();
            ScheduledFuture scheduledFuture = ((ador) obj).e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                ((ador) obj).e = null;
            }
        }
    }

    public final synchronized void f(Throwable th) {
        w(adnq.l.e("Could not evaluate SecurityPolicy").d(th), true);
    }

    @Override // defpackage.adoz
    protected final void g(Parcel parcel) {
        parcel.readInt();
        this.z.q();
    }

    public final synchronized void h(adnq adnqVar) {
        if (C(2)) {
            if (adnqVar.g()) {
                this.c.a();
            } else {
                w(adnqVar, true);
            }
        }
    }

    @Override // defpackage.adoz
    protected final void i(Parcel parcel) {
        if (C(2)) {
            if (parcel.readInt() != 1) {
                w(adnq.m.e("Wire format version mismatch"), true);
                return;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                w(adnq.m.e("Malformed SETUP_TRANSPORT data"), true);
                return;
            }
            if (!A(adqb.b(strongBinder, this.a))) {
                w(adnq.m.e("Failed to observe outgoing binder"), true);
                return;
            }
            Object obj = this.A.a;
            adoz adozVar = (adoz) obj;
            adpt adptVar = adozVar.k;
            int callingUid = Binder.getCallingUid();
            adps adpsVar = adptVar.a;
            if (adpsVar != null) {
                adptVar.a = new adqr(callingUid, Logger.getLogger(adqs.class.getName()), adpsVar);
            }
            ador adorVar = (ador) obj;
            adqn adqnVar = new adqn(adorVar.n);
            adqnVar.c(g, Integer.valueOf(callingUid));
            adqnVar.c(adua.a, callingUid == Process.myUid() ? adne.c : adne.b);
            adorVar.n = adqnVar.a();
            zgp zgpVarA = adorVar.a(callingUid);
            adozVar.D(zgpVarA);
            wub.ah(zgpVarA, new ikn(obj, 20), adorVar.a);
        }
    }

    @Override // defpackage.adoz
    public final void j(adnq adnqVar) {
        this.d.c(adnqVar, adzt.UNKNOWN);
    }

    @Override // defpackage.adoz
    public final void k() {
        if (this.v.getAndSet(0) > 0) {
            this.d.a(false);
        }
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.e = null;
        }
        ((adqm) this.c).c(adnq.c);
        this.d.d();
    }

    public final synchronized void l(IBinder iBinder) {
        ((adoz) this.A.a).u(adqb.b(iBinder, this.a));
    }

    public final synchronized void m() {
        if (C(2)) {
            this.e = null;
            long j = this.w;
            w(adnq.f.e("Connect timeout " + j + "ms lapsed"), true);
        }
    }

    public final synchronized void n(adnq adnqVar) {
        w(adnqVar, true);
    }

    public final synchronized void o() {
        if (C(1)) {
            B(2);
            try {
                boolean z = this.x;
                adop adopVar = this.c;
                if (z) {
                    int i = Build.VERSION.SDK_INT >= 29 ? 268435456 : 0;
                    PackageManager packageManager = ((adqm) adopVar).d().getPackageManager();
                    Intent intent = ((adqm) adopVar).a;
                    ResolveInfo resolveInfoResolveService = packageManager.resolveService(intent, i);
                    if (resolveInfoResolveService == null) {
                        throw new adnr(adnq.k.e("resolveService(" + String.valueOf(intent) + " / " + String.valueOf(((adqm) adopVar).b) + ") was null"));
                    }
                    zgp zgpVarA = a(resolveInfoResolveService.serviceInfo.applicationInfo.uid);
                    D(zgpVarA);
                    wub.ah(zgpVarA, new ikn(this, 19), this.a);
                } else {
                    adopVar.a();
                }
                this.e = this.j.schedule(new aabr(this, 14), this.w, TimeUnit.MILLISECONDS);
            } catch (adnr e) {
                w(e.a, true);
            }
        }
    }

    @Override // defpackage.adoz
    public final void p() {
        super.p();
        this.u.b(this.a);
    }

    @Override // defpackage.adwi
    public final synchronized void q(adnq adnqVar) {
        adnqVar.getClass();
        w(adnqVar, false);
    }

    @Override // defpackage.adoz
    protected final void r(adpl adplVar) {
        if (adplVar.e() && this.v.decrementAndGet() == 0) {
            this.d.a(false);
        }
        super.r(adplVar);
    }
}

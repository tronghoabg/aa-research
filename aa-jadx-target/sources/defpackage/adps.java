package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adps extends defpackage.adqa implements adtt {
    private final ajnd A;
    public final java.util.concurrent.Executor a;
    public final defpackage.adpn b;
    public final adpq c;
    public adxi d;
    public java.util.concurrent.ScheduledFuture e;
    private final adxu u;
    private final java.util.concurrent.atomic.AtomicInteger v;
    private final long w;
    private final boolean x;
    private int y;
    private final defpackage.adrq z;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public adps(defpackage.adpu adpuVar, defpackage.adpe adpeVar, defpackage.adtm adtmVar) {
        adxu adxuVar = adpuVar.c;
        defpackage.adjs adjsVar = adtmVar.b;
        android.content.Context context = adpuVar.a;
        defpackage.adpk adpkVar = adpuVar.g;
        defpackage.adjs adjsVar2 = defpackage.adjs.a;
        defpackage.adrn adrnVar = new defpackage.adrn(defpackage.adjs.a);
        adrnVar.c(defpackage.adva.a, defpackage.adof.a);
        adrnVar.c(defpackage.adva.b, adjsVar);
        adrnVar.c(defpackage.adle.b, defpackage.adpe.b(context));
        adrnVar.c(defpackage.adle.a, adpeVar);
        adrnVar.c(i, adpkVar);
        super(adxuVar, adrnVar.a(), defpackage.adlo.a(defpackage.adps.class, adpuVar.a.getClass().getSimpleName() + "->" + java.lang.String.valueOf(adpeVar)));
        this.y = 1001;
        adxu adxuVar2 = adpuVar.d;
        this.u = adxuVar2;
        this.b = adpuVar.e;
        this.a = adxuVar2.a();
        this.w = 60000L;
        java.lang.Boolean bool = (java.lang.Boolean) adtmVar.b.a(defpackage.adpf.c);
        this.x = bool != null ? bool.booleanValue() : false;
        this.A = new ajnd(this, (byte[]) null);
        this.v = new java.util.concurrent.atomic.AtomicInteger();
        defpackage.xzo xzoVar = defpackage.xzo.d;
        this.z = new defpackage.adrq();
        this.c = new defpackage.adrm(adpuVar.b, adpuVar.a, adpeVar.a.cloneFilter(), adpeVar.b, this);
    }

    private static adti E(defpackage.ador adorVar, defpackage.adjs adjsVar, defpackage.adkb[] adkbVarArr) {
        aeav.h(adkbVarArr, adjsVar).a();
        return new defpackage.aduq(adorVar, adkbVarArr);
    }

    public final defpackage.zhs a(int i) {
        adpg adpgVar = this.b;
        return adpgVar instanceof adpg ? adpgVar.b() : defpackage.ysr.ct(new adpr(this, i), this.a);
    }

    public final synchronized adti b(defpackage.adng adngVar, defpackage.adnd adndVar, defpackage.adjw adjwVar, defpackage.adkb[] adkbVarArr) throws java.lang.Throwable {
        java.lang.Throwable th;
        try {
            try {
                try {
                    if (!C(3)) {
                        return E(z() ? this.o : defpackage.ador.l.e("newStream() before transportReady()"), this.n, adkbVarArr);
                    }
                    int i = this.y;
                    int i2 = i + 1;
                    this.y = i2;
                    if (i2 == 16777215) {
                        this.y = 1001;
                    }
                    aeav aeavVarH = aeav.h(adkbVarArr, this.n);
                    adqj adqjVar = new adqj(this, this.n, i, defpackage.adve.h(adjwVar));
                    if (this.l.putIfAbsent(java.lang.Integer.valueOf(i), adqjVar) != null) {
                        defpackage.ador adorVarE = defpackage.ador.l.e("Clashing call IDs");
                        w(adorVarE, true);
                        return E(adorVarE, this.n, adkbVarArr);
                    }
                    if (adqjVar.a && this.v.getAndIncrement() == 0) {
                        this.d.a(true);
                    }
                    adrc adrcVar = new adrc(this, i, adngVar, adndVar, aeavVarH);
                    if (adngVar.a.a()) {
                        return new adro(adqjVar, adrcVar);
                    }
                    return new adqw(adqjVar, adrcVar);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
        throw th;
    }

    public final synchronized java.lang.Runnable c(adxi adxiVar) {
        this.d = adxiVar;
        return new defpackage.adkj(this, 3, null);
    }

    public final synchronized void d(defpackage.ador adorVar) {
        if (C(2)) {
            if (!adorVar.g()) {
                w(adorVar, true);
                return;
            }
            java.lang.Object obj = this.A.a;
            ((defpackage.adqa) obj).B(3);
            adxi adxiVar = ((defpackage.adps) obj).d;
            defpackage.adjs adjsVar = ((defpackage.adps) obj).n;
            adxiVar.h();
            ((defpackage.adps) obj).n = adjsVar;
            ((defpackage.adps) obj).d.b();
            java.util.concurrent.ScheduledFuture scheduledFuture = ((defpackage.adps) obj).e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                ((defpackage.adps) obj).e = null;
            }
        }
    }

    public final synchronized void f(java.lang.Throwable th) {
        w(defpackage.ador.l.e("Could not evaluate SecurityPolicy").d(th), true);
    }

    @Override // defpackage.adqa
    protected final void g(android.os.Parcel parcel) {
        parcel.readInt();
        this.z.q();
    }

    public final synchronized void h(defpackage.ador adorVar) {
        if (C(2)) {
            if (adorVar.g()) {
                this.c.a();
            } else {
                w(adorVar, true);
            }
        }
    }

    @Override // defpackage.adqa
    protected final void i(android.os.Parcel parcel) {
        if (C(2)) {
            if (parcel.readInt() != 1) {
                w(defpackage.ador.m.e("Wire format version mismatch"), true);
                return;
            }
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                w(defpackage.ador.m.e("Malformed SETUP_TRANSPORT data"), true);
                return;
            }
            if (!A(defpackage.adrb.b(strongBinder, this.a))) {
                w(defpackage.ador.m.e("Failed to observe outgoing binder"), true);
                return;
            }
            java.lang.Object obj = this.A.a;
            defpackage.adqa adqaVar = (defpackage.adqa) obj;
            defpackage.adqt adqtVar = adqaVar.k;
            int callingUid = android.os.Binder.getCallingUid();
            adqs adqsVar = adqtVar.a;
            if (adqsVar != null) {
                adqtVar.a = new adrr(callingUid, java.util.logging.Logger.getLogger(defpackage.adrs.class.getName()), adqsVar);
            }
            defpackage.adps adpsVar = (defpackage.adps) obj;
            defpackage.adrn adrnVar = new defpackage.adrn(adpsVar.n);
            adrnVar.c(g, java.lang.Integer.valueOf(callingUid));
            adrnVar.c(defpackage.adva.a, callingUid == android.os.Process.myUid() ? defpackage.adof.c : defpackage.adof.b);
            adpsVar.n = adrnVar.a();
            defpackage.zhs zhsVarA = adpsVar.a(callingUid);
            adqaVar.D(zhsVarA);
            defpackage.ysr.cy(zhsVarA, new adqo(obj, 1), adpsVar.a);
        }
    }

    @Override // defpackage.adqa
    public final void j(defpackage.ador adorVar) {
        this.d.c(adorVar, defpackage.aeat.UNKNOWN);
    }

    @Override // defpackage.adqa
    public final void k() {
        if (this.v.getAndSet(0) > 0) {
            this.d.a(false);
        }
        java.util.concurrent.ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.e = null;
        }
        ((defpackage.adrm) this.c).c(defpackage.ador.c);
        this.d.d();
    }

    public final synchronized void l(android.os.IBinder iBinder) {
        ((defpackage.adqa) this.A.a).u(defpackage.adrb.b(iBinder, this.a));
    }

    public final synchronized void m() {
        if (C(2)) {
            this.e = null;
            long j = this.w;
            w(defpackage.ador.f.e("Connect timeout " + j + "ms lapsed"), true);
        }
    }

    public final synchronized void n(defpackage.ador adorVar) {
        w(adorVar, true);
    }

    public final synchronized void o() {
        if (C(1)) {
            B(2);
            try {
                boolean z = this.x;
                adpq adpqVar = this.c;
                if (z) {
                    int i = android.os.Build.VERSION.SDK_INT >= 29 ? 268435456 : 0;
                    android.content.pm.PackageManager packageManager = ((defpackage.adrm) adpqVar).d().getPackageManager();
                    android.content.Intent intent = ((defpackage.adrm) adpqVar).a;
                    android.content.pm.ResolveInfo resolveInfoResolveService = packageManager.resolveService(intent, i);
                    if (resolveInfoResolveService == null) {
                        throw new ados(defpackage.ador.k.e("resolveService(" + java.lang.String.valueOf(intent) + " / " + java.lang.String.valueOf(((defpackage.adrm) adpqVar).b) + ") was null"));
                    }
                    defpackage.zhs zhsVarA = a(resolveInfoResolveService.serviceInfo.applicationInfo.uid);
                    D(zhsVarA);
                    defpackage.ysr.cy(zhsVarA, new defpackage.ikx(this, 20), this.a);
                } else {
                    adpqVar.a();
                }
                this.e = this.j.schedule(new defpackage.adkj(this, 2, null), this.w, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (ados e) {
                w(e.a, true);
            }
        }
    }

    @Override // defpackage.adqa
    public final void p() {
        super.p();
        this.u.b(this.a);
    }

    public final synchronized void q(defpackage.ador adorVar) {
        adorVar.getClass();
        w(adorVar, false);
    }

    @Override // defpackage.adqa
    protected final void r(adqn adqnVar) {
        if (adqnVar.e() && this.v.decrementAndGet() == 0) {
            this.d.a(false);
        }
        super.r(adqnVar);
    }
}

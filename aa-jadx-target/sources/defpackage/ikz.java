package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ikz extends defpackage.qyw implements defpackage.jbz, defpackage.jbv {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.RADIO");
    public static final j$.time.Duration b = j$.time.Duration.ofMillis(300);
    private static final j$.time.Duration u = j$.time.Duration.ofMillis(250);
    private final java.util.concurrent.ScheduledExecutorService A;
    private java.util.concurrent.ScheduledFuture B;
    public volatile boolean c;
    public final java.util.List d;
    public final java.lang.Object e;
    public final java.util.concurrent.Executor f;
    public long g;
    public xnx h;
    public java.lang.Boolean i;
    public com.google.android.gms.car.RadioProgramInfo j;
    public java.util.List k;
    public java.util.List l;
    public java.lang.Boolean m;
    public final defpackage.xzg n;
    public final defpackage.xzg o;
    public defpackage.iky p;
    public defpackage.zhs q;
    public boolean r;
    public xnx s;
    public xnw t;
    private jca v;
    private final defpackage.jez w;
    private final android.content.Context x;
    private final java.util.concurrent.atomic.AtomicLong y;
    private com.google.android.gms.car.RadioConfiguration z;

    public ikz(defpackage.jez jezVar, android.content.Context context) {
        defpackage.zhw zhwVarCg = defpackage.ysr.cg(java.util.concurrent.Executors.unconfigurableScheduledExecutorService(new defpackage.tev()));
        zhwVarCg.getClass();
        defpackage.xzo xzoVar = defpackage.xxd.a;
        this.d = new java.util.ArrayList();
        this.e = new java.lang.Object();
        this.y = new java.util.concurrent.atomic.AtomicLong(0L);
        this.g = 0L;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.z = null;
        this.B = null;
        this.p = defpackage.iky.a;
        this.q = null;
        this.r = false;
        this.s = null;
        this.t = null;
        this.w = jezVar;
        this.x = context;
        this.f = hh$.ExternalSyntheticApiModelOutline0.m(context);
        this.A = zhwVarCg;
        this.n = new defpackage.xzg(xzoVar);
        this.o = new defpackage.xzg(xzoVar);
    }

    public static final defpackage.abor A(com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier) {
        xnv xnvVar;
        try {
            xnvVar = (xnv) new defpackage.nub(xnv.b(radioProgramIdentifier.a)).i(xnv.a);
        } catch (java.lang.IllegalArgumentException unused) {
            xnvVar = xnv.a;
        }
        defpackage.abor aborVarN = xnw.a.n();
        aborVarN.t();
        xnw xnwVar = aborVarN.b;
        xnwVar.c = xnvVar.k;
        xnwVar.b |= 1;
        long j = radioProgramIdentifier.b;
        aborVarN.t();
        xnw xnwVar2 = aborVarN.b;
        xnwVar2.b |= 2;
        xnwVar2.d = j;
        return aborVarN;
    }

    public static final void B(com.google.android.gms.car.RadioProgramInfo radioProgramInfo) {
        com.google.android.gms.car.RadioMetadata radioMetadata;
        if (radioProgramInfo == null || (radioMetadata = radioProgramInfo.b) == null) {
            return;
        }
        E(radioMetadata.i);
        com.google.android.gms.car.RadioMetadata.RadioSongMetadata radioSongMetadata = radioMetadata.f;
        if (radioSongMetadata != null) {
            E(radioSongMetadata.g);
        }
    }

    public static final void C(java.util.Collection collection) {
        if (collection == null) {
            return;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            B((com.google.android.gms.car.RadioProgramInfo) it.next());
        }
    }

    private final void D() throws java.lang.IllegalStateException {
        this.w.b();
        if (!this.c) {
            throw new java.lang.IllegalStateException("CarNotConnected");
        }
    }

    private static final void E(android.graphics.Bitmap bitmap) {
        if (android.os.Build.VERSION.SDK_INT < 31 || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    public static final android.graphics.Bitmap y(android.graphics.Bitmap bitmap) {
        return (bitmap == null || android.os.Build.VERSION.SDK_INT < 31) ? bitmap : a$.ExternalSyntheticApiModelOutline0.m(bitmap);
    }

    public static final com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier z(xnw xnwVar) {
        xnv xnvVarB = xnv.b(xnwVar.c);
        if (xnvVarB == null) {
            xnvVarB = xnv.a;
        }
        return new com.google.android.gms.car.RadioProgramSelector.RadioProgramIdentifier(xnvVarB.k, xnwVar.d);
    }

    @Override // defpackage.jbv
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.izd a(defpackage.xpa xpaVar) {
        if ((xpaVar.b & 64) == 0) {
            return null;
        }
        defpackage.xoc xocVar = xpaVar.i;
        if (xocVar == null) {
            xocVar = defpackage.xoc.a;
        }
        if ((xocVar.b & 1) != 0) {
            defpackage.xoc xocVar2 = xpaVar.i;
            if (xocVar2 == null) {
                xocVar2 = defpackage.xoc.a;
            }
            xno xnoVar = xocVar2.c;
            if (xnoVar == null) {
                xnoVar = xno.a;
            }
            j$.util.stream.Stream map = j$.util.Collection.-EL.stream(xnoVar.b).map(new defpackage.ikc(6));
            int i = defpackage.ygw.d;
            this.z = new com.google.android.gms.car.RadioConfiguration((java.util.List) map.collect(defpackage.yds.a));
        }
        return this;
    }

    @Override // defpackage.izd
    public final defpackage.jbq b(defpackage.jbu jbuVar) {
        return new jca(this, jbuVar);
    }

    @Override // defpackage.izd
    public final defpackage.jdc c() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.izd
    public final defpackage.jdc d() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.qyx
    public final com.google.android.gms.car.RadioConfiguration f() {
        return this.z;
    }

    public final xnx g() {
        xnx xnxVar = this.s;
        xnw xnwVar = null;
        if (xnxVar == null) {
            xnxVar = null;
        } else {
            this.s = null;
            defpackage.xzg xzgVar = this.o;
            xzgVar.d();
            xzgVar.e();
            this.r = false;
            xoa xoaVar = xnxVar.c;
            if (xoaVar == null) {
                xoaVar = xoa.a;
            }
            if ((xoaVar.b & 1) != 0) {
                xoa xoaVar2 = xnxVar.c;
                if (xoaVar2 == null) {
                    xoaVar2 = xoa.a;
                }
                xnwVar = xoaVar2.c;
                if (xnwVar == null) {
                    xnwVar = xnw.a;
                }
            }
            this.t = xnwVar;
        }
        if (xnxVar != null) {
            this.p = defpackage.iky.b;
        }
        return xnxVar;
    }

    public final xnx h() {
        if (this.s == null || this.p.equals(defpackage.iky.b)) {
            return null;
        }
        defpackage.zhs zhsVar = this.q;
        if (zhsVar != null && !zhsVar.isDone()) {
            return null;
        }
        defpackage.xzg xzgVar = this.o;
        j$.time.Duration durationC = xzgVar.a ? xzgVar.c() : u;
        if (!this.r) {
            j$.time.Duration duration = u;
            if (durationC.compareTo(duration) < 0) {
                java.util.concurrent.ScheduledFuture scheduledFuture = this.B;
                if (scheduledFuture != null && !scheduledFuture.isDone()) {
                    return null;
                }
                this.B = this.A.schedule(new defpackage.iks(this, 0), duration.minus(durationC).toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
                return null;
            }
        }
        k();
        this.r = false;
        return g();
    }

    public final defpackage.ygw i() {
        java.util.List list = this.d;
        synchronized (list) {
            if (!list.isEmpty()) {
                return defpackage.ygw.o(list);
            }
            ((defpackage.yqj) a.l().ai(189)).u("no radio callbacks registered");
            int i = defpackage.ygw.d;
            return defpackage.ymx.a;
        }
    }

    public final defpackage.zhs j(xnx xnxVar) {
        byte[] bArrD;
        defpackage.zhm zhmVarV;
        defpackage.zhs zhsVarW;
        defpackage.zhs zhsVarCp;
        xoa xoaVar = xnxVar.c;
        if (xoaVar == null) {
            xoaVar = xoa.a;
        }
        xnw xnwVar = xoaVar.c;
        if (xnwVar == null) {
            xnwVar = xnw.a;
        }
        defpackage.rkc rkcVar = new defpackage.rkc(z(xnwVar));
        xoa xoaVar2 = xnxVar.c;
        if (xoaVar2 == null) {
            xoaVar2 = xoa.a;
        }
        j$.lang.Iterable.-EL.forEach(xoaVar2.d, new defpackage.ikd(rkcVar, 6));
        uem uemVar = new uem(rkcVar.a());
        int i = 2;
        if ((xnxVar.b & 2) == 0) {
            return defpackage.ysr.cp(uemVar.a());
        }
        xns xnsVar = xnxVar.d;
        if (xnsVar == null) {
            xnsVar = xns.a;
        }
        rcc rccVar = new rcc();
        int i2 = xnsVar.b;
        if ((i2 & 1) != 0) {
            rccVar.a = xnsVar.c;
        }
        if ((i2 & 2) != 0) {
            rccVar.b = xnsVar.d;
        }
        if ((i2 & 4) != 0) {
            rccVar.c = xnsVar.e;
        }
        int i3 = 1;
        if ((i2 & 8) != 0) {
            xob xobVar = xnsVar.f;
            if (xobVar == null) {
                xobVar = xob.a;
            }
            int iS = defpackage.wva.s(xobVar.b);
            if (iS == 0) {
                iS = 1;
            }
            rccVar.d = new com.google.android.gms.car.RadioMetadata.RadioProgramType(iS, xobVar.c);
        }
        int i4 = xnsVar.b;
        if ((i4 & 128) != 0) {
            rccVar.g = xnsVar.j;
        }
        if ((i4 & 2048) != 0) {
            rccVar.k = xnsVar.n;
        }
        if ((i4 & 64) != 0) {
            rccVar.f = xnsVar.i;
        }
        int i5 = xnsVar.k;
        if (i5 > 0) {
            rccVar.m = i5;
        }
        if ((i4 & 512) != 0) {
            rccVar.i = xnsVar.l;
        }
        if ((i4 & 1024) != 0) {
            rccVar.j = xnsVar.m;
        }
        if ((i4 & 4096) != 0) {
            rccVar.l = xnsVar.o;
        }
        xnr xnrVar = xnsVar.g;
        if (xnrVar == null) {
            xnrVar = xnr.a;
        }
        if ((xnrVar.b & 1) != 0) {
            xnr xnrVar2 = xnsVar.g;
            if (xnrVar2 == null) {
                xnrVar2 = xnr.a;
            }
            bArrD = xnrVar2.c.D();
        } else {
            bArrD = null;
        }
        int i6 = 0;
        if (bArrD == null || bArrD.length <= 0) {
            zhmVarV = defpackage.zhm.v(defpackage.ysr.cp(rccVar));
        } else {
            defpackage.zhm zhmVarV2 = defpackage.zhm.v(hea.l(hsc.c(this.x).b().j(bArrD).M(new ifr(java.lang.Integer.valueOf(java.util.Arrays.hashCode(bArrD))))));
            defpackage.iku ikuVar = new defpackage.iku(rccVar, i6);
            defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
            zhmVarV = zhmVarV2.w(ikuVar, zgtVar).u(hxc.class, new defpackage.iku(rccVar, i), zgtVar);
        }
        if ((xnsVar.b & 32) != 0) {
            xof xofVar = xnsVar.h;
            if (xofVar == null) {
                xofVar = xof.a;
            }
            rcd rcdVar = new rcd();
            int i7 = xofVar.b;
            if ((i7 & 1) != 0) {
                rcdVar.a = xofVar.c;
            }
            if ((i7 & 2) != 0) {
                rcdVar.b = xofVar.d;
            }
            if ((i7 & 4) != 0) {
                rcdVar.c = xofVar.e;
            }
            if ((i7 & 8) != 0) {
                rcdVar.d = xofVar.f;
            }
            if ((i7 & 32) != 0) {
                rcdVar.e = xofVar.h;
            }
            xnr xnrVar3 = xofVar.g;
            if (((xnrVar3 == null ? xnr.a : xnrVar3).b & 1) != 0) {
                if (xnrVar3 == null) {
                    xnrVar3 = xnr.a;
                }
                byte[] bArrD2 = xnrVar3.c.D();
                defpackage.zhm zhmVarV3 = defpackage.zhm.v(hea.l(hsc.c(this.x).b().j(bArrD2).M(new ifr(java.lang.Integer.valueOf(java.util.Arrays.hashCode(bArrD2))))));
                defpackage.iku ikuVar2 = new defpackage.iku(rcdVar, 3);
                defpackage.zgt zgtVar2 = defpackage.zgt.INSTANCE;
                zhsVarCp = zhmVarV3.w(ikuVar2, zgtVar2).u(hxc.class, new defpackage.iku(rcdVar, 4), zgtVar2).w(new defpackage.ikt(i3), zgtVar2);
            } else {
                zhsVarCp = defpackage.ysr.cp(rcdVar.a());
            }
            zhsVarW = defpackage.ysr.ck(zhsVarCp, zhmVarV).a(new ikv(zhmVarV, zhsVarCp), defpackage.zgt.INSTANCE);
        } else {
            zhsVarW = zhmVarV.w(new defpackage.ikt(i), defpackage.zgt.INSTANCE);
        }
        defpackage.zhm zhmVarV4 = defpackage.zhm.v(zhsVarW);
        defpackage.iku ikuVar3 = new defpackage.iku(uemVar, i3);
        defpackage.zgt zgtVar3 = defpackage.zgt.INSTANCE;
        return zhmVarV4.w(ikuVar3, zgtVar3).w(new defpackage.ikt(i6), zgtVar3);
    }

    public final void k() {
        java.util.concurrent.ScheduledFuture scheduledFuture = this.B;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.B = null;
        }
    }

    public final void l(xnx xnxVar) {
        long jIncrementAndGet = this.y.incrementAndGet();
        try {
            defpackage.zhs zhsVarJ = j(xnxVar);
            synchronized (this.e) {
                this.q = zhsVarJ;
                if (zhsVarJ.isDone()) {
                    this.p = defpackage.iky.a;
                }
            }
            defpackage.ysr.cy(zhsVarJ, new ikw(this, zhsVarJ, jIncrementAndGet), this.f);
        } catch (java.lang.Throwable th) {
            synchronized (this.e) {
                this.p = defpackage.iky.a;
                xnx xnxVarH = h();
                if (xnxVarH != null) {
                    l(xnxVarH);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.izd
    public final void m(java.io.PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.qyx
    public final void n(boolean z) throws android.os.RemoteException {
        D();
        jca jcaVar = this.v;
        defpackage.abor aborVarN = xnt.a.n();
        aborVarN.t();
        xnt xntVar = aborVarN.b;
        xntVar.b |= 1;
        xntVar.c = z;
        jcaVar.k(32796, aborVarN.q());
    }

    @Override // defpackage.qyx
    public final void o(java.lang.String str) throws android.os.RemoteException {
        D();
        jca jcaVar = this.v;
        defpackage.abor aborVarN = xnp.a.n();
        aborVarN.t();
        xnp xnpVar = aborVarN.b;
        str.getClass();
        xnpVar.b |= 1;
        xnpVar.c = str;
        jcaVar.k(32803, aborVarN.q());
    }

    public final void p(defpackage.zhs zhsVar) {
        xnx xnxVarH;
        synchronized (this.e) {
            defpackage.zhs zhsVar2 = this.q;
            if (zhsVar2 == zhsVar || (zhsVar2 != null && zhsVar2.isDone())) {
                this.q = null;
                this.p = defpackage.iky.a;
            }
            xnxVarH = h();
        }
        if (xnxVarH != null) {
            l(xnxVarH);
        }
    }

    @Override // defpackage.izd
    public final void q() {
        throw null;
    }

    @Override // defpackage.izd
    public final void r(defpackage.jbq jbqVar) {
        this.v = (jca) jbqVar;
        this.c = true;
    }

    @Override // defpackage.qyx
    public final void s(qza qzaVar) {
        java.util.List list = this.d;
        synchronized (list) {
            defpackage.iko ikoVar = new defpackage.iko(this, qzaVar, 2);
            try {
                qzaVar.asBinder().linkToDeath(ikoVar, 0);
                list.add(ikoVar);
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai(196)).u("RemoteException setting death recipient for radio callback");
            }
        }
        t(qzaVar);
    }

    @Override // defpackage.qyx
    public final void t(qza qzaVar) {
        java.lang.Boolean bool;
        try {
            synchronized (this.e) {
                java.lang.Boolean bool2 = this.i;
                if (bool2 != null) {
                    qzaVar.f(bool2.booleanValue());
                }
                com.google.android.gms.car.RadioProgramInfo radioProgramInfo = this.j;
                if (radioProgramInfo != null && (bool = this.i) != null && this.m != null) {
                    qzaVar.g(radioProgramInfo, bool.booleanValue(), this.m.booleanValue());
                }
                java.util.List list = this.k;
                if (list != null) {
                    qzaVar.h(list);
                }
                java.util.List list2 = this.l;
                if (list2 != null) {
                    qzaVar.e(list2);
                }
            }
        } catch (android.os.RemoteException unused) {
            x(qzaVar);
        }
    }

    @Override // defpackage.qyx
    public final void u(boolean z) throws android.os.RemoteException {
        D();
        jca jcaVar = this.v;
        defpackage.abor aborVarN = xod.a.n();
        aborVarN.t();
        xod xodVar = aborVarN.b;
        xodVar.b |= 1;
        xodVar.c = z;
        jcaVar.k(32801, aborVarN.q());
    }

    @Override // defpackage.qyx
    public final void v(int i) throws android.os.RemoteException {
        D();
        jca jcaVar = this.v;
        defpackage.abor aborVarN = xoe.a.n();
        aborVarN.t();
        xoe xoeVar = aborVarN.b;
        int iS = defpackage.wva.s(i);
        if (iS == 0) {
            throw null;
        }
        xoeVar.c = iS;
        xoeVar.b |= 1;
        jcaVar.k(32802, aborVarN.q());
    }

    @Override // defpackage.qyx
    public final void w(com.google.android.gms.car.RadioProgramSelector radioProgramSelector) throws android.os.RemoteException {
        D();
        jca jcaVar = this.v;
        defpackage.abor aborVarN = xoa.a.n();
        defpackage.abor aborVarA = A(radioProgramSelector.a);
        aborVarN.t();
        xoa xoaVar = aborVarN.b;
        xnw xnwVarQ = aborVarA.q();
        xnwVarQ.getClass();
        xoaVar.c = xnwVarQ;
        xoaVar.b |= 1;
        j$.lang.Iterable.-EL.forEach(radioProgramSelector.b, new defpackage.ikd(aborVarN, 7));
        xoa xoaVarQ = aborVarN.q();
        defpackage.abor aborVarN2 = xog.a.n();
        aborVarN2.t();
        xog xogVar = aborVarN2.b;
        xoaVarQ.getClass();
        xogVar.c = xoaVarQ;
        xogVar.b |= 1;
        jcaVar.k(32798, aborVarN2.q());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qza] */
    @Override // defpackage.qyx
    public final void x(qza qzaVar) {
        java.util.List list = this.d;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                defpackage.iko ikoVar = (defpackage.iko) it.next();
                ?? r2 = ikoVar.a;
                if (r2.asBinder().equals(qzaVar.asBinder())) {
                    r2.asBinder().unlinkToDeath(ikoVar, 0);
                    it.remove();
                }
            }
        }
    }
}

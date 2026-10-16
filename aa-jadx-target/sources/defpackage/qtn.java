package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qtn extends defpackage.quc {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.LITE");
    public final defpackage.shm b;
    public final defpackage.rty c;
    public final android.os.Handler d;
    public final defpackage.qtm e;
    public final android.content.Context f;
    public long g;
    public defpackage.rvp h;
    public boolean i;
    public boolean j;
    private final defpackage.riw l;
    private final int m;
    private final int n;
    private final java.io.Closeable o;
    private final boolean p;
    private final com.google.android.gms.car.bluetooth.data.CarBluetoothData q;
    private final com.google.android.gms.carsetup.CarInfoInternal r;
    private boolean s;

    public qtn(android.content.Context context, int i, int i2, java.io.Closeable closeable, com.google.android.gms.carsetup.CarInfoInternal carInfoInternal, boolean z, com.google.android.gms.car.bluetooth.data.CarBluetoothData carBluetoothData, defpackage.qte qteVar) {
        defpackage.stq stqVar = new defpackage.stq(context.getMainLooper());
        defpackage.riw riwVar = new defpackage.riw();
        super(qteVar);
        this.c = new defpackage.rvg(true);
        this.e = new defpackage.qtm(this);
        this.f = context;
        this.d = stqVar;
        this.l = riwVar;
        riwVar.start();
        this.b = new defpackage.shu(context, new defpackage.stq(riwVar), new defpackage.imy(19), new defpackage.wyz(this, null), carInfoInternal != null ? carInfoInternal.a : null);
        defpackage.yqk yqkVar = defpackage.rtc.a;
        this.m = i;
        this.n = i2;
        this.o = closeable;
        this.r = carInfoInternal;
        this.p = z;
        this.q = carBluetoothData;
    }

    @Override // defpackage.quc, defpackage.qte
    public final void d(java.io.PrintWriter printWriter) {
        super.d(printWriter);
        printWriter.println();
        printWriter.println("CarServiceBinderLite");
        printWriter.print("connectionType: ");
        printWriter.println(this.m);
        printWriter.print("sessionId: ");
        printWriter.println(this.g);
        printWriter.print("analyticsSessionId: ");
        printWriter.println(this.n);
        printWriter.print("userAuthorized: ");
        printWriter.println(this.j);
        printWriter.print("resumeComplete: ");
        printWriter.println(this.i);
    }

    @Override // defpackage.quc, defpackage.qte
    public final void f(com.google.android.gms.car.diagnostics.CriticalError criticalError) {
        a.f().ai(7904).u("Car disconnected");
        this.b.a();
        p(criticalError);
    }

    @Override // defpackage.quc, defpackage.qte
    public final void j() {
        this.l.quit();
        super.j();
    }

    public final void m() {
        this.g = 0L;
        this.h = null;
        this.i = false;
        this.j = false;
        defpackage.qtq.d();
        defpackage.qtm qtmVar = this.e;
        qtmVar.a = false;
        qtmVar.b = false;
    }

    public final void o() {
        defpackage.qtn qtnVar;
        if (!this.j) {
            a.l().ai(7909).u("FRX is required. SensorService already opened in Proxy.");
            this.s = true;
            return;
        }
        int i = defpackage.ygw.d;
        java.util.List<java.lang.Integer> listD = defpackage.ymx.a;
        try {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (byte[] bArr : this.h.c()) {
                defpackage.abox aboxVarD = defpackage.abox.D(defpackage.xpa.a, bArr, 0, bArr.length, defpackage.abol.a());
                defpackage.abox.U(aboxVarD);
                defpackage.xpa xpaVar = (defpackage.xpa) aboxVarD;
                if ((xpaVar.b & 2048) != 0) {
                    a.f().ai(7908).w("Skip vendor extension channels for now %d", xpaVar.c);
                } else {
                    hashSet.add(java.lang.Integer.valueOf(xpaVar.c));
                }
            }
            qtnVar = this;
            try {
                qtnVar.i(this.r, this.h, this.m, this.n, this.p, this.q);
                qtnVar.c();
                defpackage.omv.g(qtnVar.f, "com.google.android.gms.car.CAR_SERVICE_ENDPOINTS", defpackage.rsr.a.ordinal(), null);
                listD = qtnVar.h.d(new defpackage.qtl(qtnVar, hashSet, qtnVar.s));
            } catch (defpackage.abpp e) {
                e = e;
                a.g().p(e).ai(7907).u("Invalid service proto buf");
            }
        } catch (defpackage.abpp e2) {
            e = e2;
            qtnVar = this;
        }
        qtnVar.s = false;
        defpackage.yqk yqkVar = a;
        yqkVar.f().ai(7906).w("Start required services in lite %d", listD.size());
        defpackage.rvp rvpVar = qtnVar.h;
        defpackage.yha yhaVar = new defpackage.yha(4);
        for (defpackage.rvo rvoVar : rvpVar.g) {
            if (rvoVar.c != null) {
                yhaVar.f(java.lang.Integer.valueOf(rvoVar.a), rvoVar.c);
            }
        }
        defpackage.yhe yheVarD = yhaVar.d(true);
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        for (java.lang.Integer num : listD) {
            defpackage.rsi rsiVarB = defpackage.rsi.b(((defpackage.rvj) yheVarD.get(num)).m);
            if (rsiVarB == null) {
                yqkVar.h().ai(7903).w("Unknown service type %d", ((defpackage.rvj) yheVarD.get(num)).m);
                rsiVarB = defpackage.rsi.UNKNOWN;
            }
            ygrVar.i(rsiVarB);
        }
        defpackage.ygw ygwVarG = ygrVar.g();
        defpackage.shm shmVar = qtnVar.b;
        ((defpackage.shu) shmVar).c.post(new defpackage.imx(shmVar, listD, ygwVarG, 9));
    }

    public final void p(com.google.android.gms.car.diagnostics.CriticalError criticalError) {
        this.g = 0L;
        try {
            this.o.close();
        } catch (java.io.IOException e) {
            a.g().p(e).ai(7910).u("Impossible");
        }
        a().f(criticalError);
        m();
    }
}

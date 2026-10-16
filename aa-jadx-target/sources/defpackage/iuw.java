package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iuw extends defpackage.rks {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.SERVICE");
    public final defpackage.ivc b;
    public final java.lang.Object c = new java.lang.Object();
    public com.google.android.gms.car.display.CarDisplay d;
    public android.graphics.Rect e;
    public java.util.List f;
    public com.google.android.gms.car.display.CarDisplayUiFeatures g;
    public final defpackage.jdj h;
    public final defpackage.jdj i;
    public final defpackage.jdj j;
    private final defpackage.jdj k;

    public iuw(defpackage.ivc ivcVar) {
        final int i = 1;
        this.k = new defpackage.jdj(this, "CarUiInfo", new defpackage.iuv() { // from class: iur
            @Override // defpackage.iuv
            public final void a(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                if (i != 0) {
                    ((defpackage.qzj) obj).e((com.google.android.gms.car.CarUiInfo) obj2);
                } else {
                    ((defpackage.rkz) obj).e((com.google.android.gms.car.display.CarDisplay) obj2);
                }
            }
        });
        final int i2 = 0;
        this.h = new defpackage.jdj(this, "CarDisplay", new defpackage.iuv() { // from class: iur
            @Override // defpackage.iuv
            public final void a(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                if (i2 != 0) {
                    ((defpackage.qzj) obj).e((com.google.android.gms.car.CarUiInfo) obj2);
                } else {
                    ((defpackage.rkz) obj).e((com.google.android.gms.car.display.CarDisplay) obj2);
                }
            }
        });
        this.i = new defpackage.jdj(this, "contentInsets", new defpackage.iut() { // from class: ius
            @Override // defpackage.iut
            public final void a(java.lang.Object obj, com.google.android.gms.car.display.CarDisplayId carDisplayId, java.lang.Object obj2) throws android.os.RemoteException {
                if (i != 0) {
                    ((defpackage.rlc) obj).e(carDisplayId, (android.graphics.Rect) obj2);
                } else {
                    ((rll) obj).e(carDisplayId, (com.google.android.gms.car.display.CarDisplayUiFeatures) obj2);
                }
            }
        });
        this.j = new defpackage.jdj(this, "displayUiFeatures", new defpackage.iut() { // from class: ius
            @Override // defpackage.iut
            public final void a(java.lang.Object obj, com.google.android.gms.car.display.CarDisplayId carDisplayId, java.lang.Object obj2) throws android.os.RemoteException {
                if (i2 != 0) {
                    ((defpackage.rlc) obj).e(carDisplayId, (android.graphics.Rect) obj2);
                } else {
                    ((rll) obj).e(carDisplayId, (com.google.android.gms.car.display.CarDisplayUiFeatures) obj2);
                }
            }
        });
        this.b = ivcVar;
    }

    public static defpackage.ive b(defpackage.ivc ivcVar) {
        defpackage.ive iveVarA = ivcVar.o.a();
        if (iveVarA != null) {
            return iveVarA;
        }
        throw new java.lang.IllegalStateException("Display not configured.");
    }

    @Override // defpackage.rkt
    public final android.graphics.Rect a() {
        android.graphics.Rect rect;
        synchronized (this.c) {
            rect = this.e;
            if (rect == null) {
                rect = b(this.b).o;
                this.e = rect;
            }
        }
        return rect;
    }

    @Override // defpackage.rkt
    public final com.google.android.gms.car.CarUiInfo c() {
        defpackage.ivc ivcVar = this.b;
        ivcVar.f.ak();
        defpackage.ikk ikkVar = ivcVar.q;
        com.google.android.gms.car.CarUiInfo carUiInfo = ikkVar != null ? ikkVar.m : null;
        if (carUiInfo != null) {
            return carUiInfo;
        }
        throw new java.lang.IllegalStateException("No CarUiInfo found for display: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ivcVar.j))));
    }

    @Override // defpackage.rkt
    public final defpackage.rab d() {
        if (defpackage.acsj.a.fF().b()) {
            this.b.f.al();
        }
        return ((defpackage.inh) this.b.p).ar;
    }

    public final com.google.android.gms.car.display.CarDisplay f(defpackage.ive iveVar, defpackage.ivc ivcVar) {
        defpackage.rkf rkfVar;
        int i = ivcVar.k.d;
        android.util.Size size = iveVar.m;
        android.graphics.Point point = new android.graphics.Point(size.getWidth(), size.getHeight());
        android.graphics.Rect rect = new android.graphics.Rect(iveVar.n);
        android.graphics.Rect rect2 = new android.graphics.Rect(iveVar.o);
        defpackage.ygw ygwVarO = defpackage.ygw.o(iveVar.p);
        defpackage.xle xleVar = ivcVar.l;
        int iOrdinal = xleVar.ordinal();
        if (iOrdinal == 0) {
            rkfVar = defpackage.rkf.a;
        } else if (iOrdinal == 271) {
            rkfVar = defpackage.rkf.b;
        } else {
            if (iOrdinal != 277) {
                throw new java.lang.IllegalArgumentException("No valid content type for key code: " + xleVar.es);
            }
            rkfVar = defpackage.rkf.c;
        }
        return new com.google.android.gms.car.display.CarDisplay(ivcVar.j, i, iveVar.i, point, rect, rect2, ygwVarO, rkfVar.ordinal(), java.util.UUID.randomUUID().toString(), iveVar.r);
    }

    @Override // defpackage.rkt
    public final com.google.android.gms.car.display.CarDisplay g() {
        com.google.android.gms.car.display.CarDisplay carDisplayF;
        synchronized (this.c) {
            carDisplayF = this.d;
            if (carDisplayF == null) {
                defpackage.ivc ivcVar = this.b;
                carDisplayF = f(b(ivcVar), ivcVar);
                this.d = carDisplayF;
            }
        }
        return carDisplayF;
    }

    @Override // defpackage.rkt
    public final com.google.android.gms.car.display.CarDisplayUiFeatures h() {
        com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeatures;
        synchronized (this.c) {
            carDisplayUiFeatures = this.g;
            if (carDisplayUiFeatures == null) {
                defpackage.ive iveVarA = this.b.o.a();
                if (iveVarA == null) {
                    throw new java.lang.IllegalStateException("Display not configured.");
                }
                carDisplayUiFeatures = iveVarA.q;
                this.g = carDisplayUiFeatures;
            }
        }
        return carDisplayUiFeatures;
    }

    @Override // defpackage.rkt
    public final java.util.List i() {
        java.util.List list;
        synchronized (this.c) {
            list = this.f;
            if (list == null) {
                list = b(this.b).p;
                this.f = list;
            }
        }
        return list;
    }

    public final void j(com.google.android.gms.car.CarUiInfo carUiInfo) {
        this.k.e(carUiInfo);
    }

    @Override // defpackage.rkt
    public final void k(defpackage.rkz rkzVar) throws android.os.RemoteException {
        this.h.d(rkzVar);
        rkzVar.e(g());
    }

    @Override // defpackage.rkt
    public final void l(defpackage.rlc rlcVar) {
        this.i.d(rlcVar);
    }

    @Override // defpackage.rkt
    public final void m(rll rllVar) {
        this.j.d(rllVar);
    }

    @Override // defpackage.rkt
    public final void n(defpackage.qzj qzjVar) {
        this.k.d(qzjVar);
    }

    @Override // defpackage.rkt
    public final void o() {
        defpackage.rbz.h(new defpackage.iqv(this, 12));
    }

    @Override // defpackage.rkt
    public final void p(defpackage.rkz rkzVar) {
        this.h.f(rkzVar);
    }

    @Override // defpackage.rkt
    public final void q(defpackage.rlc rlcVar) {
        this.i.f(rlcVar);
    }

    @Override // defpackage.rkt
    public final void r(rll rllVar) {
        this.j.f(rllVar);
    }

    @Override // defpackage.rkt
    public final void s(defpackage.qzj qzjVar) {
        this.k.f(qzjVar);
    }
}

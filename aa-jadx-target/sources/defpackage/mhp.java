package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mhp implements defpackage.mhm {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.Preflight.Req.Car");
    private final java.util.Set b = new java.util.HashSet();

    static final boolean g() {
        defpackage.mfw mfwVar = ((defpackage.mfx) defpackage.luq.b().a()).c;
        mfwVar.getClass();
        com.google.android.gms.carsetup.CarInfoInternal carInfoInternal = mfwVar.e;
        boolean z = carInfoInternal.p;
        ((defpackage.yqj) a.l().ai(4935)).R("isCarAuthorized=%b, isKnown=%b, isProjectionAllowed=%b", java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(carInfoInternal.o), java.lang.Boolean.valueOf(carInfoInternal.p));
        return z;
    }

    @Override // defpackage.mhm
    public final int a() {
        return 4;
    }

    @Override // defpackage.mhm
    public final android.support.v4.app.Fragment b() {
        return new defpackage.mgp();
    }

    @Override // defpackage.mhm
    public final void c() {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4938)).y("Resolving requirement. isMet=%b", java.lang.Boolean.valueOf(e()));
        if (g()) {
            ((defpackage.yqj) yqmVar.l().ai((char) 4934)).u("Car already allowed, skip adding to allow list");
            return;
        }
        defpackage.mfw mfwVar = ((defpackage.mfx) defpackage.luq.b().a()).c;
        mfwVar.getClass();
        defpackage.jlv jlvVar = new defpackage.jlv(defpackage.mkp.a.c);
        com.google.android.gms.carsetup.CarInfoInternal carInfoInternal = mfwVar.e;
        try {
            jlvVar.l(carInfoInternal);
            jlvVar.q(carInfoInternal, true);
            carInfoInternal.o = true;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(4933)).u("Added car to Allowed Cars list.");
            jlvVar.close();
        } catch (java.lang.Throwable th) {
            try {
                jlvVar.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mhm
    public final boolean d() {
        return true;
    }

    @Override // defpackage.mhm
    public final boolean e() {
        boolean zG = g();
        if (zG) {
            java.util.Set set = this.b;
            defpackage.zbd zbdVar = defpackage.zbd.uF;
            if (set.add(zbdVar)) {
                defpackage.omf.u().f(defpackage.rrw.h(defpackage.yzd.FRX, defpackage.zbe.PREFLIGHT_AUTHORIZE_CAR, zbdVar));
            }
        }
        ((defpackage.yqj) a.l().ai((char) 4936)).y("isMet:%b", java.lang.Boolean.valueOf(zG));
        return zG;
    }

    @Override // defpackage.mhm
    public final boolean f(defpackage.mgt mgtVar, defpackage.wyz wyzVar) {
        ((defpackage.yqj) a.l().ai((char) 4937)).y("maybeHandleEvent: %s", mgtVar.name());
        if (mgtVar != defpackage.mgt.g) {
            return false;
        }
        wyzVar.m(this);
        return true;
    }
}

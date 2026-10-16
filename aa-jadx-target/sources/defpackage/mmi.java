package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mmi {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public mmi() {
        this.a = new defpackage.eqs();
        this.b = new defpackage.eqs();
    }

    public static defpackage.mmi c() {
        return (defpackage.mmi) defpackage.mkp.a.b(defpackage.mmi.class, new defpackage.lga(7));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
    public static final defpackage.mmg f() {
        defpackage.mku mkuVarA = ((defpackage.mkw) defpackage.mkp.a.i(defpackage.mkw.class)).a();
        return defpackage.mmg.a((defpackage.acyc.a.fF().aX() && mkuVarA.d.contains("key_settings_driver_aligned_dashboard")) ? mkuVarA.c.getString("key_settings_driver_aligned_dashboard", defpackage.mmg.c.name()) : mkuVarA.b.getString("key_settings_driver_aligned_dashboard", defpackage.mmg.c.name()));
    }

    public static final defpackage.jfg g(defpackage.qsh qshVar) {
        java.lang.String strName = defpackage.jfg.d.name();
        return defpackage.jfg.a((java.lang.String) defpackage.kgu.c(new defpackage.mmh(qshVar, strName, 0), "GH.LayoutSetMan", defpackage.zbe.SETTINGS_COMMON, defpackage.zbd.dN, true, "Non-recoverable error during reading setting. Bailing.", new java.lang.Object[0]));
    }

    public static final boolean h() {
        return f() == defpackage.mmg.DRIVER_ALIGNED;
    }

    public final defpackage.eqp a() {
        defpackage.eqp eqpVar = (defpackage.eqp) this.a;
        if (eqpVar.e() == null) {
            eqpVar.m(f());
        }
        return eqpVar;
    }

    public final defpackage.eqp b(defpackage.qsh qshVar) {
        defpackage.eqp eqpVar = (defpackage.eqp) this.b;
        if (eqpVar.e() == null) {
            eqpVar.m(g(qshVar));
        }
        return eqpVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void d(defpackage.mmg mmgVar) {
        defpackage.mku mkuVarA = defpackage.mpr.f().a();
        java.lang.String strName = mmgVar.name();
        if (defpackage.acyc.aZ() && mkuVarA.d.contains("key_settings_driver_aligned_dashboard")) {
            mkuVarA.c.edit().putString("key_settings_driver_aligned_dashboard", strName).apply();
        } else {
            mkuVarA.b.edit().putString("key_settings_driver_aligned_dashboard", strName).apply();
        }
        ((defpackage.eqp) this.a).m(mmgVar);
    }

    public final void e(defpackage.qsh qshVar, defpackage.jfg jfgVar) {
        java.lang.String strName = jfgVar.name();
        defpackage.kgu.d(new mjf(qshVar, strName, 2), "GH.LayoutSetMan", defpackage.zbe.SETTINGS_COMMON, defpackage.zbd.dM, "Non-recoverable error during writing setting. Bailing.", new java.lang.Object[0]);
        ((defpackage.eqp) this.b).m(jfgVar);
    }

    public final void i() {
        ((android.content.BroadcastReceiver.PendingResult) this.a).finish();
        defpackage.rqj rqjVar = (defpackage.rqj) this.b;
        defpackage.mdl mdlVar = (defpackage.mdl) rqjVar.a;
        if (mdlVar.g) {
            java.lang.Object obj = rqjVar.c;
            defpackage.vlw.a().f((defpackage.vlu) rqjVar.b);
            mdlVar.h.c((defpackage.rrs) obj);
        }
    }

    public mmi(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public mmi(byte[] bArr) {
        this.b = new defpackage.rup();
        this.a = new defpackage.rup();
    }
}

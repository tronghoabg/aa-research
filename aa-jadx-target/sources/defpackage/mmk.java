package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mmk {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.PwrSavingsCfgMgr");
    public final defpackage.eqs b = new defpackage.eqs();
    public final defpackage.eqs c = new defpackage.eqs();
    public final defpackage.eqs d = new defpackage.eqs();

    public static defpackage.mmk b() {
        return (defpackage.mmk) defpackage.mkp.a.b(defpackage.mmk.class, new defpackage.mbf(8));
    }

    public static void c(defpackage.qsh qshVar, java.lang.String str, java.lang.String str2, defpackage.zbe zbeVar, defpackage.zbd zbdVar) {
        defpackage.kgu.d(new mjf(qshVar, str, str2, 3), "GH.PwrSavingsCfgMgr", zbeVar, zbdVar, "Cannot access car", new java.lang.Object[0]);
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, zbdVar).l());
    }

    public static boolean f(defpackage.qsh qshVar) {
        defpackage.mkp.a.g();
        if (defpackage.oml.z(qshVar, defpackage.rbf.D)) {
            ((defpackage.yqj) a.l().ai((char) 5057)).u("Multi Display Configuration allowed!");
            return true;
        }
        ((defpackage.yqj) a.l().ai((char) 5058)).u("Multi Display Configuration feature not present; Multi Display Configuration not allowed");
        return false;
    }

    public static final defpackage.jfj g(defpackage.qsh qshVar) {
        java.lang.String strJ = j(qshVar, "auxiliary_display_mode", defpackage.zbe.SETTINGS_AUX_DISPLAY_MODE, defpackage.zbd.dr);
        defpackage.jfj jfjVarA = defpackage.jfj.a(strJ);
        ((defpackage.yqj) a.l().ai((char) 5054)).M("getCurrentAuxiliaryDisplaySetting(): %s (car service value = %s)", jfjVarA.name(), strJ);
        return jfjVarA;
    }

    public static final defpackage.jfk h(defpackage.qsh qshVar) {
        java.lang.String strJ = j(qshVar, "cluster_display_mode", defpackage.zbe.SETTINGS_CLUSTER_DISPLAY_MODE, defpackage.zbd.ds);
        defpackage.jfk jfkVarA = defpackage.jfk.a(strJ);
        ((defpackage.yqj) a.l().ai((char) 5055)).M("getCurrentClusterDisplaySetting(): %s (car service value = %s)", jfkVarA.name(), strJ);
        return jfkVarA;
    }

    public static final defpackage.jfm i(defpackage.qsh qshVar) {
        java.lang.String strJ = j(qshVar, "power_saving_mode", defpackage.zbe.SETTINGS_POWER_SAVING_MODE, defpackage.zbd.dt);
        defpackage.jfm jfmVarA = defpackage.jfm.a(strJ);
        ((defpackage.yqj) a.l().ai((char) 5056)).M("getPowerSavingSetting(): %s (car service value = %s)", jfmVarA.name(), strJ);
        return jfmVarA;
    }

    private static java.lang.String j(defpackage.qsh qshVar, java.lang.String str, defpackage.zbe zbeVar, defpackage.zbd zbdVar) {
        return (java.lang.String) defpackage.kgu.c(new defpackage.mmj(qshVar, str, 0), "GH.PwrSavingsCfgMgr", zbeVar, zbdVar, true, "Cannot access car", new java.lang.Object[0]);
    }

    public final jfl a(defpackage.qsh qshVar) {
        return jfl.a(g(qshVar), h(qshVar));
    }

    public final void d(defpackage.qsh qshVar, defpackage.jfj jfjVar, defpackage.zbe zbeVar) {
        ((defpackage.yqj) a.l().ai((char) 5059)).y("updateAuxiliaryDisplaySetting(%s)", jfjVar);
        c(qshVar, "auxiliary_display_mode", jfjVar.d, zbeVar, jfjVar.f);
        this.c.m(jfjVar);
    }

    public final void e(defpackage.qsh qshVar, defpackage.jfk jfkVar, defpackage.zbe zbeVar) {
        ((defpackage.yqj) a.l().ai((char) 5060)).y("updateClusterDisplaySetting(%s)", jfkVar);
        c(qshVar, "cluster_display_mode", jfkVar.d, zbeVar, jfkVar.f);
        this.d.m(jfkVar);
    }
}

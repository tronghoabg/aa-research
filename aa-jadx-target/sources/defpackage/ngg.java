package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ngg {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.DayNightSettingMgr");
    private final defpackage.eqs c = new defpackage.eqs();

    public static defpackage.ngg b() {
        return (defpackage.ngg) defpackage.mkp.a.i(defpackage.ngg.class);
    }

    public static final defpackage.ngi d(defpackage.qsh qshVar) {
        defpackage.kjf kjfVar = new defpackage.kjf(qshVar, 4);
        defpackage.zbe zbeVar = defpackage.zbe.SETTINGS_DAY_NIGHT_MODE;
        java.lang.String str = (java.lang.String) defpackage.kgu.c(kjfVar, "GH.DayNightSettingMgr", zbeVar, defpackage.zbd.cW, true, "Cannot access car", new java.lang.Object[0]);
        if (!"auto".equals(str)) {
            defpackage.ngi ngiVarA = defpackage.ngi.a(str);
            ((defpackage.yqj) b.l().ai((char) 5252)).M("getCurrentSetting(): %s (car service value = %s)", ngiVarA.name(), str);
            return ngiVarA;
        }
        defpackage.yqm yqmVar = b;
        defpackage.ngi ngiVar = defpackage.ngi.h;
        ((defpackage.yqj) yqmVar.l().ai((char) 5253)).M("Current car service value is %s, overriding to %s", "auto", ngiVar);
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, defpackage.zbd.cY).l());
        e(ngiVar, qshVar);
        return ngiVar;
    }

    private static void e(defpackage.ngi ngiVar, defpackage.qsh qshVar) {
        defpackage.kgu.d(new defpackage.mjh(qshVar, ngiVar, 4), "GH.DayNightSettingMgr", defpackage.zbe.SETTINGS_DAY_NIGHT_MODE, defpackage.zbd.cW, "Cannot access car", new java.lang.Object[0]);
    }

    public final defpackage.eqp a(defpackage.qsh qshVar) {
        defpackage.eqs eqsVar = this.c;
        if (!eqsVar.o()) {
            eqsVar.m(d(qshVar));
        }
        return eqsVar;
    }

    public final void c(defpackage.ngi ngiVar, defpackage.zbe zbeVar, defpackage.qsh qshVar) {
        ((defpackage.yqj) b.l().ai((char) 5254)).y("updateSetting(%s)", ngiVar);
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, ngiVar.j).l());
        e(ngiVar, qshVar);
        this.c.m(ngiVar);
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class mme {
    public static final yph a = yph.c("GH.PwrSavingsCfgMgr");
    public final eqm b = new eqm();
    public final eqm c = new eqm();
    public final eqm d = new eqm();

    public static mme b() {
        return (mme) mki.a.b(mme.class, new may(8));
    }

    public static void c(qrn qrnVar, String str, String str2, yzz yzzVar, yzy yzyVar) {
        kgq.d(new mja(qrnVar, str, str2, 3), "GH.PwrSavingsCfgMgr", yzzVar, yzyVar, "Cannot access car", new Object[0]);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzzVar, yzyVar).l());
    }

    public static boolean f(qrn qrnVar) {
        mki.a.g();
        if (ols.z(qrnVar, raj.D)) {
            ((ype) a.l().ai((char) 5055)).u("Multi Display Configuration allowed!");
            return true;
        }
        ((ype) a.l().ai((char) 5056)).u("Multi Display Configuration feature not present; Multi Display Configuration not allowed");
        return false;
    }

    public static final jfb g(qrn qrnVar) {
        String strJ = j(qrnVar, "auxiliary_display_mode", yzz.SETTINGS_AUX_DISPLAY_MODE, yzy.dr);
        jfb jfbVarA = jfb.a(strJ);
        ((ype) a.l().ai((char) 5052)).M("getCurrentAuxiliaryDisplaySetting(): %s (car service value = %s)", jfbVarA.name(), strJ);
        return jfbVarA;
    }

    public static final jfc h(qrn qrnVar) {
        String strJ = j(qrnVar, "cluster_display_mode", yzz.SETTINGS_CLUSTER_DISPLAY_MODE, yzy.ds);
        jfc jfcVarA = jfc.a(strJ);
        ((ype) a.l().ai((char) 5053)).M("getCurrentClusterDisplaySetting(): %s (car service value = %s)", jfcVarA.name(), strJ);
        return jfcVarA;
    }

    public static final jfe i(qrn qrnVar) {
        String strJ = j(qrnVar, "power_saving_mode", yzz.SETTINGS_POWER_SAVING_MODE, yzy.dt);
        jfe jfeVarA = jfe.a(strJ);
        ((ype) a.l().ai((char) 5054)).M("getPowerSavingSetting(): %s (car service value = %s)", jfeVarA.name(), strJ);
        return jfeVarA;
    }

    private static String j(qrn qrnVar, String str, yzz yzzVar, yzy yzyVar) {
        return (String) kgq.c(new mmd(qrnVar, str, 0), "GH.PwrSavingsCfgMgr", yzzVar, yzyVar, true, "Cannot access car", new Object[0]);
    }

    public final jfd a(qrn qrnVar) {
        return jfd.a(g(qrnVar), h(qrnVar));
    }

    public final void d(qrn qrnVar, jfb jfbVar, yzz yzzVar) {
        ((ype) a.l().ai((char) 5057)).y("updateAuxiliaryDisplaySetting(%s)", jfbVar);
        c(qrnVar, "auxiliary_display_mode", jfbVar.d, yzzVar, jfbVar.f);
        this.c.m(jfbVar);
    }

    public final void e(qrn qrnVar, jfc jfcVar, yzz yzzVar) {
        ((ype) a.l().ai((char) 5058)).y("updateClusterDisplaySetting(%s)", jfcVar);
        c(qrnVar, "cluster_display_mode", jfcVar.d, yzzVar, jfcVar.f);
        this.d.m(jfcVar);
    }
}

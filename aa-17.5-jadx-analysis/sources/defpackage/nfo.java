package defpackage;

/* loaded from: classes.dex */
public final class nfo {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.DayNightSettingMgr");
    private final eqm c = new eqm();

    public static nfo b() {
        return (nfo) mki.a.i(nfo.class);
    }

    public static final nfp d(qrn qrnVar) {
        kiz kizVar = new kiz(qrnVar, 4);
        yzz yzzVar = yzz.SETTINGS_DAY_NIGHT_MODE;
        String str = (String) kgq.c(kizVar, "GH.DayNightSettingMgr", yzzVar, yzy.cW, true, "Cannot access car", new Object[0]);
        if (!"auto".equals(str)) {
            nfp nfpVarA = nfp.a(str);
            ((ype) b.l().ai((char) 5250)).M("getCurrentSetting(): %s (car service value = %s)", nfpVarA.name(), str);
            return nfpVarA;
        }
        yph yphVar = b;
        nfp nfpVar = nfp.h;
        ((ype) yphVar.l().ai((char) 5251)).M("Current car service value is %s, overriding to %s", "auto", nfpVar);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzzVar, yzy.cY).l());
        e(nfpVar, qrnVar);
        return nfpVar;
    }

    private static void e(nfp nfpVar, qrn qrnVar) {
        kgq.d(new mjc(qrnVar, nfpVar, 4), "GH.DayNightSettingMgr", yzz.SETTINGS_DAY_NIGHT_MODE, yzy.cW, "Cannot access car", new Object[0]);
    }

    public final eqj a(qrn qrnVar) {
        eqm eqmVar = this.c;
        if (!eqmVar.o()) {
            eqmVar.m(d(qrnVar));
        }
        return eqmVar;
    }

    public final void c(nfp nfpVar, yzz yzzVar, qrn qrnVar) {
        ((ype) b.l().ai((char) 5252)).y("updateSetting(%s)", nfpVar);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzzVar, nfpVar.j).l());
        e(nfpVar, qrnVar);
        this.c.m(nfpVar);
    }
}

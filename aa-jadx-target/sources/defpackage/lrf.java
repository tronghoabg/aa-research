package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lrf extends defpackage.lhm {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.MediaDefaultAppCtrl");

    public lrf() {
        defpackage.lre lreVar = new defpackage.lre();
        this.j.c(lreVar);
        defpackage.ebo.e(defpackage.tcu.d(defpackage.lpx.i().f(), defpackage.lhe.b().a(defpackage.mqg.MEDIA), new defpackage.kuy(17))).eM(this, lreVar);
    }

    public static boolean a(android.content.ComponentName componentName) {
        return componentName.equals(defpackage.mkt.F) || componentName.equals(defpackage.mkt.G);
    }

    private static void b(android.content.ComponentName componentName, int i, defpackage.mqg mqgVar) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(4214)).M("Setting default media app to %s, category: %s", new defpackage.zkf(defpackage.zke.a, componentName.flattenToString()), mqgVar);
        defpackage.lhc.a().f(mqgVar, componentName);
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, mqgVar == defpackage.mqg.MEDIA ? defpackage.zbd.hh : defpackage.zbd.hi);
        rrvVarH.p(componentName);
        rrvVarH.z(i);
        oimVarU.F(rrvVarH.l());
    }

    private static final void e(defpackage.mqg mqgVar) {
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(defpackage.ler.a().b(defpackage.kit.b().e(), defpackage.nze.d(defpackage.nzd.a))).filter(new defpackage.kqi(18)).map(new lkg(14));
        int i = defpackage.ygw.d;
        j$.util.stream.Collector collector = defpackage.yds.a;
        defpackage.ygw<android.content.ComponentName> ygwVar = (defpackage.ygw) map.collect(collector);
        if (ygwVar.isEmpty()) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4212)).u("No media app present.");
            return;
        }
        java.util.HashMap map2 = new java.util.HashMap();
        for (android.content.ComponentName componentName : ygwVar) {
            map2.put(componentName.getPackageName(), componentName);
        }
        defpackage.absx absxVarB = acth.b();
        for (int i2 = 0; i2 < absxVarB.b.size(); i2++) {
            android.content.ComponentName componentName2 = (android.content.ComponentName) map2.get((java.lang.String) absxVarB.b.get(i2));
            if (componentName2 != null) {
                b(componentName2, ygwVar.size(), mqgVar);
                return;
            }
        }
        java.util.List list = ygwVar;
        if (mqgVar == defpackage.mqg.PHONE_MEDIA) {
            list = (java.util.List) j$.util.Collection.-EL.stream(ygwVar).filter(new defpackage.kqi(19)).collect(collector);
        }
        if (list.isEmpty()) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4213)).u("No phone media app present for PHONE_MEDIA category default app.");
        } else {
            b((android.content.ComponentName) j$.util.Collection.-EL.stream(list).min(j$.util.Comparator.-CC.comparing(new lkg(15), java.lang.String.CASE_INSENSITIVE_ORDER)).get(), list.size(), mqgVar);
        }
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void eQ() {
        super.eQ();
        defpackage.lhh lhhVarA = defpackage.lhc.a();
        defpackage.mqg mqgVar = defpackage.mqg.MEDIA;
        if (lhhVarA.a(mqgVar) == null) {
            e(mqgVar);
        }
        if (defpackage.lmp.a().e()) {
            defpackage.lhh lhhVarA2 = defpackage.lhc.a();
            defpackage.mqg mqgVar2 = defpackage.mqg.PHONE_MEDIA;
            if (lhhVarA2.a(mqgVar2) == null) {
                android.content.ComponentName componentNameA = defpackage.lhc.a().a(mqgVar);
                if (componentNameA == null || a(componentNameA)) {
                    e(mqgVar2);
                    return;
                }
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4215)).y("Setting default phone media app to the default media app %s", new defpackage.zkf(defpackage.zke.a, componentNameA));
                defpackage.lhc.a().f(mqgVar2, componentNameA);
            }
        }
    }
}

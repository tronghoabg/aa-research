package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lpx implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.MediaNowPlayingApp");
    public final defpackage.eqp b;
    public final java.util.Set c;
    private defpackage.eqp d;

    /* JADX WARN: Multi-variable type inference failed */
    public lpx(android.content.Context context) {
        int i = defpackage.ygw.d;
        defpackage.ygw ygwVar = defpackage.ymx.a;
        defpackage.afdo afdoVar = defpackage.tcu.a;
        this.d = new defpackage.eqs(ygwVar);
        this.c = new java.util.HashSet();
        java.lang.Object systemService = context.getSystemService("media_session");
        systemService.getClass();
        defpackage.eqp eqpVarA = defpackage.lnv.a(context, (android.media.session.MediaSessionManager) systemService);
        java.util.HashMap map = new java.util.HashMap();
        if (!defpackage.lmp.a.a().c()) {
            this.b = defpackage.ebo.e(defpackage.tcu.C(defpackage.ebo.e(defpackage.kja.a()), new defpackage.ipk(this, eqpVarA, map, 12)));
            return;
        }
        defpackage.eqp eqpVarE = defpackage.ebo.e(defpackage.kja.a());
        defpackage.eqp eqpVarC = defpackage.tcu.C(eqpVarE, new defpackage.err(eqpVarA, map, 7, (byte[]) null));
        defpackage.eqp eqpVarC2 = defpackage.tcu.C(eqpVarE, new defpackage.dbj(eqpVarC, 18));
        this.b = defpackage.ebo.e(defpackage.tcu.C(eqpVarE, new defpackage.err((java.lang.Object) this, (java.lang.Object) eqpVarC, 8, (char[]) (0 == true ? 1 : 0))));
        this.d = defpackage.ebo.f(defpackage.ebo.e(eqpVarC2), new defpackage.nnp(ygwVar, 13));
    }

    public static android.content.ComponentName a(lmi lmiVar) {
        java.lang.String strR = lmiVar.R();
        strR.getClass();
        return new android.content.ComponentName(strR, lmiVar.n().getString("android.media.session.BROWSE_SERVICE", ""));
    }

    public static lph g(defpackage.qsh qshVar, java.util.List list, java.util.Set set) {
        j$.util.stream.Stream streamDistinct = j$.util.Collection.-EL.stream(list).filter(new defpackage.lqd(qshVar, set, 1)).map(new defpackage.lpk(qshVar, 2)).filter(new defpackage.kqi(11)).distinct();
        int i = defpackage.ygw.d;
        defpackage.ygw ygwVar = (defpackage.ygw) streamDistinct.collect(defpackage.yds.a);
        if (ygwVar.isEmpty()) {
            return null;
        }
        lph lphVar = (lph) ygwVar.get(0);
        if (defpackage.acmw.i()) {
            set.add(lphVar.a);
        }
        if (ygwVar.size() >= 2) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(4171)).M("Multiple playing browser services (%s), choosing %s", ygwVar, lphVar);
            int size = ygwVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                lph lphVar2 = (lph) ygwVar.get(i2);
                defpackage.oio oioVarA = defpackage.oio.a();
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_SESSION_LIFECYCLE, defpackage.zbd.fX);
                rrvVarH.p(lphVar2.a);
                oioVarA.b((defpackage.rrw) rrvVarH.l());
            }
        }
        return lphVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0116  */
    /* JADX WARN: Code duplicated, block: B:4:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public static lph h(defpackage.qsh qshVar, lpm lpmVar) {
        lph lphVar;
        android.content.ComponentName componentName;
        defpackage.lmk lmkVar;
        java.lang.String str = lpmVar.a;
        defpackage.ygw ygwVarC = defpackage.loo.c(qshVar, str);
        boolean zIsEmpty = ygwVarC.isEmpty();
        android.os.Bundle bundle = lpmVar.e;
        boolean z = true;
        if (zIsEmpty) {
            lphVar = null;
            componentName = null;
        } else {
            boolean zC = defpackage.kmv.c(defpackage.actz.i(), ((android.content.ComponentName) ygwVarC.get(0)).getClassName());
            if (ygwVarC.size() != 1 || zC) {
                defpackage.ygw ygwVar = (defpackage.ygw) j$.util.Collection.-EL.stream(ygwVarC).filter(new defpackage.lpa(bundle.getString("android.media.session.BROWSE_SERVICE", ""), 4)).collect(defpackage.yds.a);
                if (!ygwVar.isEmpty()) {
                    lphVar = null;
                    componentName = (android.content.ComponentName) ygwVar.get(0);
                    if (ygwVar.size() >= 2) {
                        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(4167)).D("%d duplicate media browser service names %s exist in AvailableAppFinder", ygwVar.size(), componentName);
                    }
                } else if (zC) {
                    lphVar = null;
                    componentName = null;
                } else {
                    android.content.ComponentName componentName2 = (android.content.ComponentName) j$.util.Collection.-EL.stream(ygwVarC).min(j$.util.Comparator.-CC.naturalOrder()).get();
                    ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(4168)).M("Ambiguous browser services (%s), choosing %s", ygwVarC, componentName2);
                    int size = ygwVarC.size();
                    for (int i = 0; i < size; i++) {
                        android.content.ComponentName componentName3 = (android.content.ComponentName) ygwVarC.get(i);
                        defpackage.oio oioVarA = defpackage.oio.a();
                        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_SESSION_LIFECYCLE, defpackage.zbd.fW);
                        rrvVarH.p(componentName3);
                        oioVarA.b((defpackage.rrw) rrvVarH.l());
                    }
                    lphVar = null;
                    componentName = componentName2;
                }
            } else {
                componentName = (android.content.ComponentName) ygwVarC.get(0);
                lphVar = null;
            }
        }
        if (k() && componentName == null && (lmkVar = lpmVar.c) != null) {
            lmj lmjVarH = lmkVar.h();
            if (lmjVarH.S() == null && lmjVarH.R() == null && lmjVarH.O() == null && lmjVarH.P() == null) {
                z = false;
            } else {
                componentName = new android.content.ComponentName(str, bundle.getString("android.media.session.BROWSE_SERVICE", ""));
            }
        } else {
            z = false;
        }
        defpackage.lma lmaVar = lpmVar.f;
        return (componentName == null || lmaVar == null) ? lphVar : new lph(componentName, lmaVar, z);
    }

    public static defpackage.lpx i() {
        return (defpackage.lpx) defpackage.mkp.a.i(defpackage.lpx.class);
    }

    public static defpackage.ygw j(defpackage.qsh qshVar, java.util.List list, java.util.Map map) {
        defpackage.ygw ygwVar;
        if (k()) {
            j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(list).filter(new defpackage.kqi(9));
            int i = defpackage.ygw.d;
            ygwVar = (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
        } else {
            j$.util.stream.Stream streamFilter2 = j$.util.Collection.-EL.stream(list).filter(new defpackage.lpa(qshVar, 3));
            int i2 = defpackage.ygw.d;
            ygwVar = (defpackage.ygw) streamFilter2.collect(defpackage.yds.a);
        }
        defpackage.yhx yhxVar = (defpackage.yhx) j$.util.Collection.-EL.stream(ygwVar).map(new lkg(12)).collect(defpackage.yds.b);
        defpackage.yot it = defpackage.yhx.n(map.keySet()).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (!yhxVar.contains(next)) {
                map.remove(next);
            }
        }
        return (defpackage.ygw) j$.util.Collection.-EL.stream(ygwVar).map(new defpackage.gjt(map, 20)).filter(new defpackage.kqi(10)).collect(defpackage.yds.a);
    }

    public static boolean k() {
        return defpackage.lmp.a().e() || defpackage.actz.D();
    }

    public final defpackage.eqp b() {
        defpackage.ysr.bk(defpackage.lmp.a().c(), "The multiple dashboard media cards feature needs to be enabled to use this API.");
        return this.d;
    }

    @Override // defpackage.lhn
    public final void d() {
        if (defpackage.acmw.i()) {
            this.c.clear();
        }
    }

    public final defpackage.eqp e() {
        defpackage.krx krxVar = new defpackage.krx(17);
        defpackage.afdo afdoVar = defpackage.tcu.a;
        defpackage.eqp eqpVar = this.b;
        eqpVar.getClass();
        return defpackage.ebo.f(eqpVar, new defpackage.nnp(krxVar, 14));
    }

    public final defpackage.eqp f() {
        return !k() ? defpackage.tcu.w(this.b, new defpackage.lnc(8)) : defpackage.tcu.C(defpackage.ebo.e(defpackage.kja.a()), new defpackage.llr(this, 11));
    }

    @Override // defpackage.lhn
    public final void eQ() {
    }
}

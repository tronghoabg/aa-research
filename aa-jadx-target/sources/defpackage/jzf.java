package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jzf extends defpackage.nzc {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("CarApp.H");
    private static final defpackage.yhx c = new defpackage.ynu(defpackage.nzd.b);
    private boolean d;

    public jzf() {
        super("AppHost");
        this.d = false;
    }

    public static defpackage.jzf a() {
        return (defpackage.jzf) defpackage.mkp.a.i(defpackage.jzf.class);
    }

    @Override // defpackage.nzc
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.ygw b(defpackage.qsh qshVar, defpackage.nze nzeVar) {
        defpackage.yhx yhxVar = c;
        defpackage.nze nzeVarC = nzeVar.c(yhxVar);
        android.content.Intent intent = new android.content.Intent("androidx.car.app.CarAppService");
        defpackage.qqe qqeVar = defpackage.qqe.h;
        java.util.List<android.content.pm.ResolveInfo> listC = defpackage.mkc.b().c(qshVar, new defpackage.nzf(intent, qqeVar, nzeVarC));
        defpackage.yqm yqmVar = b;
        ((defpackage.yqj) yqmVar.l().ai((char) 2858)).y("Raw list of car apps found: %s", listC);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.content.pm.ResolveInfo resolveInfo : listC) {
            java.lang.String str = resolveInfo.serviceInfo.packageName;
            if (!str.equals("com.google.android.projection.gearhead") && !defpackage.ogv.d().g(str)) {
                arrayList.add(resolveInfo);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(m(arrayList, defpackage.adae.c()));
        java.util.List listC2 = defpackage.mkc.b().c(qshVar, new defpackage.nzf(new android.content.Intent("androidx.car.app.CarAppService").addCategory("androidx.car.app.category.SETTINGS"), qqeVar, nzeVarC.c(yhxVar)));
        ((defpackage.yqj) yqmVar.l().ai((char) 2859)).y("Settings template apps found: %s", listC2);
        arrayList2.removeAll(n(listC2));
        if (defpackage.acyc.V() && !jrl.b(defpackage.mkp.a.c)) {
            java.util.List listC3 = defpackage.mkc.b().c(qshVar, new defpackage.nzf(new android.content.Intent("androidx.car.app.CarAppService").addCategory("androidx.car.app.category.MESSAGING"), qqeVar, nzeVarC.c(yhxVar)));
            ((defpackage.yqj) yqmVar.l().ai((char) 2860)).y("Messaging template apps found: %s", listC3);
            arrayList2.removeAll(n(listC3));
        }
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(arrayList2).map(new defpackage.jvi(12));
        int i = defpackage.ygw.d;
        java.util.HashSet hashSet = new java.util.HashSet((defpackage.ygw) map.collect(defpackage.yds.a));
        android.content.ComponentName componentName = defpackage.mkt.v;
        defpackage.mqg mqgVar = defpackage.mqg.SYSTEM;
        hashSet.add(new defpackage.mqj(componentName, mqgVar));
        hashSet.add(new defpackage.mqj(defpackage.mkt.p, mqgVar));
        if (defpackage.actb.g()) {
            hashSet.add(new defpackage.mqj(defpackage.mkt.D, mqgVar));
        }
        if (!nzeVar.e() || defpackage.nrr.a().e()) {
            try {
                defpackage.mkp.a.f();
                com.google.android.gms.car.CarInfo carInfoD = defpackage.ooa.d(qshVar);
                if (carInfoD == null || carInfoD.r != 3) {
                    defpackage.nsn nsnVarE = defpackage.nsn.e();
                    android.content.ComponentName componentName2 = defpackage.mkt.u;
                    if (nsnVarE.g(componentName2) || !nzeVar.f()) {
                        hashSet.add(new defpackage.mqj(componentName2, defpackage.mqg.OTHER, null));
                    }
                }
            } catch (defpackage.qst e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.h()).p(e)).ai((char) 2862)).u("Unable to get vehicle type");
            }
        }
        if (!this.d) {
            defpackage.rrv rrvVarA = defpackage.kag.a(defpackage.zbd.sk);
            rrvVarA.q((java.util.Collection) j$.util.Collection.-EL.stream(hashSet).map(new defpackage.jvi(11)).collect(defpackage.yds.a));
            defpackage.kag.e(rrvVarA);
            ((defpackage.yqj) b.l().ai((char) 2861)).y("All template apps found: %s", hashSet);
            this.d = true;
        }
        return defpackage.ygw.o(hashSet);
    }

    @Override // defpackage.nzc
    protected final void ez(java.io.PrintWriter printWriter) {
        printWriter.printf("- external component filter:\n%s\n\n", defpackage.adae.c());
    }
}

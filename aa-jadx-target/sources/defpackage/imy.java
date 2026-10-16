package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class imy implements defpackage.xzi {
    private final /* synthetic */ int a;

    public /* synthetic */ imy(int i) {
        this.a = i;
    }

    @Override // defpackage.xzi
    public final java.lang.Object fF() {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yqm yqmVar = defpackage.inh.a;
                return java.lang.Integer.valueOf((int) defpackage.acwv.a.fF().g());
            case 1:
                return java.lang.Boolean.valueOf(defpackage.actq.a.fF().h());
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.xzi xziVar = defpackage.iuf.a;
                return android.os.Build.VERSION.SDK_INT >= 30 ? new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.gmscorecompat.CarChimeraService") : new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.car.CarService");
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.xzi xziVar2 = defpackage.iuf.a;
                return android.os.Build.VERSION.SDK_INT >= 30 ? new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.gmscorecompat.CarSetupServiceImpl") : new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.carsetup.CarSetupService");
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.xzi xziVar3 = defpackage.iuf.a;
                return android.os.Build.VERSION.SDK_INT >= 30 ? new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.gmscorecompat.FirstActivityImpl") : new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.car.FirstActivity");
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar2 = defpackage.iyh.a;
                defpackage.absx absxVarB = defpackage.acnc.a.fF().b();
                defpackage.xzd xzdVar = defpackage.iyo.a;
                defpackage.yhe yheVarB = defpackage.tht.b(new defpackage.ilz(7), absxVarB);
                java.util.HashMap map = new java.util.HashMap();
                defpackage.yot it = yheVarB.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.util.List listI = defpackage.iyo.a.i((java.lang.CharSequence) entry.getKey());
                    if (listI.size() != 2) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.iyo.b.h()).ai((char) 1630)).y("Invalid flag entry for blocklist %s", entry);
                    } else {
                        java.lang.String str = (java.lang.String) listI.get(0);
                        ((java.util.Set) j$.util.Map.-EL.computeIfAbsent(map, str, new defpackage.ilz(8))).add(new defpackage.iyn(str, (java.lang.String) listI.get(1), (java.util.Set) entry.getValue()));
                    }
                }
                return new defpackage.iyo(map);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yqm yqmVar3 = defpackage.jkx.a;
                defpackage.yhv yhvVar = new defpackage.yhv();
                defpackage.adab adabVar = defpackage.adab.a;
                yhvVar.k(adabVar.fF().b().b);
                yhvVar.k(adabVar.fF().a().b);
                return yhvVar.g();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yqm yqmVar4 = defpackage.jll.a;
                return new defpackage.jlj(defpackage.ygw.r("com.google.android.projection.gearhead", "com.google.android.gms"), true);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar5 = defpackage.joe.a;
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.joe.a.f()).ai((char) 2444)).u("Android is R+, so connecting to Gearhead car chimera service.");
                    return defpackage.yys.ESCAPE_POD_R;
                }
                ((defpackage.yqj) ((defpackage.yqj) defpackage.joe.a.f()).ai((char) 2443)).u("Obtaining car service delegate from GMS Core via connectionless.");
                return defpackage.yys.GMS_CAR_CONNECTIONLESS;
            case 9:
                return java.util.concurrent.Executors.newSingleThreadExecutor();
            case 10:
                int i = defpackage.kjb.p;
                return new android.os.Handler(android.os.Looper.getMainLooper());
            case 11:
                defpackage.yqm yqmVar6 = defpackage.kmy.a;
                return (defpackage.kmy) defpackage.mkp.a.i(defpackage.kmy.class);
            case 12:
                defpackage.yqm yqmVar7 = defpackage.oix.a;
                return defpackage.oix.g(defpackage.acpv.a.fF().o());
            case 13:
                defpackage.yqm yqmVar8 = defpackage.oix.a;
                return defpackage.oix.g(defpackage.acpv.a.fF().n());
            case 14:
                return java.lang.Boolean.valueOf(addc.c());
            case 15:
                int i2 = defpackage.qfn.g;
                return new defpackage.oil();
            case 16:
                int i3 = defpackage.qfn.g;
                return new defpackage.lvx();
            case 17:
                int i4 = defpackage.qfn.g;
                return new defpackage.lvv();
            case 18:
                int i5 = defpackage.qfn.g;
                return new defpackage.mbw(defpackage.jrj.b);
            case 19:
                defpackage.yqk yqkVar = defpackage.qtn.a;
                defpackage.sqs sqsVar = defpackage.stp.a;
                return defpackage.sqs.h(1);
            default:
                defpackage.xzi xziVar4 = defpackage.riv.a;
                return android.os.Build.VERSION.SDK_INT >= 30 ? new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.gmscorecompat.CarChimeraService") : new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.car.CarService");
        }
    }
}

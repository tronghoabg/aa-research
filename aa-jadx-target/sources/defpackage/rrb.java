package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rrb {
    public final defpackage.yhe a;
    public final java.util.Map b;
    public int c;

    static {
        defpackage.omv.n("CAR.UiEventBatcher");
    }

    public rrb() {
        defpackage.yha yhaVar = new defpackage.yha(4);
        defpackage.rra rraVar = new defpackage.rra(defpackage.ysr.n(java.util.EnumSet.allOf(defpackage.ovn.class)));
        yhaVar.f(defpackage.zbd.nQ, rraVar);
        yhaVar.f(defpackage.zbd.nR, rraVar);
        yhaVar.f(defpackage.zbd.nS, rraVar);
        defpackage.yhe yheVarD = yhaVar.d(true);
        this.b = new defpackage.zd();
        this.a = yheVarD;
    }

    public static void a(defpackage.rry rryVar, defpackage.zbd zbdVar, int i) {
        if (i <= 0) {
            return;
        }
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.TELEMETRY, zbdVar);
        rrvVarH.w(i);
        defpackage.rrw rrwVar = (defpackage.rrw) rrvVarH.l();
        defpackage.yyh yyhVar = defpackage.yyh.UI;
        defpackage.yyg yygVar = (defpackage.yyg) rrwVar.g().q();
        int i2 = defpackage.ygw.d;
        rryVar.a(yyhVar, yygVar, defpackage.ymx.a);
    }

    static void b(defpackage.zbg zbgVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((zbgVar.b & 2) != 0) {
            defpackage.zbd zbdVarB = defpackage.zbd.b(zbgVar.e);
            arrayList.add("action=".concat(zbdVarB != null ? zbdVarB.sn : "UNRECOGNIZED_ENUM_VALUE"));
        }
        if ((zbgVar.b & 1) != 0) {
            arrayList.add("context=".concat(java.lang.String.valueOf(c(defpackage.zbe.b(zbgVar.d)))));
        }
        if ((zbgVar.b & 16) != 0) {
            arrayList.add("screen=".concat(java.lang.String.valueOf(c(defpackage.zbe.b(zbgVar.h)))));
        }
        if ((zbgVar.b & 8) != 0) {
            arrayList.add("appPackage=".concat(java.lang.String.valueOf(zbgVar.g)));
        }
        if ((zbgVar.b & 16384) != 0) {
            arrayList.add("componentName=".concat(java.lang.String.valueOf(zbgVar.r)));
        }
        if ((zbgVar.b & 32768) != 0) {
            arrayList.add("eventCount=" + zbgVar.s);
        }
        if ((zbgVar.b & 4) != 0) {
            arrayList.add("durationMs=" + zbgVar.f);
        }
        new defpackage.xyj(", ").b(arrayList);
    }

    private static java.lang.String c(defpackage.zbe zbeVar) {
        return zbeVar != null ? zbeVar.name() : "UNRECOGNIZED_ENUM_VALUE";
    }
}

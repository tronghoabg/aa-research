package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lqf {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.MediaSugPvdr");
    public final android.content.Context b;

    public lqf(android.content.Context context) {
        this.b = context;
    }

    public static defpackage.eqp a(android.content.ComponentName componentName) {
        defpackage.eqp eqpVarC = defpackage.tcu.C(defpackage.kja.a(), new defpackage.llr(componentName, 15));
        int i = defpackage.ygw.d;
        return defpackage.tcu.v(defpackage.tcu.F(defpackage.ebo.e(defpackage.tcu.c(eqpVarC, defpackage.ymx.a)), new kcx(componentName, 5)), new defpackage.llr(componentName, 16));
    }

    public static defpackage.eqp c(lny lnyVar, defpackage.eqp eqpVar, int i) {
        if (i <= 7) {
            return defpackage.tcu.C(defpackage.tcu.v(eqpVar, new defpackage.lnc(15)), new defpackage.aif(lnyVar, i, 16));
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4184)).w("Breaking iteration at depth = %d.", 8);
        int i2 = defpackage.ygw.d;
        defpackage.ygw ygwVar = defpackage.ymx.a;
        defpackage.afdo afdoVar = defpackage.tcu.a;
        return new defpackage.eqs(ygwVar);
    }

    public static defpackage.lqf d() {
        return (defpackage.lqf) defpackage.mkp.a.b(defpackage.lqf.class, new defpackage.lqb(2));
    }

    public static void e(android.content.ComponentName componentName, defpackage.zbd zbdVar) {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, zbdVar);
        if (componentName != null) {
            rrvVarH.p(componentName);
        }
        defpackage.omf.u().F(rrvVarH.l());
    }

    public final defpackage.eqp b(android.content.ComponentName componentName) {
        defpackage.eqp eqpVarG;
        if (!defpackage.actz.H()) {
            eqpVarG = defpackage.ebo.g(defpackage.ebo.n().a(), new defpackage.llr(componentName, 13));
        } else if (componentName != null) {
            ((defpackage.yqj) a.l().ai((char) 4178)).y("Use Gearhead media browse suggestions for %s", componentName);
            eqpVarG = a(componentName);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4177)).u("Did not attempt to use App browser suggestions for null componentName");
            int i = defpackage.ygw.d;
            defpackage.ygw ygwVar = defpackage.ymx.a;
            defpackage.afdo afdoVar = defpackage.tcu.a;
            eqpVarG = new defpackage.eqs(ygwVar);
        }
        int i2 = defpackage.ygw.d;
        return defpackage.tcu.v(defpackage.tcu.u(eqpVarG, defpackage.ymx.a), new defpackage.llr(this, 19));
    }
}

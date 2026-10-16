package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kag {
    public static final defpackage.yqm a = defpackage.yqm.c("CarApp.H");

    public static defpackage.rrv a(defpackage.zbd zbdVar) {
        return defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.CAR_APP_LIBRARY, zbdVar);
    }

    public static defpackage.rrv b(defpackage.zbd zbdVar, android.content.ComponentName componentName) {
        defpackage.rrv rrvVarA = a(zbdVar);
        rrvVarA.p(componentName);
        return rrvVarA;
    }

    public static defpackage.ygw c(defpackage.qsh qshVar, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("androidx.car.app.CarAppService");
        if (str != null) {
            intent.addCategory(str);
        }
        j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(defpackage.mkc.b().c(qshVar, new defpackage.nzf(intent, defpackage.qqe.h, defpackage.nze.b()))).filter(new defpackage.ghv(intent, 18)).map(new defpackage.jvi(16)).filter(new defpackage.hmj(15));
        int i = defpackage.ygw.d;
        return (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(defpackage.ygw ygwVar, defpackage.yyd yydVar, java.lang.String str) {
        int size = ygwVar.size();
        for (int i = 0; i < size; i++) {
            android.content.ComponentName componentName = (android.content.ComponentName) ygwVar.get(i);
            if (str != null) {
                ((defpackage.yqj) a.l().ai((char) 2893)).M("%s declared as a %s app", componentName.flattenToShortString(), str);
            } else {
                ((defpackage.yqj) a.l().ai((char) 2892)).y("%s does not declare category", componentName.flattenToShortString());
            }
        }
        defpackage.rrv rrvVarA = a(defpackage.zbd.sJ);
        rrvVarA.q(ygwVar);
        rrvVarA.o = defpackage.xyn.h(yydVar);
        e(rrvVarA);
    }

    public static void e(defpackage.rrv rrvVar) {
        defpackage.omf.u().F(rrvVar.l());
    }

    public static void f(defpackage.zbd zbdVar, android.content.ComponentName componentName) {
        e(b(zbdVar, componentName));
    }

    public static void g(defpackage.zbd zbdVar, java.lang.String str) {
        f(zbdVar, new android.content.ComponentName(str, ""));
    }
}

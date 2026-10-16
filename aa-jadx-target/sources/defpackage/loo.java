package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class loo {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.MediaAppFinder");

    public static android.content.ComponentName a(defpackage.qsh qshVar, java.lang.String str) {
        defpackage.ygw ygwVarC = c(qshVar, str);
        if (ygwVarC.isEmpty()) {
            return null;
        }
        android.content.ComponentName componentName = (android.content.ComponentName) j$.util.Collection.-EL.stream(ygwVarC).min(j$.util.Comparator.-CC.naturalOrder()).get();
        if (ygwVarC.size() > 1) {
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai(4103)).M("Multiple browser services %s, choosing %s", ygwVarC, componentName);
        }
        return componentName;
    }

    public static defpackage.eqp b() {
        return defpackage.tcu.v((defpackage.eqp) defpackage.ngb.a().a, new defpackage.lnc(5));
    }

    public static defpackage.ygw c(defpackage.qsh qshVar, java.lang.String str) {
        j$.util.stream.Stream streamFilter = d(qshVar).filter(new defpackage.koo(str, 18));
        int i = defpackage.ygw.d;
        return (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
    }

    public static j$.util.stream.Stream d(defpackage.qsh qshVar) {
        return j$.util.Collection.-EL.stream(defpackage.ler.a().b(qshVar, defpackage.nze.d(defpackage.nzd.a))).filter(new defpackage.kqi(8)).map(new lkg(11));
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lot {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.MediaLiveDataFns");

    public static defpackage.eqp a(android.content.ComponentName componentName) {
        defpackage.eqr eqrVar = new defpackage.eqr();
        if (defpackage.adae.p() && componentName.getPackageName().isEmpty()) {
            eqrVar.m(java.lang.Boolean.FALSE);
            return eqrVar;
        }
        eqrVar.r(defpackage.lpg.j().b(componentName), new defpackage.lnj(eqrVar, 2));
        return eqrVar;
    }

    public static java.lang.Object b(java.lang.Object obj, java.lang.Class cls) {
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }
}

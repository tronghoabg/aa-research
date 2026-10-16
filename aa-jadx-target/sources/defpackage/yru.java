package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yru {
    public static final defpackage.ysr a;
    private static final java.util.Set b;

    static {
        java.util.Set setSingleton = java.util.Collections.singleton(defpackage.ypk.a);
        b = setSingleton;
        a = new defpackage.yrt(setSingleton);
    }

    public static boolean a(defpackage.yqt yqtVar, defpackage.yrp yrpVar, java.util.Set set) {
        return (yqtVar.d() == null && yrpVar.a() <= set.size() && set.containsAll(yrpVar.c())) ? false : true;
    }

    public static void b(defpackage.yrp yrpVar, defpackage.yrf yrfVar, java.lang.StringBuilder sb) {
        defpackage.yqs yqsVar = new defpackage.yqs(sb);
        yrpVar.d(yrfVar, yqsVar);
        if (yqsVar.c) {
            yqsVar.b.append(yqsVar.a);
        }
    }
}

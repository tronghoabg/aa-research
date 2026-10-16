package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class syg {
    private static defpackage.syf a;

    public static synchronized defpackage.syf a() {
        if (a == null) {
            b(new defpackage.syj());
        }
        return a;
    }

    public static synchronized void b(defpackage.syf syfVar) {
        if (a != null) {
            throw new java.lang.IllegalStateException("init() already called");
        }
        a = syfVar;
    }
}

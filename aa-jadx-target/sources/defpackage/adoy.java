package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adoy extends defpackage.adkq {
    private static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.adoy.class.getName());
    static final java.lang.ThreadLocal a = new java.lang.ThreadLocal();

    @Override // defpackage.adkq
    public final defpackage.adkr a() {
        defpackage.adkr adkrVar = (defpackage.adkr) a.get();
        return adkrVar == null ? defpackage.adkr.d : adkrVar;
    }

    @Override // defpackage.adkq
    public final defpackage.adkr b(defpackage.adkr adkrVar) {
        defpackage.adkr adkrVarA = a();
        a.set(adkrVar);
        return adkrVarA;
    }

    @Override // defpackage.adkq
    public final void c(defpackage.adkr adkrVar, defpackage.adkr adkrVar2) {
        if (a() != adkrVar) {
            b.logp(java.util.logging.Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new java.lang.Throwable().fillInStackTrace());
        }
        if (adkrVar2 != defpackage.adkr.d) {
            a.set(adkrVar2);
        } else {
            a.set(null);
        }
    }
}

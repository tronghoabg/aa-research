package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class sle extends defpackage.slf {
    private final java.util.concurrent.Callable e;

    public sle(java.util.concurrent.Callable callable) {
        super(false, null, null);
        this.e = callable;
    }

    @Override // defpackage.slf
    public final java.lang.String a() {
        try {
            return (java.lang.String) this.e.call();
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}

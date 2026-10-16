package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ahzq {
    private ahzq() {
    }

    public static final java.util.concurrent.CancellationException a(java.lang.String str, java.lang.Throwable th) {
        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public final java.util.Set<defpackage.ahod> getBLACK_LIST() {
        return defpackage.ahzr.BLACK_LIST;
    }

    public /* synthetic */ ahzq(defpackage.affu affuVar) {
        this();
    }
}

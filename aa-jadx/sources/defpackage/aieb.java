package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aieb {
    private aieb() {
    }

    public static final void a(defpackage.aiyw aiywVar, java.lang.Throwable th) {
        java.util.concurrent.CancellationException cancellationExceptionA = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
        if (cancellationExceptionA == null) {
            cancellationExceptionA = defpackage.ahzq.a("Channel was consumed, consumer had failed", th);
        }
        aiywVar.s(cancellationExceptionA);
    }

    public final defpackage.aiec getDEFAULT_VISIBLE() {
        return defpackage.aiec.DEFAULT_VISIBLE;
    }

    public /* synthetic */ aieb(defpackage.affu affuVar) {
        this();
    }
}

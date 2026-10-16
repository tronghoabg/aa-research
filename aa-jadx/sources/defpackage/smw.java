package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class smw {
    final /* synthetic */ com.google.android.gms.common.api.internal.BasePendingResult a;

    public smw(com.google.android.gms.common.api.internal.BasePendingResult basePendingResult) {
        this.a = basePendingResult;
    }

    protected final void finalize() throws java.lang.Throwable {
        java.lang.ThreadLocal threadLocal = com.google.android.gms.common.api.internal.BasePendingResult.b;
        com.google.android.gms.common.api.internal.BasePendingResult.i(this.a.c);
        super.finalize();
    }
}

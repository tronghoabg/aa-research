package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class smg extends java.lang.UnsupportedOperationException {
    private final com.google.android.gms.common.Feature a;

    public smg(com.google.android.gms.common.Feature feature) {
        this.a = feature;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return "Missing ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.a)));
    }
}

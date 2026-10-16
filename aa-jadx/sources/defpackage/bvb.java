package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bvb extends java.lang.IllegalStateException {
    private final java.lang.String a;

    public bvb(java.lang.String str) {
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.a;
    }
}

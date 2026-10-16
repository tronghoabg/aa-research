package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fcb extends java.lang.RuntimeException {
    public final java.lang.Throwable a;
    public final int b;

    public fcb(int i, java.lang.Throwable th) {
        super(th);
        this.b = i;
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        return this.a;
    }
}

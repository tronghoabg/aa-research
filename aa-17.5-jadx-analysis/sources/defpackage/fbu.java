package defpackage;

/* loaded from: classes2.dex */
final class fbu extends RuntimeException {
    public final Throwable a;
    public final int b;

    public fbu(int i, Throwable th) {
        super(th);
        this.b = i;
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}

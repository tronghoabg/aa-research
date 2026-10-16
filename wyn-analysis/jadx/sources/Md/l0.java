package md;

/* loaded from: classes5.dex */
public final class l0 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f40690a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f40691b;

    public l0(k0 k0Var) {
        super(k0.c(k0Var), k0Var.f40687c);
        this.f40690a = k0Var;
        this.f40691b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f40691b ? super.fillInStackTrace() : this;
    }
}

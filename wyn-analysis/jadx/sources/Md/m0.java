package md;

/* loaded from: classes5.dex */
public final class m0 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f40698a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f40699b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f40700c;

    public m0(k0 k0Var, b0 b0Var) {
        super(k0.c(k0Var), k0Var.f40687c);
        this.f40698a = k0Var;
        this.f40699b = b0Var;
        this.f40700c = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f40700c ? super.fillInStackTrace() : this;
    }
}

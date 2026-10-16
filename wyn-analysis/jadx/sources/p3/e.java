package p3;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final f f43211a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f43212b;

    public e(f fVar, Throwable th) {
        super(th);
        this.f43211a = fVar;
        this.f43212b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f43212b;
    }
}

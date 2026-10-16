package Ef;

/* loaded from: classes5.dex */
public final class Y extends Z {

    /* renamed from: c, reason: collision with root package name */
    public final M0 f3707c;

    public Y(long j8, M0 m02) {
        super(j8);
        this.f3707c = m02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3707c.run();
    }

    @Override // Ef.Z
    public final String toString() {
        return super.toString() + this.f3707c;
    }
}

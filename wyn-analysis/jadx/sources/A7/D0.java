package A7;

/* loaded from: classes4.dex */
public abstract class D0 extends B0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f435b;

    public D0(C0273n0 c0273n0) {
        super(c0273n0);
        ((C0273n0) this.f421a).f969E++;
    }

    public final void e0() {
        if (!this.f435b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void f0() {
        if (this.f435b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (g0()) {
            return;
        }
        ((C0273n0) this.f421a).f971G.incrementAndGet();
        this.f435b = true;
    }

    public abstract boolean g0();
}

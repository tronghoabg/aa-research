package A7;

/* loaded from: classes4.dex */
public abstract class Y extends B {

    /* renamed from: b, reason: collision with root package name */
    public boolean f756b;

    public Y(C0273n0 c0273n0) {
        super(c0273n0);
        ((C0273n0) this.f421a).f969E++;
    }

    public final void h0() {
        if (!this.f756b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void i0() {
        if (this.f756b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (j0()) {
            return;
        }
        ((C0273n0) this.f421a).f971G.incrementAndGet();
        this.f756b = true;
    }

    public abstract boolean j0();
}

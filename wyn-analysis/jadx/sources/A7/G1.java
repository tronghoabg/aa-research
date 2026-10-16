package A7;

/* loaded from: classes4.dex */
public abstract class G1 extends H1 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f500c;

    public G1(L1 l12) {
        super(l12);
        this.f509b.f583r++;
    }

    public final void h0() {
        if (!this.f500c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void i0() {
        if (this.f500c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j0();
        this.f509b.f584s++;
        this.f500c = true;
    }

    public abstract boolean j0();
}

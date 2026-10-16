package E4;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2896a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2897b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2898c;

    public j() {
        this.f2896a = true;
        this.f2897b = false;
        this.f2898c = false;
    }

    public W1.e a() {
        if (this.f2896a || !(this.f2897b || this.f2898c)) {
            return new W1.e(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public boolean b() {
        return (this.f2898c || this.f2897b) && this.f2896a;
    }

    public /* synthetic */ j(boolean z2, boolean z10, boolean z11) {
        this.f2896a = z2;
        this.f2897b = z10;
        this.f2898c = z11;
    }
}

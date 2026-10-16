package Cf;

/* loaded from: classes5.dex */
public final class h implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final h f2222b = new h(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2223a;

    public /* synthetic */ h(int i5) {
        this.f2223a = i5;
    }

    @Override // Cf.i
    public g a() {
        return new g(e.b());
    }

    public String toString() {
        switch (this.f2223a) {
            case 0:
                int i5 = e.f2220b;
                return "TimeSource(System.nanoTime())";
            default:
                return super.toString();
        }
    }
}

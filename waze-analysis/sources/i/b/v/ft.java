package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class ft implements com.google.v.ei {

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f49500h;

    /* renamed from: g, reason: collision with root package name */
    static final com.google.v.ei f49499g = new ft(6);

    /* renamed from: f, reason: collision with root package name */
    static final com.google.v.ei f49498f = new ft(5);

    /* renamed from: e, reason: collision with root package name */
    static final com.google.v.ei f49497e = new ft(4);

    /* renamed from: d, reason: collision with root package name */
    static final com.google.v.ei f49496d = new ft(3);

    /* renamed from: c, reason: collision with root package name */
    static final com.google.v.ei f49495c = new ft(2);

    /* renamed from: b, reason: collision with root package name */
    static final com.google.v.ei f49494b = new ft(1);

    /* renamed from: a, reason: collision with root package name */
    static final com.google.v.ei f49493a = new ft(0);

    private ft(int i2) {
        this.f49500h = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        int i3 = this.f49500h;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? gt.a(i2) != null : go.a(i2) != null : gn.a(i2) != null : gk.a(i2) != null : gj.a(i2) != null : fs.a(i2) != null : fu.a(i2) != null;
    }
}

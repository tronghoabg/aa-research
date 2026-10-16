package Gd;

/* loaded from: classes5.dex */
public final class b extends Rd.d {

    /* renamed from: g, reason: collision with root package name */
    public static final D8.a f4712g = new D8.a("Before", 2);

    /* renamed from: h, reason: collision with root package name */
    public static final D8.a f4713h = new D8.a("State", 2);

    /* renamed from: i, reason: collision with root package name */
    public static final D8.a f4714i = new D8.a("After", 2);

    /* renamed from: j, reason: collision with root package name */
    public static final D8.a f4715j = new D8.a("Receive", 2);
    public static final D8.a k = new D8.a("Parse", 2);

    /* renamed from: l, reason: collision with root package name */
    public static final D8.a f4716l = new D8.a("Transform", 2);

    /* renamed from: m, reason: collision with root package name */
    public static final D8.a f4717m = new D8.a("State", 2);

    /* renamed from: n, reason: collision with root package name */
    public static final D8.a f4718n = new D8.a("After", 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4719e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4720f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i5) {
        super(f4712g, f4713h, f4714i);
        this.f4719e = i5;
        switch (i5) {
            case 1:
                super(f4715j, k, f4716l, f4717m, f4718n);
                this.f4720f = true;
                break;
            default:
                this.f4720f = true;
                break;
        }
    }

    @Override // Rd.d
    public final boolean d() {
        switch (this.f4719e) {
        }
        return this.f4720f;
    }
}

package Fd;

/* loaded from: classes5.dex */
public final class f extends Rd.d {

    /* renamed from: g, reason: collision with root package name */
    public static final D8.a f4059g = new D8.a("Before", 2);

    /* renamed from: h, reason: collision with root package name */
    public static final D8.a f4060h = new D8.a("State", 2);

    /* renamed from: i, reason: collision with root package name */
    public static final D8.a f4061i = new D8.a("Transform", 2);

    /* renamed from: j, reason: collision with root package name */
    public static final D8.a f4062j = new D8.a("Render", 2);
    public static final D8.a k = new D8.a("Send", 2);

    /* renamed from: l, reason: collision with root package name */
    public static final D8.a f4063l = new D8.a("Before", 2);

    /* renamed from: m, reason: collision with root package name */
    public static final D8.a f4064m = new D8.a("State", 2);

    /* renamed from: n, reason: collision with root package name */
    public static final D8.a f4065n = new D8.a("Monitoring", 2);

    /* renamed from: o, reason: collision with root package name */
    public static final D8.a f4066o = new D8.a("Engine", 2);

    /* renamed from: p, reason: collision with root package name */
    public static final D8.a f4067p = new D8.a("Receive", 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4068e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4069f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i5) {
        super(f4059g, f4060h, f4061i, f4062j, k);
        this.f4068e = i5;
        switch (i5) {
            case 1:
                super(f4063l, f4064m, f4065n, f4066o, f4067p);
                this.f4069f = true;
                break;
            default:
                this.f4069f = true;
                break;
        }
    }

    @Override // Rd.d
    public final boolean d() {
        switch (this.f4068e) {
        }
        return this.f4069f;
    }
}

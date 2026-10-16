package D3;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final b f2289c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f2290d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f2291e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f2292f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f2293g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f2294h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2295a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2296b;

    static {
        int i5 = 0;
        f2289c = new b("NONE", i5);
        f2290d = new b("FULL", i5);
        int i10 = 1;
        f2291e = new b("FLAT", i10);
        f2292f = new b("HALF_OPENED", i10);
        int i11 = 2;
        f2293g = new b("FOLD", i11);
        f2294h = new b("HINGE", i11);
    }

    public /* synthetic */ b(String str, int i5) {
        this.f2295a = i5;
        this.f2296b = str;
    }

    public String toString() {
        switch (this.f2295a) {
            case 0:
                return (String) this.f2296b;
            case 1:
                return (String) this.f2296b;
            case 2:
                return (String) this.f2296b;
            default:
                return super.toString();
        }
    }

    public b(E3.a aVar) {
        this.f2295a = 3;
        int i5 = o.f2321b;
        this.f2296b = aVar;
    }
}

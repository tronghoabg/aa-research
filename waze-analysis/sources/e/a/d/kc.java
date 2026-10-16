package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class kc {

    /* renamed from: a, reason: collision with root package name */
    private static final ka f47267a = new ka(jy.f47262a);

    /* renamed from: b, reason: collision with root package name */
    private final jy f47268b;

    /* renamed from: c, reason: collision with root package name */
    private long f47269c;

    /* renamed from: d, reason: collision with root package name */
    private long f47270d;

    /* renamed from: e, reason: collision with root package name */
    private long f47271e;

    /* renamed from: f, reason: collision with root package name */
    private long f47272f;

    /* renamed from: g, reason: collision with root package name */
    private long f47273g;

    /* renamed from: h, reason: collision with root package name */
    private final en f47274h;

    /* renamed from: i, reason: collision with root package name */
    private volatile long f47275i;

    public kc() {
        this.f47274h = jm.d();
        this.f47268b = jy.f47262a;
    }

    public static ka a() {
        return f47267a;
    }

    public final void b() {
        this.f47272f++;
    }

    public final void c() {
        this.f47269c++;
        this.f47268b.a();
    }

    public final void d() {
        this.f47274h.a();
        this.f47275i = this.f47268b.a();
    }

    public final void e(int i2) {
        if (i2 == 0) {
            return;
        }
        this.f47273g += i2;
        this.f47268b.a();
    }

    public final void f(boolean z) {
        if (z) {
            this.f47270d++;
        } else {
            this.f47271e++;
        }
    }

    /* synthetic */ kc(jy jyVar) {
        this.f47274h = jm.d();
        this.f47268b = jyVar;
    }
}

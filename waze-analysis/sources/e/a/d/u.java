package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    private final jy f47299a;

    /* renamed from: b, reason: collision with root package name */
    private final en f47300b = jm.d();

    /* renamed from: c, reason: collision with root package name */
    private final en f47301c = jm.d();

    /* renamed from: d, reason: collision with root package name */
    private final en f47302d = jm.d();

    /* renamed from: e, reason: collision with root package name */
    private volatile long f47303e;

    u(jy jyVar) {
        this.f47299a = jyVar;
    }

    public final void a(boolean z) {
        if (z) {
            this.f47301c.a();
        } else {
            this.f47302d.a();
        }
    }

    public final void b() {
        this.f47300b.a();
        this.f47303e = this.f47299a.a();
    }
}

package kotlinx.b.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f51195a = new b(new h(false, "    ", a.f51106c), kotlinx.b.e.i.a());

    /* renamed from: b, reason: collision with root package name */
    private final h f51196b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.b.e.e f51197c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.bl.b.c.a f51198d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(h hVar, kotlinx.b.e.e eVar, byte[] bArr) {
        this(hVar, eVar);
        h.g.b.x.f(hVar, "configuration");
        h.g.b.x.f(eVar, "module");
        if (h.g.b.x.n(this.f51197c, kotlinx.b.e.i.a())) {
            return;
        }
        this.f51197c.d(new kotlinx.b.d.a.u(this.f51196b));
    }

    public final h a() {
        return this.f51196b;
    }

    public final kotlinx.b.e.e b() {
        return this.f51197c;
    }

    public final com.waze.bl.b.c.a c() {
        return this.f51198d;
    }

    public /* synthetic */ b(h hVar, kotlinx.b.e.e eVar) {
        this.f51196b = hVar;
        this.f51197c = eVar;
        this.f51198d = new com.waze.bl.b.c.a((char[]) null);
    }

    public /* synthetic */ b() {
        this(new h(false, "    ", a.f51106c), kotlinx.b.e.i.a());
    }
}

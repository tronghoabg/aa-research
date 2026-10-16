package e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class m extends i {

    /* renamed from: a, reason: collision with root package name */
    private final i f47833a;

    /* renamed from: b, reason: collision with root package name */
    private final l f47834b;

    /* synthetic */ m(i iVar, l lVar) {
        this.f47833a = iVar;
        com.google.d.b.an.C(lVar, "interceptor");
        this.f47834b = lVar;
    }

    @Override // e.a.i
    public final k a(cq cqVar, h hVar) {
        return this.f47834b.b(cqVar, hVar, this.f47833a);
    }

    @Override // e.a.i
    public final String b() {
        return this.f47833a.b();
    }
}

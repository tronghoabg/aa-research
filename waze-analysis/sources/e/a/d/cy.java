package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
class cy extends e.a.bx {

    /* renamed from: a, reason: collision with root package name */
    private final e.a.bx f46774a;

    cy(e.a.bx bxVar) {
        this.f46774a = bxVar;
    }

    @Override // e.a.i
    public final e.a.k a(e.a.cq cqVar, e.a.h hVar) {
        return this.f46774a.a(cqVar, hVar);
    }

    @Override // e.a.i
    public final String b() {
        return this.f46774a.b();
    }

    @Override // e.a.bx
    public final void d() {
        this.f46774a.d();
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("delegate", this.f46774a);
        return zVarH.toString();
    }
}

package kotlinx.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s implements cb {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.l f51094a;

    /* renamed from: b, reason: collision with root package name */
    private final v f51095b;

    public s(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "compute");
        this.f51094a = lVar;
        this.f51095b = new v();
    }

    public final h.g.a.l a() {
        return this.f51094a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.b.b] */
    @Override // kotlinx.b.c.cb
    public final kotlinx.b.b b(h.l.c cVar) {
        h.g.b.x.f(cVar, "key");
        Object obj = this.f51095b.get(h.g.b.o.w(cVar));
        h.g.b.x.e(obj, "get(...)");
        bg bgVar = (bg) obj;
        Object objA = bgVar.f50991a.get();
        if (objA == null) {
            objA = bgVar.a(new r(this, cVar));
        }
        return ((l) objA).f51085a;
    }
}

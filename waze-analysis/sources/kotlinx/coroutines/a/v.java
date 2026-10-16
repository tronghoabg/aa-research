package kotlinx.coroutines.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class v extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f51326a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f51327b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f51328c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f51329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(ag agVar, Object obj, h.c.e eVar) {
        super(2, eVar);
        this.f51327b = agVar;
        this.f51328c = obj;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        v vVar = new v(this.f51327b, this.f51328c, eVar);
        vVar.f51329d = obj;
        return vVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((v) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        h.c.a.a aVar = h.c.a.a.f48038a;
        try {
            if (this.f51326a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ag agVar = this.f51327b;
                Object obj2 = this.f51328c;
                this.f51326a = 1;
                if (agVar.g(obj2, this) == aVar) {
                    return aVar;
                }
            }
            objA = h.ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        return t.f(h.m.e(objA) ? h.ab.f48028a : new r(h.m.c(objA)));
    }
}

package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class t extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51719a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f51720b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.a.af f51721c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(h.g.b.aq aqVar, kotlinx.coroutines.a.af afVar, h.c.e eVar) {
        super(2, eVar);
        this.f51720b = aqVar;
        this.f51721c = afVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        t tVar = new t(this.f51720b, this.f51721c, eVar);
        tVar.f51719a = ((kotlinx.coroutines.a.t) obj).b();
        return tVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((t) create(kotlinx.coroutines.a.t.f(((kotlinx.coroutines.a.t) obj).b()), (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Object obj2 = this.f51719a;
        boolean z = obj2 instanceof kotlinx.coroutines.a.s;
        h.g.b.aq aqVar = this.f51720b;
        if (!z) {
            aqVar.f48105a = obj2;
        }
        kotlinx.coroutines.a.af afVar = this.f51721c;
        if (z) {
            Throwable thD = kotlinx.coroutines.a.t.d(obj2);
            if (thD != null) {
                throw thD;
            }
            afVar.s(new kotlinx.coroutines.b.a.p());
            aqVar.f48105a = kotlinx.coroutines.b.a.ab.f51385c;
        }
        return h.ab.f48028a;
    }
}

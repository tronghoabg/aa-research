package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f51701a;

    /* renamed from: b, reason: collision with root package name */
    int f51702b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f51703c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f51704d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f51705e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(h.g.b.aq aqVar, l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f51704d = aqVar;
        this.f51705e = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        p pVar = new p(this.f51704d, this.f51705e, eVar);
        pVar.f51703c = ((kotlinx.coroutines.a.t) obj).b();
        return pVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((p) create(kotlinx.coroutines.a.t.f(((kotlinx.coroutines.a.t) obj).b()), (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        h.g.b.aq aqVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f51702b == 0) {
            e.b.c.b(obj);
            Object obj2 = this.f51703c;
            h.g.b.aq aqVar2 = this.f51704d;
            boolean z = obj2 instanceof kotlinx.coroutines.a.s;
            if (!z) {
                aqVar2.f48105a = obj2;
            }
            l lVar = this.f51705e;
            if (z) {
                Throwable thD = kotlinx.coroutines.a.t.d(obj2);
                if (thD != null) {
                    throw thD;
                }
                Object obj3 = aqVar2.f48105a;
                if (obj3 != null) {
                    if (obj3 == kotlinx.coroutines.b.a.ab.f51383a) {
                        obj3 = null;
                    }
                    this.f51703c = obj2;
                    this.f51701a = aqVar2;
                    this.f51702b = 1;
                    if (lVar.emit(obj3, this) == aVar) {
                        return aVar;
                    }
                }
                aqVar = aqVar2;
            }
            return h.ab.f48028a;
        }
        aqVar = (h.g.b.aq) this.f51701a;
        e.b.c.b(obj);
        aqVar.f48105a = kotlinx.coroutines.b.a.ab.f51385c;
        return h.ab.f48028a;
    }
}

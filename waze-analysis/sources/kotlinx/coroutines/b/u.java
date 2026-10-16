package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f51722a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f51723b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f51724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(h.g.b.aq aqVar, l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f51723b = aqVar;
        this.f51724c = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new u(this.f51723b, this.f51724c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((u) create((h.ab) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f51722a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            h.g.b.aq aqVar = this.f51723b;
            Object obj2 = aqVar.f48105a;
            if (obj2 != null) {
                aqVar.f48105a = null;
                l lVar = this.f51724c;
                if (obj2 == kotlinx.coroutines.b.a.ab.f51383a) {
                    obj2 = null;
                }
                this.f51722a = 1;
                if (lVar.emit(obj2, this) == aVar) {
                    return aVar;
                }
            }
        }
        return h.ab.f48028a;
    }
}

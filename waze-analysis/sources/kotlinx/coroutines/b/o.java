package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    int f51698a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f51699b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f51700c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(l lVar, h.g.b.aq aqVar, h.c.e eVar) {
        super(1, eVar);
        this.f51699b = lVar;
        this.f51700c = aqVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(h.c.e<?> eVar) {
        return new o(this.f51699b, this.f51700c, eVar);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((o) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f51698a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            l lVar = this.f51699b;
            h.g.b.aq aqVar = this.f51700c;
            kotlinx.coroutines.e.ak akVar = kotlinx.coroutines.b.a.ab.f51383a;
            Object obj2 = aqVar.f48105a;
            if (obj2 == akVar) {
                obj2 = null;
            }
            this.f51698a = 1;
            if (lVar.emit(obj2, this) == aVar) {
                return aVar;
            }
        }
        this.f51700c.f48105a = null;
        return h.ab.f48028a;
    }
}

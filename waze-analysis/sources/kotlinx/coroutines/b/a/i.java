package kotlinx.coroutines.b.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f51412a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f51413b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f51414c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f51415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(m mVar, kotlinx.coroutines.b.l lVar, Object obj, h.c.e eVar) {
        super(2, eVar);
        this.f51413b = mVar;
        this.f51414c = lVar;
        this.f51415d = obj;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new i(this.f51413b, this.f51414c, this.f51415d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f51412a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            m mVar = this.f51413b;
            kotlinx.coroutines.b.l lVar = this.f51414c;
            Object obj2 = this.f51415d;
            h.g.a.q qVar = mVar.f51430e;
            this.f51412a = 1;
            if (qVar.invoke(lVar, obj2, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

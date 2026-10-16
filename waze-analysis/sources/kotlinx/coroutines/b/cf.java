package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cf extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f51648a;

    cf(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        cf cfVar = new cf(eVar);
        cfVar.f51648a = obj;
        return cfVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cf) create((bw) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(((bw) this.f51648a) != bw.f51619a);
    }
}

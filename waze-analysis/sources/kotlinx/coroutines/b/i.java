package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i<T> implements k<T> {

    /* renamed from: a, reason: collision with root package name */
    public final h.g.a.l f51686a;

    /* renamed from: b, reason: collision with root package name */
    public final h.g.a.p f51687b;

    /* renamed from: c, reason: collision with root package name */
    private final k f51688c;

    public i(k kVar, h.g.a.l lVar, h.g.a.p pVar) {
        this.f51688c = kVar;
        this.f51686a = lVar;
        this.f51687b = pVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(l<? super T> lVar, h.c.e<? super h.ab> eVar) {
        h.g.b.aq aqVar = new h.g.b.aq();
        aqVar.f48105a = kotlinx.coroutines.b.a.ab.f51383a;
        Object objCollect = this.f51688c.collect(new h(this, aqVar, lVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}

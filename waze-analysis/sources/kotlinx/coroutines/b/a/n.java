package kotlinx.coroutines.b.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f51431a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f51432b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ af f51433c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(kotlinx.coroutines.b.k kVar, af afVar, h.c.e eVar) {
        super(2, eVar);
        this.f51432b = kVar;
        this.f51433c = afVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new n(this.f51432b, this.f51433c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((n) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f51431a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f51431a = 1;
            if (this.f51432b.collect(this.f51433c, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bc extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f51556a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f51557b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f51558c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bm f51559d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f51560e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(k kVar, bm bmVar, Object obj, h.c.e eVar) {
        super(2, eVar);
        this.f51558c = kVar;
        this.f51559d = bmVar;
        this.f51560e = obj;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        bc bcVar = new bc(this.f51558c, this.f51559d, this.f51560e, eVar);
        bcVar.f51557b = obj;
        return bcVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bc) create((bw) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f51556a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            bw bwVar = (bw) this.f51557b;
            bw bwVar2 = bw.f51619a;
            int iOrdinal = bwVar.ordinal();
            if (iOrdinal == 0) {
                this.f51556a = 1;
                if (this.f51558c.collect(this.f51559d, this) == aVar) {
                    return aVar;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new h.i();
                }
                Object obj2 = this.f51560e;
                kotlinx.coroutines.e.ak akVar = bu.f51616a;
                bm bmVar = this.f51559d;
                if (obj2 == akVar) {
                    bmVar.b();
                } else {
                    bmVar.c(obj2);
                }
            }
        }
        return h.ab.f48028a;
    }
}

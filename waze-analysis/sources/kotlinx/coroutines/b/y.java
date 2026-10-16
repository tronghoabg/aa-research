package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    Object f51734a;

    /* renamed from: b, reason: collision with root package name */
    Object f51735b;

    /* renamed from: c, reason: collision with root package name */
    int f51736c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f51737d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f51738e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ k f51739f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f51740g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(long j2, k kVar, h.c.e eVar) {
        super(3, eVar);
        this.f51738e = j2;
        this.f51739f = kVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        y yVar = new y(this.f51738e, this.f51739f, (h.c.e) obj3);
        yVar.f51740g = (kotlinx.coroutines.af) obj;
        yVar.f51737d = (l) obj2;
        return yVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        h.g.b.aq aqVar;
        kotlinx.coroutines.a.af afVar;
        kotlinx.coroutines.a.af afVarD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f51736c != 0) {
            afVarD = (kotlinx.coroutines.a.af) this.f51735b;
            aqVar = (h.g.b.aq) this.f51734a;
            afVar = (kotlinx.coroutines.a.af) this.f51737d;
            lVar = (l) this.f51740g;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar2 = (kotlinx.coroutines.af) this.f51740g;
            lVar = (l) this.f51737d;
            kotlinx.coroutines.a.af afVarD2 = kotlinx.coroutines.a.ab.d(afVar2, -1, new x(this.f51739f, null, 0), 1);
            aqVar = new h.g.b.aq();
            afVar = afVarD2;
            afVarD = kotlinx.coroutines.a.ab.d(afVar2, 0, new s(this.f51738e, null), 1);
        }
        while (aqVar.f48105a != kotlinx.coroutines.b.a.ab.f51385c) {
            kotlinx.coroutines.g.k kVar = new kotlinx.coroutines.g.k(getContext());
            kVar.k(afVar.B(), new t(aqVar, afVarD, null));
            kVar.k(afVarD.A(), new u(aqVar, lVar, null));
            this.f51740g = lVar;
            this.f51737d = afVar;
            this.f51734a = aqVar;
            this.f51735b = afVarD;
            this.f51736c = 1;
            if (kVar.d(this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

package kotlinx.b.d.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class z extends h.c.b.a.f implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f51192a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f51193b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f51194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(ab abVar, h.c.e eVar) {
        super(3, eVar);
        this.f51193b = abVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        z zVar = new z(this.f51193b, (h.c.e) obj3);
        zVar.f51194c = (h.b) obj;
        return zVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f51192a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            h.b bVar = (h.b) this.f51194c;
            ab abVar = this.f51193b;
            byte b2 = abVar.f51120a.b();
            if (b2 == 1) {
                return abVar.g(true);
            }
            if (b2 == 0) {
                return abVar.g(false);
            }
            if (b2 != 6) {
                if (b2 == 8) {
                    return abVar.f();
                }
                a.s(abVar.f51120a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw new h.e();
            }
            this.f51192a = 1;
            obj = ab.a(abVar, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return (kotlinx.b.d.k) obj;
    }
}

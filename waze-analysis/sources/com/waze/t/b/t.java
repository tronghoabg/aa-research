package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class t extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40809a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f40810b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f40811c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ag f40812d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f40813e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.z.a.b.n f40814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(h.g.a.l lVar, Object obj, ag agVar, com.waze.z.a.b.n nVar, int i2, h.c.e eVar) {
        super(2, eVar);
        this.f40810b = lVar;
        this.f40811c = obj;
        this.f40812d = agVar;
        this.f40814f = nVar;
        this.f40813e = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new t(this.f40810b, this.f40811c, this.f40812d, this.f40814f, this.f40813e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((t) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f40809a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.b.k kVar = (kotlinx.coroutines.b.k) this.f40810b.invoke(this.f40811c);
            ag agVar = this.f40812d;
            kotlinx.coroutines.b.k kVarL = kotlinx.coroutines.b.ai.L(kVar, new p(agVar, this.f40814f, null));
            int i2 = this.f40813e;
            this.f40809a = 1;
            if (kotlinx.coroutines.b.ai.o(kotlinx.coroutines.b.ai.J(kVarL, new q(agVar, i2, null)), new r(agVar, null)).collect(new s(agVar, i2), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

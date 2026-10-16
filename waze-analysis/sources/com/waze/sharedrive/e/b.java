package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f38386a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f38387b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f38388c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedrive.d.aq f38389d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f38390e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h.c.e eVar, com.waze.sharedrive.d.aq aqVar, e eVar2) {
        super(3, eVar);
        this.f38389d = aqVar;
        this.f38388c = eVar2;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        b bVar = new b((h.c.e) obj3, this.f38389d, this.f38388c);
        bVar.f38390e = (kotlinx.coroutines.b.l) obj;
        bVar.f38387b = obj2;
        return bVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f38386a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.b.l lVar = (kotlinx.coroutines.b.l) this.f38390e;
            b bVar = this;
            kotlinx.coroutines.b.k kVarE = ((Boolean) this.f38387b).booleanValue() ? kotlinx.coroutines.b.ai.E(new d(this.f38389d, this.f38388c, null)) : kotlinx.coroutines.b.ai.G(null);
            this.f38386a = 1;
            if (kotlinx.coroutines.b.ai.g(lVar, kVarE, bVar) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

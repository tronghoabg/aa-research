package com.waze.settings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bc extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f36857a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bf f36858b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(bf bfVar, h.c.e eVar) {
        super(2, eVar);
        this.f36858b = bfVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        bc bcVar = new bc(this.f36858b, eVar);
        bcVar.f36857a = ((Boolean) obj).booleanValue();
        return bcVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((bc) create(bool, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        boolean z;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z2 = this.f36857a;
        kotlinx.coroutines.b.bn bnVar = this.f36858b.f36866c;
        do {
            objD = bnVar.d();
            z = false;
            if (((be) objD).a() && z2) {
                z = true;
            }
        } while (!bnVar.f(objD, new be(z2, z)));
        return h.ab.f48028a;
    }
}

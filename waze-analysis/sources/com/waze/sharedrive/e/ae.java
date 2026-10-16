package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ae extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38307a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f38308b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f38309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(ah ahVar, h.c.e eVar) {
        super(2, eVar);
        this.f38309c = ahVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ae aeVar = new ae(this.f38309c, eVar);
        aeVar.f38308b = obj;
        return aeVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ae) create((com.waze.sharedrive.c.a.m) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f38307a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.sharedrive.c.a.m mVar = (com.waze.sharedrive.c.a.m) this.f38308b;
            ah ahVar = this.f38309c;
            if (mVar != null) {
                this.f38307a = 1;
                if (ah.e(ahVar, mVar, this) == aVar) {
                    return aVar;
                }
            } else {
                ah.f(ahVar);
            }
        }
        return h.ab.f48028a;
    }
}

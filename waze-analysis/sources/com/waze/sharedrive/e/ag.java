package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ag extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38313a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ah f38314b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(ah ahVar, h.c.e eVar) {
        super(2, eVar);
        this.f38314b = ahVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ag(this.f38314b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ag) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f38313a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ah ahVar = this.f38314b;
            this.f38313a = 1;
            if (kotlinx.coroutines.b.ai.e(new m(ahVar.f38325k.n(), 2), new ae(ahVar, null), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

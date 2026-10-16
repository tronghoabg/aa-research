package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bt extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38459a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bv f38460b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bt(bv bvVar, h.c.e eVar) {
        super(2, eVar);
        this.f38460b = bvVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bt(this.f38460b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bt) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f38459a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            bv bvVar = this.f38460b;
            this.f38459a = 1;
            if (kotlinx.coroutines.b.ai.y(new m(bvVar.f38465d.n(), 6)).collect(new br(bvVar), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

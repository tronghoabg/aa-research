package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.z.a.b.ab f18155a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f18156b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f18157c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(com.waze.z.a.b.ab abVar, h.g.a.l lVar, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f18155a = abVar;
        this.f18156b = lVar;
        this.f18157c = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new q(this.f18155a, this.f18156b, this.f18157c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.z.a.b.ab abVar = this.f18155a;
        if (abVar.g() == abVar.i()) {
            this.f18156b.invoke(new bb(abVar.g(), this.f18157c));
        }
        return h.ab.f48028a;
    }
}

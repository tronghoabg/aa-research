package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f42113a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bc f42114b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(h.g.a.l lVar, bc bcVar, h.c.e eVar) {
        super(2, eVar);
        this.f42113a = lVar;
        this.f42114b = bcVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new y(this.f42113a, this.f42114b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f42113a.invoke(this.f42114b.i());
        return h.ab.f48028a;
    }
}

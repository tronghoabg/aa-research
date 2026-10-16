package com.waze.trip_overview.c.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f41262a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(ab abVar, h.c.e eVar) {
        super(2, eVar);
        this.f41262a = abVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new u(this.f41262a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((u) create((com.waze.map.canvas.a.b) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f41262a.L().e();
        return h.ab.f48028a;
    }
}

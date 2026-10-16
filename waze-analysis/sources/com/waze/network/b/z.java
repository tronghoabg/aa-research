package com.waze.network.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32113a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f32114b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(y yVar, h.c.e eVar) {
        super(2, eVar);
        this.f32114b = yVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        z zVar = new z(this.f32114b, eVar);
        zVar.f32113a = obj;
        return zVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((z) create((ay) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f32114b.b((ay) this.f32113a);
        return h.ab.f48028a;
    }
}

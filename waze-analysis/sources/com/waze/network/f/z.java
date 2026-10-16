package com.waze.network.f;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f32368a;

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f32369b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(ab abVar, h.c.e eVar) {
        super(2, eVar);
        this.f32368a = abVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        z zVar = new z(this.f32368a, eVar);
        zVar.f32369b = obj;
        return zVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return kotlinx.coroutines.aj.z((kotlinx.coroutines.af) this.f32369b, null, null, new y(this.f32368a, null), 3);
    }
}

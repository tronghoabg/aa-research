package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ap extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f28540a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainCanvasDelegatorImpl f28541b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f28542c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ap(kotlinx.coroutines.b.k kVar, MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar) {
        super(2, eVar);
        this.f28540a = kVar;
        this.f28541b = mainCanvasDelegatorImpl;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ap apVar = new ap(this.f28540a, this.f28541b, eVar);
        apVar.f28542c = obj;
        return apVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ap) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f28542c;
        kotlinx.coroutines.b.k kVar = this.f28540a;
        MainCanvasDelegatorImpl mainCanvasDelegatorImpl = this.f28541b;
        kotlinx.coroutines.aj.z(afVar, null, null, new ao(kVar, mainCanvasDelegatorImpl, (h.c.e) null, 1, (byte[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ao(kVar, mainCanvasDelegatorImpl, (h.c.e) null, 0), 3);
        return h.ab.f48028a;
    }
}

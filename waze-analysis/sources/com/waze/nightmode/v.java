package com.waze.nightmode;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class v extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32505a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f32506b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(ae aeVar, h.c.e eVar) {
        super(2, eVar);
        this.f32506b = aeVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        v vVar = new v(this.f32506b, eVar);
        vVar.f32505a = obj;
        return vVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((v) create((x) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        x xVar = (x) this.f32505a;
        this.f32506b.f32452a.g("night mode has been updated, nightMode=" + ae.f(xVar) + ", state=" + xVar);
        return h.ab.f48028a;
    }
}

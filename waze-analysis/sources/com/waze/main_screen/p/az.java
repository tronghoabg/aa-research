package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class az extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.ui.l.bp f27078a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f27079b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bf f27080c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f27081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    az(com.waze.ui.l.bp bpVar, float f2, bf bfVar, h.c.e eVar) {
        super(2, eVar);
        this.f27078a = bpVar;
        this.f27079b = f2;
        this.f27080c = bfVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        az azVar = new az(this.f27078a, this.f27079b, this.f27080c, eVar);
        azVar.f27081d = obj;
        return azVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((az) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f27081d;
        com.waze.ui.l.bp bpVar = this.f27078a;
        float fB = bpVar.f() ? bpVar.b() : 0.0f;
        float f2 = true == bpVar.f() ? 16.0f : 0.0f;
        float f3 = this.f27079b;
        bf bfVar = this.f27080c;
        float f4 = f2 + f3 + fB;
        kotlinx.coroutines.aj.z(afVar, null, null, new aw(bfVar, f4, (h.c.e) null, 2, (char[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ay(bpVar, f4, bfVar, (h.c.e) null, 0), 3);
        if (bpVar.f()) {
            kotlinx.coroutines.aj.z(afVar, null, null, new ar(bfVar, (h.c.e) null, 4, (int[]) null), 3);
        }
        return h.ab.f48028a;
    }
}

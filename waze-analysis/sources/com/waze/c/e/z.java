package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class z implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bi f18717a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.ui.b.bc f18718b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f18719c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f18720d;

    z(bi biVar, com.waze.ui.b.bc bcVar, int i2, h.g.a.a aVar) {
        this.f18717a = biVar;
        this.f18718b = bcVar;
        this.f18719c = i2;
        this.f18720d = aVar;
    }

    @Override // h.g.a.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        bi biVar = this.f18717a;
        biVar.b().c().c().invoke(Integer.valueOf(biVar.b().c().b().indexOf(this.f18718b)), Integer.valueOf(this.f18719c));
        this.f18720d.invoke();
        return h.ab.f48028a;
    }
}

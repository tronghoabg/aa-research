package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aq extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31563a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ at f31564b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aq(at atVar, h.c.e eVar) {
        super(2, eVar);
        this.f31564b = atVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        aq aqVar = new aq(this.f31564b, eVar);
        aqVar.f31563a = obj;
        return aqVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aq) create((com.waze.reports_v2.c.a) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f31564b.f31573a.d((com.waze.reports_v2.c.a) this.f31563a);
        return h.ab.f48028a;
    }
}

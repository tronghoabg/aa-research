package com.waze.uid.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44182a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f44183b;

    y(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        y yVar = new y((h.c.e) obj3);
        yVar.f44182a = (com.waze.sharedui.h.k) obj;
        yVar.f44183b = (com.waze.uid.p) obj2;
        return yVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.sharedui.h.k kVar = (com.waze.sharedui.h.k) this.f44182a;
        com.waze.uid.p pVar = (com.waze.uid.p) this.f44183b;
        boolean z = false;
        if (kVar.b() && !pVar.b() && pVar.a() != com.waze.uid.n.f44541d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

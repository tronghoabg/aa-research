package com.waze.car_lib.b;

import com.waze.mo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class y extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19148a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ap f19149b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f19150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ap apVar, h.c.e eVar) {
        super(2, eVar);
        this.f19149b = apVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        y yVar = new y(this.f19149b, eVar);
        yVar.f19150c = obj;
        return yVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((y) create((kotlinx.coroutines.a.ad) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f19148a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.a.ad adVar = (kotlinx.coroutines.a.ad) this.f19150c;
            ap apVar = this.f19149b;
            this.f19148a = 1;
            if (kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.A(new ai(apVar.f18982b.a(), 1), new mo(19)), new w(apVar, adVar, null), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

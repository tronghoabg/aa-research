package com.waze.car_lib.o;

import com.waze.navigate.ej;
import com.waze.navigate.em;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20478a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f20479b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(q qVar, h.c.e eVar) {
        super(2, eVar);
        this.f20479b = qVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        o oVar = new o(this.f20479b, eVar);
        oVar.f20478a = obj;
        return oVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((o) create((em) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = ((em) this.f20478a) instanceof ej;
        List listF = z ? this.f20479b.f() : h.a.i.h();
        q qVar = this.f20479b;
        qVar.f20485d = new p(z, listF);
        qVar.f20483b.a("state updated: " + qVar.f20485d + ", (" + qVar + ")");
        return h.ab.f48028a;
    }
}

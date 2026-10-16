package com.waze.view.popups.a;

import com.waze.map.b.dw;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f45236a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f45237b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(aa aaVar, h.c.e eVar) {
        super(2, eVar);
        this.f45237b = aaVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        x xVar = new x(this.f45237b, eVar);
        xVar.f45236a = obj;
        return xVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((x) create((dw) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        n nVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        dw dwVar = (dw) this.f45236a;
        bn bnVar = this.f45237b.f45150k;
        do {
            objD = bnVar.d();
            nVar = (n) objD;
        } while (!bnVar.f(objD, nVar != null ? n.d(nVar, null, dwVar, 3) : null));
        return h.ab.f48028a;
    }
}

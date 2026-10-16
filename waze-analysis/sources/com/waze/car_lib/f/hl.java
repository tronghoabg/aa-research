package com.waze.car_lib.f;

import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class hl extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f19665a;

    /* renamed from: b, reason: collision with root package name */
    Object f19666b;

    /* renamed from: c, reason: collision with root package name */
    Object f19667c;

    /* renamed from: d, reason: collision with root package name */
    int f19668d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.av.b.aa f19669e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ hm f19670f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hl(com.waze.av.b.aa aaVar, hm hmVar, h.c.e eVar) {
        super(2, eVar);
        this.f19669e = aaVar;
        this.f19670f = hmVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new hl(this.f19669e, this.f19670f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((hl) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        com.waze.av.b.aa aaVar;
        hm hmVar;
        Iterator it;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f19668d != 0) {
            it = (Iterator) this.f19667c;
            aaVar = (com.waze.av.b.aa) this.f19666b;
            hmVar = (hm) this.f19665a;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            aaVar = this.f19669e;
            List listD = aaVar.d();
            hmVar = this.f19670f;
            it = listD.iterator();
        }
        while (it.hasNext()) {
            com.waze.av.b.y yVar = (com.waze.av.b.y) it.next();
            com.waze.av.b.ah ahVarA = hmVar.a();
            com.waze.av.a.p pVarA = aaVar.a();
            this.f19665a = hmVar;
            this.f19666b = aaVar;
            this.f19667c = it;
            this.f19668d = 1;
            if (ahVarA.c(pVarA, yVar, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

package com.waze.location;

import android.location.Location;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class d extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f25387a;

    /* renamed from: b, reason: collision with root package name */
    int f25388b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f25389c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ g f25390d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(g gVar, h.c.e eVar) {
        super(2, eVar);
        this.f25390d = gVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        d dVar = new d(this.f25390d, eVar);
        dVar.f25389c = obj;
        return dVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((List) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        g gVar;
        Iterator it;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f25388b != 0) {
            it = (Iterator) this.f25387a;
            gVar = (g) this.f25389c;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            List list = (List) this.f25389c;
            gVar = this.f25390d;
            it = list.iterator();
        }
        while (it.hasNext()) {
            gVar.f25398c.d((Location) it.next(), g.f25396a);
            this.f25389c = gVar;
            this.f25387a = it;
            this.f25388b = 1;
            if (kotlinx.coroutines.aj.q(500L, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}

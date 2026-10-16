package com.waze.car_lib.r.c.c;

import com.waze.car_lib.p.as;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f21158a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f21159b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(i iVar, h.c.e eVar) {
        super(2, eVar);
        this.f21159b = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f21159b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f21158a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            h.o.c cVar = h.o.a.f48264a;
            this.f21158a = 1;
            if (aj.r(h.o.c.i(10, h.o.d.f48273d), this) == aVar) {
                return aVar;
            }
        }
        i iVar = this.f21159b;
        iVar.f21179l = null;
        iVar.j(as.f20588a);
        return ab.f48028a;
    }
}

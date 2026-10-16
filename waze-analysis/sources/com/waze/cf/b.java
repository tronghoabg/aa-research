package com.waze.cf;

import h.ab;
import h.g.a.p;
import java.util.Iterator;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f22178a;

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f22179b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(h hVar, h.c.e eVar) {
        super(2, eVar);
        this.f22178a = hVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        b bVar = new b(this.f22178a, eVar);
        bVar.f22179b = obj;
        return bVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        af afVar = (af) this.f22179b;
        Iterator it = this.f22178a.f22242e.iterator();
        while (it.hasNext()) {
            aj.z(afVar, null, null, new g((h.l.f) it.next(), (h.c.e) null, 1), 3);
        }
        return ab.f48028a;
    }
}

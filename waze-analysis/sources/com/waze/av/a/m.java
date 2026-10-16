package com.waze.av.a;

import h.g.b.x;
import java.util.Iterator;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m implements b {

    /* renamed from: a, reason: collision with root package name */
    private final ch f15818a;

    public m(com.waze.w.p pVar, com.waze.w.p pVar2, com.waze.w.p pVar3, af afVar, h.g.a.a aVar) {
        x.f(pVar, "recentsDataSource");
        x.f(pVar2, "favoritesDataSource");
        x.f(pVar3, "eventsDataSource");
        x.f(afVar, "coroutineScope");
        x.f(aVar, "registerPlacesUpdateNotification");
        aVar.invoke();
        aj.z(afVar, null, null, new c(pVar, (h.c.e) null, 1, (byte[]) null), 3);
        aj.z(afVar, null, null, new c(pVar2, null, 0), 3);
        aj.z(afVar, null, null, new c(pVar3, (h.c.e) null, 2, (char[]) null), 3);
        kotlinx.coroutines.b.k kVarR = ai.r(pVar.e(), pVar2.e(), pVar3.e(), new d(this, null));
        int i2 = bz.f51630a;
        this.f15818a = ai.V(kVarR, afVar, by.b(), h.a.i.h());
    }

    @Override // com.waze.av.a.b
    public final com.waze.av.b.n a(h.g.a.l lVar) {
        Object next;
        x.f(lVar, "predicate");
        Iterator it = ((Iterable) this.f15818a.d()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Boolean) lVar.invoke((com.waze.av.b.n) next)).booleanValue()) {
                break;
            }
        }
        return (com.waze.av.b.n) next;
    }

    @Override // com.waze.av.a.b
    public final kotlinx.coroutines.b.k b(n nVar) {
        x.f(nVar, "genericPlaceType");
        n nVar2 = n.f15819a;
        switch (nVar.ordinal()) {
            case 0:
                return this.f15818a;
            case 1:
                return new h(this.f15818a, 2);
            case 2:
                return new h(this.f15818a, 0);
            case 3:
                return new h(this.f15818a, 1);
            case 4:
                return new h(this.f15818a, 3);
            case 5:
                return new h(this.f15818a, 4);
            case 6:
                return new h(this.f15818a, 5);
            default:
                throw new h.i();
        }
    }
}

package com.waze.shared_infra.coordinators;

import h.ab;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f37812a;

    j(o oVar) {
        this.f37812a = oVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object next;
        o oVar = this.f37812a;
        String str = (String) obj;
        Iterator it = oVar.f37830f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x.n(((com.waze.sharedui.profile.b) next).n(), str)) {
                break;
            }
        }
        com.waze.sharedui.profile.b bVar = (com.waze.sharedui.profile.b) next;
        if (bVar != null) {
            oVar.f37830f.remove(bVar);
            bVar.p();
            o.C(oVar, h.f37807b);
        }
        return ab.f48028a;
    }
}

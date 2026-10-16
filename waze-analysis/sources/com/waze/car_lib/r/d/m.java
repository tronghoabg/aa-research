package com.waze.car_lib.r.d;

import com.waze.asks.ak;
import com.waze.car_lib.f.jb;
import com.waze.car_lib.r.fj;
import com.waze.modules.c.ar;
import com.waze.modules.c.dk;
import h.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class m extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21307a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f21308b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ x f21309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(x xVar, h.c.e eVar) {
        super(3, eVar);
        this.f21309c = xVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        m mVar = new m(this.f21309c, (h.c.e) obj3);
        mVar.f21307a = (com.waze.c.b.j) obj;
        mVar.f21308b = zBooleanValue;
        return mVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.c.b.j jVar = (com.waze.c.b.j) this.f21307a;
        boolean z = jVar instanceof com.waze.c.b.h;
        boolean z2 = this.f21308b;
        if (z) {
            x xVar = this.f21309c;
            xVar.f21348l.b();
            com.waze.c.b.h hVar = (com.waze.c.b.h) jVar;
            List listF = ((dk) hVar.c()).f();
            bn bnVar = xVar.v;
            String strS = com.waze.ac.e.s(hVar.b().a(), xVar.f21340d);
            if (strS == null) {
                strS = "";
            }
            com.waze.ui.ac.m mVar = new com.waze.ui.ac.m(strS);
            List<ar> list = listF;
            ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(x.f(xVar, (ar) it.next()));
            }
            ArrayList arrayList2 = arrayList;
            int i2 = fj.f21640a;
            int iB = fj.b(listF, hVar.a());
            h.g.b.x.f(listF, "<this>");
            boolean z3 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (ar arVar : list) {
                    if (arVar.h() != null || arVar.i().longValue() > 0) {
                        z3 = true;
                        break;
                    }
                }
            }
            bnVar.e(new com.waze.car_lib.screens.b.q(z2, mVar, arrayList2, iB, z3, new ak(listF, xVar, 3, null), xVar.q, (int) h.o.a.p(xVar.f21341e.b())));
        } else if (jVar instanceof com.waze.c.b.i) {
            this.f21309c.v.e(new com.waze.car_lib.screens.b.r(z2));
        } else {
            if (!(jVar instanceof com.waze.c.b.f) && !h.g.b.x.n(jVar, com.waze.c.b.g.f18243a)) {
                throw new h.i();
            }
            x xVar2 = this.f21309c;
            xVar2.R(jb.f19739c, null, null);
            xVar2.n.b("invalid state for the TripOverview");
        }
        return ab.f48028a;
    }
}

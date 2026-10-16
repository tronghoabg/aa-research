package com.waze.network.b;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class af implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.b.am f31929a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f31930b;

    af(h.g.b.am amVar, ag agVar) {
        this.f31929a = amVar;
        this.f31930b = agVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        if (!((Boolean) obj).booleanValue()) {
            h.g.b.am amVar = this.f31929a;
            if (!amVar.f48101a) {
                ag agVar = this.f31930b;
                com.waze.an.d.b bVar = agVar.f31932b;
                com.waze.an.a.u uVar = new com.waze.an.a.u(ah.f31938b, com.waze.an.a.ae.f14550f);
                String strC = agVar.f31933c.c(R.string.ALERTER_NETWORK_WARNING_TITLE, new Object[0]);
                String strC2 = agVar.f31933c.c(R.string.ALERTER_NETWORK_WARNING_DESCRIPTION, new Object[0]);
                Integer num = new Integer(R.drawable.no_network_warning_alerter_icon);
                h.o.c cVar = h.o.a.f48264a;
                if (com.waze.an.c.q.b(bVar, uVar, new com.waze.an.a.k(strC, strC2, num, new com.waze.an.a.j(h.o.c.i(agVar.f31936f.c(), h.o.d.f48273d), new com.waze.native_managers.n(9), null), h.a.i.h()), null, null, 28)) {
                    amVar.f48101a = true;
                    agVar.f31934d.a(agVar.f31936f.c());
                }
            }
        }
        return h.ab.f48028a;
    }
}

package com.waze.main_screen.c;

import com.waze.R;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class x extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26292a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26293b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f26294c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ai f26295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(ai aiVar, h.c.e eVar) {
        super(4, eVar);
        this.f26295d = aiVar;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        x xVar = new x(this.f26295d, (h.c.e) obj4);
        xVar.f26292a = (Optional) obj;
        xVar.f26293b = (com.waze.nav_connect.b.c) obj2;
        xVar.f26294c = (List) obj3;
        return xVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        Optional optional = (Optional) this.f26292a;
        com.waze.nav_connect.b.c cVar = (com.waze.nav_connect.b.c) this.f26293b;
        List list = (List) this.f26294c;
        if (cVar.a()) {
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (((com.waze.location.q) it.next()) instanceof n) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                return new s(new com.waze.ui.ac.j(R.string.NAV_CONNECT_FTE_TOOLTIP), i2, (com.waze.location.q) list.get(i2), new w(this.f26295d.f26106k, 1, null));
            }
        }
        if (!optional.isEmpty()) {
            Iterator it2 = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (((com.waze.location.q) it2.next()) instanceof q) {
                    break;
                }
                i3++;
            }
            if (i3 != -1) {
                return new s(new com.waze.ui.ac.k(R.string.TRANSPORTATION_LAYER_TOOLTIP_TITLE, ((com.waze.main_screen.ae.a.c) optional.get()).a()), i3, (com.waze.location.q) list.get(i3), new w(this.f26295d.f26104i, 0));
            }
        }
        return null;
    }
}

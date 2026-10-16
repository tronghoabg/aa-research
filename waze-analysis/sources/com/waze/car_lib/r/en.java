package com.waze.car_lib.r;

import com.waze.R;
import com.waze.car_lib.f.id;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class en {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.tree.d.d f21557a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.p.y f21558b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.p.ac f21559c;

    public en(com.waze.shared_infra.o.a aVar, com.waze.settings.ds dsVar) {
        String str;
        String strS;
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(dsVar, "settingsRepository");
        com.waze.settings.tree.d.d dVarE = com.waze.car_lib.o.i.e(aVar, dsVar, com.waze.sound.bu.f39572a);
        this.f21557a = dVarE;
        List listH = dVarE.H();
        ArrayList arrayList = new ArrayList(h.a.i.q(listH, 10));
        Iterator it = listH.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            com.waze.settings.tree.d.g gVar = (com.waze.settings.tree.d.g) it.next();
            String strS2 = gVar.s();
            strS2 = strS2 == null ? "" : strS2;
            String strT = gVar.t();
            strT = strT == null ? "" : strT;
            com.waze.settings.tree.d dVarM = gVar.m();
            com.waze.settings.tree.a aVar2 = dVarM instanceof com.waze.settings.tree.a ? (com.waze.settings.tree.a) dVarM : null;
            arrayList.add(new com.waze.car_lib.p.aa(strS2, strT, Integer.valueOf(aVar2 != null ? aVar2.a() : -1), null, 8));
        }
        ArrayList arrayList2 = arrayList;
        com.waze.settings.tree.d.g gVarF = this.f21557a.F();
        if (gVarF != null && (strS = gVarF.s()) != null) {
            str = strS;
        }
        com.waze.car_lib.p.y yVar = new com.waze.car_lib.p.y(arrayList2, str);
        this.f21558b = yVar;
        this.f21559c = new com.waze.car_lib.p.ac(aVar.c(R.string.AAOS_SOUND_SETTINGS_TITLE, new Object[0]), h.a.i.d(yVar));
    }

    public final com.waze.car_lib.p.ac a() {
        return this.f21559c;
    }

    public final void b(id idVar, String str) {
        Object next;
        h.g.b.x.f(idVar, "controller");
        h.g.b.x.f(str, "option");
        com.waze.settings.tree.d.d dVar = this.f21557a;
        Iterator it = dVar.H().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (h.g.b.x.n(((com.waze.settings.tree.d.g) next).s(), str)) {
                    break;
                }
            }
        }
        com.waze.settings.tree.c.h hVarD = dVar.D();
        if (hVarD != null) {
            hVarD.c(null, str, this.f21558b.a());
        }
        idVar.a(str);
    }
}

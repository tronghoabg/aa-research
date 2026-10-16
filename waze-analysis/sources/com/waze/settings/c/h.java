package com.waze.settings.c;

import android.view.View;
import com.waze.R;
import com.waze.network.f.ak;
import com.waze.settings.de;
import com.waze.settings.tree.d.q;
import com.waze.settings.tree.d.s;
import com.waze.settings.tree.views.WazeSettingsView;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends com.waze.settings.tree.d.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ev.n f36939a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.b.d f36940b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f36941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.waze.ev.n nVar, com.waze.sharedui.b.d dVar, com.waze.shared_infra.o.a aVar) {
        super("ev_networks", "EV_NETWORKS_SETTINGS", com.waze.ui.ad.b.c(Integer.valueOf(R.string.EV_NETWORKS_SETTINGS_TITLE)), (com.waze.settings.tree.d) null, (List) null, 56);
        x.f(nVar, "evRepository");
        x.f(dVar, "auditReporter");
        x.f(aVar, "stringProvider");
        this.f36939a = nVar;
        this.f36940b = dVar;
        this.f36941c = aVar;
    }

    private final List E(de deVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            arrayList.add(new s(str, str, str, new c(this, str, deVar)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(de deVar) {
        ArrayList arrayList = new ArrayList();
        com.waze.ev.n nVar = this.f36939a;
        List list = (List) nVar.f().d();
        if (list == null) {
            arrayList.add(new d(com.waze.ui.ad.b.d("LOADING")));
            B(arrayList);
            return;
        }
        com.waze.settings.tree.d.l lVar = new com.waze.settings.tree.d.l("ev_network_types_disclaimer", com.waze.ui.ad.b.c(Integer.valueOf(R.string.EV_NETWORKS_SETTINGS_DISCLAIMER)));
        List listA = ((com.waze.ev.m) nVar.g().d()).a();
        if (!listA.isEmpty()) {
            arrayList.addAll(E(deVar, h.a.i.ao(((com.waze.ev.m) nVar.g().d()).a())));
            if (list.size() != listA.size()) {
                arrayList.add(new q());
            }
        }
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(h.a.i.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.waze.ev.g) it.next()).a());
        }
        arrayList.addAll(E(deVar, h.a.i.ad(arrayList2, h.a.i.au(((com.waze.ev.m) nVar.g().d()).a()))));
        arrayList.add(lVar);
        B(arrayList);
    }

    @Override // com.waze.settings.tree.d.n, com.waze.settings.tree.f
    protected final View O(de deVar) {
        String strB;
        x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = (WazeSettingsView) com.waze.speech.k.d(deVar, this);
        com.waze.ev.n nVar = this.f36939a;
        List listA = ((com.waze.ev.m) nVar.g().d()).a();
        com.waze.shared_infra.o.a aVar = this.f36941c;
        String strC = aVar.c(R.string.EV_PROFILE_SETTINGS_NONE_NETWORKS_SELECTED, new Object[0]);
        if (!listA.isEmpty()) {
            if (listA.size() == 1) {
                com.waze.ev.g gVarB = nVar.b((String) h.a.i.P(listA));
                String strA = gVarB != null ? gVarB.a() : null;
                if (strA != null && (strB = aVar.b(strA)) != null) {
                    strC = strB;
                }
            } else {
                strC = aVar.c(R.string.EV_PROFILE_SETTINGS_MULTIPLE_NETWORKS_SELECTED_PD, Integer.valueOf(listA.size()));
            }
        }
        wazeSettingsView.P(strC);
        Collection collection = (Collection) nVar.f().d();
        if (collection == null || collection.isEmpty()) {
            wazeSettingsView.setClickable(false);
            wazeSettingsView.F(false);
        }
        return wazeSettingsView;
    }

    public final Integer e() {
        List listA = ((com.waze.ev.m) this.f36939a.g().d()).a();
        if (listA.isEmpty()) {
            return Integer.valueOf(R.string.EV_PROFILE_SETTINGS_NONE_NETWORKS_SELECTED);
        }
        if (listA.size() == 1) {
            return null;
        }
        return Integer.valueOf(R.string.EV_PROFILE_SETTINGS_MULTIPLE_NETWORKS_SELECTED_PD);
    }

    @Override // com.waze.settings.tree.g
    public final void h(de deVar) {
        x.f(deVar, "page");
        super.h(deVar);
        F(deVar);
        ai.m(ai.K(this.f36939a.g(), new e(this, deVar, (h.c.e) null, 0)), ak.q(deVar));
        aj.z(ak.q(deVar), null, null, new g(this, deVar, null), 3);
    }
}

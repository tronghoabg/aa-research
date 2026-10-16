package com.waze.settings.c;

import com.waze.ConfigManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.settings.gu;
import com.waze.settings.hd;
import com.waze.settings.tree.d.s;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {
    public static final /* synthetic */ List a(com.waze.ev.n nVar, com.waze.sharedui.b.d dVar, com.waze.shared_infra.o.a aVar) {
        b bVar = new b(nVar, dVar, aVar);
        h hVar = new h(nVar, dVar, aVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new s("i_drive_an_ev_toggle", R.string.EV_PROFILE_SETTINGS_I_DRIVE_EV_TOGGLE, "I_DRIVE_EV", new m(bVar.e(), hVar.e(), dVar, nVar)));
        arrayList.add(bVar);
        arrayList.add(hVar);
        arrayList.add(new com.waze.settings.tree.d.l("ev_profile_footer", com.waze.ui.ad.b.c(Integer.valueOf(R.string.EV_PROFILE_SETTINGS_FOOTER))));
        return arrayList;
    }

    public static final void b(hd hdVar, ConfigManager configManager) {
        x.f(hdVar, "<this>");
        x.f(configManager, "configManager");
        configManager.setConfigValueBool(ConfigValues.CONFIG_VALUE_FTE_QUICK_NAVIGATION_CLICKED, true);
        hd.c("quick_navigation", "MAP");
    }

    public static final /* synthetic */ com.waze.ui.k.i d(com.waze.ui.k.i iVar) {
        String strA = iVar.a();
        List listB = iVar.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (((com.waze.ui.k.h) obj).d()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(h.a.i.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((com.waze.ui.k.h) it.next()).c());
        }
        return com.waze.ui.k.i.e(iVar, null, null, gu.i(strA, arrayList3), 11);
    }
}

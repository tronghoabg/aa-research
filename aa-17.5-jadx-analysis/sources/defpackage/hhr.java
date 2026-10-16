package defpackage;

import androidx.car.app.model.Tab;
import androidx.car.app.model.TabTemplate;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class hhr {
    public static final void a(hhp hhpVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-2048620908);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hhpVar) : buxVarC.E(hhpVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            buxVarC.v(1167063745);
            ((bvv) buxVarC).Y(false);
            cfyVar2 = cfyVar;
            hkr.b(cfyVar2, null, null, hhq.a, null, bxc.i(265971877, true, new hfg(5), buxVarC), buxVarC, ((i2 >> 3) & 14) | 199680, 20);
        } else {
            cfyVar2 = cfyVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new heu((Object) hhpVar, cfyVar2, i, 10);
        }
    }

    public static final void b(TabTemplate tabTemplate, geu geuVar) {
        if (tabTemplate.isLoading()) {
            return;
        }
        wm wmVar = wm.a;
        List<Tab> tabs = tabTemplate.getTabs();
        String activeTabContentId = tabTemplate.getActiveTabContentId();
        int size = tabs.size();
        int i = wmVar.c;
        if (size < i) {
            throw new IllegalArgumentException("There must be at least " + i + " tab(s) added, but only found " + tabs.size());
        }
        int size2 = tabs.size();
        int i2 = wmVar.b;
        if (size2 > i2) {
            throw new IllegalArgumentException("There cannot be more than " + i2 + " tabs added, found " + tabs.size());
        }
        HashSet hashSet = new HashSet();
        boolean zEquals = false;
        for (Tab tab : tabs) {
            zEquals |= activeTabContentId.equals(tab.getContentId());
            if (!hashSet.add(tab.getContentId())) {
                throw new IllegalArgumentException("Found duplicate tab ID: " + tab.getContentId() + ". Each tab must have a unique ID.");
            }
        }
        if (!zEquals) {
            throw new IllegalArgumentException("There is no tab with content ID matching the active tab content ID set on the template");
        }
        if (geuVar.i().c() >= 8) {
            wl.c.a(tabTemplate.getTabContents().getTemplate());
            return;
        }
        if (geuVar.i().c() == 7) {
            wl.b.a(tabTemplate.getTabContents().getTemplate());
        } else {
            if (geuVar.i().c() != 6) {
                geuVar.i().e((gnf) geuVar.F(gnf.class));
                throw new IllegalArgumentException("Tabs are only available in API 6+");
            }
            wl.a.a(tabTemplate.getTabContents().getTemplate());
        }
    }
}

package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class njl extends eql {
    public ComponentName a;
    public ComponentName h;
    public ComponentName i;
    final /* synthetic */ njp j;
    private final eqj k;

    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public njl(defpackage.njp r7) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njl.<init>(njp):void");
    }

    public static final boolean v(ComponentName componentName) {
        if (acxa.U()) {
            if (affa.f(componentName, mkn.b) || affa.f(componentName, mkn.c)) {
                njp.b.l().y("Recent app denied: %s (reason: telecom)", componentName);
                return true;
            }
            if (affa.f(componentName, mkn.s) || affa.f(componentName, mkn.H)) {
                njp.b.l().y("Recent app denied: %s (reason: launcher)", componentName);
                return true;
            }
            if (affa.f(componentName, mkn.B)) {
                njp.b.l().y("Recent app denied: %s (reason: nav fallback)", componentName);
                return true;
            }
        }
        if (affa.f(componentName, mkn.v) || kmo.c(acwu.b(), componentName.flattenToString())) {
            return false;
        }
        njp.b.l().y("Recent app denied: %s (reason: denied list flag)", componentName);
        return true;
    }

    public final void a(ComponentName componentName, ComponentName componentName2) {
        if (acxa.U()) {
            Collection collection = (List) e();
            if (collection == null) {
                collection = afbe.a;
            }
            List listCh = woy.ch(collection);
            if (componentName2 != null && !affa.f(componentName2, componentName)) {
                listCh.remove(componentName2);
                listCh.add(0, componentName2);
            }
            u(listCh);
            return;
        }
        List list = (List) e();
        ComponentName componentName3 = list != null ? (ComponentName) woy.bH(list) : null;
        if (componentName2 != null) {
            if (affa.f(componentName2, componentName)) {
            }
            if (componentName2 != null || affa.f(componentName2, componentName3)) {
            }
            u(woy.bg(componentName2));
            return;
        }
        componentName2 = null;
        if ((componentName2 == null || affa.f(componentName2, componentName)) && affa.f(componentName, componentName3)) {
            ComponentName componentName4 = this.i;
            componentName2 = mkn.b;
            if (affa.f(componentName4, componentName2)) {
                componentName2 = mkn.v;
            }
        } else {
            componentName2 = componentName3;
        }
        if (componentName2 != null) {
        }
    }

    @Override // defpackage.eqj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void m(List list) {
        List list2 = list == null ? afbe.a : list;
        if (!acxa.U()) {
            ComponentName componentName = (ComponentName) woy.bH(list2);
            njp.b.l().S("Setting recent app to %s. Nav: %s, Media: %s, Phone: %s", componentName, this.a, this.h, this.i);
            if (componentName != null) {
                this.j.n(componentName);
            }
            this.j.l(list2);
            super.m(list);
            return;
        }
        njp.b.l().S("Setting recent apps to %s. Nav: %s, Media: %s, Phone: %s", list, this.a, this.h, this.i);
        njp njpVar = this.j;
        njpVar.l(list2);
        ComponentName componentName2 = (ComponentName) woy.bH(list2);
        if (componentName2 != null) {
            njpVar.n(componentName2);
        }
        super.m(list);
    }

    public final void u(List list) {
        if (!acxa.U()) {
            njp.b.l().y("Updating recent apps (legacy). newList=%s", list);
            ComponentName componentName = (ComponentName) woy.bH(list);
            if (componentName == null || affa.f(componentName, this.a) || affa.f(componentName, this.h) || affa.f(componentName, this.i) || v(componentName)) {
                componentName = null;
            }
            if (componentName == null) {
                componentName = mkn.v;
                componentName.getClass();
            }
            m(woy.bg(componentName));
            return;
        }
        yph yphVar = njp.b;
        yphVar.l().y("Updating recent apps. newList=%s", list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ComponentName componentName2 = (ComponentName) obj;
            if (!affa.f(componentName2, this.a) && !affa.f(componentName2, this.h) && !affa.f(componentName2, this.i) && !v(componentName2)) {
                arrayList.add(obj);
            }
        }
        List listBQ = woy.bQ(arrayList);
        yphVar.l().y("Filtered recent apps. filteredList=%s", listBQ);
        List listCh = woy.ch(listBQ);
        if (listCh.isEmpty()) {
            ComponentName componentName3 = mkn.v;
            componentName3.getClass();
            listCh.add(componentName3);
        }
        List listCd = woy.cd(listCh, 3);
        yphVar.l().y("Final recent apps to be assigned: %s", listCd);
        m(listCd);
    }
}

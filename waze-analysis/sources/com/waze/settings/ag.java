package com.waze.settings;

import com.waze.R;
import com.waze.config.ConfigValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag extends com.waze.settings.tree.d.d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36763a = com.waze.reports_v2.c.bv.f34294b.a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f36764b = com.waze.reports_v2.c.bv.f34295c.a();

    /* renamed from: c, reason: collision with root package name */
    private final boolean f36765c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.l f36766d;

    /* JADX WARN: Illegal instructions before constructor call */
    public ag(boolean z, h.g.a.l lVar) {
        h.g.b.x.f(lVar, "openRequestRecordAudioPermission");
        com.waze.ui.ac.n nVarC = com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORTS));
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_USER_ENABLED_STATE;
        h.g.b.x.e(dVar, "CONFIG_VALUE_REPORTING_C…ORTING_USER_ENABLED_STATE");
        super("reporting", "REPORTS_SETTINGS", nVarC, null, new com.waze.settings.tree.c.g(dVar, 0), h.a.i.i(new com.waze.settings.tree.d.g(f36763a, com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORTING_OPTIONS_OPTION_TALK_TO_REPORT)), null, null, null, "CONVERSATIONAL_REPORTING_TOGGLE", 28), new com.waze.settings.tree.d.g(f36764b, com.waze.ui.ad.b.c(Integer.valueOf(R.string.REPORTING_OPTIONS_OPTION_TAP_TO_REPORT)), null, null, null, "CONVERSATIONAL_REPORTING_TOGGLE", 28)), 8);
        this.f36765c = z;
        this.f36766d = lVar;
    }

    static final h.ab c(ag agVar, com.waze.settings.tree.d.g gVar, dd ddVar, boolean z) {
        Object next;
        if (z) {
            super.d(gVar, ddVar);
        } else {
            Iterator it = agVar.H().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (h.g.b.x.n(((com.waze.settings.tree.d.g) next).s(), f36764b)) {
                    break;
                }
            }
            com.waze.settings.tree.d.g gVar2 = (com.waze.settings.tree.d.g) next;
            if (gVar2 != null) {
                super.d(gVar2, ddVar);
                agVar.e(agVar.H());
            }
        }
        return h.ab.f48028a;
    }

    @Override // com.waze.settings.tree.d.d
    public final void d(final com.waze.settings.tree.d.g gVar, final dd ddVar) {
        h.g.b.x.f(gVar, "option");
        h.g.b.x.f(ddVar, "page");
        if (h.g.b.x.n(gVar.s(), f36764b)) {
            super.d(gVar, ddVar);
        } else {
            this.f36766d.invoke(new h.g.a.l() { // from class: com.waze.settings.af
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ag.c(this.f36760a, gVar, ddVar, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    @Override // com.waze.settings.tree.d.d
    public final void e(List list) {
        Object next;
        Object next2;
        h.g.b.x.f(list, "options");
        String strB = E().b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.waze.settings.tree.d.g) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        String str = f36763a;
        Object obj2 = null;
        if (h.g.b.x.n(strB, str) && this.f36765c) {
            ArrayList arrayList3 = arrayList2;
            Iterator it = arrayList3.iterator();
            while (true) {
                if (it.hasNext()) {
                    next2 = it.next();
                    if (h.g.b.x.n(((com.waze.settings.tree.d.g) next2).s(), str)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            com.waze.settings.tree.d.g gVar = (com.waze.settings.tree.d.g) next2;
            if (gVar != null) {
                gVar.f(true);
            }
            Iterator it2 = arrayList3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (h.g.b.x.n(((com.waze.settings.tree.d.g) next3).s(), f36764b)) {
                    obj2 = next3;
                    break;
                }
            }
            com.waze.settings.tree.d.g gVar2 = (com.waze.settings.tree.d.g) obj2;
            if (gVar2 != null) {
                gVar2.f(false);
                return;
            }
            return;
        }
        ArrayList arrayList4 = arrayList2;
        Iterator it3 = arrayList4.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (h.g.b.x.n(((com.waze.settings.tree.d.g) next).s(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        com.waze.settings.tree.d.g gVar3 = (com.waze.settings.tree.d.g) next;
        if (gVar3 != null) {
            gVar3.f(false);
        }
        Iterator it4 = arrayList4.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next4 = it4.next();
            if (h.g.b.x.n(((com.waze.settings.tree.d.g) next4).s(), f36764b)) {
                obj2 = next4;
                break;
            }
        }
        com.waze.settings.tree.d.g gVar4 = (com.waze.settings.tree.d.g) obj2;
        if (gVar4 != null) {
            gVar4.f(true);
        }
    }
}

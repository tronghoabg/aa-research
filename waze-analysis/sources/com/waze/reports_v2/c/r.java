package com.waze.reports_v2.c;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.ConfigManager;
import com.waze.config.ConfigValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Object f34535a;

    public r() {
        this.f34535a = new ArrayList();
    }

    public final int a() {
        return ((ConfigManager) this.f34535a).getConfigValueInt(ConfigValues.CONFIG_VALUE_REPORTING_CLOSURE_V2_WRONG_TURN_DURATION_SECONDS);
    }

    public final boolean b() {
        return ((ConfigManager) this.f34535a).getConfigValueBool(ConfigValues.CONFIG_VALUE_REPORTING_CLOSURE_V2_CLOSURE_BEHIND_USE_CASE_ENABLED);
    }

    public final com.waze.settings.tree.f c(String str) {
        Object next;
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.aq aqVar = new h.g.b.aq();
        Object objU = this.f34535a;
        for (List list : h.a.i.aU(h.n.o.af(str, new String[]{"."}, 0, 6), 1)) {
            String str2 = (String) h.a.i.S(list, 0);
            if (str2 != null) {
                Object objS = h.a.i.S(list, 1);
                if (objU != null) {
                    Iterator it = ((Iterable) objU).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (h.g.b.x.n(((com.waze.settings.tree.f) next).s(), str2)) {
                            break;
                        }
                    }
                    com.waze.settings.tree.f fVar = (com.waze.settings.tree.f) next;
                    if (fVar != null) {
                        if (objS != null) {
                            com.waze.settings.tree.i iVar = fVar instanceof com.waze.settings.tree.i ? (com.waze.settings.tree.i) fVar : null;
                            if (iVar != null) {
                                iVar.d();
                            }
                            objU = fVar.u();
                        }
                        aqVar.f48105a = fVar;
                    }
                }
            }
            return null;
        }
        return (com.waze.settings.tree.f) aqVar.f48105a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void d(com.waze.settings.tree.f fVar) {
        h.g.b.x.f(fVar, "setting");
        this.f34535a.add(fVar);
    }

    public r(ConfigManager configManager) {
        h.g.b.x.f(configManager, "configManager");
        this.f34535a = configManager;
    }
}

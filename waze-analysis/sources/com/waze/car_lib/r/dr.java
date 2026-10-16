package com.waze.car_lib.r;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.R;
import com.waze.settings.SettingsNativeManager;
import com.waze.settings.gr;
import com.waze.strings.DisplayStrings;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dr {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21423a;

    /* renamed from: b, reason: collision with root package name */
    private final SettingsNativeManager f21424b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.settings.ds f21425c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.settings.eb f21426d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.sharedui.b.d f21427e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.ev.n f21428f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.google_assistant.c f21429g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.settings.d.f f21430h;

    /* renamed from: i, reason: collision with root package name */
    private List f21431i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.car_lib.p.x f21432j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.settings.tree.d.n f21433k;

    public dr(com.waze.shared_infra.o.a aVar, SettingsNativeManager settingsNativeManager, com.waze.settings.ds dsVar, com.waze.settings.eb ebVar, com.waze.sharedui.b.d dVar, com.waze.ev.n nVar, com.waze.google_assistant.c cVar, com.waze.settings.d.f fVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(settingsNativeManager, "settingsNativeManager");
        h.g.b.x.f(dsVar, "settingsRepository");
        h.g.b.x.f(ebVar, "settingsStatsSender");
        h.g.b.x.f(dVar, "auditReporter");
        h.g.b.x.f(nVar, "evRepository");
        h.g.b.x.f(cVar, "googleAssistantConfig");
        h.g.b.x.f(fVar, "settingsGasTypeController");
        this.f21423a = aVar;
        this.f21424b = settingsNativeManager;
        this.f21425c = dsVar;
        this.f21426d = ebVar;
        this.f21427e = dVar;
        this.f21428f = nVar;
        this.f21429g = cVar;
        this.f21430h = fVar;
        this.f21431i = h.a.i.h();
        this.f21432j = new com.waze.car_lib.p.x(h.a.i.d(new com.waze.car_lib.p.aa("more_navigation_settings", aVar.c(R.string.AAOS_TRIP_OVERVIEW_VIEW_ALL_SETTINGS_BUTTON, new Object[0]), null, true, 4)));
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(dsVar, "settingsRepository");
        h.g.b.x.f(settingsNativeManager, "settingsNativeManager");
        h.g.b.x.f(ebVar, "settingsStatsSender");
        h.g.b.x.f(dVar, "auditReporter");
        h.g.b.x.f(nVar, "evRepository");
        h.g.b.x.f(cVar, "googleAssistantConfig");
        h.g.b.x.f(fVar, "settingsGasTypeController");
        this.f21433k = (com.waze.settings.tree.d.n) new gr(dsVar, settingsNativeManager, ebVar, new com.waze.car_lib.o.b(new com.waze.reports_v2.c.r(), 2), dVar, nVar, cVar, fVar, aVar, null, true, DisplayStrings.DS_CARPLAY_ENABLE_MIC_PERMISSION_OK).h();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.waze.car_lib.p.ac a(boolean r15) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.dr.a(boolean):com.waze.car_lib.p.ac");
    }

    public final void b(String str, h.g.a.l lVar) {
        Object next;
        com.waze.settings.tree.c.b bVarB;
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        if (h.g.b.x.n(str, "more_navigation_settings")) {
            if (lVar != null) {
                lVar.invoke(this.f21433k);
                return;
            }
            return;
        }
        Iterator it = this.f21431i.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (h.g.b.x.n(((com.waze.settings.tree.d.s) next).s(), str)) {
                    break;
                }
            }
        }
        com.waze.settings.tree.d.s sVar = (com.waze.settings.tree.d.s) next;
        if (sVar == null || (bVarB = sVar.B()) == null) {
            return;
        }
        com.waze.settings.tree.c.f.c(sVar, !bVarB.Q(), null, null);
    }
}

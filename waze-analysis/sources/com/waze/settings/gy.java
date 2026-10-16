package com.waze.settings;

import androidx.lifecycle.ViewModel;
import com.waze.R;
import com.waze.config.ConfigValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gy extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final ds f37360a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.as.a f37361b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.reports_v2.d.j f37362c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f37363d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.bq f37364e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f37365f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37366g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.ab.a.ad f37367h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.settings.b.c f37368i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.reports_v2.c.r f37369j;

    public gy(SettingsNativeManager settingsNativeManager, ds dsVar, com.waze.sharedui.b.d dVar, eb ebVar, com.waze.ev.n nVar, com.waze.g.d dVar2, com.waze.google_assistant.c cVar, com.waze.settings.d.f fVar, com.waze.sound.fm fmVar, com.waze.sound.fc fcVar, com.waze.as.a aVar, com.waze.shared_infra.o.a aVar2, com.waze.reports_v2.d.j jVar, com.waze.main_screen.c.a aVar3, com.waze.ab.a.p pVar) {
        h.g.b.x.f(settingsNativeManager, "settingsNativeManager");
        h.g.b.x.f(dsVar, "settingsRepository");
        h.g.b.x.f(dVar, "auditReporter");
        h.g.b.x.f(ebVar, "settingsStatsSender");
        h.g.b.x.f(nVar, "evRepository");
        h.g.b.x.f(dVar2, "applicationInfoRepository");
        h.g.b.x.f(cVar, "googleAssistantConfig");
        h.g.b.x.f(fVar, "settingsGasTypeController");
        h.g.b.x.f(fmVar, "soundPlayer");
        h.g.b.x.f(fcVar, "soundOutputRoutingManager");
        h.g.b.x.f(aVar, "deviceLockStateService");
        h.g.b.x.f(aVar2, "stringProvider");
        h.g.b.x.f(jVar, "reportingStatsSender");
        h.g.b.x.f(aVar3, "buttonPackConfiguration");
        h.g.b.x.f(pVar, "stateHolderFactory");
        this.f37360a = dsVar;
        this.f37361b = aVar;
        this.f37362c = jVar;
        kotlinx.coroutines.b.bm bmVarE = kotlinx.coroutines.b.bu.e(0, 0, null, 7);
        this.f37363d = bmVarE;
        this.f37364e = kotlinx.coroutines.b.ai.S(bmVarE);
        this.f37365f = kotlinx.coroutines.b.bu.e(0, 1, kotlinx.coroutines.a.a.f51273c, 1);
        this.f37367h = pVar.a();
        dVar2.d();
        this.f37368i = new com.waze.settings.b.c(dsVar.m(), settingsNativeManager, new gx(this));
        dsVar.U();
        ew ewVar = new ew(this, 12);
        h.g.b.x.f(dsVar, "settingsRepository");
        h.g.b.x.f(dVar, "auditReporter");
        h.g.b.x.f(nVar, "evRepository");
        h.g.b.x.f(settingsNativeManager, "settingsNativeManager");
        h.g.b.x.f(ebVar, "settingsStatsSender");
        h.g.b.x.f("5.20.90.901", "appVersion");
        h.g.b.x.f(cVar, "googleAssistantConfig");
        h.g.b.x.f(fVar, "settingsGasTypeController");
        h.g.b.x.f(fmVar, "soundPlayer");
        h.g.b.x.f(fcVar, "soundOutputRoutingManager");
        h.g.b.x.f(aVar2, "stringProvider");
        h.g.b.x.f(ewVar, "conversationalReportingChangedHandler");
        com.waze.reports_v2.c.r rVar = new com.waze.reports_v2.c.r();
        gr grVar = new gr(dsVar, settingsNativeManager, ebVar, new com.waze.car_lib.o.b(rVar, 3), dVar, nVar, cVar, fVar, aVar2, aVar3, false, 2048);
        com.waze.settings.tree.f[] fVarArr = new com.waze.settings.tree.f[5];
        fVarArr[0] = grVar.G(fmVar, fcVar, ewVar);
        fVarArr[1] = grVar.j();
        fVarArr[2] = grVar.k();
        fVarArr[3] = grVar.l();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.waze.settings.tree.d.d("Environment", null, com.waze.ui.ad.b.c(Integer.valueOf(R.string.LOCATION)), null, new go(), h.a.i.i(new com.waze.settings.tree.d.g("STG", com.waze.ui.ad.b.d("STG"), null, null, null, null, 60), new com.waze.settings.tree.d.g("IL", com.waze.ui.ad.b.d(" IL"), null, null, null, null, 60), new com.waze.settings.tree.d.g("US", com.waze.ui.ad.b.d("US"), null, null, null, null, 60), new com.waze.settings.tree.d.g("ROW", com.waze.ui.ad.b.d("ROW"), null, null, null, null, 60)), 8));
        arrayList.add(new com.waze.settings.tree.d.d("ConversationalReportingMode", null, com.waze.ui.ad.b.d("Conversational Reporting mode"), null, new fh(grVar, 4), h.a.i.i(new com.waze.settings.tree.d.g("report_menu", com.waze.ui.ad.b.d("report_menu"), null, null, null, null, 60), new com.waze.settings.tree.d.g("main_screen", com.waze.ui.ad.b.d("main_screen"), null, null, null, null, 60)), 8));
        arrayList.add(new com.waze.settings.tree.d.d("ConversationalReportingSoundPackage", null, com.waze.ui.ad.b.d("Conversational Reporting sound package"), null, new fh(grVar, 5), h.a.i.i(new com.waze.settings.tree.d.g("minimalist", com.waze.ui.ad.b.d("minimalist"), null, null, null, null, 60), new com.waze.settings.tree.d.g("popcorn", com.waze.ui.ad.b.d("popcorn"), null, null, null, null, 60)), 8));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Conversational Reporting enabled", ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ENABLED);
        linkedHashMap.put("Conversational Reporting FTE Tooltip enabled", ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_FTE_TOOLTIP_ENABLED);
        linkedHashMap.put("Conversational Reporting FTE Hint in Report Menu enabled", ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_FTE_HINT_ENABLED);
        linkedHashMap.put("Conversational Reporting FTE Hint in Report Button enabled", ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_BUTTON_FTE_HINT_ENABLED);
        linkedHashMap.put("Conversational Reporting Activation Dialog enabled", ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ACTIVATION_DIALOG_ENABLED);
        linkedHashMap.put("Waze Asks enabled", ConfigValues.CONFIG_VALUE_REPORTING_WAZE_ASKS_ENABLED);
        linkedHashMap.put("Personal Safety Alert enabled", ConfigValues.CONFIG_VALUE_ALERTS_PERSONAL_SAFETY_ALERT_ENABLED);
        linkedHashMap.put("Trip Overview - AAOS Address preview", ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_SHOW_FROM_AAOS_ADDRESS_PREVIEW);
        linkedHashMap.put("Trip Overview - AAOS search", ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_SHOW_FROM_AAOS_SEARCH);
        linkedHashMap.put("Trip Overview - AAOS StartState", ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_SHOW_FROM_AAOS_START_STATE);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            com.waze.config.b bVar = (com.waze.config.b) entry.getValue();
            h.g.b.x.f(bVar, "config");
            arrayList.add(new com.waze.settings.tree.d.s(str, str, (String) null, new com.waze.settings.tree.c.a(bVar)));
        }
        fVarArr[4] = new com.waze.settings.tree.d.n("feature_toggles", (String) null, com.waze.ui.ad.b.d("Feature Toggles"), (com.waze.settings.tree.d) null, arrayList, 24);
        Iterator it = h.a.i.i(fVarArr).iterator();
        while (it.hasNext()) {
            rVar.d((com.waze.settings.tree.f) it.next());
        }
        this.f37369j = rVar;
        addCloseable((AutoCloseable) this.f37367h);
        int i2 = com.waze.sharedui.c.b.f38844a;
        com.waze.sharedui.c.b.c(this.f37368i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.reports_v2.c.s p() {
        return this.f37360a.j().b().a();
    }

    public final com.waze.ab.a.ad a() {
        return this.f37367h;
    }

    public final com.waze.as.a b() {
        return this.f37361b;
    }

    public final ds e() {
        return this.f37360a;
    }

    public final kotlinx.coroutines.b.bm g() {
        return this.f37365f;
    }

    public final kotlinx.coroutines.b.bq h() {
        return this.f37364e;
    }

    public final void j(boolean z) {
        if (h.g.b.x.n(p(), com.waze.reports_v2.b.f34001a)) {
            return;
        }
        boolean zM = p().m();
        boolean z2 = zM && !z;
        boolean z3 = !zM && z && this.f37366g;
        if (z2 || z3) {
            this.f37366g = false;
            p().f(z);
        }
    }

    public final void k() {
        this.f37360a.I();
    }

    public final void l(Boolean bool) {
        boolean zN = h.g.b.x.n(bool, true);
        com.waze.reports_v2.d.j jVar = this.f37362c;
        if (zN) {
            jVar.n();
        } else {
            jVar.m();
        }
    }

    public final void m() {
        this.f37362c.o();
    }

    public final com.waze.reports_v2.c.r o() {
        return this.f37369j;
    }

    @Override // androidx.lifecycle.ViewModel
    protected final void onCleared() {
        this.f37360a.W();
        com.waze.sharedui.c.b.a(this.f37368i);
    }
}

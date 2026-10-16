package com.waze.ui.w;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.waze.R;
import com.waze.ui.f.al;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class z implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    public static final z f43802a = new z();

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        com.waze.ui.f.ad adVar = (com.waze.ui.f.ad) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        h.g.b.x.f(adVar, "it");
        composer.startReplaceGroup(1359072893);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1359072893, iIntValue, -1, "com.waze.ui.reports.MenuLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReportsMenuLayout.kt:331)");
        }
        al alVarC = al.c(com.waze.tide.s.e(adVar, composer, iIntValue & 14), com.waze.ui.r.a.c.c.b(R.string.CONVERSATIONAL_REPORTING_IDLE_OB_FLOW_BUTTON, composer, 0));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return alVarC;
    }
}

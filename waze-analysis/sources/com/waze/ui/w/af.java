package com.waze.ui.w;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.waze.ui.w.b.ap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class af implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f43541a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f43542b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f43543c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.ui.x.u f43544d;

    af(boolean z, com.waze.ui.x.u uVar, h.g.a.l lVar, c cVar) {
        this.f43541a = z;
        this.f43544d = uVar;
        this.f43542b = lVar;
        this.f43543c = cVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        h.g.b.x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394279954, iIntValue, -1, "com.waze.ui.reports.MenuLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReportsMenuLayout.kt:413)");
        }
        if (this.f43541a) {
            composer.startReplaceGroup(-741410534);
            ai.B(0.0f, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-741358640);
            composer.endReplaceGroup();
        }
        com.waze.ui.x.u uVar = this.f43544d;
        if (uVar instanceof ap) {
            composer.startReplaceGroup(-741289541);
            ap apVar = (ap) uVar;
            long jC = apVar.c();
            long jD = apVar.d();
            h.g.a.l lVar = this.f43542b;
            boolean zChanged = composer.changed(lVar);
            c cVar = this.f43543c;
            boolean zChangedInstance = zChanged | composer.changedInstance(cVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (h.g.a.a) new ae(lVar, cVar, 0);
                composer.updateRememberedValue(objRememberedValue);
            }
            h.g.a.a aVar = (h.g.a.a) objRememberedValue;
            boolean zChanged2 = composer.changed(lVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (h.g.a.a) new aa(lVar, 3);
                composer.updateRememberedValue(objRememberedValue2);
            }
            ai.y(jC, jD, aVar, (h.g.a.a) objRememberedValue2, composer, 0);
            SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 8.0f), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-740715824);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return h.ab.f48028a;
    }
}

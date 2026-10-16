package com.waze.main_screen.t;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.Ref;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aa implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ref f27449a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BoxScope f27450b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ am f27451c;

    public aa(Ref ref, BoxScope boxScope, am amVar) {
        this.f27449a = ref;
        this.f27450b = boxScope;
        this.f27451c = amVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-559889238, iIntValue, -1, "com.waze.design_components_compose.components.AnimatedValueVisibility.<anonymous> (AnimatedValueVisibility.kt:26)");
        }
        Object value = this.f27449a.getValue();
        if (value == null) {
            composer.startReplaceGroup(1992702047);
        } else {
            composer.startReplaceGroup(1992702048);
            com.waze.reports_v2.presentation.a.at atVar = (com.waze.reports_v2.presentation.a.at) value;
            composer.startReplaceGroup(1283510760);
            Modifier modifierAlign = this.f27450b.align(Modifier.Companion, Alignment.Companion.getTopStart());
            am amVar = this.f27451c;
            boolean zChanged = composer.changed(amVar) | composer.changedInstance(atVar);
            y yVarRememberedValue = composer.rememberedValue();
            if (zChanged || yVarRememberedValue == Composer.Companion.getEmpty()) {
                yVarRememberedValue = new y(amVar, atVar);
                composer.updateRememberedValue(yVarRememberedValue);
            }
            com.waze.reports_v2.presentation.a.an.q(atVar, (h.g.a.a) yVarRememberedValue, modifierAlign, composer, 0);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return h.ab.f48028a;
    }
}

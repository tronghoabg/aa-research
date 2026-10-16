package com.waze.main_screen.p;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.Ref;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ae implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ref f27012a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BoxScope f27013b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bf f27014c;

    public ae(Ref ref, BoxScope boxScope, bf bfVar) {
        this.f27012a = ref;
        this.f27013b = boxScope;
        this.f27014c = bfVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-559889238, iIntValue, -1, "com.waze.design_components_compose.components.AnimatedValueVisibility.<anonymous> (AnimatedValueVisibility.kt:26)");
        }
        Object value = this.f27012a.getValue();
        if (value == null) {
            composer.startReplaceGroup(1992702047);
        } else {
            composer.startReplaceGroup(1992702048);
            com.waze.reports_v2.presentation.a.at atVar = (com.waze.reports_v2.presentation.a.at) value;
            composer.startReplaceGroup(2044118570);
            Modifier modifierAlign = this.f27013b.align(Modifier.Companion, Alignment.Companion.getTopStart());
            bf bfVar = this.f27014c;
            boolean zChanged = composer.changed(bfVar) | composer.changedInstance(atVar);
            ad adVarRememberedValue = composer.rememberedValue();
            if (zChanged || adVarRememberedValue == Composer.Companion.getEmpty()) {
                adVarRememberedValue = new ad(bfVar, atVar);
                composer.updateRememberedValue(adVarRememberedValue);
            }
            com.waze.reports_v2.presentation.a.an.q(atVar, (h.g.a.a) adVarRememberedValue, modifierAlign, composer, 0);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return h.ab.f48028a;
    }
}

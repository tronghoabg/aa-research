package com.waze.main_screen.t;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.Ref;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class x implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ref f27635a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f27636b;

    public x(Ref ref, int i2) {
        this.f27636b = i2;
        this.f27635a = ref;
    }

    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f27636b != 0) {
            Composer composer = (Composer) obj2;
            int iIntValue = ((Number) obj3).intValue();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-559889238, iIntValue, -1, "com.waze.design_components_compose.components.AnimatedValueVisibility.<anonymous> (AnimatedValueVisibility.kt:26)");
            }
            Object value = this.f27635a.getValue();
            if (value == null) {
                composer.startReplaceGroup(1992702047);
            } else {
                composer.startReplaceGroup(1992702048);
                composer.startReplaceGroup(-588247418);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                int i2 = al.f27484a;
                com.waze.br.c.d.a((com.waze.br.c.n) value, SizeKt.m2808height3ABfNKs(modifierFillMaxWidth$default, 400.0f), composer, 48);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return h.ab.f48028a;
        }
        Composer composer2 = (Composer) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-559889238, iIntValue2, -1, "com.waze.design_components_compose.components.AnimatedValueVisibility.<anonymous> (AnimatedValueVisibility.kt:26)");
        }
        Object value2 = this.f27635a.getValue();
        if (value2 == null) {
            composer2.startReplaceGroup(1992702047);
        } else {
            composer2.startReplaceGroup(1992702048);
            composer2.startReplaceGroup(-2112636556);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            int i3 = al.f27484a;
            com.waze.br.c.d.a((com.waze.br.c.n) value2, SizeKt.m2808height3ABfNKs(modifierFillMaxWidth$default2, 400.0f), composer2, 48);
            composer2.endReplaceGroup();
        }
        composer2.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return h.ab.f48028a;
    }
}

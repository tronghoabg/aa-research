package com.waze.search.v2;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.Ref;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ref f36138a;

    public aa(Ref ref) {
        this.f36138a = ref;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-559889238, iIntValue, -1, "com.waze.design_components_compose.components.AnimatedValueVisibility.<anonymous> (AnimatedValueVisibility.kt:26)");
        }
        Object value = this.f36138a.getValue();
        if (value == null) {
            composer.startReplaceGroup(1992702047);
        } else {
            composer.startReplaceGroup(1992702048);
            composer.startReplaceGroup(-462779843);
            com.waze.br.c.d.a((com.waze.br.c.n) value, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), composer, 48);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return h.ab.f48028a;
    }
}

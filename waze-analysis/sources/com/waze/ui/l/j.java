package com.waze.ui.l;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.node.Ref;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ref f42694a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f42695b;

    public j(Ref ref, boolean z) {
        this.f42694a = ref;
        this.f42695b = z;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-559889238, iIntValue, -1, "com.waze.design_components_compose.components.AnimatedValueVisibility.<anonymous> (AnimatedValueVisibility.kt:26)");
        }
        Object value = this.f42694a.getValue();
        if (value == null) {
            composer.startReplaceGroup(1992702047);
        } else {
            composer.startReplaceGroup(1992702048);
            composer.startReplaceGroup(1678111726);
            l.r((q) value, this.f42695b, composer, 0);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return h.ab.f48028a;
    }
}

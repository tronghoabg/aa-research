package com.waze.ui.f;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends h.g.b.y implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    public static final g f42301a = new g();

    public g() {
        super(3);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        composer.startReplaceGroup(-781456724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-781456724, iIntValue, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:62)");
        }
        SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return springSpecSpring$default;
    }
}

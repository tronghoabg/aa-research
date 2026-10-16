package com.waze.ui.b;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final SpringSpec f42028a = AnimationSpecKt.spring(0.9f, 100.0f, Float.valueOf(5.0f));

    public static final a a(e eVar, Composer composer) {
        h.g.b.x.f(eVar, "initialAnchor");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1017072719, 54, -1, "com.waze.ui.alternate_routes.rememberAlternativeRoutesCardsLayoutState (AlternativeRoutesCardsLayoutState.kt:17)");
        }
        SwipeableState swipeableStateRememberSwipeableState = SwipeableKt.rememberSwipeableState(eVar, f42028a, null, composer, 54, 4);
        boolean zChanged = composer.changed(swipeableStateRememberSwipeableState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a(swipeableStateRememberSwipeableState);
            composer.updateRememberedValue(objRememberedValue);
        }
        a aVar = (a) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return aVar;
    }
}

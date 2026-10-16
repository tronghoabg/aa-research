package com.waze.ui.l;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.node.Ref;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ref f42691a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EnterTransition f42692b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ExitTransition f42693c;

    public i(Ref ref, EnterTransition enterTransition, ExitTransition exitTransition) {
        this.f42691a = ref;
        this.f42692b = enterTransition;
        this.f42693c = exitTransition;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-559889238, iIntValue, -1, "com.waze.design_components_compose.components.AnimatedValueVisibility.<anonymous> (AnimatedValueVisibility.kt:26)");
        }
        Object value = this.f42691a.getValue();
        if (value == null) {
            composer.startReplaceGroup(1992702047);
        } else {
            composer.startReplaceGroup(1992702048);
            composer.startReplaceGroup(500675023);
            EnterTransition enterTransition = this.f42692b;
            boolean zChanged = composer.changed(enterTransition);
            ExitTransition exitTransition = this.f42693c;
            boolean zChanged2 = zChanged | composer.changed(exitTransition);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (h.g.a.l) new g(enterTransition, exitTransition);
                composer.updateRememberedValue(objRememberedValue);
            }
            AnimatedContentKt.AnimatedContent(value, null, (h.g.a.l) objRememberedValue, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1258036027, true, new h(), composer, 54), composer, 1572864, 58);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return h.ab.f48028a;
    }
}

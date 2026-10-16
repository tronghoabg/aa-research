package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class RememberLifecycleOwnerKt {
    public static final LifecycleOwner rememberLifecycleOwner(Lifecycle.State state, final LifecycleOwner lifecycleOwner, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            state = Lifecycle.State.RESUMED;
        }
        if ((i3 & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1501509168, i2, -1, "androidx.lifecycle.compose.rememberLifecycleOwner (RememberLifecycleOwner.kt:78)");
        }
        boolean zChanged = composer.changed(lifecycleOwner);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new ComposeLifecycleOwner();
            composer.updateRememberedValue(objRememberedValue);
        }
        final ComposeLifecycleOwner composeLifecycleOwner = (ComposeLifecycleOwner) objRememberedValue;
        boolean zChangedInstance = composer.changedInstance(composeLifecycleOwner) | composer.changedInstance(lifecycleOwner);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new l() { // from class: androidx.lifecycle.compose.RememberLifecycleOwnerKt$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return RememberLifecycleOwnerKt.rememberLifecycleOwner$lambda$1$0(lifecycleOwner, composeLifecycleOwner, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(composeLifecycleOwner, lifecycleOwner, (l) objRememberedValue2, composer, i2 & 112);
        boolean zChangedInstance2 = composer.changedInstance(composeLifecycleOwner);
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(state.ordinal())) && (i2 & 6) != 4) {
            z = false;
        }
        boolean z2 = zChangedInstance2 | z;
        Object objRememberedValue3 = composer.rememberedValue();
        if (z2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = (p) new RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1(composeLifecycleOwner, state, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.LaunchedEffect(composeLifecycleOwner, state, (p) objRememberedValue3, composer, (i2 << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return composeLifecycleOwner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult rememberLifecycleOwner$lambda$1$0(final LifecycleOwner lifecycleOwner, final ComposeLifecycleOwner composeLifecycleOwner, DisposableEffectScope disposableEffectScope) {
        Lifecycle lifecycle;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.compose.RememberLifecycleOwnerKt$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                composeLifecycleOwner.handleLifecycleEvent(event);
            }
        };
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(lifecycleEventObserver);
        }
        if (lifecycleOwner == null) {
            composeLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.RememberLifecycleOwnerKt$rememberLifecycleOwner$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Lifecycle lifecycle2;
                LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                if (lifecycleOwner2 != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
                    lifecycle2.removeObserver(lifecycleEventObserver);
                }
                composeLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
            }
        };
    }
}

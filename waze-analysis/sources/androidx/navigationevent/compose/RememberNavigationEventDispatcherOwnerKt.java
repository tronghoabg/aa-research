package androidx.navigationevent.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.navigationevent.NavigationEventDispatcher;
import androidx.navigationevent.NavigationEventDispatcherOwner;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RememberNavigationEventDispatcherOwnerKt {
    public static final NavigationEventDispatcherOwner rememberNavigationEventDispatcherOwner(boolean z, NavigationEventDispatcherOwner navigationEventDispatcherOwner, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0 && (navigationEventDispatcherOwner = LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No NavigationEventDispatcherOwner provided in LocalNavigationEventDispatcherOwner. If you intended to create a root dispatcher, explicitly pass null as the parent.");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-336636597, i2, -1, "androidx.navigationevent.compose.rememberNavigationEventDispatcherOwner (RememberNavigationEventDispatcherOwner.kt:65)");
        }
        boolean zChanged = composer.changed(navigationEventDispatcherOwner);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = navigationEventDispatcherOwner != null ? new NavigationEventDispatcher(navigationEventDispatcherOwner.getNavigationEventDispatcher()) : new NavigationEventDispatcher();
            composer.updateRememberedValue(objRememberedValue);
        }
        boolean z2 = true;
        boolean z3 = 1 == ((z ? 1 : 0) | (i3 & 1));
        final NavigationEventDispatcher navigationEventDispatcher = (NavigationEventDispatcher) objRememberedValue;
        Boolean boolValueOf = Boolean.valueOf(z3);
        boolean zChangedInstance = composer.changedInstance(navigationEventDispatcher);
        int i4 = i2 & 14;
        if (((i4 ^ 6) <= 4 || !composer.changed(z3)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean z4 = z2 | zChangedInstance;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = (p) new RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$2$1(navigationEventDispatcher, z3, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.LaunchedEffect(boolValueOf, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue2, composer, i4);
        boolean zChangedInstance2 = composer.changedInstance(navigationEventDispatcher);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new l() { // from class: androidx.navigationevent.compose.RememberNavigationEventDispatcherOwnerKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return RememberNavigationEventDispatcherOwnerKt.rememberNavigationEventDispatcherOwner$lambda$3$0(navigationEventDispatcher, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.DisposableEffect(navigationEventDispatcher, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
        boolean zChanged2 = composer.changed(navigationEventDispatcher);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = new ComposeNavigationEventDispatcherOwner(navigationEventDispatcher);
            composer.updateRememberedValue(objRememberedValue4);
        }
        ComposeNavigationEventDispatcherOwner composeNavigationEventDispatcherOwner = (ComposeNavigationEventDispatcherOwner) objRememberedValue4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return composeNavigationEventDispatcherOwner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult rememberNavigationEventDispatcherOwner$lambda$3$0(final NavigationEventDispatcher navigationEventDispatcher, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.navigationevent.compose.RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$lambda$3$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                navigationEventDispatcher.dispose();
            }
        };
    }
}

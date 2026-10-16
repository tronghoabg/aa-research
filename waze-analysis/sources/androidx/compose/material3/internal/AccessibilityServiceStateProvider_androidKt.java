package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AccessibilityServiceStateProvider_androidKt {
    private static final String SwitchAccessActivityName = "SwitchAccess";
    private static final String VoiceAccessActivityName = "VoiceAccess";

    private static final void ObserveState(final LifecycleOwner lifecycleOwner, final l<? super Lifecycle.Event, ab> lVar, final a<ab> aVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1868327245);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(lifecycleOwner) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (i6 != 0) {
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new l() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$$ExternalSyntheticLambda0
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return AccessibilityServiceStateProvider_androidKt.ObserveState$lambda$0$0((Lifecycle.Event) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                lVar = (l) objRememberedValue;
            }
            if (i7 != 0) {
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new a() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$$ExternalSyntheticLambda1
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return ab.f48028a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                aVar = (a) objRememberedValue2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1868327245, i4, -1, "androidx.compose.material3.internal.ObserveState (AccessibilityServiceStateProvider.android.kt:82)");
            }
            boolean zChangedInstance = ((i4 & 112) == 32) | composerStartRestartGroup.changedInstance(lifecycleOwner);
            boolean z = (i4 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new l() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$$ExternalSyntheticLambda2
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return AccessibilityServiceStateProvider_androidKt.ObserveState$lambda$2$0(lifecycleOwner, lVar, aVar, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i4 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final l<? super Lifecycle.Event, ab> lVar2 = lVar;
        final a<ab> aVar2 = aVar;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return AccessibilityServiceStateProvider_androidKt.ObserveState$lambda$3(lifecycleOwner, lVar2, aVar2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ObserveState$lambda$0$0(Lifecycle.Event event) {
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ObserveState$lambda$2$0(final LifecycleOwner lifecycleOwner, final l lVar, final a aVar, DisposableEffectScope disposableEffectScope) {
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$$ExternalSyntheticLambda6
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                lVar.invoke(event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$ObserveState$lambda$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                aVar.invoke();
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    static final ab ObserveState$lambda$3(LifecycleOwner lifecycleOwner, l lVar, a aVar, int i2, int i3, Composer composer, int i4) {
        ObserveState(lifecycleOwner, lVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.runtime.State<java.lang.Boolean> rememberAccessibilityServiceState(boolean r9, boolean r10, boolean r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(boolean, boolean, boolean, androidx.compose.runtime.Composer, int, int):androidx.compose.runtime.State");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab rememberAccessibilityServiceState$lambda$1$0(Listener listener, AccessibilityManager accessibilityManager, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            listener.register(accessibilityManager);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab rememberAccessibilityServiceState$lambda$2$0(Listener listener, AccessibilityManager accessibilityManager) {
        listener.unregister(accessibilityManager);
        return ab.f48028a;
    }
}

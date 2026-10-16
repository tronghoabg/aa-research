package androidx.activity.compose;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ActivityResultRegistryKt {
    public static final <I, O> ManagedActivityResultLauncher<I, O> rememberLauncherForActivityResult(final ActivityResultContract<I, O> activityResultContract, l<? super O, ab> lVar, Composer composer, int i2) {
        final String str;
        Object obj;
        ActivityResultContract<I, O> activityResultContract2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1408504823, i2, -1, "androidx.activity.compose.rememberLauncherForActivityResult (ActivityResultRegistry.kt:83)");
        }
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(activityResultContract, composer, i2 & 14);
        final State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(lVar, composer, (i2 >> 3) & 14);
        Object[] objArr = new Object[0];
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return ActivityResultRegistryKt.rememberLauncherForActivityResult$lambda$0$0();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        String str2 = (String) RememberSaveableKt.rememberSaveable(objArr, (a) objRememberedValue, composer, 48);
        ActivityResultRegistryOwner current = LocalActivityResultRegistryOwner.INSTANCE.getCurrent(composer, 6);
        if (current == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        final ActivityResultRegistry activityResultRegistry = current.getActivityResultRegistry();
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new ActivityResultLauncherHolder();
            composer.updateRememberedValue(objRememberedValue2);
        }
        final ActivityResultLauncherHolder activityResultLauncherHolder = (ActivityResultLauncherHolder) objRememberedValue2;
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new ManagedActivityResultLauncher(activityResultLauncherHolder, stateRememberUpdatedState);
            composer.updateRememberedValue(objRememberedValue3);
        }
        ManagedActivityResultLauncher<I, O> managedActivityResultLauncher = (ManagedActivityResultLauncher) objRememberedValue3;
        boolean zChangedInstance = composer.changedInstance(activityResultLauncherHolder) | composer.changedInstance(activityResultRegistry) | composer.changed(str2) | composer.changedInstance(activityResultContract) | composer.changed(stateRememberUpdatedState2);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue4 == Composer.Companion.getEmpty()) {
            str = str2;
            obj = new l() { // from class: androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return ActivityResultRegistryKt.rememberLauncherForActivityResult$lambda$4$0(activityResultLauncherHolder, activityResultRegistry, str, activityResultContract, stateRememberUpdatedState2, (DisposableEffectScope) obj2);
                }
            };
            activityResultContract2 = activityResultContract;
            composer.updateRememberedValue(obj);
        } else {
            str = str2;
            obj = objRememberedValue4;
            activityResultContract2 = activityResultContract;
        }
        EffectsKt.DisposableEffect(activityResultRegistry, str, activityResultContract2, (l) obj, composer, (i2 << 6) & DisplayStrings.DS_TAP_TO_VERIFY);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return managedActivityResultLauncher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rememberLauncherForActivityResult$lambda$0$0() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult rememberLauncherForActivityResult$lambda$4$0(final ActivityResultLauncherHolder activityResultLauncherHolder, ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract activityResultContract, final State state, DisposableEffectScope disposableEffectScope) {
        activityResultLauncherHolder.setLauncher(activityResultRegistry.register(str, activityResultContract, new ActivityResultCallback() { // from class: androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResultRegistryKt.rememberLauncherForActivityResult$lambda$4$0$0(state, obj);
            }
        }));
        return new DisposableEffectResult() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$lambda$4$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                activityResultLauncherHolder.unregister();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rememberLauncherForActivityResult$lambda$4$0$0(State state, Object obj) {
        ((l) state.getValue()).invoke(obj);
    }
}

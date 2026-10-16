package androidx.compose.foundation.text;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import h.ab;
import h.g.a.a;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BasicSecureTextField_androidKt {
    private static final String TAG = "BasicSecureTextField";
    private static l<? super Context, ? extends PasswordVisibilitySetting> passwordVisibilitySettingFactory = new l() { // from class: androidx.compose.foundation.text.BasicSecureTextField_androidKt$$ExternalSyntheticLambda2
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return BasicSecureTextField_androidKt.passwordVisibilitySettingFactory$lambda$0((Context) obj);
        }
    };

    public static final l<Context, PasswordVisibilitySetting> getPasswordVisibilitySettingFactory() {
        return passwordVisibilitySettingFactory;
    }

    static final PasswordVisibilitySetting passwordVisibilitySettingFactory$lambda$0(Context context) {
        return Build.VERSION.SDK_INT >= 37 ? new PlatformPasswordVisibilitySettingApi37(context) : new PlatformPasswordVisibilitySettingImpl(context);
    }

    public static final int rememberPlatformPasswordVisibilitySettingsState(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2120768432, i2, -1, "androidx.compose.foundation.text.rememberPlatformPasswordVisibilitySettingsState (BasicSecureTextField.android.kt:135)");
        }
        Object obj = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (PasswordVisibilitySetting) passwordVisibilitySettingFactory.invoke(obj);
            composer.updateRememberedValue(objRememberedValue);
        }
        final PasswordVisibilitySetting passwordVisibilitySetting = (PasswordVisibilitySetting) objRememberedValue;
        boolean zChanged2 = composer.changed(passwordVisibilitySetting);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SplitVisibilitySettings.m3363boximpl(SplitVisibilitySettings.m3365constructorimpl(passwordVisibilitySetting.shouldShowTouchInput(), passwordVisibilitySetting.shouldShowPhysicalInput())), null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        final MutableState mutableState = (MutableState) objRememberedValue2;
        boolean zChangedInstance = composer.changedInstance(passwordVisibilitySetting) | composer.changed(mutableState);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new l() { // from class: androidx.compose.foundation.text.BasicSecureTextField_androidKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return BasicSecureTextField_androidKt.rememberPlatformPasswordVisibilitySettingsState$lambda$4$0(passwordVisibilitySetting, mutableState, (DisposableEffectScope) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.DisposableEffect(passwordVisibilitySetting, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
        int iRememberPlatformPasswordVisibilitySettingsState$lambda$2 = rememberPlatformPasswordVisibilitySettingsState$lambda$2(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iRememberPlatformPasswordVisibilitySettingsState$lambda$2;
    }

    private static final int rememberPlatformPasswordVisibilitySettingsState$lambda$2(MutableState<SplitVisibilitySettings> mutableState) {
        return mutableState.getValue().m3372unboximpl();
    }

    private static final void rememberPlatformPasswordVisibilitySettingsState$lambda$3(MutableState<SplitVisibilitySettings> mutableState, int i2) {
        mutableState.setValue(SplitVisibilitySettings.m3363boximpl(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult rememberPlatformPasswordVisibilitySettingsState$lambda$4$0(final PasswordVisibilitySetting passwordVisibilitySetting, final MutableState mutableState, DisposableEffectScope disposableEffectScope) {
        final Runnable runnableRegisterObserver = passwordVisibilitySetting.registerObserver(new a() { // from class: androidx.compose.foundation.text.BasicSecureTextField_androidKt$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return BasicSecureTextField_androidKt.rememberPlatformPasswordVisibilitySettingsState$lambda$4$0$0(passwordVisibilitySetting, mutableState);
            }
        });
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicSecureTextField_androidKt$rememberPlatformPasswordVisibilitySettingsState$lambda$4$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                runnableRegisterObserver.run();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab rememberPlatformPasswordVisibilitySettingsState$lambda$4$0$0(PasswordVisibilitySetting passwordVisibilitySetting, MutableState mutableState) {
        rememberPlatformPasswordVisibilitySettingsState$lambda$3(mutableState, SplitVisibilitySettings.m3365constructorimpl(passwordVisibilitySetting.shouldShowTouchInput(), passwordVisibilitySetting.shouldShowPhysicalInput()));
        return ab.f48028a;
    }

    public static final void resetPasswordVisibilitySettingFactory() {
        passwordVisibilitySettingFactory = new l() { // from class: androidx.compose.foundation.text.BasicSecureTextField_androidKt$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BasicSecureTextField_androidKt.resetPasswordVisibilitySettingFactory$lambda$0((Context) obj);
            }
        };
    }

    static final PlatformPasswordVisibilitySettingImpl resetPasswordVisibilitySettingFactory$lambda$0(Context context) {
        return Build.VERSION.SDK_INT >= 37 ? new PlatformPasswordVisibilitySettingApi37(context) : new PlatformPasswordVisibilitySettingImpl(context);
    }

    public static final void setPasswordVisibilitySettingFactory(l<? super Context, ? extends PasswordVisibilitySetting> lVar) {
        passwordVisibilitySettingFactory = lVar;
    }

    public static /* synthetic */ void getPasswordVisibilitySettingFactory$annotations() {
    }
}

package androidx.compose.foundation.text;

import android.content.Context;
import android.text.ShowSecretsSetting;
import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PlatformPasswordVisibilitySettingApi37 extends PlatformPasswordVisibilitySettingImpl {
    public PlatformPasswordVisibilitySettingApi37(Context context) {
        super(context);
    }

    @Override // androidx.compose.foundation.text.PlatformPasswordVisibilitySettingImpl, androidx.compose.foundation.text.PasswordVisibilitySetting
    public Runnable registerObserver(final a<ab> aVar) {
        return ShowSecretsSetting.registerCallback(getContext(), new Runnable() { // from class: androidx.compose.foundation.text.PlatformPasswordVisibilitySettingApi37$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.invoke();
            }
        });
    }

    @Override // androidx.compose.foundation.text.PlatformPasswordVisibilitySettingImpl, androidx.compose.foundation.text.PasswordVisibilitySetting
    public boolean shouldShowPhysicalInput() {
        return ShowSecretsSetting.shouldShowPhysicalInput(getContext());
    }

    @Override // androidx.compose.foundation.text.PlatformPasswordVisibilitySettingImpl, androidx.compose.foundation.text.PasswordVisibilitySetting
    public boolean shouldShowTouchInput() {
        return ShowSecretsSetting.shouldShowTouchInput(getContext());
    }
}

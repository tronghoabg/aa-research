package androidx.biometric.internal;

import android.hardware.biometrics.BiometricPrompt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Api29Impl {
    public static final Api29Impl INSTANCE = new Api29Impl();

    private Api29Impl() {
    }

    public final void setConfirmationRequired(BiometricPrompt.Builder builder, boolean z) {
        x.f(builder, "builder");
        builder.setConfirmationRequired(z);
    }

    public final void setDeviceCredentialAllowed(BiometricPrompt.Builder builder, boolean z) {
        x.f(builder, "builder");
        builder.setDeviceCredentialAllowed(z);
    }
}

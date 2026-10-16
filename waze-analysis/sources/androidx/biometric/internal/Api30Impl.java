package androidx.biometric.internal;

import android.hardware.biometrics.BiometricPrompt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Api30Impl {
    public static final Api30Impl INSTANCE = new Api30Impl();

    private Api30Impl() {
    }

    public final void setAllowedAuthenticators(BiometricPrompt.Builder builder, int i2) {
        x.f(builder, "builder");
        builder.setAllowedAuthenticators(i2);
    }
}

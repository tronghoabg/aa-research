package androidx.biometric.internal;

import android.util.Log;
import androidx.biometric.BiometricPrompt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DefaultClientAuthenticationCallback extends BiometricPrompt.AuthenticationCallback {
    private final void logClientCallbackNullError() {
        Log.e("AuthenticationHandler", "Callbacks are not re-registered when the caller's activity/fragment is recreated!");
    }

    @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationError(int i2, CharSequence charSequence) {
        x.f(charSequence, "errString");
        logClientCallbackNullError();
    }

    @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationFailed() {
        logClientCallbackNullError();
    }

    @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        x.f(authenticationResult, "result");
        logClientCallbackNullError();
    }
}

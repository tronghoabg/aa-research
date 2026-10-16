package androidx.biometric.internal;

import android.content.Context;
import android.os.Build;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.utils.AuthenticatorUtils;
import androidx.biometric.utils.PackageUtils;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DefaultAuthenticationHandlerKt {
    private static final boolean hasFace(Context context) {
        return PackageUtils.hasSystemFeatureFace(context);
    }

    public static final boolean hasFingerprint(Context context) {
        return PackageUtils.hasSystemFeatureFingerprint(context);
    }

    private static final boolean hasIris(Context context) {
        return PackageUtils.hasSystemFeatureIris(context);
    }

    private static final boolean isFingerprintDialogNeededForCrypto(Context context, BiometricPrompt.CryptoObject cryptoObject) {
        return false;
    }

    private static final boolean isFingerprintDialogNeededForErrorHandling(Context context) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isKeyguardManagerNeededForBiometricAndCredential(int i2) {
        return Build.VERSION.SDK_INT == 29 && AuthenticatorUtils.isWeakBiometricAllowed(i2) && AuthenticatorUtils.isDeviceCredentialAllowed(i2);
    }

    public static final boolean isKeyguardManagerNeededForNoBiometric(Context context, int i2) {
        x.f(context, "<this>");
        if (Build.VERSION.SDK_INT == 29 && !hasFingerprint(context) && !hasFace(context) && !hasIris(context)) {
            return true;
        }
        isManagingDeviceCredentialButton(context, i2);
        return false;
    }

    public static final boolean isManagingDeviceCredentialButton(Context context, int i2) {
        x.f(context, "<this>");
        return false;
    }

    public static final boolean isUsingFingerprintDialog(Context context, BiometricPrompt.CryptoObject cryptoObject) {
        x.f(context, "<this>");
        return false;
    }
}

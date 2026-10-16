package androidx.biometric.utils;

import android.os.Build;
import androidx.biometric.BiometricPrompt;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class AuthenticatorUtils {
    private static final int BIOMETRIC_CLASS_MASK = 32767;

    private AuthenticatorUtils() {
    }

    public static String convertToString(int i2) {
        int i3 = (-65537) & i2;
        String strValueOf = i3 != 15 ? i3 != 255 ? i3 != 32768 ? i3 != 32783 ? i3 != 33023 ? String.valueOf(i2) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG";
        if ((i2 & 65536) != 65536) {
            return strValueOf;
        }
        if (i2 != 65536) {
            strValueOf = String.valueOf(strValueOf).concat(" | ");
        }
        return String.valueOf(strValueOf).concat("IDENTITY_CHECK");
    }

    public static int getBiometricAuthenticators(int i2) {
        return i2 & 32767;
    }

    public static int getConsolidatedAuthenticators(BiometricPrompt.PromptInfo promptInfo, BiometricPrompt.CryptoObject cryptoObject, boolean z) {
        if (promptInfo == null) {
            return 0;
        }
        int allowedAuthenticators = promptInfo.getAllowedAuthenticators();
        if ((allowedAuthenticators & 65536) == 65536 && !z) {
            allowedAuthenticators &= -65537;
        }
        if (allowedAuthenticators != 0) {
            return allowedAuthenticators;
        }
        int i2 = cryptoObject != null ? 15 : 255;
        return promptInfo.isDeviceCredentialAllowed() ? 32768 | i2 : i2;
    }

    public static boolean isAtLeastStrength(int i2, int i3) {
        int i4 = i2 & 32767;
        if (((~i3) & i4) == 0) {
            for (int i5 = 1; i5 <= i3; i5 = (i5 + i5) | 1) {
                if (i5 == i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDeviceCredentialAllowed(int i2) {
        return (i2 & 32768) != 0;
    }

    public static boolean isSomeBiometricAllowed(int i2) {
        return getBiometricAuthenticators(i2) != 0;
    }

    public static boolean isSupportedCombination(int i2) {
        int i3 = i2 & (-65537);
        if (i3 != 15 && i3 != 255) {
            return i3 != 32768 ? i3 != 32783 ? i3 == 33023 || i3 == 0 : Build.VERSION.SDK_INT > 29 : Build.VERSION.SDK_INT >= 30;
        }
        return true;
    }

    public static boolean isWeakBiometricAllowed(int i2) {
        return (i2 & 255) == 255;
    }
}

package androidx.biometric.utils;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class DeviceUtils {
    private DeviceUtils() {
    }

    public static boolean canAssumeStrongBiometrics(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return isModelInList(context, str, R.array.assume_strong_biometrics_models);
    }

    private static boolean isModelInList(Context context, String str, int i2) throws Resources.NotFoundException {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i2)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isModelInPrefixList(Context context, String str, int i2) throws Resources.NotFoundException {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i2)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isVendorInList(Context context, String str, int i2) throws Resources.NotFoundException {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i2)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWearOS(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static boolean shouldDelayShowingPrompt(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return isModelInList(context, str, R.array.delay_showing_prompt_models);
    }

    public static boolean shouldHideFingerprintDialog(Context context, String str) {
        return false;
    }

    public static boolean shouldUseFingerprintForCrypto(Context context, String str, String str2) {
        return false;
    }
}

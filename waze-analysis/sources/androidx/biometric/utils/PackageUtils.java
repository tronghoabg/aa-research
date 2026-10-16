package androidx.biometric.utils;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class PackageUtils {

    /* compiled from: WazeSource */
    class Api29Impl {
        private Api29Impl() {
        }

        static boolean hasSystemFeatureFace(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.biometrics.face");
        }

        static boolean hasSystemFeatureIris(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.biometrics.iris");
        }
    }

    private PackageUtils() {
    }

    public static boolean hasSystemFeatureFace(Context context) {
        return (context == null || context.getPackageManager() == null || !Api29Impl.hasSystemFeatureFace(context.getPackageManager())) ? false : true;
    }

    public static boolean hasSystemFeatureFingerprint(Context context) {
        return (context == null || context.getPackageManager() == null || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) ? false : true;
    }

    public static boolean hasSystemFeatureIris(Context context) {
        return (context == null || context.getPackageManager() == null || !Api29Impl.hasSystemFeatureIris(context.getPackageManager())) ? false : true;
    }
}

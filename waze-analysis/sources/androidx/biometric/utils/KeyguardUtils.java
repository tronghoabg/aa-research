package androidx.biometric.utils;

import android.app.KeyguardManager;
import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class KeyguardUtils {
    private KeyguardUtils() {
    }

    public static KeyguardManager getKeyguardManager(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean isDeviceSecuredWithCredential(Context context) {
        KeyguardManager keyguardManager = getKeyguardManager(context);
        if (keyguardManager == null) {
            return false;
        }
        return keyguardManager.isDeviceSecure();
    }
}

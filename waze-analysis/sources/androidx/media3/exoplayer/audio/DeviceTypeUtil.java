package androidx.media3.exoplayer.audio;

import android.os.Build;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class DeviceTypeUtil {
    private DeviceTypeUtil() {
    }

    public static boolean isBluetoothDevice(int i2) {
        if (i2 == 8 || i2 == 7) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 31 || !(i2 == 26 || i2 == 27)) {
            return Build.VERSION.SDK_INT >= 33 && i2 == 30;
        }
        return true;
    }

    public static boolean isBuiltInEarpiece(int i2) {
        return i2 == 1;
    }

    public static boolean isBuiltInSpeaker(int i2) {
        return i2 == 2;
    }

    public static boolean isHdmiArc(int i2) {
        return i2 == 10;
    }

    public static boolean isHdmiEarc(int i2) {
        return Build.VERSION.SDK_INT >= 31 && i2 == 29;
    }

    public static boolean isUsbDevice(int i2) {
        if (i2 == 11 || i2 == 12) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 31 && i2 == 22;
    }
}

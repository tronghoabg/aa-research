package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.carstream.tech.car.CarScreen;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class sb {
    public static PowerManager.WakeLock a;

    static {
        new Handler(Looper.getMainLooper());
    }

    public static void a(CarScreen carScreen, boolean z) {
        PowerManager powerManager;
        try {
            if (!z) {
                PowerManager.WakeLock wakeLock = a;
                if (wakeLock != null && wakeLock.isHeld()) {
                    a.release();
                }
                a = null;
                return;
            }
            PowerManager.WakeLock wakeLock2 = a;
            if ((wakeLock2 == null || !wakeLock2.isHeld()) && (powerManager = (PowerManager) carScreen.getSystemService("power")) != null) {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(536870918, "carstream:chieu");
                a = wakeLockNewWakeLock;
                wakeLockNewWakeLock.acquire(14400000L);
            }
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }
}

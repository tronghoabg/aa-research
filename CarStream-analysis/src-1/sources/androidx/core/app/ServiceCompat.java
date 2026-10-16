package androidx.core.app;

import android.app.Service;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ServiceCompat {
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface StopForegroundFlags {
    }

    private ServiceCompat() {
    }

    public static void stopForeground(Service service, int i) {
        service.stopForeground(i);
    }
}

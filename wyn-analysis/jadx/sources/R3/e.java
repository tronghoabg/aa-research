package R3;

import J3.r;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public abstract class e {
    public static void a(Service service, int i5, Notification notification, int i10) {
        try {
            service.startForeground(i5, notification, i10);
        } catch (ForegroundServiceStartNotAllowedException e7) {
            r rVarD = r.d();
            String str = SystemForegroundService.f19084f;
            if (rVarD.f5584a <= 5) {
                Log.w(str, "Unable to start foreground service", e7);
            }
        }
    }
}

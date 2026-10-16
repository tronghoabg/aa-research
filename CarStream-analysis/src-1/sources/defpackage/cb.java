package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class cb {
    public static HandlerThread a = null;
    public static volatile long b = 0;
    public static Handler c = null;
    public static volatile int d = -1;
    public static final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public static final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public static volatile Location g;
    public static LocationManager h;
    public static ab i;

    public static void a(Context context, h2 h2Var) {
        if (h2Var != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = e;
            if (copyOnWriteArrayList.contains(h2Var)) {
                return;
            }
            copyOnWriteArrayList.add(h2Var);
            h2Var.a(d);
            c(context.getApplicationContext());
        }
    }

    public static boolean b(Context context) {
        return context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public static void c(Context context) {
        if (i == null && b(context)) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            h = locationManager;
            if (locationManager == null) {
                return;
            }
            i = new ab();
            if (a == null) {
                HandlerThread handlerThread = new HandlerThread("cnt-gps");
                a = handlerThread;
                handlerThread.start();
            }
            try {
                h.requestLocationUpdates("gps", 1000L, 0.0f, i, a.getLooper());
                b = System.currentTimeMillis();
                Context applicationContext = context.getApplicationContext();
                if (c != null) {
                    return;
                }
                Handler handler = new Handler(Looper.getMainLooper());
                c = handler;
                handler.postDelayed(new v(applicationContext, 3), 10000L);
            } catch (Throwable th) {
                String.valueOf(th);
                i = null;
            }
        }
    }
}

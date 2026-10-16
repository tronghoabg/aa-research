package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class dc {
    public static volatile boolean k;
    public static volatile int l;
    public static dc m;
    public final Context a;
    public final ac b;
    public volatile boolean e;
    public volatile long f;
    public float g;
    public long h;
    public Location i;
    public final ExecutorService c = Executors.newSingleThreadExecutor();
    public final Handler d = new Handler(Looper.getMainLooper());
    public final bc j = new bc(this);

    public dc(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        ac acVar = new ac(applicationContext);
        File file = new File(applicationContext.getCacheDir(), "cnt_tiles");
        acVar.c = file;
        try {
            file.mkdirs();
        } catch (Throwable unused) {
        }
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (int i = 0; i < fileArrListFiles.length; i++) {
                    String name = fileArrListFiles[i].getName();
                    if (name.endsWith(".bin") || name.endsWith(".tmp")) {
                        fileArrListFiles[i].delete();
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        acVar.f = Math.max(0L, 21600000L);
        this.b = acVar;
    }

    public static synchronized void a(Context context) {
        ab abVar;
        try {
            if ("carstream".equals(xc.g(context, "vietmapSource", "widget"))) {
                if (m == null) {
                    m = new dc(context);
                }
                m.b();
            } else {
                dc dcVar = m;
                if (dcVar != null && k) {
                    k = false;
                    bc bcVar = dcVar.j;
                    CopyOnWriteArrayList copyOnWriteArrayList = cb.f;
                    copyOnWriteArrayList.remove(bcVar);
                    if (cb.e.isEmpty() && copyOnWriteArrayList.isEmpty()) {
                        LocationManager locationManager = cb.h;
                        if (locationManager != null && (abVar = cb.i) != null) {
                            try {
                                locationManager.removeUpdates(abVar);
                            } catch (Throwable unused) {
                            }
                        }
                        cb.i = null;
                    }
                    ac acVar = dcVar.b;
                    synchronized (acVar.b) {
                        acVar.b.clear();
                    }
                }
            }
        } finally {
        }
    }

    public static void c(int i) {
        int i2 = w7.a;
        w7.c(null, i);
    }

    public final void b() {
        if (!k && cb.b(this.a)) {
            k = true;
            this.e = false;
            l = 0;
            ac acVar = this.b;
            acVar.h = -1;
            acVar.i = -1;
            this.g = 0.0f;
            this.h = 0L;
            this.i = null;
            Context context = this.a;
            bc bcVar = this.j;
            if (bcVar != null) {
                CopyOnWriteArrayList copyOnWriteArrayList = cb.f;
                if (copyOnWriteArrayList.contains(bcVar)) {
                    return;
                }
                copyOnWriteArrayList.add(bcVar);
                Location location = cb.g;
                if (location != null) {
                    try {
                        bcVar.onLocation(location);
                    } catch (Exception unused) {
                    }
                }
                cb.c(context.getApplicationContext());
            }
        }
    }
}

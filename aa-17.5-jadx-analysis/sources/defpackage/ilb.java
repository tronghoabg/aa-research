package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Process;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ilb {
    private static final yph a = yph.c("CAR.SERVICE");
    private static final AtomicBoolean b = new AtomicBoolean();

    public static int a(Context context, String str) {
        AtomicBoolean atomicBoolean = b;
        boolean z = true;
        if (atomicBoolean.get() && !ila.b) {
            z = false;
        }
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 235)).y("Compare pid: %b", Boolean.valueOf(z));
        ((ype) yphVar.l().ai(236)).B("Calling pid: %d\nProcess pid: %d", Binder.getCallingPid(), Process.myPid());
        if (z && Binder.getCallingPid() == Process.myPid()) {
            ((ype) ((ype) yphVar.h()).ai((char) 237)).u("Caller is self, permission denied");
            return -1;
        }
        if (atomicBoolean.get()) {
            HashMap map = ila.a;
            if (map.containsKey(str)) {
                return ((Integer) map.get(str)).intValue();
            }
            return 0;
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        ((ype) yphVar.l().ai((char) 231)).y("Checking permission: %s", str);
        if (packagesForUid == null || packagesForUid.length <= 0) {
            ((ype) ((ype) yphVar.h()).ai((char) 232)).u("No package with that UID, denied!");
            return -1;
        }
        ((ype) yphVar.l().ai((char) 233)).y("All packages: %s", Arrays.toString(packagesForUid));
        ((ype) yphVar.l().ai(234)).U("calling pid: %d, calling uid: %d, process pid: %d, process uid: %d, package name: %s, permission: %s", Integer.valueOf(Binder.getCallingPid()), Integer.valueOf(Binder.getCallingUid()), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myUid()), packagesForUid[0], str);
        return dln.o(context, str, Binder.getCallingPid(), Binder.getCallingUid(), packagesForUid[0]);
    }

    public static File b(Context context) {
        File file = new File(context.getExternalFilesDir(null), "auto");
        if (file.exists() || file.mkdir()) {
            return file;
        }
        ((ype) ((ype) a.h()).ai((char) 238)).u("Failed to create auto-specific file dir");
        return null;
    }

    public static String c(Context context) {
        try {
            if (!b.get()) {
                return qtr.b(context, skn.a(context).b(context.getPackageName()));
            }
            HashMap map = ila.a;
            return qtr.b(context, skn.a(context).b(context.getPackageName()));
        } catch (IllegalStateException | SecurityException unused) {
            return "";
        }
    }

    public static void d() {
        if (b.get()) {
            HashMap map = ila.a;
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("expecting main thread");
        }
    }

    public static void e() {
        if (b.get()) {
            HashMap map = ila.a;
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("unexpected main thread");
        }
    }
}

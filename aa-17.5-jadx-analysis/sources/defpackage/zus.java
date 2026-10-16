package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.DropBoxManager;
import android.os.Looper;
import android.util.Log;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zus {
    private static final ThreadLocal b = new ThreadLocal();
    public static volatile Context a = null;

    public static void a(Throwable th) {
        b(a, th, null, zur.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    static void b(Context context, Throwable th, zrz zrzVar, zur zurVar) {
        ?? r18;
        if (context == null) {
            if (zrn.e("CrashUtils", 6)) {
                Log.e("CrashUtils", "Unable to log crashes prior to environment initialisation.", th);
                return;
            }
            return;
        }
        if (addj.a.gu().b()) {
            ThreadLocal threadLocal = b;
            Throwable th2 = (Throwable) threadLocal.get();
            if (th == th2) {
                return;
            }
            if (th2 != null && th.getCause() == th2) {
                return;
            } else {
                threadLocal.set(th);
            }
        }
        if (th instanceof zsc) {
            tnd.b(context.getFilesDir().getAbsolutePath(), "_google_maps_sdk_developer_exception_");
            return;
        }
        tnd.b(context.getFilesDir().getAbsolutePath(), "_google_maps_sdk_crash_");
        tnb.a.set((int) addj.b());
        tnb.a(context);
        if (th instanceof SecurityException) {
            if (zrn.e("CrashUtils", 6)) {
                Log.e("CrashUtils", "Ignoring missing-permissions-caused SecurityException.", th);
                return;
            }
            return;
        }
        if (th instanceof RuntimeRemoteException) {
            if (zrn.e("CrashUtils", 6)) {
                Log.e("CrashUtils", "Ignoring externally-caused RemoteException.", th);
                return;
            }
            return;
        }
        if (zrzVar != null && Looper.getMainLooper() != Looper.myLooper()) {
            if (zrn.e("CrashUtils", 6)) {
                Log.e("CrashUtils", "Ignoring crash because it shouldn't be running off the UI Thread.", th);
                return;
            }
            return;
        }
        if (zrn.e("CrashUtils", 6)) {
            Log.e("CrashUtils", "addAndReportErrorToCrashReport()", th);
        }
        if (zurVar.b == null) {
            zurVar.b = (DropBoxManager) context.getApplicationContext().getSystemService("dropbox");
        }
        DropBoxManager dropBoxManager = zurVar.b;
        if (dropBoxManager == null || !dropBoxManager.isTagEnabled("system_app_crash")) {
            return;
        }
        DropBoxManager dropBoxManager2 = zurVar.b;
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.US;
        String packageName = context.getPackageName();
        boolean z = false;
        List listI = xxx.c('.').i((String) xxx.c('-').i("3.4.0").get(0));
        long j = -1;
        if (listI.size() != 3) {
            r18 = z;
        } else {
            try {
                long j2 = 0;
                while (listI.iterator().hasNext()) {
                    j2 = (j2 * 100) + Integer.parseInt((String) r7.next());
                    z = z;
                }
                r18 = z;
                j = j2;
            } catch (NumberFormatException unused) {
            }
        }
        Long lValueOf = Long.valueOf(j);
        String stackTraceString = Log.getStackTraceString(th);
        Object[] objArr = new Object[6];
        objArr[r18] = packageName;
        objArr[1] = "com.google.android.libraries.maps";
        objArr[2] = lValueOf;
        objArr[3] = "3.4.0";
        objArr[4] = Build.FINGERPRINT;
        objArr[5] = stackTraceString;
        sb.append(String.format(locale, "Process: %s\nPackage: %s v%d (%s)\nBuild: %s\n\n%s", objArr));
        dropBoxManager2.addText("system_app_crash", sb.toString());
    }

    public static void c(Throwable th) {
        if (zrn.e("CrashUtils", 6)) {
            Log.e("CrashUtils", "addAndReportErrorToCrashReport()", th);
        }
        b(a, th, zrz.c, zur.a);
    }
}

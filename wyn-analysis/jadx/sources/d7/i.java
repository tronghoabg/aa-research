package d7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.applovin.shadow.okio.Segment;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p7.C3773c;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f34132b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f34133c = false;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f34135e = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f34131a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f34134d = new AtomicBoolean();

    public static void a(Context context, int i5) throws g, h {
        f fVar = f.f34129b;
        int iD = fVar.d(context, i5);
        if (iD != 0) {
            Intent intentB = fVar.b(context, iD, "e");
            StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 46);
            sb2.append("GooglePlayServices not available due to error ");
            sb2.append(iD);
            Log.e("GooglePlayServicesUtil", sb2.toString());
            if (intentB != null) {
                throw new h(iD, intentB, "Google Play Services not available");
            }
            throw new g();
        }
    }

    public static boolean b(Context context) {
        try {
            if (!f34133c) {
                try {
                    PackageInfo packageInfoC = C3773c.a(context).c(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                    j.b(context);
                    if (packageInfoC == null || j.f(packageInfoC, false) || !j.f(packageInfoC, true)) {
                        f34132b = false;
                    } else {
                        f34132b = true;
                    }
                    f34133c = true;
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e7);
                    f34133c = true;
                }
            }
            return f34132b || !"user".equals(Build.TYPE);
        } catch (Throwable th) {
            f34133c = true;
            throw th;
        }
    }

    public static boolean c(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", Segment.SIZE).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}

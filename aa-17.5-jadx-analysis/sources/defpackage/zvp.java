package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import android.widget.Toast;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zvp {
    public static final /* synthetic */ int a = 0;
    private static boolean b = false;
    private static final ExecutorService c;

    static {
        ExecutorService executorService = zrz.a;
        c = zrz.a;
    }

    public static synchronized void a(gjt gjtVar, aabc aabcVar) {
        if (!b) {
            b = true;
            Object obj = gjtVar.a;
            Object obj2 = aabcVar.j;
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = ((Context) obj).getPackageManager();
            String[] strArr = zyx.b;
            int length = strArr.length;
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                try {
                    packageManager.getPermissionInfo(str, 128);
                    if (((Context) obj).checkCallingOrSelfPermission(str) != 0) {
                        arrayList.add(str);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    String str2 = zyx.a;
                    if (zrn.e(str2, 6)) {
                        Log.e(str2, a.bq(str, "Permission \"", "\" has not been found on the system. If this occurs on an emulator, you can probably ignore this error."));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                StringBuilder sb = new StringBuilder("The Maps SDK for Android requires the additional following permissions to be set in  the AndroidManifest.xml to ensure a correct behavior:");
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append("\n<uses-permission android:name=\"" + ((String) arrayList.get(i2)) + "\"/>");
                }
                throw new SecurityException(sb.toString());
            }
            if (zrs.b() || zrs.c((Context) obj)) {
                try {
                    ((Context) obj).getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    c.execute(new zte(aabcVar, 7));
                } catch (PackageManager.NameNotFoundException unused2) {
                    zrn.b("Google Play services is not present on this device.");
                }
            } else {
                zrn.b("Google Maps SDK for Android only supports devices with OpenGL ES 2.0 and above");
            }
            zrg.a.b((Context) obj, ((Context) obj).getPackageName());
            if (((zyb) aabcVar.h).g) {
                Toast.makeText((Context) gjtVar.a, gjtVar.F(R.string.maps_API_OUTDATED_WARNING), 1).show();
            }
        }
    }
}

package ya;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.C1725n;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1725n f48043a = new C1725n("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e7) {
            String strConcat = "Exception thrown when trying to get app version ".concat(e7.toString());
            C1725n c1725n = f48043a;
            if (!Log.isLoggable(c1725n.f26676a, 6)) {
                return "";
            }
            String str = c1725n.f26677b;
            if (str != null) {
                strConcat = str.concat(strConcat);
            }
            Log.e("CommonUtils", strConcat);
            return "";
        }
    }
}

package androidx.car.app;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.car.app.utils.LogTags;
import defpackage.ad;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class CarAppPermission {
    public static final String ACCESS_SURFACE = "androidx.car.app.ACCESS_SURFACE";
    public static final String MAP_TEMPLATES = "androidx.car.app.MAP_TEMPLATES";
    public static final String NAVIGATION_TEMPLATES = "androidx.car.app.NAVIGATION_TEMPLATES";

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface LibraryPermission {
    }

    private CarAppPermission() {
    }

    public static void checkHasLibraryPermission(Context context, String str) throws PackageManager.NameNotFoundException {
        Log.isLoggable(LogTags.TAG, 3);
        try {
            try {
                checkHasPermission(context, str);
            } catch (SecurityException unused) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    for (String str2 : packageInfo.requestedPermissions) {
                        if (str2.equals(str)) {
                            return;
                        }
                    }
                }
                throw new SecurityException(ad.g("The car app does not have a required permission: ", str));
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            context.getPackageName();
            throw new SecurityException(ad.g("The car app does not have a required permission: ", str));
        }
    }

    public static void checkHasPermission(Context context, String str) {
        if (context.getPackageManager().checkPermission(str, context.getPackageName()) != 0) {
            throw new SecurityException(ad.g("The car app does not have the required permission: ", str));
        }
    }
}

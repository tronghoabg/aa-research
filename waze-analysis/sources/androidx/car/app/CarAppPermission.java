package androidx.car.app;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.car.app.utils.LogTags;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CarAppPermission {
    public static final String ACCESS_SURFACE = "androidx.car.app.ACCESS_SURFACE";
    public static final String MAP_TEMPLATES = "androidx.car.app.MAP_TEMPLATES";
    public static final String MEDIA_TEMPLATES = "androidx.car.app.MEDIA_TEMPLATES";
    public static final String NAVIGATION_TEMPLATES = "androidx.car.app.NAVIGATION_TEMPLATES";

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface LibraryPermission {
    }

    private CarAppPermission() {
    }

    public static void checkHasLibraryPermission(Context context, String str) throws PackageManager.NameNotFoundException {
        if (Log.isLoggable(LogTags.TAG, 3)) {
            Log.d(LogTags.TAG, "Checking to see if the car app requested the required library permission: ".concat(String.valueOf(str)));
        }
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
                throw new SecurityException("The car app does not have a required permission: ".concat(String.valueOf(str)));
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(LogTags.TAG, "Package name not found on the system: ".concat(String.valueOf(context.getPackageName())), e2);
            throw new SecurityException("The car app does not have a required permission: ".concat(String.valueOf(str)));
        }
    }

    public static void checkHasPermission(Context context, String str) {
        if (context.getPackageManager().checkPermission(str, context.getPackageName()) != 0) {
            throw new SecurityException("The car app does not have the required permission: ".concat(String.valueOf(str)));
        }
    }
}

package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.UserManager;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class qcs {
    private static boolean a = false;
    private static boolean b = false;

    public static boolean a(Context context) {
        if (!a) {
            UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
            a = true;
            if (Build.VERSION.SDK_INT >= 30) {
                b = userManager.isManagedProfile();
            } else if (userManager.getUserProfiles().size() < 2) {
                b = false;
                a = false;
            } else {
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService(DevicePolicyManager.class);
                PackageManager packageManager = context.getPackageManager();
                b = false;
                Iterator<PackageInfo> it = packageManager.getInstalledPackages(0).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (devicePolicyManager.isProfileOwnerApp(it.next().packageName)) {
                        b = true;
                        break;
                    }
                }
            }
        }
        return b;
    }
}

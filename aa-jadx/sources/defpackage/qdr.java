package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qdr {
    private static boolean a = false;
    private static boolean b = false;

    public static boolean a(android.content.Context context) {
        if (!a) {
            android.os.UserManager userManager = (android.os.UserManager) context.getSystemService(android.os.UserManager.class);
            a = true;
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                b = userManager.isManagedProfile();
            } else if (userManager.getUserProfiles().size() < 2) {
                b = false;
                a = false;
            } else {
                android.app.admin.DevicePolicyManager devicePolicyManager = (android.app.admin.DevicePolicyManager) context.getSystemService(android.app.admin.DevicePolicyManager.class);
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                b = false;
                java.util.Iterator<android.content.pm.PackageInfo> it = packageManager.getInstalledPackages(0).iterator();
                while (it.hasNext()) {
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

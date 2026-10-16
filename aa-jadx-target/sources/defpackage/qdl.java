package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qdl {
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;

    public final boolean a(android.content.Context context) {
        if (!this.a) {
            try {
                android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo == null || packageInfo.requestedPermissions == null) {
                    this.a = true;
                } else {
                    for (java.lang.String str : packageInfo.requestedPermissions) {
                        if (str.equals("android.permission.INTERACT_ACROSS_PROFILES")) {
                            this.b = true;
                        } else if (str.equals("android.permission.INTERACT_ACROSS_USERS")) {
                            this.c = true;
                        } else if (str.equals("android.permission.INTERACT_ACROSS_USERS_FULL")) {
                            this.d = true;
                        }
                    }
                    this.a = true;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.e("AbstractProfileBinder", "Could not find package.", e);
                this.b = false;
                this.c = false;
                this.d = false;
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && this.b && bgp$.ExternalSyntheticApiModelOutline0.m$1(jx$.ExternalSyntheticApiModelOutline3.m(context.getSystemService(jx$.ExternalSyntheticApiModelOutline3.m$1())))) {
            return true;
        }
        if (this.d && context.checkSelfPermission("android.permission.INTERACT_ACROSS_USERS_FULL") == 0) {
            return true;
        }
        return this.c && context.checkSelfPermission("android.permission.INTERACT_ACROSS_USERS") == 0;
    }
}

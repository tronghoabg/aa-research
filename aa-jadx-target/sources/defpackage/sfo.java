package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class sfo {
    private static final defpackage.yqk e = defpackage.omv.n("CAR.SETUP");
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;
    public final boolean d;

    public sfo(java.lang.String str, boolean z) {
        java.lang.String[] strArrSplit = str.split(":", 3);
        int iIntValue = 0;
        this.a = strArrSplit[0];
        if (strArrSplit.length >= 2) {
            try {
                iIntValue = java.lang.Integer.decode(strArrSplit[1]).intValue();
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.c = iIntValue;
        this.b = strArrSplit.length == 3 ? strArrSplit[2] : null;
        this.d = z;
    }

    public int a(android.content.Context context) {
        android.content.pm.PackageInfo packageInfoB = b(context, this.a);
        if (packageInfoB == null) {
            return this.d ? 3 : 1;
        }
        return e(packageInfoB) ? 1 : 2;
    }

    protected final android.content.pm.PackageInfo b(android.content.Context context, java.lang.String str) {
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            e.l().ai(8871).R("Package %s: installed ver=%d minimum required ver=%d", str, java.lang.Integer.valueOf(packageInfo.versionCode), java.lang.Integer.valueOf(this.c));
            return packageInfo;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            e.l().ai(8872).y("Package %s not found.", str);
            return null;
        }
    }

    public final boolean c(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            java.lang.String str = this.a;
            int applicationEnabledSetting = packageManager.getApplicationEnabledSetting(str);
            e.l().ai(8873).K("Package %s: appEnabledSetting=%d", str, applicationEnabledSetting);
            return applicationEnabledSetting == 3;
        } catch (java.lang.IllegalArgumentException unused) {
            e.l().ai(8874).y("Package %s not found.", this.a);
            return false;
        }
    }

    public final boolean d(android.content.Context context) {
        return a(context) == 1;
    }

    protected final boolean e(android.content.pm.PackageInfo packageInfo) {
        int i = this.c;
        return ((long) i) == -1 || packageInfo.versionCode >= i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.sfo)) {
            return false;
        }
        defpackage.sfo sfoVar = (defpackage.sfo) obj;
        return this.c == sfoVar.c && this.d == sfoVar.d && j$.util.Objects.equals(this.a, sfoVar.a) && j$.util.Objects.equals(this.b, sfoVar.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, java.lang.Integer.valueOf(this.c), java.lang.Boolean.valueOf(this.d)});
    }

    public java.lang.String toString() {
        return "pkg=" + this.a + ", minVersion=" + this.c + ", isRequired=" + this.d;
    }

    public sfo(java.lang.String str, java.lang.String str2, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }
}

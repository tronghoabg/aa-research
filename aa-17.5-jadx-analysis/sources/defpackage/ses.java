package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import j$.util.Objects;

/* loaded from: classes.dex */
public class ses {
    private static final ypf e = ols.R("CAR.SETUP");
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public ses(String str, boolean z) {
        String[] strArrSplit = str.split(":", 3);
        int iIntValue = 0;
        this.a = strArrSplit[0];
        if (strArrSplit.length >= 2) {
            try {
                iIntValue = Integer.decode(strArrSplit[1]).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        this.c = iIntValue;
        this.b = strArrSplit.length == 3 ? strArrSplit[2] : null;
        this.d = z;
    }

    public int a(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfoB = b(context, this.a);
        return packageInfoB == null ? this.d ? 3 : 1 : e(packageInfoB) ? 1 : 2;
    }

    protected final PackageInfo b(Context context, String str) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            e.l().ai(8846).R("Package %s: installed ver=%d minimum required ver=%d", str, Integer.valueOf(packageInfo.versionCode), Integer.valueOf(this.c));
            return packageInfo;
        } catch (PackageManager.NameNotFoundException unused) {
            e.l().ai(8847).y("Package %s not found.", str);
            return null;
        }
    }

    public final boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            String str = this.a;
            int applicationEnabledSetting = packageManager.getApplicationEnabledSetting(str);
            e.l().ai(8848).K("Package %s: appEnabledSetting=%d", str, applicationEnabledSetting);
            return applicationEnabledSetting == 3;
        } catch (IllegalArgumentException unused) {
            e.l().ai(8849).y("Package %s not found.", this.a);
            return false;
        }
    }

    public final boolean d(Context context) {
        return a(context) == 1;
    }

    protected final boolean e(PackageInfo packageInfo) {
        int i = this.c;
        return ((long) i) == -1 || packageInfo.versionCode >= i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ses)) {
            return false;
        }
        ses sesVar = (ses) obj;
        return this.c == sesVar.c && this.d == sesVar.d && Objects.equals(this.a, sesVar.a) && Objects.equals(this.b, sesVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Boolean.valueOf(this.d));
    }

    public String toString() {
        return "pkg=" + this.a + ", minVersion=" + this.c + ", isRequired=" + this.d;
    }

    public ses(String str, String str2, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }
}

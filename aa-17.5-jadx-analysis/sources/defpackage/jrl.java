package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes.dex */
public enum jrl {
    PROJECTION("projection"),
    SHARED_SERVICE("shared"),
    CAR("car"),
    CROSS_PROFILE("crossprofile"),
    PROVIDER("provider"),
    PRIMES_LIFEBOAT("primes_lifeboat"),
    WATCHDOG("watchdog"),
    EMPTY("");

    private final String j;

    jrl(String str) {
        this.j = str;
    }

    public static jrl a() {
        return (jrl) mki.a.i(jrl.class);
    }

    public static jrl b(Context context, String str) {
        String str2;
        for (jrl jrlVar : values()) {
            if (jrlVar.c(context).equals(str)) {
                return jrlVar;
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (!applicationContext.getPackageName().equals(str)) {
            throw new IllegalArgumentException(a.bq(str, "Unexpected process name: ", ". All android components in manifest must run in a known process."));
        }
        try {
            str2 = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 0).processName;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("GH.ProcessInfo", "Error detecting process name from manifest.");
            str2 = "<unknown>";
        }
        Log.e("GH.ProcessInfo", "processName given is the package name default process. Should have run as ".concat(String.valueOf(str2)));
        return EMPTY;
    }

    public final String c(Context context) {
        return context.getApplicationContext().getPackageName() + ":" + this.j;
    }
}

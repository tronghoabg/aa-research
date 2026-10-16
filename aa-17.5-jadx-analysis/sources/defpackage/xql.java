package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class xql {
    public static Bundle a = null;
    public static Bundle b = null;
    private static final String c = "xql";
    private static final Object d = new Object();

    static Uri a() {
        return new Uri.Builder().scheme("content").authority("com.google.android.setupwizard.partner").build();
    }

    public static boolean b(Context context) {
        synchronized (d) {
            Bundle bundle = a;
            if (bundle == null || bundle.isEmpty()) {
                try {
                    a = context.getContentResolver().call(a(), "isGlifExpressiveEnabled", (String) null, (Bundle) null);
                } catch (IllegalArgumentException | SecurityException unused) {
                    Log.w(c, "isGlifExpressiveEnabled status is unknown; return as false.");
                }
            }
            Bundle bundle2 = a;
            if (bundle2 != null && !bundle2.isEmpty()) {
                return bundle2.getBoolean("isGlifExpressiveEnabled", false);
            }
            if (context.getTheme() != null) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.sucGlifExpressiveStyleEnabled});
                boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
                typedArrayObtainStyledAttributes.recycle();
                Log.i(c, a.bR(z, "isGlifExpressiveStyleEnabled is "));
                if (z) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean c(Context context) {
        Bundle bundleCall = b;
        if (bundleCall == null || bundleCall.isEmpty()) {
            bundleCall = null;
            try {
                bundleCall = context.getContentResolver().call(a(), "isSuwUseDesktopLayoutEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(c, "isSuwUseDesktopLayoutEnabled status is unknown; return as false.");
            }
        }
        b = bundleCall;
        if (bundleCall != null) {
            return bundleCall.getBoolean("isSuwUseDesktopLayoutEnabled", false);
        }
        return false;
    }
}

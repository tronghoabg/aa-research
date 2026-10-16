package com.google.android.gms.internal.measurement;

import N0.a;
import android.content.Context;
import android.net.Uri;
import x.C4412e;

/* loaded from: classes4.dex */
public final class zzhk {
    private static final C4412e zza = new C4412e(0);

    public static synchronized Uri zza(String str) {
        Uri uri;
        C4412e c4412e = zza;
        uri = (Uri) c4412e.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            c4412e.put(str, uri);
        }
        return uri;
    }

    public static String zza(Context context, String str) {
        if (!str.contains("#")) {
            return a.g(str, "#", context.getPackageName());
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(str));
    }

    public static boolean zza(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}

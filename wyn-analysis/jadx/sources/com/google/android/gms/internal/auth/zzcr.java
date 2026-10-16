package com.google.android.gms.internal.auth;

import android.net.Uri;
import x.C4412e;

/* loaded from: classes3.dex */
public final class zzcr {
    private static final C4412e zza = new C4412e(0);

    public static synchronized Uri zza(String str) {
        C4412e c4412e = zza;
        Uri uri = (Uri) c4412e.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        c4412e.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
